import java.util.Scanner;

public class Square{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();

        for (int j =1 ; j <= N; j++) {
            for (int i = 0; i <= N; i++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
