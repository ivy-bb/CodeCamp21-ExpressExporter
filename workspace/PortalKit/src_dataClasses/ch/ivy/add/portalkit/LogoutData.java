package ch.ivy.add.portalkit;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class LogoutData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class LogoutData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 3346639639594343266L;

  private transient java.lang.Boolean isTaskReserve;

  /**
   * Gets the field isTaskReserve.
   * @return the value of the field isTaskReserve; may be null.
   */
  public java.lang.Boolean getIsTaskReserve()
  {
    return isTaskReserve;
  }

  /**
   * Sets the field isTaskReserve.
   * @param _isTaskReserve the new value of the field isTaskReserve.
   */
  public void setIsTaskReserve(java.lang.Boolean _isTaskReserve)
  {
    isTaskReserve = _isTaskReserve;
  }

  private transient ch.ivyteam.ivy.workflow.ITask task;

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

}
