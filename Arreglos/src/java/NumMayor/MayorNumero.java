package NumMayor;

public class MayorNumero {
    static void main() {
        //Dado un arreglo de números, encuentra el valor más grande dentro
        // del arreglo sin usar funciones predefinidas.

        //Ejemplo:
        //Arreglo: [3, 8, 2, 15, 7]
        //Resultado esperado: 15

            int [] arreglo = {6, 0, 16, 29, 90, 12, 54, 34, 12};
        int valorGrande = arreglo[0];

        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo [i] > valorGrande) {
                valorGrande = arreglo [i];
            }
        }

        System.out.println("Arreglo : ");
        for ( int num : arreglo) {
            System.out.println(num + " ");
        }

        System.out.println("\n\nEl valor más grande del arreglo es: " + valorGrande);

    }
}
