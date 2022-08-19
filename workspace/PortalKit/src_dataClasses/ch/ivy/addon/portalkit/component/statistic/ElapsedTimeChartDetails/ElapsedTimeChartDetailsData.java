package ch.ivy.addon.portalkit.component.statistic.ElapsedTimeChartDetails;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class ElapsedTimeChartDetailsData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class ElapsedTimeChartDetailsData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -3454245492788140289L;

  private ch.ivy.addon.portalkit.datamodel.internal.ElapsedTimeLazyDataModel dataModel;

  /**
   * Gets the field dataModel.
   * @return the value of the field dataModel; may be null.
   */
  public ch.ivy.addon.portalkit.datamodel.internal.ElapsedTimeLazyDataModel getDataModel()
  {
    return dataModel;
  }

  /**
   * Sets the field dataModel.
   * @param _dataModel the new value of the field dataModel.
   */
  public void setDataModel(ch.ivy.addon.portalkit.datamodel.internal.ElapsedTimeLazyDataModel _dataModel)
  {
    dataModel = _dataModel;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.workflow.ICase> cases;

  /**
   * Gets the field cases.
   * @return the value of the field cases; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.workflow.ICase> getCases()
  {
    return cases;
  }

  /**
   * Sets the field cases.
   * @param _cases the new value of the field cases.
   */
  public void setCases(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.workflow.ICase> _cases)
  {
    cases = _cases;
  }

  private java.lang.Long totalCases;

  /**
   * Gets the field totalCases.
   * @return the value of the field totalCases; may be null.
   */
  public java.lang.Long getTotalCases()
  {
    return totalCases;
  }

  /**
   * Sets the field totalCases.
   * @param _totalCases the new value of the field totalCases.
   */
  public void setTotalCases(java.lang.Long _totalCases)
  {
    totalCases = _totalCases;
  }

  private java.lang.Integer startIndex;

  /**
   * Gets the field startIndex.
   * @return the value of the field startIndex; may be null.
   */
  public java.lang.Integer getStartIndex()
  {
    return startIndex;
  }

  /**
   * Sets the field startIndex.
   * @param _startIndex the new value of the field startIndex.
   */
  public void setStartIndex(java.lang.Integer _startIndex)
  {
    startIndex = _startIndex;
  }

  private java.lang.Integer count;

  /**
   * Gets the field count.
   * @return the value of the field count; may be null.
   */
  public java.lang.Integer getCount()
  {
    return count;
  }

  /**
   * Sets the field count.
   * @param _count the new value of the field count.
   */
  public void setCount(java.lang.Integer _count)
  {
    count = _count;
  }

  private ch.ivy.addon.portalkit.ivydata.searchcriteria.CaseSearchCriteria caseSearchCriteria;

  /**
   * Gets the field caseSearchCriteria.
   * @return the value of the field caseSearchCriteria; may be null.
   */
  public ch.ivy.addon.portalkit.ivydata.searchcriteria.CaseSearchCriteria getCaseSearchCriteria()
  {
    return caseSearchCriteria;
  }

  /**
   * Sets the field caseSearchCriteria.
   * @param _caseSearchCriteria the new value of the field caseSearchCriteria.
   */
  public void setCaseSearchCriteria(ch.ivy.addon.portalkit.ivydata.searchcriteria.CaseSearchCriteria _caseSearchCriteria)
  {
    caseSearchCriteria = _caseSearchCriteria;
  }

  private java.lang.Long filterGroupId;

  /**
   * Gets the field filterGroupId.
   * @return the value of the field filterGroupId; may be null.
   */
  public java.lang.Long getFilterGroupId()
  {
    return filterGroupId;
  }

  /**
   * Sets the field filterGroupId.
   * @param _filterGroupId the new value of the field filterGroupId.
   */
  public void setFilterGroupId(java.lang.Long _filterGroupId)
  {
    filterGroupId = _filterGroupId;
  }

  private java.lang.String category;

  /**
   * Gets the field category.
   * @return the value of the field category; may be null.
   */
  public java.lang.String getCategory()
  {
    return category;
  }

  /**
   * Sets the field category.
   * @param _category the new value of the field category.
   */
  public void setCategory(java.lang.String _category)
  {
    category = _category;
  }

}
