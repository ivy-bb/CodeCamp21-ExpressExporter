package ch.ivy.addon.portalkit.component.CaseItemRelatedTask;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class CaseItemRelatedTaskData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class CaseItemRelatedTaskData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 2944433590389713694L;

  private ch.ivyteam.ivy.workflow.ICase iCase;

  /**
   * Gets the field iCase.
   * @return the value of the field iCase; may be null.
   */
  public ch.ivyteam.ivy.workflow.ICase getICase()
  {
    return iCase;
  }

  /**
   * Sets the field iCase.
   * @param _iCase the new value of the field iCase.
   */
  public void setICase(ch.ivyteam.ivy.workflow.ICase _iCase)
  {
    iCase = _iCase;
  }

  private java.util.List<ch.ivyteam.ivy.workflow.ITask> relatedTasks;

  /**
   * Gets the field relatedTasks.
   * @return the value of the field relatedTasks; may be null.
   */
  public java.util.List<ch.ivyteam.ivy.workflow.ITask> getRelatedTasks()
  {
    return relatedTasks;
  }

  /**
   * Sets the field relatedTasks.
   * @param _relatedTasks the new value of the field relatedTasks.
   */
  public void setRelatedTasks(java.util.List<ch.ivyteam.ivy.workflow.ITask> _relatedTasks)
  {
    relatedTasks = _relatedTasks;
  }

  private java.lang.Long taskId;

  /**
   * Gets the field taskId.
   * @return the value of the field taskId; may be null.
   */
  public java.lang.Long getTaskId()
  {
    return taskId;
  }

  /**
   * Sets the field taskId.
   * @param _taskId the new value of the field taskId.
   */
  public void setTaskId(java.lang.Long _taskId)
  {
    taskId = _taskId;
  }

  private java.util.List<ch.ivyteam.ivy.workflow.ICase> technicalCases;

  /**
   * Gets the field technicalCases.
   * @return the value of the field technicalCases; may be null.
   */
  public java.util.List<ch.ivyteam.ivy.workflow.ICase> getTechnicalCases()
  {
    return technicalCases;
  }

  /**
   * Sets the field technicalCases.
   * @param _technicalCases the new value of the field technicalCases.
   */
  public void setTechnicalCases(java.util.List<ch.ivyteam.ivy.workflow.ICase> _technicalCases)
  {
    technicalCases = _technicalCases;
  }

  private ch.ivy.addon.portalkit.ivydata.searchcriteria.CaseSearchCriteria caseSearchCriteria;

  /**
   * Gets the field caseSearchCriteria.
   * @return the value of the field caseSearchCriteria; may be null.
   */
  public ch.ivy.addon.portalkit.ivydata.searchcriteria.CaseSearchCriteria getCaseSearchCriteria()
  {
    return caseSearchCriteria;
  }

  /**
   * Sets the field caseSearchCriteria.
   * @param _caseSearchCriteria the new value of the field caseSearchCriteria.
   */
  public void setCaseSearchCriteria(ch.ivy.addon.portalkit.ivydata.searchcriteria.CaseSearchCriteria _caseSearchCriteria)
  {
    caseSearchCriteria = _caseSearchCriteria;
  }

  private ch.ivyteam.ivy.workflow.ICase selectedTechnicalCase;

  /**
   * Gets the field selectedTechnicalCase.
   * @return the value of the field selectedTechnicalCase; may be null.
   */
  public ch.ivyteam.ivy.workflow.ICase getSelectedTechnicalCase()
  {
    return selectedTechnicalCase;
  }

  /**
   * Sets the field selectedTechnicalCase.
   * @param _selectedTechnicalCase the new value of the field selectedTechnicalCase.
   */
  public void setSelectedTechnicalCase(ch.ivyteam.ivy.workflow.ICase _selectedTechnicalCase)
  {
    selectedTechnicalCase = _selectedTechnicalCase;
  }

  private java.lang.Integer totalRelatedCases;

  /**
   * Gets the field totalRelatedCases.
   * @return the value of the field totalRelatedCases; may be null.
   */
  public java.lang.Integer getTotalRelatedCases()
  {
    return totalRelatedCases;
  }

  /**
   * Sets the field totalRelatedCases.
   * @param _totalRelatedCases the new value of the field totalRelatedCases.
   */
  public void setTotalRelatedCases(java.lang.Integer _totalRelatedCases)
  {
    totalRelatedCases = _totalRelatedCases;
  }

  private java.lang.Integer totalRelatedTasks;

  /**
   * Gets the field totalRelatedTasks.
   * @return the value of the field totalRelatedTasks; may be null.
   */
  public java.lang.Integer getTotalRelatedTasks()
  {
    return totalRelatedTasks;
  }

  /**
   * Sets the field totalRelatedTasks.
   * @param _totalRelatedTasks the new value of the field totalRelatedTasks.
   */
  public void setTotalRelatedTasks(java.lang.Integer _totalRelatedTasks)
  {
    totalRelatedTasks = _totalRelatedTasks;
  }

  private java.lang.Boolean isTaskFinished;

  /**
   * Gets the field isTaskFinished.
   * @return the value of the field isTaskFinished; may be null.
   */
  public java.lang.Boolean getIsTaskFinished()
  {
    return isTaskFinished;
  }

  /**
   * Sets the field isTaskFinished.
   * @param _isTaskFinished the new value of the field isTaskFinished.
   */
  public void setIsTaskFinished(java.lang.Boolean _isTaskFinished)
  {
    isTaskFinished = _isTaskFinished;
  }

  private java.lang.Boolean isWorkingOnTask;

  /**
   * Gets the field isWorkingOnTask.
   * @return the value of the field isWorkingOnTask; may be null.
   */
  public java.lang.Boolean getIsWorkingOnTask()
  {
    return isWorkingOnTask;
  }

  /**
   * Sets the field isWorkingOnTask.
   * @param _isWorkingOnTask the new value of the field isWorkingOnTask.
   */
  public void setIsWorkingOnTask(java.lang.Boolean _isWorkingOnTask)
  {
    isWorkingOnTask = _isWorkingOnTask;
  }

  private java.lang.Boolean inFrame;

  /**
   * Gets the field inFrame.
   * @return the value of the field inFrame; may be null.
   */
  public java.lang.Boolean getInFrame()
  {
    return inFrame;
  }

  /**
   * Sets the field inFrame.
   * @param _inFrame the new value of the field inFrame.
   */
  public void setInFrame(java.lang.Boolean _inFrame)
  {
    inFrame = _inFrame;
  }

}
