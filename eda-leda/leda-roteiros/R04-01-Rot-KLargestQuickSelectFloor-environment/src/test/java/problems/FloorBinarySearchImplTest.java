package problems;

import static org.junit.Assert.*;

import org.junit.Test;

public class FloorBinarySearchImplTest {
    
    private Integer[] array1 = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8};
    private Integer[] array2 = new Integer[]{2, 3, 5, 6, 8};
    private FloorBinarySearchImpl floorBinarySearch = new FloorBinarySearchImpl();

    @Test
    public void testShouldFindIndex() {
        int foundIndex = floorBinarySearch.binarySearch(this.array1, 0, this.array1.length - 1, 3);
        assertEquals(2, foundIndex);
    }
}
