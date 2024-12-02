package programacion_3;

public class actividad3{
    public static void main(String[] args) {
      
        double[] sueldos = {1000, 1500, 2000, 1200, 1700};

       
        String[] empleados = {"Juan", "María", "Pedro", "Ana", "Luis"};

      
        System.out.println("Tabla de sueldos con aumento (usando 'for'):");
        System.out.println("Empleado   | Sueldo");
        System.out.println("-----------|----------");
        for (int i = 0; i < sueldos.length; i++) {
            sueldos[i] *= 1.10;  // Aumentamos el sueldo en un 10%
            System.out.printf("%-10s | %.2f\n", empleados[i], sueldos[i]);
        }
       
        sueldos[0] = 1000;
        sueldos[1] = 1500;
        sueldos[2] = 2000;
        sueldos[3] = 1200;
        sueldos[4] = 1700;

        System.out.println("\nTabla de sueldos con aumento (usando 'foreach'):");
        System.out.println("Empleado   | Sueldo");
        System.out.println("-----------|----------");
        int index = 0;
        for (double sueldo : sueldos) {
            sueldos[index] *= 1.10;  // 
            System.out.printf("%-10s | %.2f\n", empleados[index], sueldos[index]);
            index++;
        }
    }
}
