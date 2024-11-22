
package programacion.ut2;
public class ejercicio52 {
    public static boolean esPrimo (int n){
        if(n<=1){ 
            return false;  
                    
        }
        for(int i = 2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
        public static void main(String[]args){
            int num= 10;
            if(esPrimo(num)){
                System.out.println(num+" es primo");
                
            }else{
                System.out.println(num+" no es primo.");
            }
        }
       
    }

