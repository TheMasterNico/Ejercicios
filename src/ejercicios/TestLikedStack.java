/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author Estudiante
 */
public class TestLikedStack {
    public static void main(String[] args)
    {
        LinkedStack<Disco> linkedStack = new LinkedStack<Disco>();
        int code = 1; // identificador consecutivo del disco
        
        linkedStack.push(new Disco("Primero"));
        linkedStack.push(new Disco("Segundo"));
        linkedStack.push(new Disco("Tercero"));
        linkedStack.push(new Disco("Cuarto"));
        linkedStack.push(new Disco("Quinto"));
        
        System.out.println("Tamaño actual: " + linkedStack.size());
        
        Disco p = linkedStack.top();
        
        if(p!= null)
            System.out.println("Top Actual: " + p.toString());
        
    }
    
}
