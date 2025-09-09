import java.util.Scanner;

public class penilaian{
    public static void main(String[] args) {
        hitungnilai mhs1 = new hitungnilai();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nilai: ");
        int nilai = scanner.nextInt();
        
        System.out.println("Status: " + mhs1.StatusKelulusan(nilai));
        System.out.println("Grade : " + mhs1.GradeNilai(nilai));
    }
}