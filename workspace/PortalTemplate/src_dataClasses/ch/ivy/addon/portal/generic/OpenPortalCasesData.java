package ch.ivy.addon.portal.generic;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class OpenPortalCasesData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class OpenPortalCasesData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -5751973868139496795L;

  private transient ch.ivy.addon.portal.generic.view.CaseView view;

  /**
   * Gets the field view.
   * @return the value of the field view; may be null.
   */
  public ch.ivy.addon.portal.generic.view.CaseView getView()
  {
    return view;
  }

  /**
   * Sets the field view.
   * @param _view the new value of the field view.
   */
  public void setView(ch.ivy.addon.portal.generic.view.CaseView _view)
  {
    view = _view;
  }

}
