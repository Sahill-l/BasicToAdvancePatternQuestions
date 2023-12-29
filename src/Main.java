import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row =4;
        int col=10;

        for (int i =1;i<=row;i++){
            for (int j=1;j<=col;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
