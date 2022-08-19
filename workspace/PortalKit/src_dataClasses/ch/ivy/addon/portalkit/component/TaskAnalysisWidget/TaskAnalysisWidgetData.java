package ch.ivy.addon.portalkit.component.TaskAnalysisWidget;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class TaskAnalysisWidgetData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class TaskAnalysisWidgetData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 2079707292695133918L;

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

  private ch.ivy.addon.portalkit.datamodel.internal.TaskAnalysisLazyDataModel dataModel;

  /**
   * Gets the field dataModel.
   * @return the value of the field dataModel; may be null.
   */
  public ch.ivy.addon.portalkit.datamodel.internal.TaskAnalysisLazyDataModel getDataModel()
  {
    return dataModel;
  }

  /**
   * Sets the field dataModel.
   * @param _dataModel the new value of the field dataModel.
   */
  public void setDataModel(ch.ivy.addon.portalkit.datamodel.internal.TaskAnalysisLazyDataModel _dataModel)
  {
    dataModel = _dataModel;
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

  private java.lang.Long totalTasks;

  /**
   * Gets the field totalTasks.
   * @return the value of the field totalTasks; may be null.
   */
  public java.lang.Long getTotalTasks()
  {
    return totalTasks;
  }

  /**
   * Sets the field totalTasks.
   * @param _totalTasks the new value of the field totalTasks.
   */
  public void setTotalTasks(java.lang.Long _totalTasks)
  {
    totalTasks = _totalTasks;
  }

  private java.util.List<ch.ivyteam.ivy.workflow.ITask> tasks;

  /**
   * Gets the field tasks.
   * @return the value of the field tasks; may be null.
   */
  public java.util.List<ch.ivyteam.ivy.workflow.ITask> getTasks()
  {
    return tasks;
  }

  /**
   * Sets the field tasks.
   * @param _tasks the new value of the field tasks.
   */
  public void setTasks(java.util.List<ch.ivyteam.ivy.workflow.ITask> _tasks)
  {
    tasks = _tasks;
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

  private java.lang.String filterSetName;

  /**
   * Gets the field filterSetName.
   * @return the value of the field filterSetName; may be null.
   */
  public java.lang.String getFilterSetName()
  {
    return filterSetName;
  }

  /**
   * Sets the field filterSetName.
   * @param _filterSetName the new value of the field filterSetName.
   */
  public void setFilterSetName(java.lang.String _filterSetName)
  {
    filterSetName = _filterSetName;
  }

  private ch.ivy.addon.portalkit.enums.FilterType filterType;

  /**
   * Gets the field filterType.
   * @return the value of the field filterType; may be null.
   */
  public ch.ivy.addon.portalkit.enums.FilterType getFilterType()
  {
    return filterType;
  }

  /**
   * Sets the field filterType.
   * @param _filterType the new value of the field filterType.
   */
  public void setFilterType(ch.ivy.addon.portalkit.enums.FilterType _filterType)
  {
    filterType = _filterType;
  }

  private ch.ivy.addon.portalkit.taskfilter.impl.TaskAnalysisFilterData taskFilterDataToBeRemoved;

  /**
   * Gets the field taskFilterDataToBeRemoved.
   * @return the value of the field taskFilterDataToBeRemoved; may be null.
   */
  public ch.ivy.addon.portalkit.taskfilter.impl.TaskAnalysisFilterData getTaskFilterDataToBeRemoved()
  {
    return taskFilterDataToBeRemoved;
  }

  /**
   * Sets the field taskFilterDataToBeRemoved.
   * @param _taskFilterDataToBeRemoved the new value of the field taskFilterDataToBeRemoved.
   */
  public void setTaskFilterDataToBeRemoved(ch.ivy.addon.portalkit.taskfilter.impl.TaskAnalysisFilterData _taskFilterDataToBeRemoved)
  {
    taskFilterDataToBeRemoved = _taskFilterDataToBeRemoved;
  }

  private java.lang.Boolean isFilterExisted;

  /**
   * Gets the field isFilterExisted.
   * @return the value of the field isFilterExisted; may be null.
   */
  public java.lang.Boolean getIsFilterExisted()
  {
    return isFilterExisted;
  }

  /**
   * Sets the field isFilterExisted.
   * @param _isFilterExisted the new value of the field isFilterExisted.
   */
  public void setIsFilterExisted(java.lang.Boolean _isFilterExisted)
  {
    isFilterExisted = _isFilterExisted;
  }

  private java.lang.Long taskFilterGroupId;

  /**
   * Gets the field taskFilterGroupId.
   * @return the value of the field taskFilterGroupId; may be null.
   */
  public java.lang.Long getTaskFilterGroupId()
  {
    return taskFilterGroupId;
  }

  /**
   * Sets the field taskFilterGroupId.
   * @param _taskFilterGroupId the new value of the field taskFilterGroupId.
   */
  public void setTaskFilterGroupId(java.lang.Long _taskFilterGroupId)
  {
    taskFilterGroupId = _taskFilterGroupId;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.taskfilter.impl.TaskAnalysisFilterData> taskPublicFilters;

  /**
   * Gets the field taskPublicFilters.
   * @return the value of the field taskPublicFilters; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.taskfilter.impl.TaskAnalysisFilterData> getTaskPublicFilters()
  {
    return taskPublicFilters;
  }

  /**
   * Sets the field taskPublicFilters.
   * @param _taskPublicFilters the new value of the field taskPublicFilters.
   */
  public void setTaskPublicFilters(ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.taskfilter.impl.TaskAnalysisFilterData> _taskPublicFilters)
  {
    taskPublicFilters = _taskPublicFilters;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.taskfilter.impl.TaskAnalysisFilterData> taskPrivateFilters;

  /**
   * Gets the field taskPrivateFilters.
   * @return the value of the field taskPrivateFilters; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.taskfilter.impl.TaskAnalysisFilterData> getTaskPrivateFilters()
  {
    return taskPrivateFilters;
  }

  /**
   * Sets the field taskPrivateFilters.
   * @param _taskPrivateFilters the new value of the field taskPrivateFilters.
   */
  public void setTaskPrivateFilters(ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.taskfilter.impl.TaskAnalysisFilterData> _taskPrivateFilters)
  {
    taskPrivateFilters = _taskPrivateFilters;
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

  private java.util.Map columnsVisibility;

  /**
   * Gets the field columnsVisibility.
   * @return the value of the field columnsVisibility; may be null.
   */
  public java.util.Map getColumnsVisibility()
  {
    return columnsVisibility;
  }

  /**
   * Sets the field columnsVisibility.
   * @param _columnsVisibility the new value of the field columnsVisibility.
   */
  public void setColumnsVisibility(java.util.Map _columnsVisibility)
  {
    columnsVisibility = _columnsVisibility;
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

  /**
   * max number of records when querying task for exporting
   */
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

}
