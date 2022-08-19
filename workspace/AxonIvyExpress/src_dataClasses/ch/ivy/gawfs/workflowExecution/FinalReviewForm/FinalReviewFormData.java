package ch.ivy.gawfs.workflowExecution.FinalReviewForm;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class FinalReviewFormData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class FinalReviewFormData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 7434568072119893521L;

  private java.util.List<gawfs.TaskDef> finishedTasks;

  /**
   * Gets the field finishedTasks.
   * @return the value of the field finishedTasks; may be null.
   */
  public java.util.List<gawfs.TaskDef> getFinishedTasks()
  {
    return finishedTasks;
  }

  /**
   * Sets the field finishedTasks.
   * @param _finishedTasks the new value of the field finishedTasks.
   */
  public void setFinishedTasks(java.util.List<gawfs.TaskDef> _finishedTasks)
  {
    finishedTasks = _finishedTasks;
  }

  private java.util.List<java.lang.String> steps;

  /**
   * Gets the field steps.
   * @return the value of the field steps; may be null.
   */
  public java.util.List<java.lang.String> getSteps()
  {
    return steps;
  }

  /**
   * Sets the field steps.
   * @param _steps the new value of the field steps.
   */
  public void setSteps(java.util.List<java.lang.String> _steps)
  {
    steps = _steps;
  }

  private java.lang.Integer actualStepIndex;

  /**
   * Gets the field actualStepIndex.
   * @return the value of the field actualStepIndex; may be null.
   */
  public java.lang.Integer getActualStepIndex()
  {
    return actualStepIndex;
  }

  /**
   * Sets the field actualStepIndex.
   * @param _actualStepIndex the new value of the field actualStepIndex.
   */
  public void setActualStepIndex(java.lang.Integer _actualStepIndex)
  {
    actualStepIndex = _actualStepIndex;
  }

}
