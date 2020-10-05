package edu.udg.caes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExerciseIntroTestingTest {

    @Test
    public void testFindLast(){
        final int result = ExerciseIntroTesting.findLast(new int []{2, 3, 5}, 2);
        assertEquals(result, 0);
    }

    @Test
    public void testLastZero(){
        final int result = ExerciseIntroTesting.lastZero(new int []{0, 1, 0});
        assertEquals(result, 2);
    }

    @Test
    public void testCountPositive(){
        final int result = ExerciseIntroTesting.countPositive(new int []{-4, 2, 0, 2});
        assertEquals(result, 2);
    }

    @Test
    public void testOddOrPos(){
        final int result = ExerciseIntroTesting.oddOrPos(new int []{-3, -2, 0, 1, 4});
        assertEquals(result, 3);
    }

    //New tests

    @Test
    public void testFindLastNew(){
        final int result = ExerciseIntroTesting.findLast(new int []{4, 5}, 2);
        assertEquals(result, -1);
    }

    @Test
    public void testLastZeroNew(){
        final int result = ExerciseIntroTesting.lastZero(new int []{0, 3 , 1});
        assertEquals(result, 0);
    }

    @Test
    public void testCountPositiveNew(){
        final int result = ExerciseIntroTesting.countPositive(new int []{-4, 2, 2});
        assertEquals(result, 2);
    }

    @Test
    public void testOddOrPosNew(){
        final int result = ExerciseIntroTesting.oddOrPos(new int []{2, -2, 5, 4});
        assertEquals(result, 3);
    }
}