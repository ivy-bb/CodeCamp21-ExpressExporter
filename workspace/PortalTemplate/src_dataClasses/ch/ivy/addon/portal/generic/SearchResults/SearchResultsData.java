package ch.ivy.addon.portal.generic.SearchResults;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class SearchResultsData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class SearchResultsData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 1151368003009320886L;

  /**
   * For customization: change this attribute's type to <YOUR_CUSTOMIZED_DATA_MODEL>, for example: CustomizedSearchResultsDataModel
   */
  private ch.ivy.addon.portalkit.datamodel.SearchResultsDataModel dataModel;

  /**
   * Gets the field dataModel.
   * @return the value of the field dataModel; may be null.
   */
  public ch.ivy.addon.portalkit.datamodel.SearchResultsDataModel getDataModel()
  {
    return dataModel;
  }

  /**
   * Sets the field dataModel.
   * @param _dataModel the new value of the field dataModel.
   */
  public void setDataModel(ch.ivy.addon.portalkit.datamodel.SearchResultsDataModel _dataModel)
  {
    dataModel = _dataModel;
  }

  private java.lang.Number activeTabIndex;

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
