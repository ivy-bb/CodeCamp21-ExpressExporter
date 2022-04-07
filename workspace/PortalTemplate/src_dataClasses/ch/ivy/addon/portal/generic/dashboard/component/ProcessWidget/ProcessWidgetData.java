package ch.ivy.addon.portal.generic.dashboard.component.ProcessWidget;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class ProcessWidgetData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class ProcessWidgetData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -3341793865656862211L;

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

  private ch.ivyteam.ivy.workflow.query.TaskQuery taskQuery;

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

  private ch.ivy.addon.portalkit.dto.dashboard.TaskDashboardWidget taskWidget;

  /**
   * Gets the field taskWidget.
   * @return the value of the field taskWidget; may be null.
   */
  public ch.ivy.addon.portalkit.dto.dashboard.TaskDashboardWidget getTaskWidget()
  {
    return taskWidget;
  }

  /**
   * Sets the field taskWidget.
   * @param _taskWidget the new value of the field taskWidget.
   */
  public void setTaskWidget(ch.ivy.addon.portalkit.dto.dashboard.TaskDashboardWidget _taskWidget)
  {
    taskWidget = _taskWidget;
  }

  private java.util.List<ch.ivyteam.ivy.workflow.ITask> filteredTasks;

  /**
   * Gets the field filteredTasks.
   * @return the value of the field filteredTasks; may be null.
   */
  public java.util.List<ch.ivyteam.ivy.workflow.ITask> getFilteredTasks()
  {
    return filteredTasks;
  }

  /**
   * Sets the field filteredTasks.
   * @param _filteredTasks the new value of the field filteredTasks.
   */
  public void setFilteredTasks(java.util.List<ch.ivyteam.ivy.workflow.ITask> _filteredTasks)
  {
    filteredTasks = _filteredTasks;
  }

  private ch.ivy.addon.portalkit.datamodel.DashboardTaskLazyDataModel dataModel;

  /**
   * Gets the field dataModel.
   * @return the value of the field dataModel; may be null.
   */
  public ch.ivy.addon.portalkit.datamodel.DashboardTaskLazyDataModel getDataModel()
  {
    return dataModel;
  }

  /**
   * Sets the field dataModel.
   * @param _dataModel the new value of the field dataModel.
   */
  public void setDataModel(ch.ivy.addon.portalkit.datamodel.DashboardTaskLazyDataModel _dataModel)
  {
    dataModel = _dataModel;
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

  private java.lang.Boolean showInformationLink;

  /**
   * Gets the field showInformationLink.
   * @return the value of the field showInformationLink; may be null.
   */
  public java.lang.Boolean getShowInformationLink()
  {
    return showInformationLink;
  }

  /**
   * Sets the field showInformationLink.
   * @param _showInformationLink the new value of the field showInformationLink.
   */
  public void setShowInformationLink(java.lang.Boolean _showInformationLink)
  {
    showInformationLink = _showInformationLink;
  }

}
