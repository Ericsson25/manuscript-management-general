package manuscript.module.manuscript.management;

import org.springframework.web.multipart.MultipartFile;

import manuscript.module.manuscript.management.preload.reply.ManuscriptPreloadReply;
import manuscript.module.manuscript.management.request.RemoveSubmissionRequest;
import manuscript.module.manuscript.management.request.SaveSubmissionDataRequest;
import manuscript.module.manuscript.management.request.SearchAuthorRequest;
import manuscript.module.manuscript.management.request.SubmitSubmissionRequest;
import manuscript.module.manuscript.management.response.AuthorPreloadResponse;
import manuscript.module.manuscript.management.response.EditorPreloadResponse;
import manuscript.module.manuscript.management.response.FileUploadResponse;
import manuscript.module.manuscript.management.response.RemoveSubmissionResponse;
import manuscript.module.manuscript.management.response.ReviewerPreloadResponse;
import manuscript.module.manuscript.management.response.SaveSubmissionDataResponse;
import manuscript.module.manuscript.management.response.SearchAuthorResponse;
import manuscript.module.manuscript.management.response.SubmitSubmissionResponse;
import manuscript.module.user.management.bean.Role;
import manuscript.module.user.management.bean.Roles;

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
	public ManuscriptPreloadReply<?> preload(Roles role);

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

	/**
	 * Kitörli a paraméterben megadott submission adatait az adatbázisból.
	 * 
	 * @param request
	 * @return
	 */
	public RemoveSubmissionResponse remove(RemoveSubmissionRequest request);

	/**
	 * A kész cikk benyújtása/véglegesítése.
	 * 
	 * @param request
	 * @return
	 */
	public SubmitSubmissionResponse submit(SubmitSubmissionRequest request);

	/**
	 * Beadott paraméterek alapján visszaad egy listát a lehetséges Authorokról.
	 * 
	 * @param request
	 * @return
	 */
	public SearchAuthorResponse searchAuthor(SearchAuthorRequest request);
}
