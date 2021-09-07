package Lesson4.Task1;

import Task1.IntArray;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class IntArrayTest {
    @Test
    public void testIntArray(){
        Task1.IntArray intArray = new IntArray();
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};

        int[] array3 = {6, 8, 10, 12};
        int[] array4 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] array5 = {1, 2, 3, 4, 5};
        int[] array6 = {5, 6, 8};

        assertEquals("5 6 7 8 ", intArray.print(array2));
        assertEquals(intArray.print(array3), intArray.print(intArray.add(array1, array2)));
        assertEquals(intArray.print(array4), intArray.print(intArray.extend(array1, array2)));
        assertEquals(intArray.print(array5), intArray.print(intArray.append(array1, 5)));
        assertEquals(intArray.print(array6), intArray.print(intArray.remove(array2, 7)));

        assertEquals(1, intArray.countArray(array1, 2));

    }

}