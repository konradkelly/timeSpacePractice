import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls


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
}
