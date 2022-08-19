package ch.ivy.gawfs.workflowExecution.UserTaskWithMailForm;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class UserTaskWithMailFormData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class UserTaskWithMailFormData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 1296653853587524048L;

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

  private ch.ivy.addon.portalkit.bo.ExpressUserEmail email;

  /**
   * Gets the field email.
   * @return the value of the field email; may be null.
   */
  public ch.ivy.addon.portalkit.bo.ExpressUserEmail getEmail()
  {
    return email;
  }

  /**
   * Sets the field email.
   * @param _email the new value of the field email.
   */
  public void setEmail(ch.ivy.addon.portalkit.bo.ExpressUserEmail _email)
  {
    email = _email;
  }

}
