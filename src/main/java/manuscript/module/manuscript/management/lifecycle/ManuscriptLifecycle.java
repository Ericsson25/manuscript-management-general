package manuscript.module.manuscript.management.lifecycle;

import manuscript.module.manuscript.management.bean.ManuscriptLifecycleRequest;

public interface ManuscriptLifecycle<T extends ManuscriptLifecycleRequest> {

	public void lifecycle(T t);
}
