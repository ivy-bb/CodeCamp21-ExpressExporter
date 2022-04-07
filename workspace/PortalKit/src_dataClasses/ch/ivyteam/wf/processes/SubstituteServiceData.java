package ch.ivyteam.wf.processes;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class SubstituteServiceData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class SubstituteServiceData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 1158972283036363775L;

  private transient java.util.List<ch.ivy.addon.portalkit.ivydata.bo.IvySubstitute> substitutes;

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

  private transient ch.ivy.addon.portalkit.dto.UserDTO userDTO;

  /**
   * Gets the field userDTO.
   * @return the value of the field userDTO; may be null.
   */
  public ch.ivy.addon.portalkit.dto.UserDTO getUserDTO()
  {
    return userDTO;
  }

  /**
   * Sets the field userDTO.
   * @param _userDTO the new value of the field userDTO.
   */
  public void setUserDTO(ch.ivy.addon.portalkit.dto.UserDTO _userDTO)
  {
    userDTO = _userDTO;
  }

}
