import java.util.Scanner;

public class Patrones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero de caracteres a mostrar en cada patron: ");
        int n = scanner.nextInt();

        //Patron 1 *.*.*.*.*.*.*
        for (int i = 0; i <n; i++) {
            if(i%2==0) {
                System.out.print("*");
            } else {
                System.out.print(".");
            }
        }
        System.out.println();

        //Patron 2 12341234
        for (int i = 0; i <n; i++) {
            System.out.printf("%d",i%4 + 1);
        }
        System.out.println();

        //Patron 3 ||*||*||*||*
        for (int i = 1; i <= n; i++) {
            if(i%3==0) {
                System.out.print("*");
            } else {
                System.out.print("|");
            }
        }
        System.out.println();

    }
}
