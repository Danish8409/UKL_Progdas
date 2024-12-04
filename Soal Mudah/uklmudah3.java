public class uklmudah3 {
    public static void main(String[] args) {

        for (int i = 50; i >= 1; i--) {// pengulangan int
            if (i % 4 == 0) { // untuk bilangan yang perkalian 3
                System.out.println(i + ". saya anak angkatan 33");
            } else if (i % 4 == 1) { // untuk bilangan yang perkalian 2
                System.out.println(i + ". saya anak moklet");
            } else if (i % 4 == 2) { // selain bilangan perkalian 3 & 2
                System.out.println(i + ". saya anak wikusama");
            } else {
                System.out.println(i + ". saya senang");
            }
        }

    }
}