package ch.ivy.addon.portal.setting.AbsenceManagement;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class AbsenceManagementData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class AbsenceManagementData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 4841464739173486984L;

  private java.util.Map absencesByUser;

  /**
   * Gets the field absencesByUser.
   * @return the value of the field absencesByUser; may be null.
   */
  public java.util.Map getAbsencesByUser()
  {
    return absencesByUser;
  }

  /**
   * Sets the field absencesByUser.
   * @param _absencesByUser the new value of the field absencesByUser.
   */
  public void setAbsencesByUser(java.util.Map _absencesByUser)
  {
    absencesByUser = _absencesByUser;
  }

  private ch.ivy.addon.portalkit.ivydata.bo.IvyAbsence backupAbsence;

  /**
   * Gets the field backupAbsence.
   * @return the value of the field backupAbsence; may be null.
   */
  public ch.ivy.addon.portalkit.ivydata.bo.IvyAbsence getBackupAbsence()
  {
    return backupAbsence;
  }

  /**
   * Sets the field backupAbsence.
   * @param _backupAbsence the new value of the field backupAbsence.
   */
  public void setBackupAbsence(ch.ivy.addon.portalkit.ivydata.bo.IvyAbsence _backupAbsence)
  {
    backupAbsence = _backupAbsence;
  }

  private transient java.lang.Boolean isSupervisor;

  /**
   * Gets the field isSupervisor.
   * @return the value of the field isSupervisor; may be null.
   */
  public java.lang.Boolean getIsSupervisor()
  {
    return isSupervisor;
  }

  /**
   * Sets the field isSupervisor.
   * @param _isSupervisor the new value of the field isSupervisor.
   */
  public void setIsSupervisor(java.lang.Boolean _isSupervisor)
  {
    isSupervisor = _isSupervisor;
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

  private transient java.lang.String queryAutoComplete;

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

  private ch.ivy.addon.portalkit.ivydata.bo.IvyAbsence selectedAbsence;

  /**
   * Gets the field selectedAbsence.
   * @return the value of the field selectedAbsence; may be null.
   */
  public ch.ivy.addon.portalkit.ivydata.bo.IvyAbsence getSelectedAbsence()
  {
    return selectedAbsence;
  }

  /**
   * Sets the field selectedAbsence.
   * @param _selectedAbsence the new value of the field selectedAbsence.
   */
  public void setSelectedAbsence(ch.ivy.addon.portalkit.ivydata.bo.IvyAbsence _selectedAbsence)
  {
    selectedAbsence = _selectedAbsence;
  }

  private transient java.lang.Boolean validationError;

  /**
   * Gets the field validationError.
   * @return the value of the field validationError; may be null.
   */
  public java.lang.Boolean getValidationError()
  {
    return validationError;
  }

  /**
   * Sets the field validationError.
   * @param _validationError the new value of the field validationError.
   */
  public void setValidationError(java.lang.Boolean _validationError)
  {
    validationError = _validationError;
  }

  private java.lang.Boolean absenceInThePastShown;

  /**
   * Gets the field absenceInThePastShown.
   * @return the value of the field absenceInThePastShown; may be null.
   */
  public java.lang.Boolean getAbsenceInThePastShown()
  {
    return absenceInThePastShown;
  }

  /**
   * Sets the field absenceInThePastShown.
   * @param _absenceInThePastShown the new value of the field absenceInThePastShown.
   */
  public void setAbsenceInThePastShown(java.lang.Boolean _absenceInThePastShown)
  {
    absenceInThePastShown = _absenceInThePastShown;
  }

  private java.util.List<ch.ivy.addon.portalkit.ivydata.bo.IvyAbsence> displayedAbsences;

  /**
   * Gets the field displayedAbsences.
   * @return the value of the field displayedAbsences; may be null.
   */
  public java.util.List<ch.ivy.addon.portalkit.ivydata.bo.IvyAbsence> getDisplayedAbsences()
  {
    return displayedAbsences;
  }

  /**
   * Sets the field displayedAbsences.
   * @param _displayedAbsences the new value of the field displayedAbsences.
   */
  public void setDisplayedAbsences(java.util.List<ch.ivy.addon.portalkit.ivydata.bo.IvyAbsence> _displayedAbsences)
  {
    displayedAbsences = _displayedAbsences;
  }

  private java.lang.Boolean isAbsenceBeingCreated;

  /**
   * Gets the field isAbsenceBeingCreated.
   * @return the value of the field isAbsenceBeingCreated; may be null.
   */
  public java.lang.Boolean getIsAbsenceBeingCreated()
  {
    return isAbsenceBeingCreated;
  }

  /**
   * Sets the field isAbsenceBeingCreated.
   * @param _isAbsenceBeingCreated the new value of the field isAbsenceBeingCreated.
   */
  public void setIsAbsenceBeingCreated(java.lang.Boolean _isAbsenceBeingCreated)
  {
    isAbsenceBeingCreated = _isAbsenceBeingCreated;
  }

  private ch.ivy.addon.portalkit.dto.UserDTO selectedAbsenceUser;

  /**
   * Gets the field selectedAbsenceUser.
   * @return the value of the field selectedAbsenceUser; may be null.
   */
  public ch.ivy.addon.portalkit.dto.UserDTO getSelectedAbsenceUser()
  {
    return selectedAbsenceUser;
  }

  /**
   * Sets the field selectedAbsenceUser.
   * @param _selectedAbsenceUser the new value of the field selectedAbsenceUser.
   */
  public void setSelectedAbsenceUser(ch.ivy.addon.portalkit.dto.UserDTO _selectedAbsenceUser)
  {
    selectedAbsenceUser = _selectedAbsenceUser;
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

  private java.lang.Boolean isCreateMode;

  /**
   * Gets the field isCreateMode.
   * @return the value of the field isCreateMode; may be null.
   */
  public java.lang.Boolean getIsCreateMode()
  {
    return isCreateMode;
  }

  /**
   * Sets the field isCreateMode.
   * @param _isCreateMode the new value of the field isCreateMode.
   */
  public void setIsCreateMode(java.lang.Boolean _isCreateMode)
  {
    isCreateMode = _isCreateMode;
  }

  private java.util.List<ch.ivy.addon.portalkit.ivydata.bo.IvySubstitute> substitutes;

  /**
   * Gets the field substitutes.
   * @return the value of the field substitutes; may be null.
   */
  public java.util.List<ch.ivy.addon.portalkit.ivydata.bo.IvySubstitute> getSubstitutes()
  {
    return substitutes;
  }

  /**
   * Sets the field substitutes.
   * @param _substitutes the new value of the field substitutes.
   */
  public void setSubstitutes(java.util.List<ch.ivy.addon.portalkit.ivydata.bo.IvySubstitute> _substitutes)
  {
    substitutes = _substitutes;
  }

  private java.util.List<ch.ivy.addon.portalkit.ivydata.bo.IvySubstitute> substitutions;

  /**
   * Gets the field substitutions.
   * @return the value of the field substitutions; may be null.
   */
  public java.util.List<ch.ivy.addon.portalkit.ivydata.bo.IvySubstitute> getSubstitutions()
  {
    return substitutions;
  }

  /**
   * Sets the field substitutions.
   * @param _substitutions the new value of the field substitutions.
   */
  public void setSubstitutions(java.util.List<ch.ivy.addon.portalkit.ivydata.bo.IvySubstitute> _substitutions)
  {
    substitutions = _substitutions;
  }

  private java.lang.String message;

  /**
   * Gets the field message.
   * @return the value of the field message; may be null.
   */
  public java.lang.String getMessage()
  {
    return message;
  }

  /**
   * Sets the field message.
   * @param _message the new value of the field message.
   */
  public void setMessage(java.lang.String _message)
  {
    message = _message;
  }

  private java.util.List<ch.ivy.addon.portalkit.dto.DeputyRole> deputyRoles;

  /**
   * Gets the field deputyRoles.
   * @return the value of the field deputyRoles; may be null.
   */
  public java.util.List<ch.ivy.addon.portalkit.dto.DeputyRole> getDeputyRoles()
  {
    return deputyRoles;
  }

  /**
   * Sets the field deputyRoles.
   * @param _deputyRoles the new value of the field deputyRoles.
   */
  public void setDeputyRoles(java.util.List<ch.ivy.addon.portalkit.dto.DeputyRole> _deputyRoles)
  {
    deputyRoles = _deputyRoles;
  }

  private ch.ivy.addon.portalkit.dto.DeputyRole selectedDeputyRole;

  /**
   * Gets the field selectedDeputyRole.
   * @return the value of the field selectedDeputyRole; may be null.
   */
  public ch.ivy.addon.portalkit.dto.DeputyRole getSelectedDeputyRole()
  {
    return selectedDeputyRole;
  }

  /**
   * Sets the field selectedDeputyRole.
   * @param _selectedDeputyRole the new value of the field selectedDeputyRole.
   */
  public void setSelectedDeputyRole(ch.ivy.addon.portalkit.dto.DeputyRole _selectedDeputyRole)
  {
    selectedDeputyRole = _selectedDeputyRole;
  }

  private java.lang.String selectedDeputyRoleId;

  /**
   * Gets the field selectedDeputyRoleId.
   * @return the value of the field selectedDeputyRoleId; may be null.
   */
  public java.lang.String getSelectedDeputyRoleId()
  {
    return selectedDeputyRoleId;
  }

  /**
   * Sets the field selectedDeputyRoleId.
   * @param _selectedDeputyRoleId the new value of the field selectedDeputyRoleId.
   */
  public void setSelectedDeputyRoleId(java.lang.String _selectedDeputyRoleId)
  {
    selectedDeputyRoleId = _selectedDeputyRoleId;
  }

  private ch.ivy.addon.portalkit.dto.UserDTO selectedDeputy;

  /**
   * Gets the field selectedDeputy.
   * @return the value of the field selectedDeputy; may be null.
   */
  public ch.ivy.addon.portalkit.dto.UserDTO getSelectedDeputy()
  {
    return selectedDeputy;
  }

  /**
   * Sets the field selectedDeputy.
   * @param _selectedDeputy the new value of the field selectedDeputy.
   */
  public void setSelectedDeputy(ch.ivy.addon.portalkit.dto.UserDTO _selectedDeputy)
  {
    selectedDeputy = _selectedDeputy;
  }

  private java.util.List<ch.ivyteam.ivy.security.ISecurityMember> selectedDeputies;

  /**
   * Gets the field selectedDeputies.
   * @return the value of the field selectedDeputies; may be null.
   */
  public java.util.List<ch.ivyteam.ivy.security.ISecurityMember> getSelectedDeputies()
  {
    return selectedDeputies;
  }

  /**
   * Sets the field selectedDeputies.
   * @param _selectedDeputies the new value of the field selectedDeputies.
   */
  public void setSelectedDeputies(java.util.List<ch.ivyteam.ivy.security.ISecurityMember> _selectedDeputies)
  {
    selectedDeputies = _selectedDeputies;
  }

}
