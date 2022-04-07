package ch.ivy.addon.portal.generic;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class OpenPortalSearchData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class OpenPortalSearchData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -2938368240767533771L;

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

  private transient java.lang.Number activeTabIndex;

  /**
   * Gets the field activeTabIndex.
   * @return the value of the field activeTabIndex; may be null.
   */
  public java.lang.Number getActiveTabIndex()
  {
    return activeTabIndex;
  }

  /**
   * Sets the field activeTabIndex.
   * @param _activeTabIndex the new value of the field activeTabIndex.
   */
  public void setActiveTabIndex(java.lang.Number _activeTabIndex)
  {
    activeTabIndex = _activeTabIndex;
  }

}
