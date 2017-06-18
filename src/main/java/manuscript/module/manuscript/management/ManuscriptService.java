package manuscript.module.manuscript.management;

import manuscript.module.manuscript.management.bean.ROLE;
import manuscript.module.manuscript.management.preload.reply.ManuscriptPreloadReply;

public interface ManuscriptService {

	public ManuscriptPreloadReply<?> preload(ROLE role);
}
