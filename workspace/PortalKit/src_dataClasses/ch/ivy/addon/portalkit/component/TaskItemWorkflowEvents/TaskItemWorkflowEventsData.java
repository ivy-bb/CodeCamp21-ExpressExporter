package ch.ivy.addon.portalkit.component.TaskItemWorkflowEvents;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class TaskItemWorkflowEventsData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class TaskItemWorkflowEventsData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -2269959205702911689L;

  private java.util.List<ch.ivy.addon.portalkit.bo.History> workflowEvents;

  /**
   * Gets the field workflowEvents.
   * @return the value of the field workflowEvents; may be null.
   */
  public java.util.List<ch.ivy.addon.portalkit.bo.History> getWorkflowEvents()
  {
    return workflowEvents;
  }

  /**
   * Sets the field workflowEvents.
   * @param _workflowEvents the new value of the field workflowEvents.
   */
  public void setWorkflowEvents(java.util.List<ch.ivy.addon.portalkit.bo.History> _workflowEvents)
  {
    workflowEvents = _workflowEvents;
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

}
