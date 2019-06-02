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

public class EX26 
{
    static int Num[] = new int[3];
    public static void Leer_Y_Ordenar()
    {
        for(int i = 0; i < 3;)
        {
            try
            {
                Num[i] =  Integer.decode(JOptionPane.showInputDialog("Escriber el entero #"+(i+1)+": "));
                i++;
            }
            catch(NumberFormatException e)
            {
                System.out.println("El valor ingresado debe ser un numero");
            }
        }
        System.out.println(Num[0]+"-"+Num[1]+"-"+Num[2]);
        Ordenar(Num);
    }
    
    public static void Ordenar(int Numero[])
    {
        int aux;
        for(int i = 0; i < Numero.length; i++)
        {
            for(int j = i+1; j < Numero.length; j++)
            {
                if(Numero[i] > Numero[j])
                {
                    aux = Numero[j];
                    Numero[j] = Numero[i];
                    Numero[i] = aux;
                }
            }
        }        
        for(int i = 0; i < Numero.length; i++) 
        {
            System.out.println("\tNumero["+i+"] = " + Numero[i]);
        }
    }
}
