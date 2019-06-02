/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Nicolas Castillo
 */

public class EX27 
{
    public static void Pedirdatos()
    {
        System.out.println(ConvertirFaC(100));
        try
        {
            double F = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el grado Fahrenheit a convertir:\nIngresa 999 para salir."));
            if(F == 999) 
            {
                System.out.println("Saliste");
            }
            else 
            {
                System.out.println("El valor de "+F+"°F en °C es: " + ConvertirFaC(F));
                Pedirdatos();
            }
        }
        catch(NumberFormatException e)
        {
            
        }
    }
    public static double ConvertirFaC(double F)
    {
        return (5*(F-32))/9;
    }
}
