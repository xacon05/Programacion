public class persona4_1main {
    public static void main(String[] args) {
    	
        Persona4_1 persona1 = new Persona4_1("Juan", 25, 175.0);
        System.out.println(persona1);
        persona1.cumplirAños();
        persona1.crecer(2.0);
        System.out.println(persona1);
    }
}
