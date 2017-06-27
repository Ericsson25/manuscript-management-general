package manuscript.module.manuscript.management;

import org.springframework.web.multipart.MultipartFile;

import manuscript.module.manuscript.management.bean.Role;
import manuscript.module.manuscript.management.preload.reply.ManuscriptPreloadReply;
import manuscript.module.manuscript.management.response.AuthorPreloadResponse;
import manuscript.module.manuscript.management.response.EditorPreloadResponse;
import manuscript.module.manuscript.management.response.FileUploadResponse;
import manuscript.module.manuscript.management.response.ReviewerPreloadResponse;

public interface ManuscriptService {

	/**
	 * Az adott {@link Role}-nak megfelel�en visszat�r a megfelel� v�lasszal. Lehet�s�gek
	 * <li>{@link AuthorPreloadResponse}
	 * <li>{@link ReviewerPreloadResponse}
	 * <li>{@link EditorPreloadResponse}
	 * 
	 * @param role
	 * @return
	 */
	public ManuscriptPreloadReply<?> preload(Role role);

	/**
	 * Param�terben megkapott f�jl-t lementi a f�jlrendszerre
	 * 
	 * @param file
	 * @return
	 */
	public FileUploadResponse upload(MultipartFile file);
}
