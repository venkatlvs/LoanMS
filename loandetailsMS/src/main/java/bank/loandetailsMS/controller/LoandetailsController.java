package bank.loandetailsMS.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import bank.loandetailsMS.DTO.LoandetailsDTO;
import bank.loandetailsMS.exception.LoanIdException;
import bank.loandetailsMS.service.LoandetailsService;

@RestController
@CrossOrigin
@RequestMapping(name = "/api")
public class LoandetailsController {
	
	@Autowired
	LoandetailsService loanService;

	@Autowired
	Environment environment;
	
	

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	

	@GetMapping(value = "/loans/loandetails/{loanId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public LoandetailsDTO viewloanbyLoanId(@PathVariable Long loanId) throws LoanIdException {
		
		System.out.println(2);
		logger.info("Fetching loan by loanId:" + loanId);
		LoandetailsDTO loan = new LoandetailsDTO();
		try {
			loan = loanService.getloan(loanId);
		} catch (LoanIdException e) {
			throw new LoanIdException(e.getMessage());
		}
		
		return loan;
	}

	@GetMapping(value = "/loans/{loanType}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<LoandetailsDTO> viewloanbyLoanType(@PathVariable String loanType) throws Exception {
		try {
			logger.info("Fetching loan by loanType:" + loanType);
			List<LoandetailsDTO> loandetailsDTO = loanService.getloanbyLoanType(loanType);
			return loandetailsDTO;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@GetMapping(value = "/loans/outstandingBalance/{loanId}/{loanType}")
	public Double viewOutstandingDues(@PathVariable Long loanId, @PathVariable String loanType) throws Exception {
		try {
			return loanService.getOutstandingBalance(loanId, loanType);
		} catch (Exception e) {
			throw new Exception(environment.getProperty(e.getMessage()), e);
		}
	}

	@GetMapping(value = "/loans/tenure/{loanId}/{loanType}")
	public Integer viewTenure(@PathVariable Long loanId, @PathVariable String loanType) throws Exception {
		try {
			return loanService.getTenure(loanId, loanType);
		} catch (Exception e) {
			throw new Exception(environment.getProperty(e.getMessage()), e);
		}
	}

	@GetMapping(value = "/loans/dues/{loanId}/{loanType}")
	public Double viewDueAmount(@PathVariable Long loanId, @PathVariable String loanType) throws Exception {
		try {
			return loanService.getDueAmount(loanId, loanType);
		} catch (Exception e) {
			throw new Exception(environment.getProperty(e.getMessage()), e);
		}
	}

}
