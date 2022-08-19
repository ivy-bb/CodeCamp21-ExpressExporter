package ch.ivy.addon.portalkit.component.SecurityMemberDisplayName;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class SecurityMemberDisplayNameData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class SecurityMemberDisplayNameData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -7379434855145766180L;

  private java.util.List<ch.ivy.addon.portalkit.dto.UserDTO> memberNames;

  /**
   * Gets the field memberNames.
   * @return the value of the field memberNames; may be null.
   */
  public java.util.List<ch.ivy.addon.portalkit.dto.UserDTO> getMemberNames()
  {
    return memberNames;
  }

  /**
   * Sets the field memberNames.
   * @param _memberNames the new value of the field memberNames.
   */
  public void setMemberNames(java.util.List<ch.ivy.addon.portalkit.dto.UserDTO> _memberNames)
  {
    memberNames = _memberNames;
  }

  private java.lang.String roleName;

  /**
   * Gets the field roleName.
   * @return the value of the field roleName; may be null.
   */
  public java.lang.String getRoleName()
  {
    return roleName;
  }

  /**
   * Sets the field roleName.
   * @param _roleName the new value of the field roleName.
   */
  public void setRoleName(java.lang.String _roleName)
  {
    roleName = _roleName;
  }

  private java.lang.String keyword;

  /**
   * Gets the field keyword.
   * @return the value of the field keyword; may be null.
   */
  public java.lang.String getKeyword()
  {
    return keyword;
  }

  /**
   * Sets the field keyword.
   * @param _keyword the new value of the field keyword.
   */
  public void setKeyword(java.lang.String _keyword)
  {
    keyword = _keyword;
  }

  private java.lang.Boolean isShowAllUser;

  /**
   * Gets the field isShowAllUser.
   * @return the value of the field isShowAllUser; may be null.
   */
  public java.lang.Boolean getIsShowAllUser()
  {
    return isShowAllUser;
  }

  /**
   * Sets the field isShowAllUser.
   * @param _isShowAllUser the new value of the field isShowAllUser.
   */
  public void setIsShowAllUser(java.lang.Boolean _isShowAllUser)
  {
    isShowAllUser = _isShowAllUser;
  }

  private java.lang.String usersInTooltips;

  /**
   * Gets the field usersInTooltips.
   * @return the value of the field usersInTooltips; may be null.
   */
  public java.lang.String getUsersInTooltips()
  {
    return usersInTooltips;
  }

  /**
   * Sets the field usersInTooltips.
   * @param _usersInTooltips the new value of the field usersInTooltips.
   */
  public void setUsersInTooltips(java.lang.String _usersInTooltips)
  {
    usersInTooltips = _usersInTooltips;
  }

  private java.lang.Boolean isRenderUserOfRole;

  /**
   * Gets the field isRenderUserOfRole.
   * @return the value of the field isRenderUserOfRole; may be null.
   */
  public java.lang.Boolean getIsRenderUserOfRole()
  {
    return isRenderUserOfRole;
  }

  /**
   * Sets the field isRenderUserOfRole.
   * @param _isRenderUserOfRole the new value of the field isRenderUserOfRole.
   */
  public void setIsRenderUserOfRole(java.lang.Boolean _isRenderUserOfRole)
  {
    isRenderUserOfRole = _isRenderUserOfRole;
  }

  private ch.ivyteam.ivy.security.ISecurityMember securityMember;

  /**
   * Gets the field securityMember.
   * @return the value of the field securityMember; may be null.
   */
  public ch.ivyteam.ivy.security.ISecurityMember getSecurityMember()
  {
    return securityMember;
  }

  /**
   * Sets the field securityMember.
   * @param _securityMember the new value of the field securityMember.
   */
  public void setSecurityMember(ch.ivyteam.ivy.security.ISecurityMember _securityMember)
  {
    securityMember = _securityMember;
  }

}
