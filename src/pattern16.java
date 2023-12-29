//    *   
//   * *  
//  *   * 
// *******
public class pattern16 {
public static void main(String[] args) {
        int row=4;
        int col=7;
        for (int i=1;i<=row;i++){
            for (int j=1;j<=col;j++){
                if( i==4 || (i+j)==5 || (j-i)==3){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
