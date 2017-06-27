package manuscript.module.manuscript.management.exception;

public class FileUploadException extends RuntimeException {

	private static final long serialVersionUID = -4552540885418539013L;

	private String message;

	public FileUploadException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
