package bank.loandetailsMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bank.loandetailsMS.entity.LoandetailsEntity;

@Repository
public interface LoandetailsRepository extends JpaRepository<LoandetailsEntity, Long> {
	
}
