package manuscript.module.manuscript.management.preload.reply;

public class ManuscriptPreloadReply<T> {
	private T preloadReply;

	public T getPreloadReply() {
		return preloadReply;
	}

	public void setPreloadReply(T preloadReply) {
		this.preloadReply = preloadReply;
	}

	@Override
	public String toString() {
		return "ManuscriptPreloadReply [preloadReply=" + preloadReply + "]";
	}

}
