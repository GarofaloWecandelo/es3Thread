package es3Thread;

import java.util.InputMismatchException;
import java.util.Scanner;

public class es3Thread {
    public static void main(String[] args) throws InterruptedException {
            Scanner input = new Scanner(System.in);
            System.out.println("Inserisci n:");
            int n = input.nextInt();
            System.out.println("Inserisci k: ");
            int k = input.nextInt();
            int differenza = n-k;
            
            Fattoriale F1 = new Fattoriale("N!", n);
            Fattoriale F2 = new Fattoriale("K!", k);
            Fattoriale F3 = new Fattoriale("(N-K)!", differenza);
            
            
            F1.start();
            F2.start();
            F3.start();
            
            
            F1.join();
            F2.join();
            F3.join();
            
            int risultato_finale = F1.getVal() / (F2.getVal() * F3.getVal());
            System.out.println("Risultato finale: " + risultato_finale);

    }   
}