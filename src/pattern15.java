public class pattern15 {
    public static void main(String[] args) {
        int row=5;
        for (int i=1;i<=row;i++){
            for (int j=1;j<=row;j++){
                if ((i+j)==6){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            for (int k=2;k<=i;k++){
                if (k==i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i=row;i>=1;i--){
            for (int j=1;j<=row;j++){
                if ((i+j)==6){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            for (int k=2;k<=i;k++){
                if (k==i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
