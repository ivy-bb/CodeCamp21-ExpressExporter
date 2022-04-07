package ch.ivy.addon.portal.setting.UserProfile;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class UserProfileData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class UserProfileData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -3253025066906270004L;

  private ch.ivy.addon.portalkit.ivydata.bo.IvyLanguage language;

  /**
   * Gets the field language.
   * @return the value of the field language; may be null.
   */
  public ch.ivy.addon.portalkit.ivydata.bo.IvyLanguage getLanguage()
  {
    return language;
  }

  /**
   * Sets the field language.
   * @param _language the new value of the field language.
   */
  public void setLanguage(ch.ivy.addon.portalkit.ivydata.bo.IvyLanguage _language)
  {
    language = _language;
  }

  private ch.ivy.addon.portalkit.ivydata.bo.IvyEmailSetting emailSetting;

  /**
   * Gets the field emailSetting.
   * @return the value of the field emailSetting; may be null.
   */
  public ch.ivy.addon.portalkit.ivydata.bo.IvyEmailSetting getEmailSetting()
  {
    return emailSetting;
  }

  /**
   * Sets the field emailSetting.
   * @param _emailSetting the new value of the field emailSetting.
   */
  public void setEmailSetting(ch.ivy.addon.portalkit.ivydata.bo.IvyEmailSetting _emailSetting)
  {
    emailSetting = _emailSetting;
  }

  private java.util.List<ch.ivyteam.util.date.Weekday> dailySummaryList;

  /**
   * Gets the field dailySummaryList.
   * @return the value of the field dailySummaryList; may be null.
   */
  public java.util.List<ch.ivyteam.util.date.Weekday> getDailySummaryList()
  {
    return dailySummaryList;
  }

  /**
   * Sets the field dailySummaryList.
   * @param _dailySummaryList the new value of the field dailySummaryList.
   */
  public void setDailySummaryList(java.util.List<ch.ivyteam.util.date.Weekday> _dailySummaryList)
  {
    dailySummaryList = _dailySummaryList;
  }

  private java.lang.Boolean showTutorial;

  /**
   * Gets the field showTutorial.
   * @return the value of the field showTutorial; may be null.
   */
  public java.lang.Boolean getShowTutorial()
  {
    return showTutorial;
  }

  /**
   * Sets the field showTutorial.
   * @param _showTutorial the new value of the field showTutorial.
   */
  public void setShowTutorial(java.lang.Boolean _showTutorial)
  {
    showTutorial = _showTutorial;
  }

  private ch.addon.portal.generic.userprofile.homepage.Homepage selectedHomepage;

  /**
   * Gets the field selectedHomepage.
   * @return the value of the field selectedHomepage; may be null.
   */
  public ch.addon.portal.generic.userprofile.homepage.Homepage getSelectedHomepage()
  {
    return selectedHomepage;
  }

  /**
   * Sets the field selectedHomepage.
   * @param _selectedHomepage the new value of the field selectedHomepage.
   */
  public void setSelectedHomepage(ch.addon.portal.generic.userprofile.homepage.Homepage _selectedHomepage)
  {
    selectedHomepage = _selectedHomepage;
  }

  private java.util.List<ch.addon.portal.generic.userprofile.homepage.Homepage> homepages;

  /**
   * Gets the field homepages.
   * @return the value of the field homepages; may be null.
   */
  public java.util.List<ch.addon.portal.generic.userprofile.homepage.Homepage> getHomepages()
  {
    return homepages;
  }

  /**
   * Sets the field homepages.
   * @param _homepages the new value of the field homepages.
   */
  public void setHomepages(java.util.List<ch.addon.portal.generic.userprofile.homepage.Homepage> _homepages)
  {
    homepages = _homepages;
  }

  private java.lang.Boolean disableShowTutorial;

  /**
   * Gets the field disableShowTutorial.
   * @return the value of the field disableShowTutorial; may be null.
   */
  public java.lang.Boolean getDisableShowTutorial()
  {
    return disableShowTutorial;
  }

  /**
   * Sets the field disableShowTutorial.
   * @param _disableShowTutorial the new value of the field disableShowTutorial.
   */
  public void setDisableShowTutorial(java.lang.Boolean _disableShowTutorial)
  {
    disableShowTutorial = _disableShowTutorial;
  }

  private java.util.List<java.lang.String> taskListSortFields;

  /**
   * Gets the field taskListSortFields.
   * @return the value of the field taskListSortFields; may be null.
   */
  public java.util.List<java.lang.String> getTaskListSortFields()
  {
    return taskListSortFields;
  }

  /**
   * Sets the field taskListSortFields.
   * @param _taskListSortFields the new value of the field taskListSortFields.
   */
  public void setTaskListSortFields(java.util.List<java.lang.String> _taskListSortFields)
  {
    taskListSortFields = _taskListSortFields;
  }

  private java.lang.String selectedTaskListSortField;

  /**
   * Gets the field selectedTaskListSortField.
   * @return the value of the field selectedTaskListSortField; may be null.
   */
  public java.lang.String getSelectedTaskListSortField()
  {
    return selectedTaskListSortField;
  }

  /**
   * Sets the field selectedTaskListSortField.
   * @param _selectedTaskListSortField the new value of the field selectedTaskListSortField.
   */
  public void setSelectedTaskListSortField(java.lang.String _selectedTaskListSortField)
  {
    selectedTaskListSortField = _selectedTaskListSortField;
  }

  private java.util.List<java.lang.String> caseListSortFields;

  /**
   * Gets the field caseListSortFields.
   * @return the value of the field caseListSortFields; may be null.
   */
  public java.util.List<java.lang.String> getCaseListSortFields()
  {
    return caseListSortFields;
  }

  /**
   * Sets the field caseListSortFields.
   * @param _caseListSortFields the new value of the field caseListSortFields.
   */
  public void setCaseListSortFields(java.util.List<java.lang.String> _caseListSortFields)
  {
    caseListSortFields = _caseListSortFields;
  }

  private java.lang.String selectedCaseListSortField;

  /**
   * Gets the field selectedCaseListSortField.
   * @return the value of the field selectedCaseListSortField; may be null.
   */
  public java.lang.String getSelectedCaseListSortField()
  {
    return selectedCaseListSortField;
  }

  /**
   * Sets the field selectedCaseListSortField.
   * @param _selectedCaseListSortField the new value of the field selectedCaseListSortField.
   */
  public void setSelectedCaseListSortField(java.lang.String _selectedCaseListSortField)
  {
    selectedCaseListSortField = _selectedCaseListSortField;
  }

  private java.util.List<java.lang.String> sortDirections;

  /**
   * Gets the field sortDirections.
   * @return the value of the field sortDirections; may be null.
   */
  public java.util.List<java.lang.String> getSortDirections()
  {
    return sortDirections;
  }

  /**
   * Sets the field sortDirections.
   * @param _sortDirections the new value of the field sortDirections.
   */
  public void setSortDirections(java.util.List<java.lang.String> _sortDirections)
  {
    sortDirections = _sortDirections;
  }

  private java.lang.String selectedTaskListSortDirection;

  /**
   * Gets the field selectedTaskListSortDirection.
   * @return the value of the field selectedTaskListSortDirection; may be null.
   */
  public java.lang.String getSelectedTaskListSortDirection()
  {
    return selectedTaskListSortDirection;
  }

  /**
   * Sets the field selectedTaskListSortDirection.
   * @param _selectedTaskListSortDirection the new value of the field selectedTaskListSortDirection.
   */
  public void setSelectedTaskListSortDirection(java.lang.String _selectedTaskListSortDirection)
  {
    selectedTaskListSortDirection = _selectedTaskListSortDirection;
  }

  private java.lang.String selectedCaseListSortDirection;

  /**
   * Gets the field selectedCaseListSortDirection.
   * @return the value of the field selectedCaseListSortDirection; may be null.
   */
  public java.lang.String getSelectedCaseListSortDirection()
  {
    return selectedCaseListSortDirection;
  }

  /**
   * Sets the field selectedCaseListSortDirection.
   * @param _selectedCaseListSortDirection the new value of the field selectedCaseListSortDirection.
   */
  public void setSelectedCaseListSortDirection(java.lang.String _selectedCaseListSortDirection)
  {
    selectedCaseListSortDirection = _selectedCaseListSortDirection;
  }

  private java.lang.String selectedDateFormat;

  /**
   * Gets the field selectedDateFormat.
   * @return the value of the field selectedDateFormat; may be null.
   */
  public java.lang.String getSelectedDateFormat()
  {
    return selectedDateFormat;
  }

  /**
   * Sets the field selectedDateFormat.
   * @param _selectedDateFormat the new value of the field selectedDateFormat.
   */
  public void setSelectedDateFormat(java.lang.String _selectedDateFormat)
  {
    selectedDateFormat = _selectedDateFormat;
  }

  private java.util.List<java.lang.String> dateFormats;

  /**
   * Gets the field dateFormats.
   * @return the value of the field dateFormats; may be null.
   */
  public java.util.List<java.lang.String> getDateFormats()
  {
    return dateFormats;
  }

  /**
   * Sets the field dateFormats.
   * @param _dateFormats the new value of the field dateFormats.
   */
  public void setDateFormats(java.util.List<java.lang.String> _dateFormats)
  {
    dateFormats = _dateFormats;
  }

  private java.util.List<java.lang.String> processModes;

  /**
   * Gets the field processModes.
   * @return the value of the field processModes; may be null.
   */
  public java.util.List<java.lang.String> getProcessModes()
  {
    return processModes;
  }

  /**
   * Sets the field processModes.
   * @param _processModes the new value of the field processModes.
   */
  public void setProcessModes(java.util.List<java.lang.String> _processModes)
  {
    processModes = _processModes;
  }

  private java.lang.String selectedProcessMode;

  /**
   * Gets the field selectedProcessMode.
   * @return the value of the field selectedProcessMode; may be null.
   */
  public java.lang.String getSelectedProcessMode()
  {
    return selectedProcessMode;
  }

  /**
   * Sets the field selectedProcessMode.
   * @param _selectedProcessMode the new value of the field selectedProcessMode.
   */
  public void setSelectedProcessMode(java.lang.String _selectedProcessMode)
  {
    selectedProcessMode = _selectedProcessMode;
  }

}
