package orderStatistic;

import static org.junit.Assert.*;

import org.junit.Test;

public class KLargestOrderStatisticsImplTest {

  private Integer[] testArray = new Integer[] { 5, 3, 6, 2, 8 };
  private KLargestOrderStatisticsImpl<Integer> kLargestOrderStatistics = new KLargestOrderStatisticsImpl<Integer>();

  @Test
  public void testShouldReturnOneElementArray() {
    Integer[] kLargest = kLargestOrderStatistics.getKLargest(this.testArray, 4);
    Integer[] expectedResult = new Integer[] { 8 };
    assertArrayEquals(expectedResult, kLargest);
  }

  @Test
  public void testShouldReturnEmptyArray() {
    Integer[] kLargest = kLargestOrderStatistics.getKLargest(this.testArray, 5);
    Integer[] expectedResult = new Integer[] {};
    assertArrayEquals(expectedResult, kLargest);
  }

  @Test
  public void testShouldReturnArrayWithoutSmallestElement() {
    Integer[] kLargest = kLargestOrderStatistics.getKLargest(this.testArray, 1);
    Integer[] expectedResult = new Integer[] { 3, 5, 6, 8 };
    assertArrayEquals(expectedResult, kLargest);
  }

  @Test
  public void testShouldReturnArrayWithoutTwoSmallestElements() {
    Integer[] kLargest = kLargestOrderStatistics.getKLargest(this.testArray, 2);
    Integer[] expectedResult = new Integer[] { 5, 6, 8 };
    assertArrayEquals(expectedResult, kLargest);
  }
}
