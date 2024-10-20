import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ağırlıklar tanımlanıyor
        double examWeight = 0.50;  // Sınav %50
        double assignmentWeight = 0.30;  // Ödev %30
        double projectWeight = 0.20;  // Proje %20

        // Kullanıcıdan notları alma
        System.out.print("Sınav notunuzu girin (0-100): ");
        double examScore = scanner.nextDouble();

        System.out.print("Ödev notunuzu girin (0-100): ");
        double assignmentScore = scanner.nextDouble();

        System.out.print("Proje notunuzu girin (0-100): ");
        double projectScore = scanner.nextDouble();

        // Final notunu hesaplama
        double finalGrade = (examScore * examWeight) + (assignmentScore * assignmentWeight) + (projectScore * projectWeight);

        // Sonucu gösterme
        System.out.printf("Final notunuz: %.2f\n", finalGrade);

        // Geçme/Kalma durumu
        if (finalGrade >= 60) {
            System.out.println("Sonuç: Geçtiniz!");
        } else {
            System.out.println("Sonuç: Kaldınız.");
        }

        // Scanner'ı kapatma
        scanner.close();
    }
}