package manuscript.module.manuscript.management;

import manuscript.module.manuscript.management.request.SaveSubmissionRequest;
import manuscript.module.manuscript.management.response.GetSubmissionDataResponse;

public interface ManuscriptDao {

	public void saveBasicSubmissionData(SaveSubmissionRequest saveSubmissionRequest);

	public GetSubmissionDataResponse getSubmissionData(String submissionId);
}
