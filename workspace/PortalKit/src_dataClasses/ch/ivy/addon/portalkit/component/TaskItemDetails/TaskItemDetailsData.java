package ch.ivy.addon.portalkit.component.TaskItemDetails;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class TaskItemDetailsData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class TaskItemDetailsData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -8398525092273603664L;

  private java.lang.String oldName;

  /**
   * Gets the field oldName.
   * @return the value of the field oldName; may be null.
   */
  public java.lang.String getOldName()
  {
    return oldName;
  }

  /**
   * Sets the field oldName.
   * @param _oldName the new value of the field oldName.
   */
  public void setOldName(java.lang.String _oldName)
  {
    oldName = _oldName;
  }

  private java.lang.String changeNameNoteContent;

  /**
   * Gets the field changeNameNoteContent.
   * @return the value of the field changeNameNoteContent; may be null.
   */
  public java.lang.String getChangeNameNoteContent()
  {
    return changeNameNoteContent;
  }

  /**
   * Sets the field changeNameNoteContent.
   * @param _changeNameNoteContent the new value of the field changeNameNoteContent.
   */
  public void setChangeNameNoteContent(java.lang.String _changeNameNoteContent)
  {
    changeNameNoteContent = _changeNameNoteContent;
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

  /**
   * Page opened Task Details
   */
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

  private java.lang.Boolean isHideTaskDocument;

  /**
   * Gets the field isHideTaskDocument.
   * @return the value of the field isHideTaskDocument; may be null.
   */
  public java.lang.Boolean getIsHideTaskDocument()
  {
    return isHideTaskDocument;
  }

  /**
   * Sets the field isHideTaskDocument.
   * @param _isHideTaskDocument the new value of the field isHideTaskDocument.
   */
  public void setIsHideTaskDocument(java.lang.Boolean _isHideTaskDocument)
  {
    isHideTaskDocument = _isHideTaskDocument;
  }

}
