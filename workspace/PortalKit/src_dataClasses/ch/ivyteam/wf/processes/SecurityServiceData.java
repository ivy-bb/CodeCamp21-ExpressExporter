package ch.ivyteam.wf.processes;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class SecurityServiceData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class SecurityServiceData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 8483105248384363853L;

  private transient java.lang.Integer count;

  /**
   * Gets the field count.
   * @return the value of the field count; may be null.
   */
  public java.lang.Integer getCount()
  {
    return count;
  }

  /**
   * Sets the field count.
   * @param _count the new value of the field count.
   */
  public void setCount(java.lang.Integer _count)
  {
    count = _count;
  }

  private transient java.lang.String query;

  /**
   * Gets the field query.
   * @return the value of the field query; may be null.
   */
  public java.lang.String getQuery()
  {
    return query;
  }

  /**
   * Sets the field query.
   * @param _query the new value of the field query.
   */
  public void setQuery(java.lang.String _query)
  {
    query = _query;
  }

  private transient java.util.List<ch.ivy.addon.portalkit.dto.RoleDTO> roleDTOs;

  /**
   * Gets the field roleDTOs.
   * @return the value of the field roleDTOs; may be null.
   */
  public java.util.List<ch.ivy.addon.portalkit.dto.RoleDTO> getRoleDTOs()
  {
    return roleDTOs;
  }

  /**
   * Sets the field roleDTOs.
   * @param _roleDTOs the new value of the field roleDTOs.
   */
  public void setRoleDTOs(java.util.List<ch.ivy.addon.portalkit.dto.RoleDTO> _roleDTOs)
  {
    roleDTOs = _roleDTOs;
  }

  private transient java.util.List<java.lang.String> fromRoles;

  /**
   * Gets the field fromRoles.
   * @return the value of the field fromRoles; may be null.
   */
  public java.util.List<java.lang.String> getFromRoles()
  {
    return fromRoles;
  }

  /**
   * Sets the field fromRoles.
   * @param _fromRoles the new value of the field fromRoles.
   */
  public void setFromRoles(java.util.List<java.lang.String> _fromRoles)
  {
    fromRoles = _fromRoles;
  }

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

  private transient java.util.List<ch.ivy.addon.portalkit.dto.SecurityMemberDTO> securityMembers;

  /**
   * Gets the field securityMembers.
   * @return the value of the field securityMembers; may be null.
   */
  public java.util.List<ch.ivy.addon.portalkit.dto.SecurityMemberDTO> getSecurityMembers()
  {
    return securityMembers;
  }

  /**
   * Sets the field securityMembers.
   * @param _securityMembers the new value of the field securityMembers.
   */
  public void setSecurityMembers(java.util.List<ch.ivy.addon.portalkit.dto.SecurityMemberDTO> _securityMembers)
  {
    securityMembers = _securityMembers;
  }

  private transient java.lang.Integer startIndex;

  /**
   * Gets the field startIndex.
   * @return the value of the field startIndex; may be null.
   */
  public java.lang.Integer getStartIndex()
  {
    return startIndex;
  }

  /**
   * Sets the field startIndex.
   * @param _startIndex the new value of the field startIndex.
   */
  public void setStartIndex(java.lang.Integer _startIndex)
  {
    startIndex = _startIndex;
  }

  private transient java.lang.String username;

  /**
   * Gets the field username.
   * @return the value of the field username; may be null.
   */
  public java.lang.String getUsername()
  {
    return username;
  }

  /**
   * Sets the field username.
   * @param _username the new value of the field username.
   */
  public void setUsername(java.lang.String _username)
  {
    username = _username;
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

  private transient java.util.List<java.lang.String> excludedUsernames;

  /**
   * Gets the field excludedUsernames.
   * @return the value of the field excludedUsernames; may be null.
   */
  public java.util.List<java.lang.String> getExcludedUsernames()
  {
    return excludedUsernames;
  }

  /**
   * Sets the field excludedUsernames.
   * @param _excludedUsernames the new value of the field excludedUsernames.
   */
  public void setExcludedUsernames(java.util.List<java.lang.String> _excludedUsernames)
  {
    excludedUsernames = _excludedUsernames;
  }

}
