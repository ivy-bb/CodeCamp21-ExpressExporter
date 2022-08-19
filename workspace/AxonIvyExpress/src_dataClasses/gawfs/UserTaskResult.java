package gawfs;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class UserTaskResult", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class UserTaskResult extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -1063778016410305032L;

  private transient gawfs.Applicant applicant;

  /**
   * Gets the field applicant.
   * @return the value of the field applicant; may be null.
   */
  public gawfs.Applicant getApplicant()
  {
    return applicant;
  }

  /**
   * Sets the field applicant.
   * @param _applicant the new value of the field applicant.
   */
  public void setApplicant(gawfs.Applicant _applicant)
  {
    applicant = _applicant;
  }

  private transient java.util.List<gawfs.ApprovalTaskResult> approvalResultList;

  /**
   * Gets the field approvalResultList.
   * @return the value of the field approvalResultList; may be null.
   */
  public java.util.List<gawfs.ApprovalTaskResult> getApprovalResultList()
  {
    return approvalResultList;
  }

  /**
   * Sets the field approvalResultList.
   * @param _approvalResultList the new value of the field approvalResultList.
   */
  public void setApprovalResultList(java.util.List<gawfs.ApprovalTaskResult> _approvalResultList)
  {
    approvalResultList = _approvalResultList;
  }

}
