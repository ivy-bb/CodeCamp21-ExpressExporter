package ch.ivy.addon.portal.component.iframe.CaseInformationInIFrame;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class CaseInformationInIFrameData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class CaseInformationInIFrameData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 6584635584254004477L;

  private ch.ivyteam.ivy.workflow.ICase currentCase;

  /**
   * Gets the field currentCase.
   * @return the value of the field currentCase; may be null.
   */
  public ch.ivyteam.ivy.workflow.ICase getCurrentCase()
  {
    return currentCase;
  }

  /**
   * Sets the field currentCase.
   * @param _currentCase the new value of the field currentCase.
   */
  public void setCurrentCase(ch.ivyteam.ivy.workflow.ICase _currentCase)
  {
    currentCase = _currentCase;
  }

  private java.lang.Boolean showBackButton;

  /**
   * Gets the field showBackButton.
   * @return the value of the field showBackButton; may be null.
   */
  public java.lang.Boolean getShowBackButton()
  {
    return showBackButton;
  }

  /**
   * Sets the field showBackButton.
   * @param _showBackButton the new value of the field showBackButton.
   */
  public void setShowBackButton(java.lang.Boolean _showBackButton)
  {
    showBackButton = _showBackButton;
  }

  private java.lang.Boolean readOnly;

  /**
   * Gets the field readOnly.
   * @return the value of the field readOnly; may be null.
   */
  public java.lang.Boolean getReadOnly()
  {
    return readOnly;
  }

  /**
   * Sets the field readOnly.
   * @param _readOnly the new value of the field readOnly.
   */
  public void setReadOnly(java.lang.Boolean _readOnly)
  {
    readOnly = _readOnly;
  }

  private java.lang.Long currentCaseId;

  /**
   * Gets the field currentCaseId.
   * @return the value of the field currentCaseId; may be null.
   */
  public java.lang.Long getCurrentCaseId()
  {
    return currentCaseId;
  }

  /**
   * Sets the field currentCaseId.
   * @param _currentCaseId the new value of the field currentCaseId.
   */
  public void setCurrentCaseId(java.lang.Long _currentCaseId)
  {
    currentCaseId = _currentCaseId;
  }

}
