package ch.ivyteam.htmldialog.demo.output.LazyLoadingDemo;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class LazyLoadingDemoData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class LazyLoadingDemoData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -3933169529079431147L;

  /**
   * Model is lazy loaded
   */
  private org.primefaces.model.LazyDataModel lazyModel;

  /**
   * Gets the field lazyModel.
   * @return the value of the field lazyModel; may be null.
   */
  public org.primefaces.model.LazyDataModel getLazyModel()
  {
    return lazyModel;
  }

  /**
   * Sets the field lazyModel.
   * @param _lazyModel the new value of the field lazyModel.
   */
  public void setLazyModel(org.primefaces.model.LazyDataModel _lazyModel)
  {
    lazyModel = _lazyModel;
  }

}
