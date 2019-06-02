/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios;

/**
 *
 * @author Nicolas Castillo
 */

public class EX28 
{
    public static void Sentencia()
    {
        for(int i = 0; i < 4; i++)
        {
            switch(i) // Sin los break, cuando encuentra un case, muestra el mensaje de ese case y los inferiores a él
            {
                case 0:
                    System.out.println("Caso #0");
                    break;
                case 1:
                    System.out.println("Caso #1");
                    break;
                case 2:
                    System.out.println("Caso #2");
                    break;
                default:
                    System.out.println("Default");
                   break;                    
            }
        }
    }
}
