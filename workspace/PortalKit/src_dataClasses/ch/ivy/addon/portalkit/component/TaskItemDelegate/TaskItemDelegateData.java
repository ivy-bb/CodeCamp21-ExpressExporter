package ch.ivy.addon.portalkit.component.TaskItemDelegate;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class TaskItemDelegateData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class TaskItemDelegateData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 5405899632281394673L;

  private java.lang.Boolean canDelegateTask;

  /**
   * Gets the field canDelegateTask.
   * @return the value of the field canDelegateTask; may be null.
   */
  public java.lang.Boolean getCanDelegateTask()
  {
    return canDelegateTask;
  }

  /**
   * Sets the field canDelegateTask.
   * @param _canDelegateTask the new value of the field canDelegateTask.
   */
  public void setCanDelegateTask(java.lang.Boolean _canDelegateTask)
  {
    canDelegateTask = _canDelegateTask;
  }

  private java.util.List<ch.ivy.addon.portalkit.dto.UserDTO> usersToDelegate;

  /**
   * Gets the field usersToDelegate.
   * @return the value of the field usersToDelegate; may be null.
   */
  public java.util.List<ch.ivy.addon.portalkit.dto.UserDTO> getUsersToDelegate()
  {
    return usersToDelegate;
  }

  /**
   * Sets the field usersToDelegate.
   * @param _usersToDelegate the new value of the field usersToDelegate.
   */
  public void setUsersToDelegate(java.util.List<ch.ivy.addon.portalkit.dto.UserDTO> _usersToDelegate)
  {
    usersToDelegate = _usersToDelegate;
  }

  private java.util.List<ch.ivy.addon.portalkit.dto.RoleDTO> rolesToDelegate;

  /**
   * Gets the field rolesToDelegate.
   * @return the value of the field rolesToDelegate; may be null.
   */
  public java.util.List<ch.ivy.addon.portalkit.dto.RoleDTO> getRolesToDelegate()
  {
    return rolesToDelegate;
  }

  /**
   * Sets the field rolesToDelegate.
   * @param _rolesToDelegate the new value of the field rolesToDelegate.
   */
  public void setRolesToDelegate(java.util.List<ch.ivy.addon.portalkit.dto.RoleDTO> _rolesToDelegate)
  {
    rolesToDelegate = _rolesToDelegate;
  }

  private ch.ivyteam.ivy.application.IApplication application;

  /**
   * Gets the field application.
   * @return the value of the field application; may be null.
   */
  public ch.ivyteam.ivy.application.IApplication getApplication()
  {
    return application;
  }

  /**
   * Sets the field application.
   * @param _application the new value of the field application.
   */
  public void setApplication(ch.ivyteam.ivy.application.IApplication _application)
  {
    application = _application;
  }

  private java.lang.Boolean disabledDelegateButton;

  /**
   * Gets the field disabledDelegateButton.
   * @return the value of the field disabledDelegateButton; may be null.
   */
  public java.lang.Boolean getDisabledDelegateButton()
  {
    return disabledDelegateButton;
  }

  /**
   * Sets the field disabledDelegateButton.
   * @param _disabledDelegateButton the new value of the field disabledDelegateButton.
   */
  public void setDisabledDelegateButton(java.lang.Boolean _disabledDelegateButton)
  {
    disabledDelegateButton = _disabledDelegateButton;
  }

  private java.lang.Boolean isUserDelegated;

  /**
   * Gets the field isUserDelegated.
   * @return the value of the field isUserDelegated; may be null.
   */
  public java.lang.Boolean getIsUserDelegated()
  {
    return isUserDelegated;
  }

  /**
   * Sets the field isUserDelegated.
   * @param _isUserDelegated the new value of the field isUserDelegated.
   */
  public void setIsUserDelegated(java.lang.Boolean _isUserDelegated)
  {
    isUserDelegated = _isUserDelegated;
  }

  private ch.ivyteam.ivy.security.ISecurityMember delegatedSecurityMember;

  /**
   * Gets the field delegatedSecurityMember.
   * @return the value of the field delegatedSecurityMember; may be null.
   */
  public ch.ivyteam.ivy.security.ISecurityMember getDelegatedSecurityMember()
  {
    return delegatedSecurityMember;
  }

  /**
   * Sets the field delegatedSecurityMember.
   * @param _delegatedSecurityMember the new value of the field delegatedSecurityMember.
   */
  public void setDelegatedSecurityMember(ch.ivyteam.ivy.security.ISecurityMember _delegatedSecurityMember)
  {
    delegatedSecurityMember = _delegatedSecurityMember;
  }

  private java.lang.String delegateComment;

  /**
   * Gets the field delegateComment.
   * @return the value of the field delegateComment; may be null.
   */
  public java.lang.String getDelegateComment()
  {
    return delegateComment;
  }

  /**
   * Sets the field delegateComment.
   * @param _delegateComment the new value of the field delegateComment.
   */
  public void setDelegateComment(java.lang.String _delegateComment)
  {
    delegateComment = _delegateComment;
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

  private java.lang.String taskDelegationComment;

  /**
   * Gets the field taskDelegationComment.
   * @return the value of the field taskDelegationComment; may be null.
   */
  public java.lang.String getTaskDelegationComment()
  {
    return taskDelegationComment;
  }

  /**
   * Sets the field taskDelegationComment.
   * @param _taskDelegationComment the new value of the field taskDelegationComment.
   */
  public void setTaskDelegationComment(java.lang.String _taskDelegationComment)
  {
    taskDelegationComment = _taskDelegationComment;
  }

}
