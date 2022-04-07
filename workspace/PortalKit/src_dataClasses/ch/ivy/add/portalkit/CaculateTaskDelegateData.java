package ch.ivy.add.portalkit;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class CaculateTaskDelegateData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class CaculateTaskDelegateData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 8723472723825473896L;

  private transient ch.ivy.addon.portalkit.dto.SecurityMemberDTO currentUser;

  /**
   * Gets the field currentUser.
   * @return the value of the field currentUser; may be null.
   */
  public ch.ivy.addon.portalkit.dto.SecurityMemberDTO getCurrentUser()
  {
    return currentUser;
  }

  /**
   * Sets the field currentUser.
   * @param _currentUser the new value of the field currentUser.
   */
  public void setCurrentUser(ch.ivy.addon.portalkit.dto.SecurityMemberDTO _currentUser)
  {
    currentUser = _currentUser;
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

  private transient java.util.List<ch.ivy.addon.portalkit.dto.UserDTO> users;

  /**
   * Gets the field users.
   * @return the value of the field users; may be null.
   */
  public java.util.List<ch.ivy.addon.portalkit.dto.UserDTO> getUsers()
  {
    return users;
  }

  /**
   * Sets the field users.
   * @param _users the new value of the field users.
   */
  public void setUsers(java.util.List<ch.ivy.addon.portalkit.dto.UserDTO> _users)
  {
    users = _users;
  }

  private transient java.util.List<ch.ivy.addon.portalkit.dto.RoleDTO> roles;

  /**
   * Gets the field roles.
   * @return the value of the field roles; may be null.
   */
  public java.util.List<ch.ivy.addon.portalkit.dto.RoleDTO> getRoles()
  {
    return roles;
  }

  /**
   * Sets the field roles.
   * @param _roles the new value of the field roles.
   */
  public void setRoles(java.util.List<ch.ivy.addon.portalkit.dto.RoleDTO> _roles)
  {
    roles = _roles;
  }

}
