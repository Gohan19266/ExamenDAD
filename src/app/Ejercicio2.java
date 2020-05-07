package app;

public class Ejercicio2 extends Thread{
    int sumador = 0;
    int[] lista = { 2, 7, 5, 4, 9, 3, 6, 8, 1, 10};
    
    public Ejercicio2(){
        System.out.println("Cubos");
    }
   
    @Override
    public void run() {
        for (int i : lista) {
            try {
                Thread.sleep(2000);
            }catch (Exception e){
                System.out.println(e);
            }
            this.sumador = this.sumador+(int)Math.pow(i, 3);
            System.out.println("Suma "+this.sumador);
        }
        System.out.println("Total: "+this.sumador);
    }

    public static void main(String[] args) {
        Thread adicion = new Ejercicio2();
        adicion.start();
    }
}