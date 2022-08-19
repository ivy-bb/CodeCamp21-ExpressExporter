package ch.ivy.add.portalkit;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class OpenPortalCaseDetailsHookData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class OpenPortalCaseDetailsHookData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 6411117351084028181L;

  private transient ch.ivyteam.ivy.workflow.ICase caseView;

  /**
   * Gets the field caseView.
   * @return the value of the field caseView; may be null.
   */
  public ch.ivyteam.ivy.workflow.ICase getCaseView()
  {
    return caseView;
  }

  /**
   * Sets the field caseView.
   * @param _caseView the new value of the field caseView.
   */
  public void setCaseView(ch.ivyteam.ivy.workflow.ICase _caseView)
  {
    caseView = _caseView;
  }

  private transient java.lang.Boolean isShowBackButton;

  /**
   * Gets the field isShowBackButton.
   * @return the value of the field isShowBackButton; may be null.
   */
  public java.lang.Boolean getIsShowBackButton()
  {
    return isShowBackButton;
  }

  /**
   * Sets the field isShowBackButton.
   * @param _isShowBackButton the new value of the field isShowBackButton.
   */
  public void setIsShowBackButton(java.lang.Boolean _isShowBackButton)
  {
    isShowBackButton = _isShowBackButton;
  }

}
