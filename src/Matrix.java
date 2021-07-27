
public class Matrix {
    public final int size;
    public final int maxShipLenght;
    /**
    0 - sea, 1 - ship, 2 - sea near ship, 3 - shooted sea, 4 - shooted ship
     */
    static private int[][] matrix;

    public Matrix(int size, int maxShipLenght) {
        this.size = size;
        this.maxShipLenght = maxShipLenght;
        matrix = new int[this.size][this.size];

        //Обнуление:
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                matrix[i][j] = 1;
            }
        }
    }
    private int get(int x, int y){
        return matrix[x][y];
    }
    private void set(int x, int y, int type){
        matrix[x][y]=type;
    }

    public boolean placeShip(Ship ship){
        return true;
    }
    public boolean hit(int x, int y){

        return true;
    }

    public String printUser(){
        String result="";

        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++){
                result += "__";
            }
            result += "_\n";
            for (int j = 0; j < this.size; j++) {
                if (matrix[i][j] == 0 || matrix[i][j] == 1 || matrix[i][j] == 2){
                    result += "| ";
                }
                if (matrix[i][j] == 3){
                    result += "|•";
                }
                if (matrix[i][j] == 4){
                    result += "|*";
                }
            }
            result += "|\n";
        }
        for (int j = 0; j < this.size; j++){
            result += "__";
        }
        result += "_\n";

        return result;
    }
    public String printComp(){
        String result="";

        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++){
                result += "|-";
            }
            result += "|\n";
            for (int j = 0; j < this.size; j++) {
                if (matrix[i][j] == 0 || matrix[i][j] == 2){
                    result += "| ";
                }
                if (matrix[i][j] == 1){
                    result += "|+";
                }
                if (matrix[i][j] == 3){
                    result += "|•";
                }
                if (matrix[i][j] == 4){
                    result += "|*";
                }
            }
            result += "|\n";
        }
        for (int j = 0; j < this.size; j++){
            result += "--";
        }
        result += "-\n";

        return result;
    }
}

