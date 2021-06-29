package bank.loandetailsMS.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.core.env.Environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import bank.loandetailsMS.DTO.LoandetailsDTO;
import bank.loandetailsMS.entity.LoandetailsEntity;
import bank.loandetailsMS.exception.LoanIdException;
import bank.loandetailsMS.repository.LoandetailsRepository;

@PropertySource(value = {"classpath:application.properties"})
@Service
public class LoandetailsService {
	@Autowired
	LoandetailsRepository loandetailsRepository;
	@Autowired
	Environment env;

	public LoandetailsDTO getloan(Long loanId) throws LoanIdException {
		System.out.println(3);
		LoandetailsDTO loandetailsDTO = new LoandetailsDTO();

		Optional<LoandetailsEntity> entity = loandetailsRepository.findById(loanId);
		if (entity.isPresent()) {
			
			LoandetailsEntity e = entity.get();
			loandetailsDTO = LoandetailsDTO.valueOf(e);
					
		} else {
			throw new LoanIdException(env.getProperty("Service.Loan_ID"));
		}
		return loandetailsDTO;

	}

	public List<LoandetailsDTO> getloanbyLoanType(String loanType) throws Exception {

		List<LoandetailsEntity> entity = loandetailsRepository.findAll();
		List<LoandetailsDTO> dto = new ArrayList<LoandetailsDTO>();
		for (LoandetailsEntity le : entity) {
			if (le.getLoanType().equals(loanType)) {
				LoandetailsDTO d = LoandetailsDTO.valueOf(le);
				dto.add(d);
			}
		}
		if (dto.isEmpty()) {
			throw new Exception("Provide Valid Loan Type");
		}
		return dto;
	}

	public Double getOutstandingBalance(Long loanId, String loanType) throws Exception {
		Optional<LoandetailsEntity> entity = loandetailsRepository.findById(loanId);
		Double value = null;
		try {
			if (entity.get().getLoanType().equals(loanType)) {
				if (entity.get().getOutstandingBalance() > 0) {
					value = entity.get().getOutstandingBalance();
				} else
					throw new Exception("Service.NoOB");
			} else
				throw new Exception("Service.Type");
			return value;
		} catch (Exception e) {
			throw new Exception("Service.Loan_ID");
		}
	}

	public Integer getTenure(Long loanId, String loanType) throws Exception {
		Optional<LoandetailsEntity> entity = loandetailsRepository.findById(loanId);
		Integer value = null;
		try {
			if (entity.get().getLoanType().equals(loanType)) {
				value = entity.get().getLoanPeriod();
			} else
				throw new Exception("Service.Type");
			return value;
		} catch (Exception e) {
			throw new Exception("Service.Loan_ID");
		}

	}

	public Double getDueAmount(Long loanId, String loanType) throws Exception {
		Optional<LoandetailsEntity> entity = loandetailsRepository.findById(loanId);
		Double value = null;
		try {
			if (entity.get().getLoanType().equals(loanType)) {
				if (entity.get().getDue() > 0) {
					value = entity.get().getDue();
				} else {
					throw new Exception("Service.NoDues");
				}
			} else {
				throw new Exception("Service.LoanType");
			}
			return value;
		} catch (Exception e) {
			throw new Exception("Service.Loan_ID");
		}
	}

}
