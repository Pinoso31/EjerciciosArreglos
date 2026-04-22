package EliminDuplicados;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicados {
    public static void main(String[] args) {
        //Dado un arreglo con valores repetidos,
        // genera un nuevo arreglo que contenga solo elementos únicos.

        int [] arr = {5, 3, 5, 7, 3, 9, 1, 7, 5, 2, 9};

        System.out.println("Arreglo original : " + Arrays.toString(arr));

        int [] ArrayUnico = ConseguirElementosUnicos(arr);

        System.out.println("Arreglo con elementos unicos: " + Arrays.toString(ArrayUnico));
    }

    public static int[] ConseguirElementosUnicos(int[] arr) {
        if ( arr == null || arr.length == 0 ) {
            return new int[0];
        }

        Set < Integer> setUnico = new LinkedHashSet<>();

        for ( int num : arr ) {
            setUnico.add(num);
        }

        int [] ArrayUnico = new int[setUnico.size()];
        int index = 0;
        for ( int num : setUnico) {
            ArrayUnico[index++] = num;
        }

        return ArrayUnico;
    }
}
