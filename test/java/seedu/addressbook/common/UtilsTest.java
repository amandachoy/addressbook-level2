package seedu.addressbook.common;

import java.util.Arrays;
import java.util.ArrayList;
import org.junit.Assert.*;
import org.junit.Test;

public class UtilsTest {

  public void isAnyNull_containsNull_returnsTrue() {
    Object[] test = new Object[] {new Object(), null};
    assertEquals(Utils.isAnyNull(test), true);
  }
  
  public void isAnyNull_noNull_returnsFalse() {
    Object[] test1 = new Object[] {new Object(), new Object()}  
    assertEquals(Utils.isAnyNull(test1), false);
  }
  
  public void elementsAreUnique_repeatedElements_returnFalse() {
    ArrayList<Integer> test2 = new ArrayList<Integer>();
    test2.add(1);
    test2.add(2);
    test2.add(1);
    assertEquals(Utils.elementsAreUnique(test2), false);
  }
  
    public void elementsAreUnique_uniqueElements_returnTrue() {
    ArrayList<Integer> test3 = new ArrayList<Integer>();
    test3.add(1);
    test3.add(2);
    test3.add(3);
    assertEquals(Utils.elementsAreUnique(test2), true);
  }
}
