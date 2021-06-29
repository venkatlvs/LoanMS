package bank.loandetailsMS.DTO;

import java.util.Date;

import bank.loandetailsMS.entity.LoandetailsEntity;

public class LoandetailsDTO {
	Integer customerId;
	String customerName;
	Float annualInterestRate;
	Integer loanPeriod;
	Integer paymentsPerYear;
	Date loanStartDate;
	Double loanAmount;
	Double due;
	String loanType;
	Date dueDate;
	Long loanId;
	Double outstandingBalance;

	public LoandetailsDTO() {
		super();
	}

	public LoandetailsDTO(Integer customerId, String customerName, Double due, Float annualInterestRate,
			Integer loanPeriod, Integer payementsPerYear, Date loanStartDate, Double loanAmount, String loanType,
			Date dueDate, Long loanId, Integer paymentsPerYear, Double outstandingBalance) {
		this();
		this.due = due;
		this.customerId = customerId;
		this.customerName = customerName;
		this.annualInterestRate = annualInterestRate;
		this.loanPeriod = loanPeriod;
		this.paymentsPerYear = paymentsPerYear;
		this.loanStartDate = loanStartDate;
		this.loanAmount = loanAmount;
		this.loanType = loanType;
		this.dueDate = dueDate;
		this.loanId = loanId;
		this.outstandingBalance = outstandingBalance;

	}

	public Double getOutstandingBalance() {
		return outstandingBalance;
	}

	public void setOutstandingBalance(Double outstandingBalance) {
		this.outstandingBalance = outstandingBalance;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Float getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(Float annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Integer getLoanPeriod() {
		return loanPeriod;
	}

	public void setLoanPeriod(Integer loanPeriod) {
		this.loanPeriod = loanPeriod;
	}

	public Integer getPaymentsPerYear() {
		return paymentsPerYear;
	}

	public void setPaymentsPerYear(Integer paymentsPerYear) {
		this.paymentsPerYear = paymentsPerYear;
	}

	public Date getLoanStartDate() {
		return loanStartDate;
	}

	public void setLoanStartDate(Date loanStartDate) {
		this.loanStartDate = loanStartDate;
	}

	public Double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Double getDue() {
		return due;
	}

	public void setDue(Double due) {
		this.due = due;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Long getLoanId() {
		return loanId;
	}

	public void setLoanId(Long loanId) {
		this.loanId = loanId;
	}
	//entity to DTO
	public static LoandetailsDTO valueOf(LoandetailsEntity le) {
		LoandetailsDTO dto = new LoandetailsDTO();
		dto.setCustomerId(le.getCustomerId());
		dto.setDueDate(le.getDueDate());
		dto.setLoanAmount(le.getLoanAmount());
		dto.setLoanId(le.getLoanId());
		dto.setLoanType(le.getLoanType());
		dto.setAnnualInterestRate(le.getAnnualInterestRate());
		dto.setCustomerName(le.getCustomerName());
		dto.setDue(le.getDue());
		dto.setPaymentsPerYear(le.getPaymentsPerYear());
		dto.setLoanStartDate(le.getLoanStartDate());
		dto.setLoanPeriod(le.getLoanPeriod());
		dto.setOutstandingBalance(le.getOutstandingBalance());
		return dto;
	}
}
