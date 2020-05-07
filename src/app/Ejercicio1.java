package app;

public class Ejercicio1 extends Thread{

    String numero;
    String[] estacion={"impar","par"};
    public Ejercicio1(String numero){
      this.numero=numero;
     
    }
    public void run(){
        switch(numero){
            case "impar":
                for(int num =10; num<=1;num--){
                    System.out.print(" " +num+" ");
                        try {
                            sleep (1500);
                        }catch(InterruptedException e){
                        
                        }
                        yield(); 
                    } 
                break;
            case "par":
            for(int num =1; num<=10;num++){
                System.out.print(" " +num+" ");
                    try {
                        sleep (1500);
                    }catch(InterruptedException e){
                    
                    }
                    yield(); 
                }
                break;
            }    
            
      }
        
        
        
    static Ejercicio1 par;
    static Ejercicio1 impar;
    public static void main(String []args) throws Exception{
        par=new Ejercicio1("par");
        par.start();
        impar=new Ejercicio1("impar");
        impar.start();
        par.join();
        impar.join();

    }
}