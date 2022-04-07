package ch.ivy.addon.portal.generic;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class AssignRolesGroupChatData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class AssignRolesGroupChatData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -2560218228230443470L;

  private transient java.util.List<ch.ivyteam.ivy.security.IRole> roles;

  /**
   * Gets the field roles.
   * @return the value of the field roles; may be null.
   */
  public java.util.List<ch.ivyteam.ivy.security.IRole> getRoles()
  {
    return roles;
  }

  /**
   * Sets the field roles.
   * @param _roles the new value of the field roles.
   */
  public void setRoles(java.util.List<ch.ivyteam.ivy.security.IRole> _roles)
  {
    roles = _roles;
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
