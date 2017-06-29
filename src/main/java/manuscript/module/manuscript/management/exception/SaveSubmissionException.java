package manuscript.module.manuscript.management.exception;

public class SaveSubmissionException extends RuntimeException {

	private static final long serialVersionUID = -4130318366843550164L;

	private String message;

	public SaveSubmissionException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
