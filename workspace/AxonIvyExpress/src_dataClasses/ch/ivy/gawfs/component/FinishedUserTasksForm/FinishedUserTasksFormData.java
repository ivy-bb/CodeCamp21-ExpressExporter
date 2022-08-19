package ch.ivy.gawfs.component.FinishedUserTasksForm;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class FinishedUserTasksFormData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class FinishedUserTasksFormData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 4264919566166344252L;

  private java.util.List<gawfs.TaskDef> finishedTasks;

  /**
   * Gets the field finishedTasks.
   * @return the value of the field finishedTasks; may be null.
   */
  public java.util.List<gawfs.TaskDef> getFinishedTasks()
  {
    return finishedTasks;
  }

  /**
   * Sets the field finishedTasks.
   * @param _finishedTasks the new value of the field finishedTasks.
   */
  public void setFinishedTasks(java.util.List<gawfs.TaskDef> _finishedTasks)
  {
    finishedTasks = _finishedTasks;
  }

}
