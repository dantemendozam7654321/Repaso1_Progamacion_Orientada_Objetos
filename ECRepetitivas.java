package ECRepetitivas;

public class ECRepetitivas {
    
    public void sumaNwhile(int numero){
        
        int suma=0;
        int i=0;
       
        while (i<=numero){
            suma= suma+i;
            i++;
        }
        System.out.println("la suma es: "+suma);
    }
    public static void main(String[] args) {
        ECRepetitivas o=new ECRepetitivas();
        o.sumaNwhile(5);
    }
    public void sumaNfor(int numero){
        int suma=0;
        for(int a=0;a<=numero; a++){
            suma=suma+a;
            
        }
        System.out.print("la suma con for es: "+suma); 
    }
    public void FactorialN (int numero){
        int factorial=1;
        int i=1;
        while ( 1<=numero) {
        factorial=factorial*i;
        i=i+i;
        }
        System.out.println("El factorial del numero es: "+factorial);
    } 
    
     
}