public class pattern10 {
    public static void main(String[] args) {
        int row=4;
//        UPPER PORION
        for (int i=1;i<=row;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            int spaces=2*(row-i);
            for (int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
//        LOWER PORTION
        for (int i=row;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            int spaces=2*(row-i);
            for (int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
