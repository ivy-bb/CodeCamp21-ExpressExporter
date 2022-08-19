package ch.ivyteam.wf.processes;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class TaskServiceData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class TaskServiceData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 3985199150626725427L;

  private transient ch.ivyteam.ivy.workflow.category.CategoryTree categoryTree;

  /**
   * Gets the field categoryTree.
   * @return the value of the field categoryTree; may be null.
   */
  public ch.ivyteam.ivy.workflow.category.CategoryTree getCategoryTree()
  {
    return categoryTree;
  }

  /**
   * Sets the field categoryTree.
   * @param _categoryTree the new value of the field categoryTree.
   */
  public void setCategoryTree(ch.ivyteam.ivy.workflow.category.CategoryTree _categoryTree)
  {
    categoryTree = _categoryTree;
  }

  private transient java.lang.Integer count;

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

  private transient ch.ivy.addon.portalkit.bo.ElapsedTimeStatistic elapsedTimeStatistic;

  /**
   * Gets the field elapsedTimeStatistic.
   * @return the value of the field elapsedTimeStatistic; may be null.
   */
  public ch.ivy.addon.portalkit.bo.ElapsedTimeStatistic getElapsedTimeStatistic()
  {
    return elapsedTimeStatistic;
  }

  /**
   * Sets the field elapsedTimeStatistic.
   * @param _elapsedTimeStatistic the new value of the field elapsedTimeStatistic.
   */
  public void setElapsedTimeStatistic(ch.ivy.addon.portalkit.bo.ElapsedTimeStatistic _elapsedTimeStatistic)
  {
    elapsedTimeStatistic = _elapsedTimeStatistic;
  }

  private transient ch.ivy.addon.portalkit.bo.ExpiryStatistic expiryStatistic;

  /**
   * Gets the field expiryStatistic.
   * @return the value of the field expiryStatistic; may be null.
   */
  public ch.ivy.addon.portalkit.bo.ExpiryStatistic getExpiryStatistic()
  {
    return expiryStatistic;
  }

  /**
   * Sets the field expiryStatistic.
   * @param _expiryStatistic the new value of the field expiryStatistic.
   */
  public void setExpiryStatistic(ch.ivy.addon.portalkit.bo.ExpiryStatistic _expiryStatistic)
  {
    expiryStatistic = _expiryStatistic;
  }

  private transient ch.ivy.addon.portalkit.bo.PriorityStatistic priorityStatistic;

  /**
   * Gets the field priorityStatistic.
   * @return the value of the field priorityStatistic; may be null.
   */
  public ch.ivy.addon.portalkit.bo.PriorityStatistic getPriorityStatistic()
  {
    return priorityStatistic;
  }

  /**
   * Sets the field priorityStatistic.
   * @param _priorityStatistic the new value of the field priorityStatistic.
   */
  public void setPriorityStatistic(ch.ivy.addon.portalkit.bo.PriorityStatistic _priorityStatistic)
  {
    priorityStatistic = _priorityStatistic;
  }

  private transient java.lang.Integer startIndex;

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

  private transient ch.ivy.addon.portalkit.ivydata.searchcriteria.TaskCategorySearchCriteria taskCategorySearchCriteria;

  /**
   * Gets the field taskCategorySearchCriteria.
   * @return the value of the field taskCategorySearchCriteria; may be null.
   */
  public ch.ivy.addon.portalkit.ivydata.searchcriteria.TaskCategorySearchCriteria getTaskCategorySearchCriteria()
  {
    return taskCategorySearchCriteria;
  }

  /**
   * Sets the field taskCategorySearchCriteria.
   * @param _taskCategorySearchCriteria the new value of the field taskCategorySearchCriteria.
   */
  public void setTaskCategorySearchCriteria(ch.ivy.addon.portalkit.ivydata.searchcriteria.TaskCategorySearchCriteria _taskCategorySearchCriteria)
  {
    taskCategorySearchCriteria = _taskCategorySearchCriteria;
  }

  private transient java.util.List<ch.ivyteam.ivy.workflow.ITask> tasks;

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

  private transient ch.ivy.addon.portalkit.ivydata.searchcriteria.TaskSearchCriteria taskSearchCriteria;

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

  private transient java.lang.Long totalTasks;

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

  private transient ch.ivy.addon.portalkit.bo.TaskStateStatistic taskStateStatistic;

  /**
   * Gets the field taskStateStatistic.
   * @return the value of the field taskStateStatistic; may be null.
   */
  public ch.ivy.addon.portalkit.bo.TaskStateStatistic getTaskStateStatistic()
  {
    return taskStateStatistic;
  }

  /**
   * Sets the field taskStateStatistic.
   * @param _taskStateStatistic the new value of the field taskStateStatistic.
   */
  public void setTaskStateStatistic(ch.ivy.addon.portalkit.bo.TaskStateStatistic _taskStateStatistic)
  {
    taskStateStatistic = _taskStateStatistic;
  }

  private transient ch.ivyteam.ivy.workflow.query.TaskQuery taskQuery;

  /**
   * Gets the field taskQuery.
   * @return the value of the field taskQuery; may be null.
   */
  public ch.ivyteam.ivy.workflow.query.TaskQuery getTaskQuery()
  {
    return taskQuery;
  }

  /**
   * Sets the field taskQuery.
   * @param _taskQuery the new value of the field taskQuery.
   */
  public void setTaskQuery(ch.ivyteam.ivy.workflow.query.TaskQuery _taskQuery)
  {
    taskQuery = _taskQuery;
  }

  private transient ch.ivy.addon.portalkit.bo.TaskCategoryStatistic taskCategoryStatistic;

  /**
   * Gets the field taskCategoryStatistic.
   * @return the value of the field taskCategoryStatistic; may be null.
   */
  public ch.ivy.addon.portalkit.bo.TaskCategoryStatistic getTaskCategoryStatistic()
  {
    return taskCategoryStatistic;
  }

  /**
   * Sets the field taskCategoryStatistic.
   * @param _taskCategoryStatistic the new value of the field taskCategoryStatistic.
   */
  public void setTaskCategoryStatistic(ch.ivy.addon.portalkit.bo.TaskCategoryStatistic _taskCategoryStatistic)
  {
    taskCategoryStatistic = _taskCategoryStatistic;
  }

}
