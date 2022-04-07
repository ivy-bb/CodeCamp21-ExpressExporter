package ch.ivy.addon.portal.generic;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class PortalStartData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class PortalStartData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -6011550623723606730L;

  private transient ch.ivy.addon.portalkit.enums.PortalPage portalPage;

  /**
   * Gets the field portalPage.
   * @return the value of the field portalPage; may be null.
   */
  public ch.ivy.addon.portalkit.enums.PortalPage getPortalPage()
  {
    return portalPage;
  }

  /**
   * Sets the field portalPage.
   * @param _portalPage the new value of the field portalPage.
   */
  public void setPortalPage(ch.ivy.addon.portalkit.enums.PortalPage _portalPage)
  {
    portalPage = _portalPage;
  }

  private transient ch.ivy.addon.portal.generic.view.CaseView caseView;

  /**
   * Gets the field caseView.
   * @return the value of the field caseView; may be null.
   */
  public ch.ivy.addon.portal.generic.view.CaseView getCaseView()
  {
    return caseView;
  }

  /**
   * Sets the field caseView.
   * @param _caseView the new value of the field caseView.
   */
  public void setCaseView(ch.ivy.addon.portal.generic.view.CaseView _caseView)
  {
    caseView = _caseView;
  }

  private transient ch.ivy.addon.portal.generic.view.TaskView taskView;

  /**
   * Gets the field taskView.
   * @return the value of the field taskView; may be null.
   */
  public ch.ivy.addon.portal.generic.view.TaskView getTaskView()
  {
    return taskView;
  }

  /**
   * Sets the field taskView.
   * @param _taskView the new value of the field taskView.
   */
  public void setTaskView(ch.ivy.addon.portal.generic.view.TaskView _taskView)
  {
    taskView = _taskView;
  }

  private transient java.lang.Number endedTaskId;

  /**
   * Gets the field endedTaskId.
   * @return the value of the field endedTaskId; may be null.
   */
  public java.lang.Number getEndedTaskId()
  {
    return endedTaskId;
  }

  /**
   * Sets the field endedTaskId.
   * @param _endedTaskId the new value of the field endedTaskId.
   */
  public void setEndedTaskId(java.lang.Number _endedTaskId)
  {
    endedTaskId = _endedTaskId;
  }

  private transient ch.ivy.addon.portalkit.datamodel.TaskLazyDataModel dataModel;

  /**
   * Gets the field dataModel.
   * @return the value of the field dataModel; may be null.
   */
  public ch.ivy.addon.portalkit.datamodel.TaskLazyDataModel getDataModel()
  {
    return dataModel;
  }

  /**
   * Sets the field dataModel.
   * @param _dataModel the new value of the field dataModel.
   */
  public void setDataModel(ch.ivy.addon.portalkit.datamodel.TaskLazyDataModel _dataModel)
  {
    dataModel = _dataModel;
  }

  private transient java.lang.Number selectedTaskId;

  /**
   * Gets the field selectedTaskId.
   * @return the value of the field selectedTaskId; may be null.
   */
  public java.lang.Number getSelectedTaskId()
  {
    return selectedTaskId;
  }

  /**
   * Sets the field selectedTaskId.
   * @param _selectedTaskId the new value of the field selectedTaskId.
   */
  public void setSelectedTaskId(java.lang.Number _selectedTaskId)
  {
    selectedTaskId = _selectedTaskId;
  }

  private transient java.lang.String callbackUrl;

  /**
   * Gets the field callbackUrl.
   * @return the value of the field callbackUrl; may be null.
   */
  public java.lang.String getCallbackUrl()
  {
    return callbackUrl;
  }

  /**
   * Sets the field callbackUrl.
   * @param _callbackUrl the new value of the field callbackUrl.
   */
  public void setCallbackUrl(java.lang.String _callbackUrl)
  {
    callbackUrl = _callbackUrl;
  }

  private transient ch.ivy.addon.portalkit.datamodel.CaseLazyDataModel caseDataModel;

  /**
   * Gets the field caseDataModel.
   * @return the value of the field caseDataModel; may be null.
   */
  public ch.ivy.addon.portalkit.datamodel.CaseLazyDataModel getCaseDataModel()
  {
    return caseDataModel;
  }

  /**
   * Sets the field caseDataModel.
   * @param _caseDataModel the new value of the field caseDataModel.
   */
  public void setCaseDataModel(ch.ivy.addon.portalkit.datamodel.CaseLazyDataModel _caseDataModel)
  {
    caseDataModel = _caseDataModel;
  }

  private transient ch.ivy.addon.portalkit.datamodel.SearchResultsDataModel searchResultsDataModel;

  /**
   * Gets the field searchResultsDataModel.
   * @return the value of the field searchResultsDataModel; may be null.
   */
  public ch.ivy.addon.portalkit.datamodel.SearchResultsDataModel getSearchResultsDataModel()
  {
    return searchResultsDataModel;
  }

  /**
   * Sets the field searchResultsDataModel.
   * @param _searchResultsDataModel the new value of the field searchResultsDataModel.
   */
  public void setSearchResultsDataModel(ch.ivy.addon.portalkit.datamodel.SearchResultsDataModel _searchResultsDataModel)
  {
    searchResultsDataModel = _searchResultsDataModel;
  }

  private transient java.lang.Long caseId;

  /**
   * Gets the field caseId.
   * @return the value of the field caseId; may be null.
   */
  public java.lang.Long getCaseId()
  {
    return caseId;
  }

  /**
   * Sets the field caseId.
   * @param _caseId the new value of the field caseId.
   */
  public void setCaseId(java.lang.Long _caseId)
  {
    caseId = _caseId;
  }

  private transient java.lang.Boolean isTaskStartedInDetails;

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

  private transient java.lang.Boolean isTaskFinished;

  /**
   * Gets the field isTaskFinished.
   * @return the value of the field isTaskFinished; may be null.
   */
  public java.lang.Boolean getIsTaskFinished()
  {
    return isTaskFinished;
  }

  /**
   * Sets the field isTaskFinished.
   * @param _isTaskFinished the new value of the field isTaskFinished.
   */
  public void setIsTaskFinished(java.lang.Boolean _isTaskFinished)
  {
    isTaskFinished = _isTaskFinished;
  }

  private transient ch.ivyteam.ivy.workflow.ITask taskSelected;

  /**
   * Gets the field taskSelected.
   * @return the value of the field taskSelected; may be null.
   */
  public ch.ivyteam.ivy.workflow.ITask getTaskSelected()
  {
    return taskSelected;
  }

  /**
   * Sets the field taskSelected.
   * @param _taskSelected the new value of the field taskSelected.
   */
  public void setTaskSelected(ch.ivyteam.ivy.workflow.ITask _taskSelected)
  {
    taskSelected = _taskSelected;
  }

  private transient ch.ivyteam.ivy.workflow.ICase caseSelected;

  /**
   * Gets the field caseSelected.
   * @return the value of the field caseSelected; may be null.
   */
  public ch.ivyteam.ivy.workflow.ICase getCaseSelected()
  {
    return caseSelected;
  }

  /**
   * Sets the field caseSelected.
   * @param _caseSelected the new value of the field caseSelected.
   */
  public void setCaseSelected(ch.ivyteam.ivy.workflow.ICase _caseSelected)
  {
    caseSelected = _caseSelected;
  }

  private transient java.lang.Boolean backFromTaskDetails;

  /**
   * Gets the field backFromTaskDetails.
   * @return the value of the field backFromTaskDetails; may be null.
   */
  public java.lang.Boolean getBackFromTaskDetails()
  {
    return backFromTaskDetails;
  }

  /**
   * Sets the field backFromTaskDetails.
   * @param _backFromTaskDetails the new value of the field backFromTaskDetails.
   */
  public void setBackFromTaskDetails(java.lang.Boolean _backFromTaskDetails)
  {
    backFromTaskDetails = _backFromTaskDetails;
  }

  private transient java.lang.Boolean isFirstTask;

  /**
   * Gets the field isFirstTask.
   * @return the value of the field isFirstTask; may be null.
   */
  public java.lang.Boolean getIsFirstTask()
  {
    return isFirstTask;
  }

  /**
   * Sets the field isFirstTask.
   * @param _isFirstTask the new value of the field isFirstTask.
   */
  public void setIsFirstTask(java.lang.Boolean _isFirstTask)
  {
    isFirstTask = _isFirstTask;
  }

  private transient java.lang.Boolean isBusinessCase;

  /**
   * Gets the field isBusinessCase.
   * @return the value of the field isBusinessCase; may be null.
   */
  public java.lang.Boolean getIsBusinessCase()
  {
    return isBusinessCase;
  }

  /**
   * Sets the field isBusinessCase.
   * @param _isBusinessCase the new value of the field isBusinessCase.
   */
  public void setIsBusinessCase(java.lang.Boolean _isBusinessCase)
  {
    isBusinessCase = _isBusinessCase;
  }

  private transient java.lang.String caseName;

  /**
   * Gets the field caseName.
   * @return the value of the field caseName; may be null.
   */
  public java.lang.String getCaseName()
  {
    return caseName;
  }

  /**
   * Sets the field caseName.
   * @param _caseName the new value of the field caseName.
   */
  public void setCaseName(java.lang.String _caseName)
  {
    caseName = _caseName;
  }

  /**
   * used in global search process
   */
  private transient java.lang.String keyword;

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

  private transient java.lang.Boolean embedInIFrame;

  /**
   * Gets the field embedInIFrame.
   * @return the value of the field embedInIFrame; may be null.
   */
  public java.lang.Boolean getEmbedInIFrame()
  {
    return embedInIFrame;
  }

  /**
   * Sets the field embedInIFrame.
   * @param _embedInIFrame the new value of the field embedInIFrame.
   */
  public void setEmbedInIFrame(java.lang.Boolean _embedInIFrame)
  {
    embedInIFrame = _embedInIFrame;
  }

  /**
   * selected homepage of user
   */
  private transient ch.addon.portal.generic.userprofile.homepage.Homepage homepage;

  /**
   * Gets the field homepage.
   * @return the value of the field homepage; may be null.
   */
  public ch.addon.portal.generic.userprofile.homepage.Homepage getHomepage()
  {
    return homepage;
  }

  /**
   * Sets the field homepage.
   * @param _homepage the new value of the field homepage.
   */
  public void setHomepage(ch.addon.portal.generic.userprofile.homepage.Homepage _homepage)
  {
    homepage = _homepage;
  }

  private transient java.lang.String passwordResetToken;

  /**
   * Gets the field passwordResetToken.
   * @return the value of the field passwordResetToken; may be null.
   */
  public java.lang.String getPasswordResetToken()
  {
    return passwordResetToken;
  }

  /**
   * Sets the field passwordResetToken.
   * @param _passwordResetToken the new value of the field passwordResetToken.
   */
  public void setPasswordResetToken(java.lang.String _passwordResetToken)
  {
    passwordResetToken = _passwordResetToken;
  }

  private transient java.lang.String passwordResetUsername;

  /**
   * Gets the field passwordResetUsername.
   * @return the value of the field passwordResetUsername; may be null.
   */
  public java.lang.String getPasswordResetUsername()
  {
    return passwordResetUsername;
  }

  /**
   * Sets the field passwordResetUsername.
   * @param _passwordResetUsername the new value of the field passwordResetUsername.
   */
  public void setPasswordResetUsername(java.lang.String _passwordResetUsername)
  {
    passwordResetUsername = _passwordResetUsername;
  }

  private transient java.lang.Boolean isValidResetUrl;

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

  private transient java.lang.String passwordResetMessage;

  /**
   * Gets the field passwordResetMessage.
   * @return the value of the field passwordResetMessage; may be null.
   */
  public java.lang.String getPasswordResetMessage()
  {
    return passwordResetMessage;
  }

  /**
   * Sets the field passwordResetMessage.
   * @param _passwordResetMessage the new value of the field passwordResetMessage.
   */
  public void setPasswordResetMessage(java.lang.String _passwordResetMessage)
  {
    passwordResetMessage = _passwordResetMessage;
  }

  private transient java.lang.Boolean isShowDashboard;

  /**
   * Gets the field isShowDashboard.
   * @return the value of the field isShowDashboard; may be null.
   */
  public java.lang.Boolean getIsShowDashboard()
  {
    return isShowDashboard;
  }

  /**
   * Sets the field isShowDashboard.
   * @param _isShowDashboard the new value of the field isShowDashboard.
   */
  public void setIsShowDashboard(java.lang.Boolean _isShowDashboard)
  {
    isShowDashboard = _isShowDashboard;
  }

  private transient java.lang.String processId;

  /**
   * Gets the field processId.
   * @return the value of the field processId; may be null.
   */
  public java.lang.String getProcessId()
  {
    return processId;
  }

  /**
   * Sets the field processId.
   * @param _processId the new value of the field processId.
   */
  public void setProcessId(java.lang.String _processId)
  {
    processId = _processId;
  }

  private transient java.util.List<ch.ivy.addon.portalkit.bo.History> histories;

  /**
   * Gets the field histories.
   * @return the value of the field histories; may be null.
   */
  public java.util.List<ch.ivy.addon.portalkit.bo.History> getHistories()
  {
    return histories;
  }

  /**
   * Sets the field histories.
   * @param _histories the new value of the field histories.
   */
  public void setHistories(java.util.List<ch.ivy.addon.portalkit.bo.History> _histories)
  {
    histories = _histories;
  }

  private transient java.lang.Long taskId;

  /**
   * Gets the field taskId.
   * @return the value of the field taskId; may be null.
   */
  public java.lang.Long getTaskId()
  {
    return taskId;
  }

  /**
   * Sets the field taskId.
   * @param _taskId the new value of the field taskId.
   */
  public void setTaskId(java.lang.Long _taskId)
  {
    taskId = _taskId;
  }

  private transient java.util.List<ch.ivyteam.ivy.workflow.INote> notes;

  /**
   * Gets the field notes.
   * @return the value of the field notes; may be null.
   */
  public java.util.List<ch.ivyteam.ivy.workflow.INote> getNotes()
  {
    return notes;
  }

  /**
   * Sets the field notes.
   * @param _notes the new value of the field notes.
   */
  public void setNotes(java.util.List<ch.ivyteam.ivy.workflow.INote> _notes)
  {
    notes = _notes;
  }

  private transient java.lang.Boolean hasPermission;

  /**
   * Gets the field hasPermission.
   * @return the value of the field hasPermission; may be null.
   */
  public java.lang.Boolean getHasPermission()
  {
    return hasPermission;
  }

  /**
   * Sets the field hasPermission.
   * @param _hasPermission the new value of the field hasPermission.
   */
  public void setHasPermission(java.lang.Boolean _hasPermission)
  {
    hasPermission = _hasPermission;
  }

}
