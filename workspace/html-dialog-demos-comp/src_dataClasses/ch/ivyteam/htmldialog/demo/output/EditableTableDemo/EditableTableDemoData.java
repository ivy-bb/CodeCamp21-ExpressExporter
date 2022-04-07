package ch.ivyteam.htmldialog.demo.output.EditableTableDemo;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class EditableTableDemoData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class EditableTableDemoData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 4339334339106120119L;

  private ch.ivyteam.ivy.scripting.objects.Recordset recordset;

  /**
   * Gets the field recordset.
   * @return the value of the field recordset; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.Recordset getRecordset()
  {
    return recordset;
  }

  /**
   * Sets the field recordset.
   * @param _recordset the new value of the field recordset.
   */
  public void setRecordset(ch.ivyteam.ivy.scripting.objects.Recordset _recordset)
  {
    recordset = _recordset;
  }

  private ch.ivyteam.ivy.scripting.objects.Record selectedPerson;

  /**
   * Gets the field selectedPerson.
   * @return the value of the field selectedPerson; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.Record getSelectedPerson()
  {
    return selectedPerson;
  }

  /**
   * Sets the field selectedPerson.
   * @param _selectedPerson the new value of the field selectedPerson.
   */
  public void setSelectedPerson(ch.ivyteam.ivy.scripting.objects.Record _selectedPerson)
  {
    selectedPerson = _selectedPerson;
  }

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

}
