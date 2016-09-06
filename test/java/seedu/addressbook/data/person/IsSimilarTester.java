package seedu.addressbook.data.person;

import org.junit.Assert.*;
import org.junit.Test;
import seedu.addressbook.data.exception.IllegalValueException;

public class IsSimilarTester {
  
  public void isSimilar_inputSimilar_returnTrue() throws IllegalValueException {
    String name = "Amanda Choy";
    String other = "AMANDA CHOY"
    assertEquals(name.isSimilar(other), true);
  }
  
  public void isSimilar_inputNotSimilar_returnTrue() throws IllegalValueException {
    String name = "Amanda Choy";
    String other = "BLAH"
    assertEquals(name.isSimilar(other), false);
  }
  
}
