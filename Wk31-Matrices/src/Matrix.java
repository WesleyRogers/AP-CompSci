import java.util.Arrays;

/**
 * A class to handle matrices.
 * @author Wesley Rogers
 *
 */
public class Matrix {
    private int[][] matrix;
    
    /**
     * Creates a 10x10 zero matrix.
     */
    public Matrix() {
        // TODO Auto-generated constructor stub
        matrix = new int[10][10];
    }

    /**
     * Creates an empty matrix.
     * @param width  The width of the new matrix.
     * @param height The height of the new matrix.
     */
    public Matrix(int width, int height){
        matrix = new int[height][width];
    }
    
    /**
     * Creates a new matrix from a 2d array.
     * @param matrix
     */
    public Matrix(int[][] matrix){
        this.matrix = matrix;
    }
    
    /**
     * Creates a new matrix from a 2d array with an increased size.
     * @param matrix
     * @param width
     * @param height
     */
    public Matrix(int[][] matrix, int width, int height){
        this.matrix = new int[matrix.length+1][matrix[0].length+1];
        
        for(int i = 0; i < matrix.length; i++){
            for(int k = 0; k < matrix[0].length; k++){
                this.setElement(matrix[i][k], i, k);
            }
        }
        
    }
    
    
    /*   Other Methods   */
    
    /**
     * Transposes the matrix.
     */
    public void transpose(){
        Matrix transpose = new Matrix(matrix.length, matrix[0].length);
        Matrix current = this.clone();
        
        for(int i = 0; i<matrix.length; i++){ //Row
            for(int k = 0; k<matrix[0].length; k++){ //Column
                transpose.setElement(current.getElement(i, k), k, i);
            }
        }
        
        this.matrix = transpose.getMatrix();
    }
    
    /**
     * Sums a column.
     * @param column The column to sum.
     * @return       The sum of the column.
     */
    public int sumColumn(int column){
        int sum = 0;
        for(int k = 0; k < matrix.length; k++){ //row
            sum += matrix[k][column];
        }
        return sum;
    }
    
    /**
     * Sums a row.
     * @param row The row to sum.
     * @return    The sum of the row.
     */
    public int sumRow(int row){
        int sum = 0;
        for(int i: matrix[row]){
            sum += i;
        }
        return sum;  
    }
    
    /**
     * Gets the diagonal sum (trace) of the matrix.
     * @return
     */
    public int diagonalSum(){
        int sum = 0;
        for(int i = 0, k = 0; i < matrix.length; i++, k++){
            sum += matrix[i][k];
        }
        return sum;
    }
    
    /**
     * Gets the top right to bottom left diagonal sum.
     * @return
     */
    public int antiDiagonalSum(){ //k+i = max+1
        int sum = 0;
        for(int i = 0; i<matrix.length; i++){
            for(int k = 0; k<matrix[0].length; k++){
                if(k+i == matrix.length + 1){
                    sum += matrix[i][k];
                }
            }
        }
        return sum;
    }
    
    /**
     * Gets a matrix where the sums of rows and columns are.
     * @return A new matrix with sums.
     */
    public Matrix sumMatrix(){
        Matrix sumMat = new Matrix(this.matrix, this.getHeight()+1, this.getWidth()+1);
        
        
        for(int i = 0; i < matrix.length; i++){
            sumMat.setElement(this.sumRow(i), i, matrix.length);
        }
        
        //The final row
        for(int k = 0; k < matrix[0].length; k++){
            sumMat.setElement(this.sumColumn(k), matrix.length, k);
        }
        
        //Sum the last sum comlumn to give us the bottom right corner.
        sumMat.setElement(sumMat.sumColumn(matrix.length), matrix.length, matrix[0].length);
        return sumMat;
    }
    
    /*   Setters   */
    
    /**
     * Sets a position's value.
     * @param val    The value to be set.
     * @param row    The row of the position.
     * @param column The column of the position.
     */
    public void setElement(int val, int row, int column){
        matrix[row][column] = val;
    }
    
    /**
     * Sets the matrix.
     * @param matrix Sets the matrix to a new matrix.
     */
    public void setMatrix(int[][] matrix){
        this.matrix = matrix;
    }
    
    
    /*   Getters   */
    
    /**
     * Gets the value at a position
     * @param row    The row of the value.
     * @param column The column of the value.
     * @return       The value.
     */
    public int getElement(int row, int column){
        return matrix[row][column];
    }
    
    /**
     * Gets the internal matrix.
     * @return The matrix.
     */
    public int[][] getMatrix(){
        return matrix;
    }
    
    /**
     * Gets the height of the matrix.
     * @return The height of the matrix.
     */
    public int getHeight(){
        return matrix.length;
    }
    
    /**
     * Gets the width of the matrix.
     * @return The width of the matrix.
     */
    public int getWidth(){
        return matrix[0].length;
    }
    
    
    /*   Overridden Methods   */
    
    
    @Override
    public Matrix clone(){
        return this;
    }
    
    @Override
    public String toString(){
        String out = "";
        for(int i = 0; i < this.getHeight(); i++){
            out += Arrays.toString(matrix[i]).replaceAll(",", " ") + "\n";
        }
        return out;
    }
    
    
}
