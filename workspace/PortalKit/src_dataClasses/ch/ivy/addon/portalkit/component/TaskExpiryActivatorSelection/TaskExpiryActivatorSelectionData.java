package ch.ivy.addon.portalkit.component.TaskExpiryActivatorSelection;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class TaskExpiryActivatorSelectionData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class TaskExpiryActivatorSelectionData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -4255961937266816549L;

  private java.lang.Boolean canChangeTaskActivator;

  /**
   * Gets the field canChangeTaskActivator.
   * @return the value of the field canChangeTaskActivator; may be null.
   */
  public java.lang.Boolean getCanChangeTaskActivator()
  {
    return canChangeTaskActivator;
  }

  /**
   * Sets the field canChangeTaskActivator.
   * @param _canChangeTaskActivator the new value of the field canChangeTaskActivator.
   */
  public void setCanChangeTaskActivator(java.lang.Boolean _canChangeTaskActivator)
  {
    canChangeTaskActivator = _canChangeTaskActivator;
  }

  private java.util.List<ch.ivy.addon.portalkit.dto.UserDTO> users;

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

  private java.util.List<ch.ivy.addon.portalkit.dto.RoleDTO> roles;

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

  private ch.ivyteam.ivy.security.ISecurityMember selectedActivator;

  /**
   * Gets the field selectedActivator.
   * @return the value of the field selectedActivator; may be null.
   */
  public ch.ivyteam.ivy.security.ISecurityMember getSelectedActivator()
  {
    return selectedActivator;
  }

  /**
   * Sets the field selectedActivator.
   * @param _selectedActivator the new value of the field selectedActivator.
   */
  public void setSelectedActivator(ch.ivyteam.ivy.security.ISecurityMember _selectedActivator)
  {
    selectedActivator = _selectedActivator;
  }

  private java.lang.String queryAutoComplete;

  /**
   * Gets the field queryAutoComplete.
   * @return the value of the field queryAutoComplete; may be null.
   */
  public java.lang.String getQueryAutoComplete()
  {
    return queryAutoComplete;
  }

  /**
   * Sets the field queryAutoComplete.
   * @param _queryAutoComplete the new value of the field queryAutoComplete.
   */
  public void setQueryAutoComplete(java.lang.String _queryAutoComplete)
  {
    queryAutoComplete = _queryAutoComplete;
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

  private ch.ivy.addon.portalkit.dto.UserDTO selectedUser;

  /**
   * Gets the field selectedUser.
   * @return the value of the field selectedUser; may be null.
   */
  public ch.ivy.addon.portalkit.dto.UserDTO getSelectedUser()
  {
    return selectedUser;
  }

  /**
   * Sets the field selectedUser.
   * @param _selectedUser the new value of the field selectedUser.
   */
  public void setSelectedUser(ch.ivy.addon.portalkit.dto.UserDTO _selectedUser)
  {
    selectedUser = _selectedUser;
  }

  private ch.ivy.addon.portalkit.dto.RoleDTO selectedRole;

  /**
   * Gets the field selectedRole.
   * @return the value of the field selectedRole; may be null.
   */
  public ch.ivy.addon.portalkit.dto.RoleDTO getSelectedRole()
  {
    return selectedRole;
  }

  /**
   * Sets the field selectedRole.
   * @param _selectedRole the new value of the field selectedRole.
   */
  public void setSelectedRole(ch.ivy.addon.portalkit.dto.RoleDTO _selectedRole)
  {
    selectedRole = _selectedRole;
  }

  private java.lang.String comment;

  /**
   * Gets the field comment.
   * @return the value of the field comment; may be null.
   */
  public java.lang.String getComment()
  {
    return comment;
  }

  /**
   * Sets the field comment.
   * @param _comment the new value of the field comment.
   */
  public void setComment(java.lang.String _comment)
  {
    comment = _comment;
  }

  private java.lang.String notes;

  /**
   * Gets the field notes.
   * @return the value of the field notes; may be null.
   */
  public java.lang.String getNotes()
  {
    return notes;
  }

  /**
   * Sets the field notes.
   * @param _notes the new value of the field notes.
   */
  public void setNotes(java.lang.String _notes)
  {
    notes = _notes;
  }

  private java.lang.Boolean isUserAssigned;

  /**
   * Gets the field isUserAssigned.
   * @return the value of the field isUserAssigned; may be null.
   */
  public java.lang.Boolean getIsUserAssigned()
  {
    return isUserAssigned;
  }

  /**
   * Sets the field isUserAssigned.
   * @param _isUserAssigned the new value of the field isUserAssigned.
   */
  public void setIsUserAssigned(java.lang.Boolean _isUserAssigned)
  {
    isUserAssigned = _isUserAssigned;
  }

  private java.lang.Boolean isDisabledAssignButton;

  /**
   * Gets the field isDisabledAssignButton.
   * @return the value of the field isDisabledAssignButton; may be null.
   */
  public java.lang.Boolean getIsDisabledAssignButton()
  {
    return isDisabledAssignButton;
  }

  /**
   * Sets the field isDisabledAssignButton.
   * @param _isDisabledAssignButton the new value of the field isDisabledAssignButton.
   */
  public void setIsDisabledAssignButton(java.lang.Boolean _isDisabledAssignButton)
  {
    isDisabledAssignButton = _isDisabledAssignButton;
  }

}
