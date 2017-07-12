package manuscript.module.manuscript.management;

import manuscript.module.manuscript.management.bean.CheckSubmissionExistence;
import manuscript.module.manuscript.management.request.RemoveSubmissionRequest;
import manuscript.module.manuscript.management.request.SaveSubmissionDataRequest;
import manuscript.module.manuscript.management.request.SaveSubmissionRequest;
import manuscript.module.manuscript.management.response.GetSubmissionDataResponse;

public interface ManuscriptDao {

	public void saveBasicSubmissionData(SaveSubmissionRequest saveSubmissionRequest);

	public GetSubmissionDataResponse getSubmissionData(String submissionId);

	public String checkSubmissionExistence(CheckSubmissionExistence checkSubmissionExistence);

	public void saveSubmissionData(SaveSubmissionDataRequest submission);

	public String removeSubmissionData(RemoveSubmissionRequest request);
}
