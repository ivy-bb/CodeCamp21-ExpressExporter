package ch.ivy.addon.portal.generic.PasswordReset;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class PasswordResetData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class PasswordResetData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -2767648697913472976L;

  private java.lang.String token;

  /**
   * Gets the field token.
   * @return the value of the field token; may be null.
   */
  public java.lang.String getToken()
  {
    return token;
  }

  /**
   * Sets the field token.
   * @param _token the new value of the field token.
   */
  public void setToken(java.lang.String _token)
  {
    token = _token;
  }

  private java.lang.String username;

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

  private java.lang.Boolean isValidResetUrl;

  /**
   * Gets the field isValidResetUrl.
   * @return the value of the field isValidResetUrl; may be null.
   */
  public java.lang.Boolean getIsValidResetUrl()
  {
    return isValidResetUrl;
  }

  /**
   * Sets the field isValidResetUrl.
   * @param _isValidResetUrl the new value of the field isValidResetUrl.
   */
  public void setIsValidResetUrl(java.lang.Boolean _isValidResetUrl)
  {
    isValidResetUrl = _isValidResetUrl;
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

}
