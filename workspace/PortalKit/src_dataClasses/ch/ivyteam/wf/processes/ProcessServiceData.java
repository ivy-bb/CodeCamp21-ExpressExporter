package ch.ivyteam.wf.processes;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class ProcessServiceData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class ProcessServiceData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -223951785025385635L;

  private transient java.util.List<ch.ivyteam.ivy.workflow.start.IWebStartable> processes;

  /**
   * Gets the field processes.
   * @return the value of the field processes; may be null.
   */
  public java.util.List<ch.ivyteam.ivy.workflow.start.IWebStartable> getProcesses()
  {
    return processes;
  }

  /**
   * Sets the field processes.
   * @param _processes the new value of the field processes.
   */
  public void setProcesses(java.util.List<ch.ivyteam.ivy.workflow.start.IWebStartable> _processes)
  {
    processes = _processes;
  }

}
