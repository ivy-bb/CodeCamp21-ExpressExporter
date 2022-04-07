package ch.ivy.addon.portal.generic.AdditionalCaseDetails;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class AdditionalCaseDetailsData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class AdditionalCaseDetailsData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -7909677031801676693L;

  private ch.ivyteam.ivy.workflow.ICase selectedCase;

  /**
   * Gets the field selectedCase.
   * @return the value of the field selectedCase; may be null.
   */
  public ch.ivyteam.ivy.workflow.ICase getSelectedCase()
  {
    return selectedCase;
  }

  /**
   * Sets the field selectedCase.
   * @param _selectedCase the new value of the field selectedCase.
   */
  public void setSelectedCase(ch.ivyteam.ivy.workflow.ICase _selectedCase)
  {
    selectedCase = _selectedCase;
  }

}
