import java.util.Scanner;

public class Throwinput {
    // Throw exception: Null Pointer Exception
    static void id(String username) {
        if (username != null) {
            System.out.println("Hai " + username);
        }
        else {
            throw new NullPointerException("Tidak kenal");
        }
    }

    // Throws exception: NumberFormatException
    static void pass(String password) throws NumberFormatException{
        int angka = Integer.parseInt(password);
    }

    // Throw exception: Illegal Argument Exception
    static void hidup(int usia) {
        if (usia < 0) {
            throw new IllegalArgumentException("Tidak hidup");
        }
        else {
            System.out.println("Pernah hidup");
        }
    }

    public static void main (String[] args) {
        String username = null;
        String password = "password123";
        int usia = -1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Pilih kasus : ");
        int kasus = scan.nextInt();
        switch (kasus) {
            case 1:
                id(username);
            case 2:
                pass(password);
            case 3:
                hidup(usia);
            default:
                System.out.println("Pilih kasus 1 sampai 3");
        }
    }
}
