import java.util.Scanner;

public class kalkulator {
    static int tambah(int a, int b){
        return a + b;
    }

    static int kali(int a, int b){
        return a * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan nilai a: ");
        int a = scanner.nextInt();
        System.out.println("Masukkan nilai b: ");
        int b = scanner.nextInt();

        System.out.println("Hasil Tambah: " + tambah(a, b));
        System.out.println("Hasil Kali: " + kali(a, b));

    };
}