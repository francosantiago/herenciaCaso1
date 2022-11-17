package ejecutable;

import javax.swing.JOptionPane;

import modelo.Sumar;

public class test 
{
    public static void main(String[] args) 
    {
        //entrada de datos
        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de x: "));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de y: "));

        //Creación de un objeto suma
        Sumar miSuma = new Sumar(x,y);
        miSuma.sumar();
        JOptionPane.showMessageDialog(null, "La suma de " + x + " y " + y + " es " + miSuma.mostrarResultado());

        System.exit(0);
    }
}
