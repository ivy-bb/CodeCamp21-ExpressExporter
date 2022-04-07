package com.axonivy.utils.persistence.demo.PersonSearch;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class PersonSearchData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class PersonSearchData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -1568882240222996990L;

  private java.lang.String personId;

  /**
   * Gets the field personId.
   * @return the value of the field personId; may be null.
   */
  public java.lang.String getPersonId()
  {
    return personId;
  }

  /**
   * Sets the field personId.
   * @param _personId the new value of the field personId.
   */
  public void setPersonId(java.lang.String _personId)
  {
    personId = _personId;
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

  private com.axonivy.utils.persistence.demo.ui.PersonSearchBean personSearchBean;

  /**
   * Gets the field personSearchBean.
   * @return the value of the field personSearchBean; may be null.
   */
  public com.axonivy.utils.persistence.demo.ui.PersonSearchBean getPersonSearchBean()
  {
    return personSearchBean;
  }

  /**
   * Sets the field personSearchBean.
   * @param _personSearchBean the new value of the field personSearchBean.
   */
  public void setPersonSearchBean(com.axonivy.utils.persistence.demo.ui.PersonSearchBean _personSearchBean)
  {
    personSearchBean = _personSearchBean;
  }

}
