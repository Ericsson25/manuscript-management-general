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
	 * Az adott {@link Role}-nak megfelel�en visszat�r a megfelel� v�lasszal. Lehet�s�gek
	 * <li>{@link AuthorPreloadResponse}
	 * <li>{@link ReviewerPreloadResponse}
	 * <li>{@link EditorPreloadResponse}
	 * 
	 * @param role
	 * @return
	 */
	public ManuscriptPreloadReply<?> preload(Roles role);

	/**
	 * Param�terben megkapott f�jl-t lementi a f�jlrendszerre
	 * 
	 * @param file
	 * @return
	 */
	public FileUploadResponse upload(MultipartFile file);

	/**
	 * Menti a submissio-on t�rt�nt m�dos�t�sokat az adatb�zisba.
	 * 
	 * @param submission
	 * @return
	 */
	public SaveSubmissionDataResponse save(SaveSubmissionDataRequest submission);

	/**
	 * Kit�rli a param�terben megadott submission adatait az adatb�zisb�l.
	 * 
	 * @param request
	 * @return
	 */
	public RemoveSubmissionResponse remove(RemoveSubmissionRequest request);

	/**
	 * A k�sz cikk beny�jt�sa/v�gleges�t�se.
	 * 
	 * @param request
	 * @return
	 */
	public SubmitSubmissionResponse submit(SubmitSubmissionRequest request);

	/**
	 * Beadott param�terek alapj�n visszaad egy list�t a lehets�ges Authorokr�l.
	 * 
	 * @param request
	 * @return
	 */
	public SearchAuthorResponse searchAuthor(SearchAuthorRequest request);
}
