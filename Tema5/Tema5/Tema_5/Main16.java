package Tema_5;

public class Main16 {

    public static void main(String[] args) {
        Integer a = 10;
        Integer b = a;
        System.out.println("Antes de modificar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        // Modificar 'a'
        a = a + 5;
        
        System.out.println("Después de modificar a:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
