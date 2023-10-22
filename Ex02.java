public class Ex02 {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        double[][] d = new double [n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                d[i][j]=Math.random()*4500;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.printf("%10.3f ", d[i][j]);
            }
            System.out.printf("\n");
        }
        System.out.println("Column wise sum: ");
        for(int i=0; i<n; i++){
            double sum = 0;
            for(int j=0; j<n; j++){
                sum+= d[j][i];
            }
            System.out.printf("%10.3f ", sum);
        }
        System.out.println("");
    }
}
