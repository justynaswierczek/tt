
public class zadanie3 {
    public static void main(String[] args) {

        String[] liczby = {"pierwszy", "drugi", "trzeci", "czwarty"};

        // pętla for
        for (int i = 0; i < liczby.length; i++) {
            System.out.print(liczby[i] + ", ");
        }

        System.out.println();

        //  pętla for-each
        for (String liczba : liczby) {
            System.out.print(liczba + ", ");
        }
    }
}
