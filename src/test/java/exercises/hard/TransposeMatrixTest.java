package exercises.hard;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransposeMatrixTest {

    @Test
    void testTranspose_squareMatrix() {
        List<List<Integer>> matrix = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9));
        List<List<Integer>> result = TransposeMatrix.transpose(matrix);

        List<List<Integer>> expected = List.of(
                List.of(1, 4, 7),
                List.of(2, 5, 8),
                List.of(3, 6, 9));
        assertEquals(expected, result);
    }

    @Test
    void testTranspose_rectangularMatrix() {
        List<List<Integer>> matrix = List.of(
                List.of(1, 2, 3, 4),
                List.of(5, 6, 7, 8));
        List<List<Integer>> result = TransposeMatrix.transpose(matrix);

        List<List<Integer>> expected = List.of(
                List.of(1, 5),
                List.of(2, 6),
                List.of(3, 7),
                List.of(4, 8));
        assertEquals(expected, result);
    }

    @Test
    void testTranspose_singleRow() {
        List<List<Integer>> matrix = List.of(
                List.of(1, 2, 3, 4, 5));
        List<List<Integer>> result = TransposeMatrix.transpose(matrix);

        List<List<Integer>> expected = List.of(
                List.of(1),
                List.of(2),
                List.of(3),
                List.of(4),
                List.of(5));
        assertEquals(expected, result);
    }

    @Test
    void testTranspose_singleColumn() {
        List<List<Integer>> matrix = List.of(
                List.of(1),
                List.of(2),
                List.of(3));
        List<List<Integer>> result = TransposeMatrix.transpose(matrix);

        List<List<Integer>> expected = List.of(
                List.of(1, 2, 3));
        assertEquals(expected, result);
    }

    @Test
    void testTranspose_singleElement() {
        List<List<Integer>> matrix = List.of(
                List.of(42));
        List<List<Integer>> result = TransposeMatrix.transpose(matrix);

        List<List<Integer>> expected = List.of(
                List.of(42));
        assertEquals(expected, result);
    }

    @Test
    void testTranspose_withNegativeNumbers() {
        List<List<Integer>> matrix = List.of(
                List.of(-1, -2),
                List.of(-3, -4),
                List.of(-5, -6));
        List<List<Integer>> result = TransposeMatrix.transpose(matrix);

        List<List<Integer>> expected = List.of(
                List.of(-1, -3, -5),
                List.of(-2, -4, -6));
        assertEquals(expected, result);
    }

    @Test
    void testTranspose_doubleTranspose() {
        List<List<Integer>> matrix = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6));
        List<List<Integer>> transposed = TransposeMatrix.transpose(matrix);
        List<List<Integer>> doubleTransposed = TransposeMatrix.transpose(transposed);

        assertEquals(matrix, doubleTransposed);
    }
}
