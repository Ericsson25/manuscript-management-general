package manuscript.module.manuscript.management;

import org.springframework.web.multipart.MultipartFile;

import manuscript.module.manuscript.management.bean.Role;
import manuscript.module.manuscript.management.preload.reply.ManuscriptPreloadReply;
import manuscript.module.manuscript.management.request.SaveSubmissionDataRequest;
import manuscript.module.manuscript.management.response.AuthorPreloadResponse;
import manuscript.module.manuscript.management.response.EditorPreloadResponse;
import manuscript.module.manuscript.management.response.FileUploadResponse;
import manuscript.module.manuscript.management.response.ReviewerPreloadResponse;
import manuscript.module.manuscript.management.response.SaveSubmissionDataResponse;

public interface ManuscriptService {

	/**
	 * Az adott {@link Role}-nak megfelelõen visszatér a megfelelõ válasszal. Lehetõségek
	 * <li>{@link AuthorPreloadResponse}
	 * <li>{@link ReviewerPreloadResponse}
	 * <li>{@link EditorPreloadResponse}
	 * 
	 * @param role
	 * @return
	 */
	public ManuscriptPreloadReply<?> preload(Role role);

	/**
	 * Paraméterben megkapott fájl-t lementi a fájlrendszerre
	 * 
	 * @param file
	 * @return
	 */
	public FileUploadResponse upload(MultipartFile file);

	/**
	 * Menti a submissio-on történt módosításokat az adatbázisba.
	 * 
	 * @param submission
	 * @return
	 */
	public SaveSubmissionDataResponse save(SaveSubmissionDataRequest submission);
}
