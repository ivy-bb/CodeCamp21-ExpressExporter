package ch.ivyteam.htmldialog.demo.output.SelectManyCheckboxDemo;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class SelectManyCheckboxDemoData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class SelectManyCheckboxDemoData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 6127895592139157079L;

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.htmldialog.demo.Person> persons;

  /**
   * Gets the field persons.
   * @return the value of the field persons; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.htmldialog.demo.Person> getPersons()
  {
    return persons;
  }

  /**
   * Sets the field persons.
   * @param _persons the new value of the field persons.
   */
  public void setPersons(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.htmldialog.demo.Person> _persons)
  {
    persons = _persons;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.htmldialog.demo.Person> selectedPersons;

  /**
   * Gets the field selectedPersons.
   * @return the value of the field selectedPersons; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.htmldialog.demo.Person> getSelectedPersons()
  {
    return selectedPersons;
  }

  /**
   * Sets the field selectedPersons.
   * @param _selectedPersons the new value of the field selectedPersons.
   */
  public void setSelectedPersons(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.htmldialog.demo.Person> _selectedPersons)
  {
    selectedPersons = _selectedPersons;
  }

}
