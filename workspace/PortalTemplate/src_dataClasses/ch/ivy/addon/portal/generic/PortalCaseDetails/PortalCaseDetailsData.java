package ch.ivy.addon.portal.generic.PortalCaseDetails;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class PortalCaseDetailsData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class PortalCaseDetailsData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 8580400999382962548L;

  private ch.ivyteam.ivy.workflow.ICase caseInfo;

  /**
   * Gets the field caseInfo.
   * @return the value of the field caseInfo; may be null.
   */
  public ch.ivyteam.ivy.workflow.ICase getCaseInfo()
  {
    return caseInfo;
  }

  /**
   * Sets the field caseInfo.
   * @param _caseInfo the new value of the field caseInfo.
   */
  public void setCaseInfo(ch.ivyteam.ivy.workflow.ICase _caseInfo)
  {
    caseInfo = _caseInfo;
  }

  private java.lang.Boolean isShowBackButton;

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

  private java.lang.Boolean isTaskStartedInDetails;

  /**
   * Gets the field isTaskStartedInDetails.
   * @return the value of the field isTaskStartedInDetails; may be null.
   */
  public java.lang.Boolean getIsTaskStartedInDetails()
  {
    return isTaskStartedInDetails;
  }

  /**
   * Sets the field isTaskStartedInDetails.
   * @param _isTaskStartedInDetails the new value of the field isTaskStartedInDetails.
   */
  public void setIsTaskStartedInDetails(java.lang.Boolean _isTaskStartedInDetails)
  {
    isTaskStartedInDetails = _isTaskStartedInDetails;
  }

  private ch.ivy.addon.portalkit.datamodel.internal.RelatedCaseLazyDataModel caseLazyDataModel;

  /**
   * Gets the field caseLazyDataModel.
   * @return the value of the field caseLazyDataModel; may be null.
   */
  public ch.ivy.addon.portalkit.datamodel.internal.RelatedCaseLazyDataModel getCaseLazyDataModel()
  {
    return caseLazyDataModel;
  }

  /**
   * Sets the field caseLazyDataModel.
   * @param _caseLazyDataModel the new value of the field caseLazyDataModel.
   */
  public void setCaseLazyDataModel(ch.ivy.addon.portalkit.datamodel.internal.RelatedCaseLazyDataModel _caseLazyDataModel)
  {
    caseLazyDataModel = _caseLazyDataModel;
  }

}
