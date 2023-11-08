import java.util.Scanner;

public class NesteedLoop_2341720164 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double [][] temps = new double[5][7];
        double [] averageTemps = new double[7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i + 1));
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
                averageTemps[i] += temps[i][j];
            }
            System.out.println();
        }

        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            for (double a : temps[i]) {
                System.out.print(a + ", ");
            }
            System.out.println();
        }

            for (int j = 0; j < temps.length; j++ ){
                double total = averageTemps[j] / temps[j].length;
                System.out.println("Rata - rata suhu pada kota ke-" + (j+1) + " adalah " + total);
            }


//        for (int i = 0; i < temps.length; i++) {
//            System.out.print("Kota ke-" + (i + 1) + ": ");
//            for (int j = 0; j < temps[0].length; j++) {
//                System.out.print(temps[i][j] + " ");
//            }
//            System.out.println();

    }
}
