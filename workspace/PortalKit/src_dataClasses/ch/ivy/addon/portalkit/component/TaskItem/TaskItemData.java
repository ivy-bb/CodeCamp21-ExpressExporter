package ch.ivy.addon.portalkit.component.TaskItem;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class TaskItemData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class TaskItemData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 7091905693707218217L;

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

  private java.lang.Boolean compactMode;

  /**
   * Gets the field compactMode.
   * @return the value of the field compactMode; may be null.
   */
  public java.lang.Boolean getCompactMode()
  {
    return compactMode;
  }

  /**
   * Sets the field compactMode.
   * @param _compactMode the new value of the field compactMode.
   */
  public void setCompactMode(java.lang.Boolean _compactMode)
  {
    compactMode = _compactMode;
  }

  private ch.ivyteam.ivy.workflow.ITask expandedTask;

  /**
   * Gets the field expandedTask.
   * @return the value of the field expandedTask; may be null.
   */
  public ch.ivyteam.ivy.workflow.ITask getExpandedTask()
  {
    return expandedTask;
  }

  /**
   * Sets the field expandedTask.
   * @param _expandedTask the new value of the field expandedTask.
   */
  public void setExpandedTask(ch.ivyteam.ivy.workflow.ITask _expandedTask)
  {
    expandedTask = _expandedTask;
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

  /**
   * Portal Task List url is used to be back after finish task
   */
  private java.lang.String callbackUrl;

  /**
   * Gets the field callbackUrl.
   * @return the value of the field callbackUrl; may be null.
   */
  public java.lang.String getCallbackUrl()
  {
    return callbackUrl;
  }

  /**
   * Sets the field callbackUrl.
   * @param _callbackUrl the new value of the field callbackUrl.
   */
  public void setCallbackUrl(java.lang.String _callbackUrl)
  {
    callbackUrl = _callbackUrl;
  }

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
