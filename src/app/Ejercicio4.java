package app;
import java.util.Scanner;

public class Ejercicio4 extends Thread{
    Scanner tec=new Scanner(System.in);
    String leo;
    public Ejercicio4(int prioridad,String leo){
        this.leo=leo;
        setPriority(prioridad);
        System.out.println("*******Cometencia de animales leopardos*******");
    }
    @Override 
    public void run(){
        for(int i=1;i<=30;i++){
            System.out.print(i+"mt ");
            yield(); 
            }
            System.out.println("\n Llego a la meta " + leo);
    }
    static Ejercicio4 Leo1;
    static Ejercicio4 Leo2;
    static Ejercicio4 Leo3;
    static Ejercicio4 Leo4;
    public static void main(String[]args) throws Exception{
        Leo1 = new Ejercicio4(8,"leo1");
        Leo2 = new Ejercicio4(7,"Leo2");
        Leo3 = new Ejercicio4(5,"Leo3");
        Leo4 = new Ejercicio4(5,"Leo4");
        Leo1.start();
        Leo2.start();
        Leo3.start();
        Leo4.start();
        Leo1.join();
        Leo2.join();
        Leo3.join();
        Leo4.join();
    }
}