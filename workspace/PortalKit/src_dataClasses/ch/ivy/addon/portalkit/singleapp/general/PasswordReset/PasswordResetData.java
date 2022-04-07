package ch.ivy.addon.portalkit.singleapp.general.PasswordReset;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class PasswordResetData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class PasswordResetData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -79555511881213925L;

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

  private java.lang.String newPassword;

  /**
   * Gets the field newPassword.
   * @return the value of the field newPassword; may be null.
   */
  public java.lang.String getNewPassword()
  {
    return newPassword;
  }

  /**
   * Sets the field newPassword.
   * @param _newPassword the new value of the field newPassword.
   */
  public void setNewPassword(java.lang.String _newPassword)
  {
    newPassword = _newPassword;
  }

  private java.lang.String passwordConfirmation;

  /**
   * Gets the field passwordConfirmation.
   * @return the value of the field passwordConfirmation; may be null.
   */
  public java.lang.String getPasswordConfirmation()
  {
    return passwordConfirmation;
  }

  /**
   * Sets the field passwordConfirmation.
   * @param _passwordConfirmation the new value of the field passwordConfirmation.
   */
  public void setPasswordConfirmation(java.lang.String _passwordConfirmation)
  {
    passwordConfirmation = _passwordConfirmation;
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

  /**
   * false
   */
  private java.lang.Boolean resetSuccess;

  /**
   * Gets the field resetSuccess.
   * @return the value of the field resetSuccess; may be null.
   */
  public java.lang.Boolean getResetSuccess()
  {
    return resetSuccess;
  }

  /**
   * Sets the field resetSuccess.
   * @param _resetSuccess the new value of the field resetSuccess.
   */
  public void setResetSuccess(java.lang.Boolean _resetSuccess)
  {
    resetSuccess = _resetSuccess;
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
