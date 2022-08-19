package ch.ivy.addon.portalkit.component.TaskItemGeneralInfo;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class TaskItemGeneralInfoData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class TaskItemGeneralInfoData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 1595466223135819674L;

  private java.lang.String changeDeadlineNoteContent;

  /**
   * Gets the field changeDeadlineNoteContent.
   * @return the value of the field changeDeadlineNoteContent; may be null.
   */
  public java.lang.String getChangeDeadlineNoteContent()
  {
    return changeDeadlineNoteContent;
  }

  /**
   * Sets the field changeDeadlineNoteContent.
   * @param _changeDeadlineNoteContent the new value of the field changeDeadlineNoteContent.
   */
  public void setChangeDeadlineNoteContent(java.lang.String _changeDeadlineNoteContent)
  {
    changeDeadlineNoteContent = _changeDeadlineNoteContent;
  }

  private ch.ivy.addon.portalkit.dto.GlobalCaseId globalCaseId;

  /**
   * Gets the field globalCaseId.
   * @return the value of the field globalCaseId; may be null.
   */
  public ch.ivy.addon.portalkit.dto.GlobalCaseId getGlobalCaseId()
  {
    return globalCaseId;
  }

  /**
   * Sets the field globalCaseId.
   * @param _globalCaseId the new value of the field globalCaseId.
   */
  public void setGlobalCaseId(ch.ivy.addon.portalkit.dto.GlobalCaseId _globalCaseId)
  {
    globalCaseId = _globalCaseId;
  }

  private ch.ivyteam.ivy.workflow.ICase selectedCase;

  /**
   * Gets the field selectedCase.
   * @return the value of the field selectedCase; may be null.
   */
  public ch.ivyteam.ivy.workflow.ICase getSelectedCase()
  {
    return selectedCase;
  }

  /**
   * Sets the field selectedCase.
   * @param _selectedCase the new value of the field selectedCase.
   */
  public void setSelectedCase(ch.ivyteam.ivy.workflow.ICase _selectedCase)
  {
    selectedCase = _selectedCase;
  }

  private ch.ivyteam.ivy.workflow.ITask task;

  /**
   * Gets the field task.
   * @return the value of the field task; may be null.
   */
  public ch.ivyteam.ivy.workflow.ITask getTask()
  {
    return task;
  }

  /**
   * Sets the field task.
   * @param _task the new value of the field task.
   */
  public void setTask(ch.ivyteam.ivy.workflow.ITask _task)
  {
    task = _task;
  }

  private java.util.Date expiryTimestamp;

  /**
   * Gets the field expiryTimestamp.
   * @return the value of the field expiryTimestamp; may be null.
   */
  public java.util.Date getExpiryTimestamp()
  {
    return expiryTimestamp;
  }

  /**
   * Sets the field expiryTimestamp.
   * @param _expiryTimestamp the new value of the field expiryTimestamp.
   */
  public void setExpiryTimestamp(java.util.Date _expiryTimestamp)
  {
    expiryTimestamp = _expiryTimestamp;
  }

}
