import java.util.Scanner;

class Esercizio {

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n, i, contDuplicati, j;
        System.out.println("Inserisci la grandezza del vettore: ");
        n = Integer.parseInt(in.nextLine());
        int[] numeri = new int[n];
        i = 0;
        while (i<n) {
            System.out.println("Inserisci valore n°" + i + " del vettore: ");
            numeri[i] = Integer.parseInt(in.nextLine());
            i++;
        }
        i = 0;
        while (i<n) {
            contDuplicati = 0;
            j += i;
            while (j<n) {
                if (numeri[i]==numeri[j] & i!=j) {
                    contDuplicati+=2;
                    System.out.println("Il valore " + numeri[i] + " occorre nelle posizioni " + i + ", " + j + ". E' stato inserito " + contDuplicati + " volte.");
                }
                j++;
            }
            i++;
        }
    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md