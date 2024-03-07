public class CustomExcep {
    // Metode validasi
    static void validasiinput (String pass) throws Password {
        if (!pass.equals("password123")) {
            throw new Password("Coba lagi");
        }
    }

    public static void main (String[] args) throws Password {
        //String password = "password123";
        try {
            validasiinput("wordpass");
        }
        catch (Password p){
            System.out.println("Error: " + p.getMessage());
        }
    }
}
