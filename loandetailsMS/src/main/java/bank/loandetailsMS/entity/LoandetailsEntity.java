package bank.loandetailsMS.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;

@Entity
@Table(name="LOAN_ACCOUNT")
@Data
public class LoandetailsEntity {

	@Id
	@Column(name = "LOAN_ID")
	private Long loanId;

	
	@Column(name = "CUSTOMER_ID")
	private Integer customerId;

	@Column(name = "LOAN_TYPE")
	private String loanType;

	@Column(name = "LOAN_AMOUNT")
	private Double loanAmount;

	@Column(name = "DUE_AMOUNT")
	private Double due;

	@Column(name = "DUE_DATE")
	private Date dueDate;

	@Column(name = "CUSTOMER_NAME")
	private String customerName;

	@Column(name = "ANNUAL_INTEREST_RATE")
	private Float annualInterestRate;

	@Column(name = "LOAN_PERIOD")
	private Integer loanPeriod;

	@Column(name = "PAYMENTS_PER_YEAR")
	private Integer paymentsPerYear;

	@Column(name = "LOAN_START_DATE")
	private Date loanStartDate;
	
	@Column(name = "OUTSTANDING_BALANCE")
	private Double outstandingBalance;
	
//	public Double getOutstandingBalance() {
//		return outstandingBalance;
//	}
//
//	public void setOutstandingBalance(Double outstandingBalance) {
//		this.outstandingBalance = outstandingBalance;
//	}
//
//
//	public Long getLoanId() {
//		return loanId;
//	}
//
//	public void setLoanId(Long loanId) {
//		this.loanId = loanId;
//	}
//
//	public Integer getCustomerId() {
//		return customerId;
//	}
//
//	public void setCustomerId(Integer customerId) {
//		this.customerId = customerId;
//	}
//
//	public String getLoanType() {
//		return loanType;
//	}
//
//	public void setLoanType(String loanType) {
//		this.loanType = loanType;
//	}
//
//	public Double getLoanAmount() {
//		return loanAmount;
//	}
//
//	public void setLoanAmount(Double loanAmount) {
//		this.loanAmount = loanAmount;
//	}
//
//	public Double getDue() {
//		return due;
//	}
//
//	public void setDue(Double due) {
//		this.due = due;
//	}
//
//	public Date getDueDate() {
//		return dueDate;
//	}
//
//	public void setDueDate(Date dueDate) {
//		this.dueDate = dueDate;
//	}
//
//	public String getCustomerName() {
//		return customerName;
//	}
//
//	public void setCustomerName(String customerName) {
//		this.customerName = customerName;
//	}
//
//	public Float getAnnualInterestRate() {
//		return annualInterestRate;
//	}
//
//	public void setAnnualInterestRate(Float annualInterestRate) {
//		this.annualInterestRate = annualInterestRate;
//	}
//
//	public Integer getLoanPeriod() {
//		return loanPeriod;
//	}
//
//	public void setLoanPeriod(Integer loanPeriod) {
//		this.loanPeriod = loanPeriod;
//	}
//
//	public Integer getPaymentsPerYear() {
//		return paymentsPerYear;
//	}
//
//	public void setPaymentsPerYear(Integer paymentsPerYear) {
//		this.paymentsPerYear = paymentsPerYear;
//	}
//
//	public Date getLoanStartDate() {
//		return loanStartDate;
//	}
//
//	public void setLoanStartDate(Date loanStartDate) {
//		this.loanStartDate = loanStartDate;
//	}

	

}
