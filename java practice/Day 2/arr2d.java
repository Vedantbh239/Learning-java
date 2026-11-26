public class arr2d {
    public static void main() {
        //one by one array access by targeting 
        int [] []matrix={{10,20,30,40,50},{60,70,80,90,100}};
        System.out.println(matrix[1][1]);
        //array access using loop 
        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[row].length;col++){
                System.out.print(matrix[row][col]+" ");
            }
        }System.out.println();
    }
}
