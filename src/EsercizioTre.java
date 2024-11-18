import java.util.Scanner;

public class EsercizioTre {

    public static double perimetroRettangolo (double lato1,double lato2){
        double perimetro = (lato1 * 2) + (lato2 * 2);
        return perimetro;
    }

    public static int pariDispari (int numero){
        if(numero % 2 == 0){
            return 0;
        }
        else return 1;
    }

    public static double areaTriangolo (double lato1 , double lato2, double lato3 ){
    double semiperimetro = (lato1 + lato2 + lato3);
    return Math.sqrt(semiperimetro * (semiperimetro - lato1) * (semiperimetro - lato2)* (semiperimetro - lato3));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci il primo lato del rettangolo");
        double latoRett = scanner.nextDouble();
        System.out.println("inserisci il secondo lato del rettangolo");
        double lato2Rett = scanner.nextDouble();

        System.out.println("il perimetro del rettangolo è " + perimetroRettangolo(latoRett,lato2Rett));

        System.out.println("inserisci il numero");
        int numero = scanner.nextInt();
        if(pariDispari(numero) == 0){
            System.out.println("il numero è pari");
        }
        else System.out.println("il numero è dispari");

        System.out.println("inserisci il primo lato del triangolo");
        double latoTriangolo = scanner.nextDouble();
        System.out.println("inserisci il secondo lato del triangolo");
        double lato2Triangolo = scanner.nextDouble();
        System.out.println("inserisci il terzo lato del triangolo");
        double lato3Triangolo = scanner.nextDouble();

        System.out.println("l'area è " + areaTriangolo(latoTriangolo,lato2Triangolo,lato3Triangolo));
    }
}
