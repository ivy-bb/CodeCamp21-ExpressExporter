package com.axonivy.utils.persistence.demo.DepartmentSearch;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class DepartmentSearchData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class DepartmentSearchData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -6337597825992768468L;

  private java.lang.String departmentId;

  /**
   * Gets the field departmentId.
   * @return the value of the field departmentId; may be null.
   */
  public java.lang.String getDepartmentId()
  {
    return departmentId;
  }

  /**
   * Sets the field departmentId.
   * @param _departmentId the new value of the field departmentId.
   */
  public void setDepartmentId(java.lang.String _departmentId)
  {
    departmentId = _departmentId;
  }

  private java.lang.Boolean secondSave;

  /**
   * Gets the field secondSave.
   * @return the value of the field secondSave; may be null.
   */
  public java.lang.Boolean getSecondSave()
  {
    return secondSave;
  }

  /**
   * Sets the field secondSave.
   * @param _secondSave the new value of the field secondSave.
   */
  public void setSecondSave(java.lang.Boolean _secondSave)
  {
    secondSave = _secondSave;
  }

  private com.axonivy.utils.persistence.demo.ui.DepartmentSearchBean departmentSearchBean;

  /**
   * Gets the field departmentSearchBean.
   * @return the value of the field departmentSearchBean; may be null.
   */
  public com.axonivy.utils.persistence.demo.ui.DepartmentSearchBean getDepartmentSearchBean()
  {
    return departmentSearchBean;
  }

  /**
   * Sets the field departmentSearchBean.
   * @param _departmentSearchBean the new value of the field departmentSearchBean.
   */
  public void setDepartmentSearchBean(com.axonivy.utils.persistence.demo.ui.DepartmentSearchBean _departmentSearchBean)
  {
    departmentSearchBean = _departmentSearchBean;
  }

}
