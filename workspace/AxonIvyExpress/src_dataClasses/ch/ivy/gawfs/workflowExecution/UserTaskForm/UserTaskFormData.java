package ch.ivy.gawfs.workflowExecution.UserTaskForm;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class UserTaskFormData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class UserTaskFormData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -4218514179450907130L;

  private gawfs.ExecutePredefinedWorkflowData executePredefinedWorkflowData;

  /**
   * Gets the field executePredefinedWorkflowData.
   * @return the value of the field executePredefinedWorkflowData; may be null.
   */
  public gawfs.ExecutePredefinedWorkflowData getExecutePredefinedWorkflowData()
  {
    return executePredefinedWorkflowData;
  }

  /**
   * Sets the field executePredefinedWorkflowData.
   * @param _executePredefinedWorkflowData the new value of the field executePredefinedWorkflowData.
   */
  public void setExecutePredefinedWorkflowData(gawfs.ExecutePredefinedWorkflowData _executePredefinedWorkflowData)
  {
    executePredefinedWorkflowData = _executePredefinedWorkflowData;
  }

  private gawfs.TaskDef workingTask;

  /**
   * Gets the field workingTask.
   * @return the value of the field workingTask; may be null.
   */
  public gawfs.TaskDef getWorkingTask()
  {
    return workingTask;
  }

  /**
   * Sets the field workingTask.
   * @param _workingTask the new value of the field workingTask.
   */
  public void setWorkingTask(gawfs.TaskDef _workingTask)
  {
    workingTask = _workingTask;
  }

}
