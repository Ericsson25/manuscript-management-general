package manuscript.module.manuscript.management.exception;

public class FileValidationException extends RuntimeException {

	private static final long serialVersionUID = 869802807162642194L;

	private String message;

	public FileValidationException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
