import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class MatrixTest{
	@Test
	public void matrix_constructor_should_return_matrix_with_0_at_every_index(){
		Matrix matrix = new Matrix(2,2);
		assertEquals(0,matrix.matrix[0][0]);
		assertEquals(0,matrix.matrix[0][1]);
		assertEquals(0,matrix.matrix[1][0]);
		assertEquals(0,matrix.matrix[1][1]);
	}

	@Test
	public void populate_matrix_should_insert_value_into_matrix(){
		Matrix matrix = new Matrix(2,2);
		int []values = {1,2,3,4};
		matrix.populateMatrix(values);
		assertEquals(1,matrix.matrix[0][0]);
		assertEquals(2,matrix.matrix[0][1]);
		assertEquals(3,matrix.matrix[1][0]);
		assertEquals(4,matrix.matrix[1][1]);
	}

	@Test
	public void addMatrix_should_add_two_matrix(){
		Matrix matrix1 = new Matrix(2,2);
		Matrix matrix2 = new Matrix(2,2);
		Matrix result  = new Matrix(2,2);
		int []values = {1,2,3,4};
		matrix1.populateMatrix(values);
		matrix2.populateMatrix(values);
		matrix1.addMatrices(matrix2,result);
		assertEquals(2,result.matrix[0][0]);
		assertEquals(4,result.matrix[0][1]);
		assertEquals(6,result.matrix[1][0]);
		assertEquals(8,result.matrix[1][1]);
	}

	@Test 
	public void multiplyMatrix_should_multiply_two_matrix_of_different_size(){
		Matrix matrix1 = new Matrix(2,1);
		Matrix matrix2 = new Matrix(1,2);
		Matrix result  = new Matrix(2,2);
		int []values = {1,2};
		matrix1.populateMatrix(values);
		matrix2.populateMatrix(values);
		matrix1.multiplyMatrices(matrix2,result);
		assertEquals(1,result.matrix[0][0]);
		assertEquals(2,result.matrix[0][1]);
		assertEquals(2,result.matrix[1][0]);
		assertEquals(4,result.matrix[1][1]);
	}

	@Test 
	public void multiplyMatrix_should_multiply_two_square_matrix(){
		Matrix matrix1 = new Matrix(2,2);
		Matrix matrix2 = new Matrix(2,2);
		Matrix result  = new Matrix(2,2);
		int []values = {1,2,3,4};
		matrix1.populateMatrix(values);
		matrix2.populateMatrix(values);
		matrix1.multiplyMatrices(matrix2,result);
		assertEquals(7,result.matrix[0][0]);
		assertEquals(10,result.matrix[0][1]);
		assertEquals(15,result.matrix[1][0]);
		assertEquals(22,result.matrix[1][1]);
	}

}