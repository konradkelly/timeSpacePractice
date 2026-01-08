import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls

  // findEvens Tests

  @Test
  public void testFindEvens_whenArrayContainsOddsAndEvens() {
    int[] nums = {91, 94, 93, 95, 92, 97, 96, 100};
    List<Integer> actual = Practice.findEvens(nums);
    
    assertEquals(List.of(94, 92, 96, 100), actual);
  }

  @Test
  public void testFindEvens_whenAllEvens() {
    int[] nums = {90, 92, 94, 96, 98, 100};
    List<Integer> actual = Practice.findEvens(nums);
    
      assertEquals(List.of(90, 92, 94, 96, 98, 100), actual);
  }

  @Test
  public void testFindEvens_whenAllOdds() {
    int[] nums = {91, 93, 95, 99, 97};
    List<Integer> actual = Practice.findEvens(nums);
    
    assertTrue(actual.isEmpty());
  }

  @Test
  public void testFindEvens_whenEmptyArray() {
    int[] nums = {};
    List<Integer> actual = Practice.findEvens(nums);
    
    assertTrue(actual.isEmpty());
  }

  @Test
  public void testFindEvens_whenArrayContainsNegativeNumbers() {
    int[] nums = {-90, -91, -92, -93, -94, -95, -96, -97, -98};
    List<Integer> actual = Practice.findEvens(nums);
    
    assertEquals(5, actual.size());
    assertEquals(List.of(-90, -92, -94, -96, -98), actual);
  }

  // countFrequencies Tests

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
  public void testCountFrequencies_whenNegativeNumbers() {
    Integer[] nums = {-98, -95, -96, -98, -95, -98, -97, -96, -98, -95};
    Map<Integer, Integer> actual = Practice.countFrequencies(nums);
    
    assertEquals(4, actual.get(-98));
    assertEquals(3, actual.get(-95));
    assertEquals(2, actual.get(-96));
    assertEquals(1, actual.get(-97));
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
  public void testMostCommonTimeEfficient_whenNegativeNumbers() {
    int[] nums = {-94, -98, -94, -97, -94, -96, -94};
    int actual = Practice.mostCommonTimeEfficient(nums);
    assertEquals(-94, actual);
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

  @Test
  public void testMostCommonSpaceEfficient_whenNegativeNumbers() {
    int[] nums = {-94, -98, -94, -97, -94, -96, -94};
    int actual = Practice.mostCommonSpaceEfficient(nums);
    assertEquals(-94, actual);
  }

  @Test
  public void testMostCommonSpaceEfficient_equalOppositesNegative() {
    int[] nums = {-1000, 1000, -1001, 1001};
    int actual = Practice.mostCommonSpaceEfficient(nums);
    assertEquals(-1000, actual);
  }

  @Test
  public void testMostCommonSpaceEfficient_equalOppositesPositive() {
    int[] nums = {1000, -1000, 1001, -1001};
    int actual = Practice.mostCommonSpaceEfficient(nums);
    assertEquals(1000, actual);
  }

  @Test
  public void testMostCommonTimeEfficient_equalOppositesNegative() {
    int[] nums = {-1000, 1000, -1001, 1001};
    int actual = Practice.mostCommonTimeEfficient(nums);
    assertEquals(-1000, actual);
  }
}
