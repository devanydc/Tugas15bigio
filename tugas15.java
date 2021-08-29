import java.util.*;

public class tugas15 {
    public static void main(String[] args) {
        int i, j, k, n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        n = sc.nextInt();

        System.out.println("");

        // bintang atas
        for (i = 0; i < n; i++) {
            // indentasi
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // bintang
            for (k = i; k <= n - 1; k++) {
                System.out.print("*" + " ");
            }

            System.out.println("");
        }

        // bintang bawah
        for (i = n - 1; i > 0; i--) {
            // indentasi
            for (j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            // bintang
            for (k = i; k <= n; k++) {
                System.out.print("*" + " ");
            }

            System.out.println("");
        }

    }
}