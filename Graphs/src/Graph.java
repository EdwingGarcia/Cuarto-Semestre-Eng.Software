public class Graph {
    int [][] matrix;
    public Graph(){

    }
    public void initialize(int n){
        matrix=new int[n][n];
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                matrix[row][col]=0;
            }
        }
    }

    public void addEdge(Edge link) {
        matrix[link.getX()][link.getY()]= link.getWeight();
        matrix[link.getY()][link.getX()]= link.getWeight();
    }

    public int dimention(){
        return matrix.length;
    }

    public boolean adjacent(int v1,int v2) throws Exception{
        if((v1<0||v1>dimention()-1)||(v2<0||v2>dimention()-1)){
            throw new Exception("Valor fuera de rango gil,aprende a contar");
        }
        if(matrix[v1][v2]!=0){
            return true;
        }
        return false;
    }


    public int weight(int v1,int v2){
        return matrix[v1][v2];
    }



}
