import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls
  @Test
  public void testCountFrequencies_whenIntegersHaveDifferentFrequencies() {
    Integer[] nums = {97, 97, 97, 97, 98, 98, 99, 100, 100, 100};
    Map<Integer, Integer> actual = Practice.countFrequencies(nums);
    
    assertEquals(4, actual.get(97));
    assertEquals(2, actual.get(98));
    assertEquals(1, actual.get(99));
    assertEquals(3, actual.get(100));
  }

  @Test
  public void testCountFrequencies_whenOnlyTheSameInteger() {
    Integer[] nums = {94, 94, 94, 94, 94};
    Map<Integer, Integer> actual = Practice.countFrequencies(nums);
    
    assertEquals(5, actual.get(94));
  }

  @Test
  public void testCountFrequencies_whenArrayIsEmpty() {
    Integer[] nums = {};
    Map<Integer, Integer> actual = Practice.countFrequencies(nums);
    
    assertTrue(actual.isEmpty());
  }

  @Test
  public void testMostCommonTimeEfficient_whenOrderedArray() {
    int[] nums = {1001, 1002, 1002, 1002, 1003};
    int actual = Practice.mostCommonTimeEfficient(nums);
    assertEquals(1002, actual);
  }

  @Test
  public void testMostCommonTimeEfficient_whenUnorderedArray() {
    int[] nums = {1001, 1003, 1002, 1002, 1002};
    int actual = Practice.mostCommonTimeEfficient(nums);
    assertEquals(1002, actual);
  }

  @Test
  public void testMostCommonTimeEfficient_handlesIllegalArgumentException_whenEmptyArray() {
    int[] nums = {};  
    assertThrows(IllegalArgumentException.class, () -> {
      Practice.mostCommonTimeEfficient(nums);
    });
  }

  @Test
  public void testMostCommonSpaceEfficient_whenOrderedArray() {
    int[] nums = {97, 98, 99, 99, 99, 100};
    int actual = Practice.mostCommonSpaceEfficient(nums);
    assertEquals(99, actual);
  }

  @Test
  public void testMostCommonSpaceEfficient_whenUnorderedArray() {
    int[] nums = {100, 99, 98, 99, 97, 99};
    int actual = Practice.mostCommonSpaceEfficient(nums);
    assertEquals(99, actual);
  }

  @Test
  public void testMostCommonSpaceEfficient_tieBreakScenario() {
    int[] nums = {97, 97, 98, 98, 99, 100};
    int actual = Practice.mostCommonSpaceEfficient(nums);
    assertEquals(97, actual);
  }
}
