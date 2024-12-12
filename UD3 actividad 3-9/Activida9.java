package programacion_3;

import java.util.Arrays;

public class Activida9 {
    public static void main(String[] args) {
        char[][] m = {{'a', 'b', 'c'},{'D', 'e', 'F'},{'g', 'H', 'I'}};
        System.out.println(Arrays.deepToString(m));
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println(m[i][j]);
            }
        }
    }
}
