package bank.loandetailsMS.exception;

public class LoanServiceException extends Exception{
	private static final long serialVersionUID=-470180507998010368L;
	
	public LoanServiceException() {
		super();
	}
	
	public LoanServiceException(final String message) {
		super(message);
	}

}
