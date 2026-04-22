package SumElementos;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;

public class SumarElement {
    static void main() {
        int [] numeros = new int [6];
        int numero;
        int suma = 0;


        for ( int i = 0; i < 6; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese los numeros : " + (i + 1) + ": "));
            numeros [i] = numero;
            suma += numeros[1];
        }

        StringBuilder mensaje = new StringBuilder();

        for ( int n : numeros ) {
            mensaje.append(n).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensaje.toString(), "Numeros : ", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "La suma de todos los numeros es : " + suma);
    }


}
