package ch.ivyteam.htmldialog.demo.component.DetailListComponent;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class DetailListComponentData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class DetailListComponentData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -5548413193381264690L;

  private transient ch.ivyteam.htmldialog.demo.component.PersonListDataModel persons;

  /**
   * Gets the field persons.
   * @return the value of the field persons; may be null.
   */
  public ch.ivyteam.htmldialog.demo.component.PersonListDataModel getPersons()
  {
    return persons;
  }

  /**
   * Sets the field persons.
   * @param _persons the new value of the field persons.
   */
  public void setPersons(ch.ivyteam.htmldialog.demo.component.PersonListDataModel _persons)
  {
    persons = _persons;
  }

  private transient ch.ivyteam.htmldialog.demo.Person selectedPerson;

  /**
   * Gets the field selectedPerson.
   * @return the value of the field selectedPerson; may be null.
   */
  public ch.ivyteam.htmldialog.demo.Person getSelectedPerson()
  {
    return selectedPerson;
  }

  /**
   * Sets the field selectedPerson.
   * @param _selectedPerson the new value of the field selectedPerson.
   */
  public void setSelectedPerson(ch.ivyteam.htmldialog.demo.Person _selectedPerson)
  {
    selectedPerson = _selectedPerson;
  }

}
