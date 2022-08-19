package ch.ivy.addon.portalkit.admin.AdminSettings;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class AdminSettingsData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class AdminSettingsData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 295693082565454779L;

  private ch.ivy.addon.portalkit.configuration.Application application;

  /**
   * Gets the field application.
   * @return the value of the field application; may be null.
   */
  public ch.ivy.addon.portalkit.configuration.Application getApplication()
  {
    return application;
  }

  /**
   * Sets the field application.
   * @param _application the new value of the field application.
   */
  public void setApplication(ch.ivy.addon.portalkit.configuration.Application _application)
  {
    application = _application;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.configuration.Application> applicationList;

  /**
   * Gets the field applicationList.
   * @return the value of the field applicationList; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.configuration.Application> getApplicationList()
  {
    return applicationList;
  }

  /**
   * Sets the field applicationList.
   * @param _applicationList the new value of the field applicationList.
   */
  public void setApplicationList(ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.configuration.Application> _applicationList)
  {
    applicationList = _applicationList;
  }

  private java.lang.String confirmMsg;

  /**
   * Gets the field confirmMsg.
   * @return the value of the field confirmMsg; may be null.
   */
  public java.lang.String getConfirmMsg()
  {
    return confirmMsg;
  }

  /**
   * Sets the field confirmMsg.
   * @param _confirmMsg the new value of the field confirmMsg.
   */
  public void setConfirmMsg(java.lang.String _confirmMsg)
  {
    confirmMsg = _confirmMsg;
  }

  private java.lang.String dialogTitle;

  /**
   * Gets the field dialogTitle.
   * @return the value of the field dialogTitle; may be null.
   */
  public java.lang.String getDialogTitle()
  {
    return dialogTitle;
  }

  /**
   * Sets the field dialogTitle.
   * @param _dialogTitle the new value of the field dialogTitle.
   */
  public void setDialogTitle(java.lang.String _dialogTitle)
  {
    dialogTitle = _dialogTitle;
  }

  /**
   * Display application name in current portal language
   */
  private transient java.lang.String displayNameInCurrentLanguage;

  /**
   * Gets the field displayNameInCurrentLanguage.
   * @return the value of the field displayNameInCurrentLanguage; may be null.
   */
  public java.lang.String getDisplayNameInCurrentLanguage()
  {
    return displayNameInCurrentLanguage;
  }

  /**
   * Sets the field displayNameInCurrentLanguage.
   * @param _displayNameInCurrentLanguage the new value of the field displayNameInCurrentLanguage.
   */
  public void setDisplayNameInCurrentLanguage(java.lang.String _displayNameInCurrentLanguage)
  {
    displayNameInCurrentLanguage = _displayNameInCurrentLanguage;
  }

  private java.lang.Boolean duplicateApp;

  /**
   * Gets the field duplicateApp.
   * @return the value of the field duplicateApp; may be null.
   */
  public java.lang.Boolean getDuplicateApp()
  {
    return duplicateApp;
  }

  /**
   * Sets the field duplicateApp.
   * @param _duplicateApp the new value of the field duplicateApp.
   */
  public void setDuplicateApp(java.lang.Boolean _duplicateApp)
  {
    duplicateApp = _duplicateApp;
  }

  private java.lang.Boolean isAddMode;

  /**
   * Gets the field isAddMode.
   * @return the value of the field isAddMode; may be null.
   */
  public java.lang.Boolean getIsAddMode()
  {
    return isAddMode;
  }

  /**
   * Sets the field isAddMode.
   * @param _isAddMode the new value of the field isAddMode.
   */
  public void setIsAddMode(java.lang.Boolean _isAddMode)
  {
    isAddMode = _isAddMode;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<java.lang.String> languages;

  /**
   * Gets the field languages.
   * @return the value of the field languages; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<java.lang.String> getLanguages()
  {
    return languages;
  }

  /**
   * Sets the field languages.
   * @param _languages the new value of the field languages.
   */
  public void setLanguages(ch.ivyteam.ivy.scripting.objects.List<java.lang.String> _languages)
  {
    languages = _languages;
  }

  private ch.ivy.addon.portalkit.configuration.Application selectedApp;

  /**
   * Gets the field selectedApp.
   * @return the value of the field selectedApp; may be null.
   */
  public ch.ivy.addon.portalkit.configuration.Application getSelectedApp()
  {
    return selectedApp;
  }

  /**
   * Sets the field selectedApp.
   * @param _selectedApp the new value of the field selectedApp.
   */
  public void setSelectedApp(ch.ivy.addon.portalkit.configuration.Application _selectedApp)
  {
    selectedApp = _selectedApp;
  }

  private ch.ivy.addon.portalkit.configuration.GlobalSetting selectedSetting;

  /**
   * Gets the field selectedSetting.
   * @return the value of the field selectedSetting; may be null.
   */
  public ch.ivy.addon.portalkit.configuration.GlobalSetting getSelectedSetting()
  {
    return selectedSetting;
  }

  /**
   * Sets the field selectedSetting.
   * @param _selectedSetting the new value of the field selectedSetting.
   */
  public void setSelectedSetting(ch.ivy.addon.portalkit.configuration.GlobalSetting _selectedSetting)
  {
    selectedSetting = _selectedSetting;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.configuration.GlobalSetting> settingList;

  /**
   * Gets the field settingList.
   * @return the value of the field settingList; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.configuration.GlobalSetting> getSettingList()
  {
    return settingList;
  }

  /**
   * Sets the field settingList.
   * @param _settingList the new value of the field settingList.
   */
  public void setSettingList(ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.configuration.GlobalSetting> _settingList)
  {
    settingList = _settingList;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.dto.DisplayName> supportedLanguages;

  /**
   * Gets the field supportedLanguages.
   * @return the value of the field supportedLanguages; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.dto.DisplayName> getSupportedLanguages()
  {
    return supportedLanguages;
  }

  /**
   * Sets the field supportedLanguages.
   * @param _supportedLanguages the new value of the field supportedLanguages.
   */
  public void setSupportedLanguages(ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.dto.DisplayName> _supportedLanguages)
  {
    supportedLanguages = _supportedLanguages;
  }

  private java.lang.Integer tabIndexActive;

  /**
   * Gets the field tabIndexActive.
   * @return the value of the field tabIndexActive; may be null.
   */
  public java.lang.Integer getTabIndexActive()
  {
    return tabIndexActive;
  }

  /**
   * Sets the field tabIndexActive.
   * @param _tabIndexActive the new value of the field tabIndexActive.
   */
  public void setTabIndexActive(java.lang.Integer _tabIndexActive)
  {
    tabIndexActive = _tabIndexActive;
  }

  private java.lang.Boolean resetAllSettings;

  /**
   * Gets the field resetAllSettings.
   * @return the value of the field resetAllSettings; may be null.
   */
  public java.lang.Boolean getResetAllSettings()
  {
    return resetAllSettings;
  }

  /**
   * Sets the field resetAllSettings.
   * @param _resetAllSettings the new value of the field resetAllSettings.
   */
  public void setResetAllSettings(java.lang.Boolean _resetAllSettings)
  {
    resetAllSettings = _resetAllSettings;
  }

  private ch.ivy.addon.portalkit.enums.GlobalVariableType settingInputType;

  /**
   * Gets the field settingInputType.
   * @return the value of the field settingInputType; may be null.
   */
  public ch.ivy.addon.portalkit.enums.GlobalVariableType getSettingInputType()
  {
    return settingInputType;
  }

  /**
   * Sets the field settingInputType.
   * @param _settingInputType the new value of the field settingInputType.
   */
  public void setSettingInputType(ch.ivy.addon.portalkit.enums.GlobalVariableType _settingInputType)
  {
    settingInputType = _settingInputType;
  }

  /**
   * internal options, for example: FALSE, TRUE
   */
  private java.util.List<java.lang.Object> dropDownValues;

  /**
   * Gets the field dropDownValues.
   * @return the value of the field dropDownValues; may be null.
   */
  public java.util.List<java.lang.Object> getDropDownValues()
  {
    return dropDownValues;
  }

  /**
   * Sets the field dropDownValues.
   * @param _dropDownValues the new value of the field dropDownValues.
   */
  public void setDropDownValues(java.util.List<java.lang.Object> _dropDownValues)
  {
    dropDownValues = _dropDownValues;
  }

  /**
   * external options, for example: homepages, task/case columns sorting
   */
  private java.util.Map externalDropDownValues;

  /**
   * Gets the field externalDropDownValues.
   * @return the value of the field externalDropDownValues; may be null.
   */
  public java.util.Map getExternalDropDownValues()
  {
    return externalDropDownValues;
  }

  /**
   * Sets the field externalDropDownValues.
   * @param _externalDropDownValues the new value of the field externalDropDownValues.
   */
  public void setExternalDropDownValues(java.util.Map _externalDropDownValues)
  {
    externalDropDownValues = _externalDropDownValues;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.configuration.GlobalSetting> filteredSettingList;

  /**
   * Gets the field filteredSettingList.
   * @return the value of the field filteredSettingList; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.configuration.GlobalSetting> getFilteredSettingList()
  {
    return filteredSettingList;
  }

  /**
   * Sets the field filteredSettingList.
   * @param _filteredSettingList the new value of the field filteredSettingList.
   */
  public void setFilteredSettingList(ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.configuration.GlobalSetting> _filteredSettingList)
  {
    filteredSettingList = _filteredSettingList;
  }

  private java.lang.Boolean settingTabOpened;

  /**
   * Gets the field settingTabOpened.
   * @return the value of the field settingTabOpened; may be null.
   */
  public java.lang.Boolean getSettingTabOpened()
  {
    return settingTabOpened;
  }

  /**
   * Sets the field settingTabOpened.
   * @param _settingTabOpened the new value of the field settingTabOpened.
   */
  public void setSettingTabOpened(java.lang.Boolean _settingTabOpened)
  {
    settingTabOpened = _settingTabOpened;
  }

  private java.lang.Boolean isDefaultApplicationLanguage;

  /**
   * Gets the field isDefaultApplicationLanguage.
   * @return the value of the field isDefaultApplicationLanguage; may be null.
   */
  public java.lang.Boolean getIsDefaultApplicationLanguage()
  {
    return isDefaultApplicationLanguage;
  }

  /**
   * Sets the field isDefaultApplicationLanguage.
   * @param _isDefaultApplicationLanguage the new value of the field isDefaultApplicationLanguage.
   */
  public void setIsDefaultApplicationLanguage(java.lang.Boolean _isDefaultApplicationLanguage)
  {
    isDefaultApplicationLanguage = _isDefaultApplicationLanguage;
  }

  private java.lang.Boolean isAnnouncementActivated;

  /**
   * Gets the field isAnnouncementActivated.
   * @return the value of the field isAnnouncementActivated; may be null.
   */
  public java.lang.Boolean getIsAnnouncementActivated()
  {
    return isAnnouncementActivated;
  }

  /**
   * Sets the field isAnnouncementActivated.
   * @param _isAnnouncementActivated the new value of the field isAnnouncementActivated.
   */
  public void setIsAnnouncementActivated(java.lang.Boolean _isAnnouncementActivated)
  {
    isAnnouncementActivated = _isAnnouncementActivated;
  }

  private ch.ivy.addon.portalkit.configuration.Announcement announcement;

  /**
   * Gets the field announcement.
   * @return the value of the field announcement; may be null.
   */
  public ch.ivy.addon.portalkit.configuration.Announcement getAnnouncement()
  {
    return announcement;
  }

  /**
   * Sets the field announcement.
   * @param _announcement the new value of the field announcement.
   */
  public void setAnnouncement(ch.ivy.addon.portalkit.configuration.Announcement _announcement)
  {
    announcement = _announcement;
  }

}
