package ch.ivyteam.htmldialog.demo.output.DataTableDemo;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class DataTableDemoData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class DataTableDemoData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 819467379224423663L;

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.htmldialog.demo.Score> scores;

  /**
   * Gets the field scores.
   * @return the value of the field scores; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.htmldialog.demo.Score> getScores()
  {
    return scores;
  }

  /**
   * Sets the field scores.
   * @param _scores the new value of the field scores.
   */
  public void setScores(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.htmldialog.demo.Score> _scores)
  {
    scores = _scores;
  }

  private ch.ivyteam.htmldialog.demo.Score selectedScore;

  /**
   * Gets the field selectedScore.
   * @return the value of the field selectedScore; may be null.
   */
  public ch.ivyteam.htmldialog.demo.Score getSelectedScore()
  {
    return selectedScore;
  }

  /**
   * Sets the field selectedScore.
   * @param _selectedScore the new value of the field selectedScore.
   */
  public void setSelectedScore(ch.ivyteam.htmldialog.demo.Score _selectedScore)
  {
    selectedScore = _selectedScore;
  }

  private ch.ivyteam.ivy.scripting.objects.List<java.lang.String> names;

  /**
   * Gets the field names.
   * @return the value of the field names; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<java.lang.String> getNames()
  {
    return names;
  }

  /**
   * Sets the field names.
   * @param _names the new value of the field names.
   */
  public void setNames(ch.ivyteam.ivy.scripting.objects.List<java.lang.String> _names)
  {
    names = _names;
  }

  private java.lang.Boolean showDialog;

  /**
   * Gets the field showDialog.
   * @return the value of the field showDialog; may be null.
   */
  public java.lang.Boolean getShowDialog()
  {
    return showDialog;
  }

  /**
   * Sets the field showDialog.
   * @param _showDialog the new value of the field showDialog.
   */
  public void setShowDialog(java.lang.Boolean _showDialog)
  {
    showDialog = _showDialog;
  }

}
