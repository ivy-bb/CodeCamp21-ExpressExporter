package ch.ivyteam.htmldialog.demo.output.AutoCompleteDemo;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class AutoCompleteDemoData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class AutoCompleteDemoData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 6941238134817025000L;

  private java.lang.String searchText;

  /**
   * Gets the field searchText.
   * @return the value of the field searchText; may be null.
   */
  public java.lang.String getSearchText()
  {
    return searchText;
  }

  /**
   * Sets the field searchText.
   * @param _searchText the new value of the field searchText.
   */
  public void setSearchText(java.lang.String _searchText)
  {
    searchText = _searchText;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IUser> searchResult;

  /**
   * Gets the field searchResult.
   * @return the value of the field searchResult; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IUser> getSearchResult()
  {
    return searchResult;
  }

  /**
   * Sets the field searchResult.
   * @param _searchResult the new value of the field searchResult.
   */
  public void setSearchResult(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IUser> _searchResult)
  {
    searchResult = _searchResult;
  }

  private java.lang.Number selectedUserId;

  /**
   * Gets the field selectedUserId.
   * @return the value of the field selectedUserId; may be null.
   */
  public java.lang.Number getSelectedUserId()
  {
    return selectedUserId;
  }

  /**
   * Sets the field selectedUserId.
   * @param _selectedUserId the new value of the field selectedUserId.
   */
  public void setSelectedUserId(java.lang.Number _selectedUserId)
  {
    selectedUserId = _selectedUserId;
  }

  private ch.ivyteam.ivy.security.IUser userViaAjax;

  /**
   * Gets the field userViaAjax.
   * @return the value of the field userViaAjax; may be null.
   */
  public ch.ivyteam.ivy.security.IUser getUserViaAjax()
  {
    return userViaAjax;
  }

  /**
   * Sets the field userViaAjax.
   * @param _userViaAjax the new value of the field userViaAjax.
   */
  public void setUserViaAjax(ch.ivyteam.ivy.security.IUser _userViaAjax)
  {
    userViaAjax = _userViaAjax;
  }

  private ch.ivyteam.ivy.security.IUser selectedUserViaFacesConverter;

  /**
   * Gets the field selectedUserViaFacesConverter.
   * @return the value of the field selectedUserViaFacesConverter; may be null.
   */
  public ch.ivyteam.ivy.security.IUser getSelectedUserViaFacesConverter()
  {
    return selectedUserViaFacesConverter;
  }

  /**
   * Sets the field selectedUserViaFacesConverter.
   * @param _selectedUserViaFacesConverter the new value of the field selectedUserViaFacesConverter.
   */
  public void setSelectedUserViaFacesConverter(ch.ivyteam.ivy.security.IUser _selectedUserViaFacesConverter)
  {
    selectedUserViaFacesConverter = _selectedUserViaFacesConverter;
  }

}
