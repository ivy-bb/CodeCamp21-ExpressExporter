package ch.ivy.addon.portalkit.multiapp.settings.LogoutSetting;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class LogoutSettingData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class LogoutSettingData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 6408771487542313797L;

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

  private java.lang.Boolean isWorkingOnATask;

  /**
   * Gets the field isWorkingOnATask.
   * @return the value of the field isWorkingOnATask; may be null.
   */
  public java.lang.Boolean getIsWorkingOnATask()
  {
    return isWorkingOnATask;
  }

  /**
   * Sets the field isWorkingOnATask.
   * @param _isWorkingOnATask the new value of the field isWorkingOnATask.
   */
  public void setIsWorkingOnATask(java.lang.Boolean _isWorkingOnATask)
  {
    isWorkingOnATask = _isWorkingOnATask;
  }

}
