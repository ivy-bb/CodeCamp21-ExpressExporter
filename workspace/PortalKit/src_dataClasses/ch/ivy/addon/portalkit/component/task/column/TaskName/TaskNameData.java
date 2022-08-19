package ch.ivy.addon.portalkit.component.task.column.TaskName;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class TaskNameData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class TaskNameData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -4070290665254455263L;

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

}
