package programacion_3;

public class actividad3 {
    public static void main(String[] args) {
        double[] sueldo = {1800, 1200, 2000, 1200, 900};

        for (int i = 0; i < sueldo.length; i++) {
            double aumento = sueldo[i] * 0.1;
            sueldo[i] = sueldo[i] + aumento;
            System.out.println(sueldo[i]);
        }
    }
}
