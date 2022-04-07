package ch.ivy.addon.portalkit.component.CaseItemRelatedTasks;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class CaseItemRelatedTasksData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class CaseItemRelatedTasksData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 7415749501517390972L;

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

  private java.lang.Boolean canUserResumeTask;

  /**
   * Gets the field canUserResumeTask.
   * @return the value of the field canUserResumeTask; may be null.
   */
  public java.lang.Boolean getCanUserResumeTask()
  {
    return canUserResumeTask;
  }

  /**
   * Sets the field canUserResumeTask.
   * @param _canUserResumeTask the new value of the field canUserResumeTask.
   */
  public void setCanUserResumeTask(java.lang.Boolean _canUserResumeTask)
  {
    canUserResumeTask = _canUserResumeTask;
  }

  private java.lang.String currentPortalPage;

  /**
   * Gets the field currentPortalPage.
   * @return the value of the field currentPortalPage; may be null.
   */
  public java.lang.String getCurrentPortalPage()
  {
    return currentPortalPage;
  }

  /**
   * Sets the field currentPortalPage.
   * @param _currentPortalPage the new value of the field currentPortalPage.
   */
  public void setCurrentPortalPage(java.lang.String _currentPortalPage)
  {
    currentPortalPage = _currentPortalPage;
  }

  /**
   * Task is selected for reset or delegate
   */
  private ch.ivyteam.ivy.workflow.ITask selectedTask;

  /**
   * Gets the field selectedTask.
   * @return the value of the field selectedTask; may be null.
   */
  public ch.ivyteam.ivy.workflow.ITask getSelectedTask()
  {
    return selectedTask;
  }

  /**
   * Sets the field selectedTask.
   * @param _selectedTask the new value of the field selectedTask.
   */
  public void setSelectedTask(ch.ivyteam.ivy.workflow.ITask _selectedTask)
  {
    selectedTask = _selectedTask;
  }

  private ch.ivy.addon.portalkit.datamodel.internal.RelatedTaskLazyDataModel dataModel;

  /**
   * Gets the field dataModel.
   * @return the value of the field dataModel; may be null.
   */
  public ch.ivy.addon.portalkit.datamodel.internal.RelatedTaskLazyDataModel getDataModel()
  {
    return dataModel;
  }

  /**
   * Sets the field dataModel.
   * @param _dataModel the new value of the field dataModel.
   */
  public void setDataModel(ch.ivy.addon.portalkit.datamodel.internal.RelatedTaskLazyDataModel _dataModel)
  {
    dataModel = _dataModel;
  }

  private java.util.List<java.lang.String> relatedTaskColumnsVisibility;

  /**
   * Gets the field relatedTaskColumnsVisibility.
   * @return the value of the field relatedTaskColumnsVisibility; may be null.
   */
  public java.util.List<java.lang.String> getRelatedTaskColumnsVisibility()
  {
    return relatedTaskColumnsVisibility;
  }

  /**
   * Sets the field relatedTaskColumnsVisibility.
   * @param _relatedTaskColumnsVisibility the new value of the field relatedTaskColumnsVisibility.
   */
  public void setRelatedTaskColumnsVisibility(java.util.List<java.lang.String> _relatedTaskColumnsVisibility)
  {
    relatedTaskColumnsVisibility = _relatedTaskColumnsVisibility;
  }

  private org.primefaces.model.StreamedContent exportedFile;

  /**
   * Gets the field exportedFile.
   * @return the value of the field exportedFile; may be null.
   */
  public org.primefaces.model.StreamedContent getExportedFile()
  {
    return exportedFile;
  }

  /**
   * Sets the field exportedFile.
   * @param _exportedFile the new value of the field exportedFile.
   */
  public void setExportedFile(org.primefaces.model.StreamedContent _exportedFile)
  {
    exportedFile = _exportedFile;
  }

  private ch.ivy.addon.portalkit.ivydata.searchcriteria.TaskSearchCriteria taskSearchCriteria;

  /**
   * Gets the field taskSearchCriteria.
   * @return the value of the field taskSearchCriteria; may be null.
   */
  public ch.ivy.addon.portalkit.ivydata.searchcriteria.TaskSearchCriteria getTaskSearchCriteria()
  {
    return taskSearchCriteria;
  }

  /**
   * Sets the field taskSearchCriteria.
   * @param _taskSearchCriteria the new value of the field taskSearchCriteria.
   */
  public void setTaskSearchCriteria(ch.ivy.addon.portalkit.ivydata.searchcriteria.TaskSearchCriteria _taskSearchCriteria)
  {
    taskSearchCriteria = _taskSearchCriteria;
  }

  private java.lang.Integer totalTasks;

  /**
   * Gets the field totalTasks.
   * @return the value of the field totalTasks; may be null.
   */
  public java.lang.Integer getTotalTasks()
  {
    return totalTasks;
  }

  /**
   * Sets the field totalTasks.
   * @param _totalTasks the new value of the field totalTasks.
   */
  public void setTotalTasks(java.lang.Integer _totalTasks)
  {
    totalTasks = _totalTasks;
  }

  private java.lang.Integer loopCounter;

  /**
   * Gets the field loopCounter.
   * @return the value of the field loopCounter; may be null.
   */
  public java.lang.Integer getLoopCounter()
  {
    return loopCounter;
  }

  /**
   * Sets the field loopCounter.
   * @param _loopCounter the new value of the field loopCounter.
   */
  public void setLoopCounter(java.lang.Integer _loopCounter)
  {
    loopCounter = _loopCounter;
  }

  private java.lang.Integer maxResultNumberPerQuery;

  /**
   * Gets the field maxResultNumberPerQuery.
   * @return the value of the field maxResultNumberPerQuery; may be null.
   */
  public java.lang.Integer getMaxResultNumberPerQuery()
  {
    return maxResultNumberPerQuery;
  }

  /**
   * Sets the field maxResultNumberPerQuery.
   * @param _maxResultNumberPerQuery the new value of the field maxResultNumberPerQuery.
   */
  public void setMaxResultNumberPerQuery(java.lang.Integer _maxResultNumberPerQuery)
  {
    maxResultNumberPerQuery = _maxResultNumberPerQuery;
  }

  private java.util.List<ch.ivyteam.ivy.workflow.ITask> collectedTasksForExporting;

  /**
   * Gets the field collectedTasksForExporting.
   * @return the value of the field collectedTasksForExporting; may be null.
   */
  public java.util.List<ch.ivyteam.ivy.workflow.ITask> getCollectedTasksForExporting()
  {
    return collectedTasksForExporting;
  }

  /**
   * Sets the field collectedTasksForExporting.
   * @param _collectedTasksForExporting the new value of the field collectedTasksForExporting.
   */
  public void setCollectedTasksForExporting(java.util.List<ch.ivyteam.ivy.workflow.ITask> _collectedTasksForExporting)
  {
    collectedTasksForExporting = _collectedTasksForExporting;
  }

  private java.lang.Integer count;

  /**
   * Gets the field count.
   * @return the value of the field count; may be null.
   */
  public java.lang.Integer getCount()
  {
    return count;
  }

  /**
   * Sets the field count.
   * @param _count the new value of the field count.
   */
  public void setCount(java.lang.Integer _count)
  {
    count = _count;
  }

  private java.lang.Integer startIndex;

  /**
   * Gets the field startIndex.
   * @return the value of the field startIndex; may be null.
   */
  public java.lang.Integer getStartIndex()
  {
    return startIndex;
  }

  /**
   * Sets the field startIndex.
   * @param _startIndex the new value of the field startIndex.
   */
  public void setStartIndex(java.lang.Integer _startIndex)
  {
    startIndex = _startIndex;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.workflow.ITask> tasks;

  /**
   * Gets the field tasks.
   * @return the value of the field tasks; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.workflow.ITask> getTasks()
  {
    return tasks;
  }

  /**
   * Sets the field tasks.
   * @param _tasks the new value of the field tasks.
   */
  public void setTasks(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.workflow.ITask> _tasks)
  {
    tasks = _tasks;
  }

}
