package ch.ivy.addon.portal.component.iframe.PortalTaskItemDetailsInIFrame;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class PortalTaskItemDetailsInIFrameData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class PortalTaskItemDetailsInIFrameData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -2816286173669853923L;

  private ch.ivy.addon.portalkit.datamodel.TaskLazyDataModel dataModel;

  /**
   * Gets the field dataModel.
   * @return the value of the field dataModel; may be null.
   */
  public ch.ivy.addon.portalkit.datamodel.TaskLazyDataModel getDataModel()
  {
    return dataModel;
  }

  /**
   * Sets the field dataModel.
   * @param _dataModel the new value of the field dataModel.
   */
  public void setDataModel(ch.ivy.addon.portalkit.datamodel.TaskLazyDataModel _dataModel)
  {
    dataModel = _dataModel;
  }

  private java.lang.Boolean isFromTaskList;

  /**
   * Gets the field isFromTaskList.
   * @return the value of the field isFromTaskList; may be null.
   */
  public java.lang.Boolean getIsFromTaskList()
  {
    return isFromTaskList;
  }

  /**
   * Sets the field isFromTaskList.
   * @param _isFromTaskList the new value of the field isFromTaskList.
   */
  public void setIsFromTaskList(java.lang.Boolean _isFromTaskList)
  {
    isFromTaskList = _isFromTaskList;
  }

  private ch.ivy.addon.portalkit.enums.PortalPage portalPage;

  /**
   * Gets the field portalPage.
   * @return the value of the field portalPage; may be null.
   */
  public ch.ivy.addon.portalkit.enums.PortalPage getPortalPage()
  {
    return portalPage;
  }

  /**
   * Sets the field portalPage.
   * @param _portalPage the new value of the field portalPage.
   */
  public void setPortalPage(ch.ivy.addon.portalkit.enums.PortalPage _portalPage)
  {
    portalPage = _portalPage;
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

  private java.lang.Boolean isTaskStartedInDetails;

  /**
   * Gets the field isTaskStartedInDetails.
   * @return the value of the field isTaskStartedInDetails; may be null.
   */
  public java.lang.Boolean getIsTaskStartedInDetails()
  {
    return isTaskStartedInDetails;
  }

  /**
   * Sets the field isTaskStartedInDetails.
   * @param _isTaskStartedInDetails the new value of the field isTaskStartedInDetails.
   */
  public void setIsTaskStartedInDetails(java.lang.Boolean _isTaskStartedInDetails)
  {
    isTaskStartedInDetails = _isTaskStartedInDetails;
  }

}
