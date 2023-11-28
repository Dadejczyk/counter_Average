import java.util.Scanner;

public class SumowanieLiczb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczby do zsumowania (wpisz 0, aby zakończyć):");

        int suma = 0;
        int liczba;

        do
        {
            System.out.print("Podaj liczbę: ");
            liczba = scanner.nextInt();
            suma += liczba;
        } while (liczba != 0);

        System.out.println("Suma wprowadzonych liczb to: " + suma);

        scanner.close();
    }
}