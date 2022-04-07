package ch.ivy.addon.portalkit.component.SideStep;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class SideStepData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class SideStepData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -7241231075726387484L;

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
