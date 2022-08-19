package ch.ivy.gawfs.workflowExecution.ApprovalForm;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class ApprovalFormData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class ApprovalFormData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 7930556141461178295L;

  private java.util.List<java.lang.String> steps;

  /**
   * Gets the field steps.
   * @return the value of the field steps; may be null.
   */
  public java.util.List<java.lang.String> getSteps()
  {
    return steps;
  }

  /**
   * Sets the field steps.
   * @param _steps the new value of the field steps.
   */
  public void setSteps(java.util.List<java.lang.String> _steps)
  {
    steps = _steps;
  }

  private java.lang.Integer actualStepIndex;

  /**
   * Gets the field actualStepIndex.
   * @return the value of the field actualStepIndex; may be null.
   */
  public java.lang.Integer getActualStepIndex()
  {
    return actualStepIndex;
  }

  /**
   * Sets the field actualStepIndex.
   * @param _actualStepIndex the new value of the field actualStepIndex.
   */
  public void setActualStepIndex(java.lang.Integer _actualStepIndex)
  {
    actualStepIndex = _actualStepIndex;
  }

  private gawfs.ApprovalTaskResult approvalResult;

  /**
   * Gets the field approvalResult.
   * @return the value of the field approvalResult; may be null.
   */
  public gawfs.ApprovalTaskResult getApprovalResult()
  {
    return approvalResult;
  }

  /**
   * Sets the field approvalResult.
   * @param _approvalResult the new value of the field approvalResult.
   */
  public void setApprovalResult(gawfs.ApprovalTaskResult _approvalResult)
  {
    approvalResult = _approvalResult;
  }

  private java.lang.String comment;

  /**
   * Gets the field comment.
   * @return the value of the field comment; may be null.
   */
  public java.lang.String getComment()
  {
    return comment;
  }

  /**
   * Sets the field comment.
   * @param _comment the new value of the field comment.
   */
  public void setComment(java.lang.String _comment)
  {
    comment = _comment;
  }

  private java.util.List<gawfs.TaskDef> finishedTasks;

  /**
   * Gets the field finishedTasks.
   * @return the value of the field finishedTasks; may be null.
   */
  public java.util.List<gawfs.TaskDef> getFinishedTasks()
  {
    return finishedTasks;
  }

  /**
   * Sets the field finishedTasks.
   * @param _finishedTasks the new value of the field finishedTasks.
   */
  public void setFinishedTasks(java.util.List<gawfs.TaskDef> _finishedTasks)
  {
    finishedTasks = _finishedTasks;
  }

  private java.lang.Boolean isAdhocProcess;

  /**
   * Gets the field isAdhocProcess.
   * @return the value of the field isAdhocProcess; may be null.
   */
  public java.lang.Boolean getIsAdhocProcess()
  {
    return isAdhocProcess;
  }

  /**
   * Sets the field isAdhocProcess.
   * @param _isAdhocProcess the new value of the field isAdhocProcess.
   */
  public void setIsAdhocProcess(java.lang.Boolean _isAdhocProcess)
  {
    isAdhocProcess = _isAdhocProcess;
  }

  private java.lang.Long originalTaskId;

  /**
   * Gets the field originalTaskId.
   * @return the value of the field originalTaskId; may be null.
   */
  public java.lang.Long getOriginalTaskId()
  {
    return originalTaskId;
  }

  /**
   * Sets the field originalTaskId.
   * @param _originalTaskId the new value of the field originalTaskId.
   */
  public void setOriginalTaskId(java.lang.Long _originalTaskId)
  {
    originalTaskId = _originalTaskId;
  }

}
