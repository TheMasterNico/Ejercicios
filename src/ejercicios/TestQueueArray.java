/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class TestQueueArray {
    
    public static void main(String args[])
    {
        int item;
        char selection;
        QueueArray queue;
        queue = new QueueArray();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println();
        
        System.out.print("Por favor ingrese el caracter E a la "
                + "cola (Enqueue) y el caractere para decolar D (Dequeue), "
                + "o S para parar:");
        selection = scanner.next().charAt(0);
        while(selection != 'S' && selection != 's')
        {
            if(selection == 'E' || selection == 'e')
            {
                System.out.print("Por favor ingrese un integer para encolarlo"
                        + "(enqueue): ");
                item = scanner.nextInt();
                queue.enqueue(item);
            }
            else if(selection == 'D' || selection == 'd')
            {
                item = queue.dequeue();
                if(item != -1)
                    System.out.println("El item decolado (dequeue) "
                            + "es: " + item);
                
            }
            else
                System.out.println("La seleccion ingresada " + selection +
                        " no es E, D o S, por favor, intente nuevamente");
            System.out.println();
            System.out.print("Por favor ingrese E para encolar (enqueue)"
                    + ", o D para decolar (Dequeue), o S para parar: ");
            selection = scanner.next().charAt(0);
            
        }
        
        System.out.println("\nFin del Programa");
    }
    
}
