package ch.ivy.addon.portalkit.component.cases.column.CaseColumnHeader;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class CaseColumnHeaderData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class CaseColumnHeaderData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -9002937901250006798L;

  private ch.ivy.addon.portalkit.datamodel.CaseLazyDataModel dataModel;

  /**
   * Gets the field dataModel.
   * @return the value of the field dataModel; may be null.
   */
  public ch.ivy.addon.portalkit.datamodel.CaseLazyDataModel getDataModel()
  {
    return dataModel;
  }

  /**
   * Sets the field dataModel.
   * @param _dataModel the new value of the field dataModel.
   */
  public void setDataModel(ch.ivy.addon.portalkit.datamodel.CaseLazyDataModel _dataModel)
  {
    dataModel = _dataModel;
  }

  private java.lang.String sortedField;

  /**
   * Gets the field sortedField.
   * @return the value of the field sortedField; may be null.
   */
  public java.lang.String getSortedField()
  {
    return sortedField;
  }

  /**
   * Sets the field sortedField.
   * @param _sortedField the new value of the field sortedField.
   */
  public void setSortedField(java.lang.String _sortedField)
  {
    sortedField = _sortedField;
  }

  private java.lang.Boolean isSortingDescending;

  /**
   * Gets the field isSortingDescending.
   * @return the value of the field isSortingDescending; may be null.
   */
  public java.lang.Boolean getIsSortingDescending()
  {
    return isSortingDescending;
  }

  /**
   * Sets the field isSortingDescending.
   * @param _isSortingDescending the new value of the field isSortingDescending.
   */
  public void setIsSortingDescending(java.lang.Boolean _isSortingDescending)
  {
    isSortingDescending = _isSortingDescending;
  }

}
