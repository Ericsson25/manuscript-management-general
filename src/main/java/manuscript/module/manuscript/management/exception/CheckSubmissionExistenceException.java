package manuscript.module.manuscript.management.exception;

public class CheckSubmissionExistenceException extends RuntimeException {

	private static final long serialVersionUID = 68359295448292071L;

	private String message;

	public CheckSubmissionExistenceException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
