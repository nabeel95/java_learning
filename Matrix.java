public class Matrix{
	private int rows;
	private int columns;
	public int [][]matrix;
	public Matrix(int rows,int columns){
		this.rows=rows;
		this.columns=columns;
		this.matrix = new int[rows][columns];
	}

	public void populateMatrix(int []values){
		int counter=0;
		for (int i=0;i<this.rows;i++) {
			for (int j=0;j<this.columns;j++ ) {
				this.matrix[i][j]=values[counter];
				counter++;
			}
		}
	}

	public void addMatrices(Matrix matrix,Matrix result){
		for(int i=0;i<this.rows;i++){
			for (int j=0;j<this.columns;j++ ) {
				result.matrix[i][j]=(this.matrix[i][j]+matrix.matrix[i][j]);
			}
		}
	}

	public void multiplyMatrices(Matrix matrix,Matrix result){
		for (int i=0;i<this.rows;i++) { 
            for (int j=0;j<matrix.columns;j++) { 
                for (int k=0;k<this.columns;k++) { 
                    result.matrix[i][j] += this.matrix[i][k] * matrix.matrix[k][j];
                }
            }
        }
	}

}