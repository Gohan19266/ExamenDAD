package app;

import java.util.Scanner;

public class Ejercicio3 extends Thread{
    Scanner tec=new Scanner(System.in);
    int iFactorial = 1;
    int numero;
    public Ejercicio3(){
        this.numero=numero;
        System.out.println("Ingrese numero(Factorial) :");
        numero=tec.nextInt();
    }
   
    @Override
    public void run() {
        for (int x=2;x<=numero;x++){
        iFactorial = iFactorial * x;
        System.out.println("Total: "+iFactorial);
        }
        
    }

    public static void main(String[] args) {
        Thread adicion = new Ejercicio3();
        adicion.start();
    }
}