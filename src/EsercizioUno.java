import java.util.Scanner;

public class EsercizioUno {

    public static int moltiplica (int num1, int num2){
        return num1 * num2;

    }

    public static String concatena (String stringa, int intero){
        return stringa + intero;
    }

    public static String[] inserisciInArray (String [] array,String stringa){
            String[] arrayNuovo = new String[6];
            arrayNuovo[0] = array[0];
            arrayNuovo[1] = array[1];
            arrayNuovo[2] = stringa;
            arrayNuovo[3] = array[2];
            arrayNuovo[4] = array[3];
            arrayNuovo[5] = array[4];
            return arrayNuovo;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci il primo numero");
        int num1 = scanner.nextInt();
        System.out.println("inserisci il secondo numero");
        int num2 = scanner.nextInt();
        int prodotto = moltiplica(num1,num2);
        System.out.println("il prodotto è " + prodotto);

        scanner.nextLine(); // pulisce lo scanner che ha ancora un newline non consumato

        System.out.println("inserisci una stringa");
        String stringa = scanner.nextLine();
        System.out.println("inserisci un numero");
        int num3 = scanner.nextInt();
        String result = concatena(stringa,num3);
        System.out.println(result);

        scanner.nextLine();
        String[] arrayIniziale = {"A", "B", "C", "D", "E"};
        String[] arrayFinale = inserisciInArray(arrayIniziale, "X");
        String output = "";
        System.out.println("array:");
        for (int i = 0; i < arrayFinale.length; i++) {
            output = output + arrayFinale[i] + " ";
        }
        System.out.println(output);

    }

}