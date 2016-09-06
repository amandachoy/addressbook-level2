package seedu.addressbook.data.person;

public class Contact {
  
  public final String value;
  private boolean isPrivate;
  
  public String toString() {
    return value;
  }
  
  public int hashCode() {
    return value.hashCode();
  }

  public boolean isPrivate() {
    return isPrivate;
  }
}
