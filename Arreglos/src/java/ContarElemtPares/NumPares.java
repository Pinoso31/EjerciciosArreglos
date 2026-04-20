package ContarElemtPares;

public class NumPares {
    static void main(String[] args) {
        int [] numeros = {5, 12, 7, 25, 45, 8, 19, 33, 10, 22};
         int suma = 0;

         for ( int i = 0; i < numeros.length; i++) {
             suma += numeros [i];
         }

        System.out.println("Arreglo de numero :");
        for ( int num : numeros) {
            System.out.println(num + " ");
        }

        System.out.println("\n\n La suma total de todos los elementos es : " + suma);
    }
}
