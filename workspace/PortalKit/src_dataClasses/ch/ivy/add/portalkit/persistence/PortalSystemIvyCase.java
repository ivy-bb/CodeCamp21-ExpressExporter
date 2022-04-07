package ch.ivy.add.portalkit.persistence;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class PortalSystemIvyCase", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
@javax.persistence.Entity
@javax.persistence.Table(name="IWA_case")
public class PortalSystemIvyCase extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 2731596928546899247L;

  /**
   * Identifier
   */
  @javax.persistence.Id
  @javax.persistence.GeneratedValue
  private java.lang.Integer id;

  /**
   * Gets the field id.
   * @return the value of the field id; may be null.
   */
  public java.lang.Integer getId()
  {
    return id;
  }

  /**
   * Sets the field id.
   * @param _id the new value of the field id.
   */
  public void setId(java.lang.Integer _id)
  {
    id = _id;
  }

  private java.lang.String customVarCharField1;

  /**
   * Gets the field customVarCharField1.
   * @return the value of the field customVarCharField1; may be null.
   */
  public java.lang.String getCustomVarCharField1()
  {
    return customVarCharField1;
  }

  /**
   * Sets the field customVarCharField1.
   * @param _customVarCharField1 the new value of the field customVarCharField1.
   */
  public void setCustomVarCharField1(java.lang.String _customVarCharField1)
  {
    customVarCharField1 = _customVarCharField1;
  }

  private java.lang.String customVarCharField2;

  /**
   * Gets the field customVarCharField2.
   * @return the value of the field customVarCharField2; may be null.
   */
  public java.lang.String getCustomVarCharField2()
  {
    return customVarCharField2;
  }

  /**
   * Sets the field customVarCharField2.
   * @param _customVarCharField2 the new value of the field customVarCharField2.
   */
  public void setCustomVarCharField2(java.lang.String _customVarCharField2)
  {
    customVarCharField2 = _customVarCharField2;
  }

  private java.lang.String customVarCharField3;

  /**
   * Gets the field customVarCharField3.
   * @return the value of the field customVarCharField3; may be null.
   */
  public java.lang.String getCustomVarCharField3()
  {
    return customVarCharField3;
  }

  /**
   * Sets the field customVarCharField3.
   * @param _customVarCharField3 the new value of the field customVarCharField3.
   */
  public void setCustomVarCharField3(java.lang.String _customVarCharField3)
  {
    customVarCharField3 = _customVarCharField3;
  }

  private java.lang.String customVarCharField4;

  /**
   * Gets the field customVarCharField4.
   * @return the value of the field customVarCharField4; may be null.
   */
  public java.lang.String getCustomVarCharField4()
  {
    return customVarCharField4;
  }

  /**
   * Sets the field customVarCharField4.
   * @param _customVarCharField4 the new value of the field customVarCharField4.
   */
  public void setCustomVarCharField4(java.lang.String _customVarCharField4)
  {
    customVarCharField4 = _customVarCharField4;
  }

  private java.lang.String customVarCharField5;

  /**
   * Gets the field customVarCharField5.
   * @return the value of the field customVarCharField5; may be null.
   */
  public java.lang.String getCustomVarCharField5()
  {
    return customVarCharField5;
  }

  /**
   * Sets the field customVarCharField5.
   * @param _customVarCharField5 the new value of the field customVarCharField5.
   */
  public void setCustomVarCharField5(java.lang.String _customVarCharField5)
  {
    customVarCharField5 = _customVarCharField5;
  }

  private java.lang.String creatorUserName;

  /**
   * Gets the field creatorUserName.
   * @return the value of the field creatorUserName; may be null.
   */
  public java.lang.String getCreatorUserName()
  {
    return creatorUserName;
  }

  /**
   * Sets the field creatorUserName.
   * @param _creatorUserName the new value of the field creatorUserName.
   */
  public void setCreatorUserName(java.lang.String _creatorUserName)
  {
    creatorUserName = _creatorUserName;
  }

  private java.lang.String name;

  /**
   * Gets the field name.
   * @return the value of the field name; may be null.
   */
  public java.lang.String getName()
  {
    return name;
  }

  /**
   * Sets the field name.
   * @param _name the new value of the field name.
   */
  public void setName(java.lang.String _name)
  {
    name = _name;
  }

  private java.util.Date startTimestamp;

  /**
   * Gets the field startTimestamp.
   * @return the value of the field startTimestamp; may be null.
   */
  public java.util.Date getStartTimestamp()
  {
    return startTimestamp;
  }

  /**
   * Sets the field startTimestamp.
   * @param _startTimestamp the new value of the field startTimestamp.
   */
  public void setStartTimestamp(java.util.Date _startTimestamp)
  {
    startTimestamp = _startTimestamp;
  }

  private java.util.Date endTimestamp;

  /**
   * Gets the field endTimestamp.
   * @return the value of the field endTimestamp; may be null.
   */
  public java.util.Date getEndTimestamp()
  {
    return endTimestamp;
  }

  /**
   * Sets the field endTimestamp.
   * @param _endTimestamp the new value of the field endTimestamp.
   */
  public void setEndTimestamp(java.util.Date _endTimestamp)
  {
    endTimestamp = _endTimestamp;
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

  private java.lang.String processCategoryName;

  /**
   * Gets the field processCategoryName.
   * @return the value of the field processCategoryName; may be null.
   */
  public java.lang.String getProcessCategoryName()
  {
    return processCategoryName;
  }

  /**
   * Sets the field processCategoryName.
   * @param _processCategoryName the new value of the field processCategoryName.
   */
  public void setProcessCategoryName(java.lang.String _processCategoryName)
  {
    processCategoryName = _processCategoryName;
  }

  private java.lang.String processName;

  /**
   * Gets the field processName.
   * @return the value of the field processName; may be null.
   */
  public java.lang.String getProcessName()
  {
    return processName;
  }

  /**
   * Sets the field processName.
   * @param _processName the new value of the field processName.
   */
  public void setProcessName(java.lang.String _processName)
  {
    processName = _processName;
  }

  private java.util.Date businessStartTimestamp;

  /**
   * Gets the field businessStartTimestamp.
   * @return the value of the field businessStartTimestamp; may be null.
   */
  public java.util.Date getBusinessStartTimestamp()
  {
    return businessStartTimestamp;
  }

  /**
   * Sets the field businessStartTimestamp.
   * @param _businessStartTimestamp the new value of the field businessStartTimestamp.
   */
  public void setBusinessStartTimestamp(java.util.Date _businessStartTimestamp)
  {
    businessStartTimestamp = _businessStartTimestamp;
  }

  private java.util.Date businessMilestoneTimestamp;

  /**
   * Gets the field businessMilestoneTimestamp.
   * @return the value of the field businessMilestoneTimestamp; may be null.
   */
  public java.util.Date getBusinessMilestoneTimestamp()
  {
    return businessMilestoneTimestamp;
  }

  /**
   * Sets the field businessMilestoneTimestamp.
   * @param _businessMilestoneTimestamp the new value of the field businessMilestoneTimestamp.
   */
  public void setBusinessMilestoneTimestamp(java.util.Date _businessMilestoneTimestamp)
  {
    businessMilestoneTimestamp = _businessMilestoneTimestamp;
  }

  private java.lang.String businessObjectName;

  /**
   * Gets the field businessObjectName.
   * @return the value of the field businessObjectName; may be null.
   */
  public java.lang.String getBusinessObjectName()
  {
    return businessObjectName;
  }

  /**
   * Sets the field businessObjectName.
   * @param _businessObjectName the new value of the field businessObjectName.
   */
  public void setBusinessObjectName(java.lang.String _businessObjectName)
  {
    businessObjectName = _businessObjectName;
  }

  private java.lang.Long applicationId;

  /**
   * Gets the field applicationId.
   * @return the value of the field applicationId; may be null.
   */
  public java.lang.Long getApplicationId()
  {
    return applicationId;
  }

  /**
   * Sets the field applicationId.
   * @param _applicationId the new value of the field applicationId.
   */
  public void setApplicationId(java.lang.Long _applicationId)
  {
    applicationId = _applicationId;
  }

}
