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
public class Ejercicios {

    public static void main(String[] args) {
        //System.out.println("Factorial 5: " +  EX25.factorial(5));
        //System.out.println("Ackerman : " +  EX25.Ackermann(3, 4));
        //EX26.Leer_Y_Ordenar();
        //EX27.Pedirdatos();
        //EX28.Sentencia();
        //MySQl.Conectar();
        /*ListaSimple L = new ListaSimple(null, null);
        L.PushFront(1);
        L.PushFront(2);
        L.PushFront(3);
        L.PopBack();
        L.DisplayList();
        L.PushFront(4);
        L.PushFront(5);
        L.DisplayList();*/
        
        ListaDoble<Integer> dlList = new ListaDoble();
        
        System.out.println("Adicionando con PushFront... (x 6)");
        dlList.PushFront(10);
        dlList.PushFront(11);
        dlList.PushFront(12);
        dlList.PushFront(13);
        dlList.PushFront(14);
        dlList.PushFront(15);
        
        System.out.println("\n\n Adicionando con PushBack... (x 5)");
        dlList.PushBack(1);
        dlList.PushBack(2);
        dlList.PushBack(3);
        dlList.PushBack(4); 
        dlList.PushBack(5);
        
        System.out.println("\n\nImprimiendo");
        
        dlList.DisplayList();
        
        System.out.println("\n\nBuscando un valor en la lista");
        
        DobleNodo dn = dlList.FindByKey(13);
        
        if(dn != null)
        {
            System.out.println("Nodo Encontrado!: " +dn.key);
            
            System.out.println("Adicionando nuevo Valor antes del valor "
                    + "encontrado: " + dn.key);
            dlList.AddBefore(dn, 88);
            
            System.out.println("\n\nListando de nuevo la lista...");
            dlList.DisplayList();
           
            
        }
        else
            System.out.println("No Encontrado");
        
        
        
    }
    
}
