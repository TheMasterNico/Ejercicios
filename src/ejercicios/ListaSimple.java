/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author Estudiante
 */
public class ListaSimple {
    Nodo head = null;
    Nodo tail = null;

    public ListaSimple(Nodo head, Nodo tail) {
        this.head = head;
        this.tail = tail;
    }
    
    public void PushFront(int dato)
    {
        Nodo N = new Nodo(dato, this.head);
        this.head = N;
        
        if(this.tail == null)
        {
            this.tail = this.head;
        }
    }
    
    public void PopBack()
    {
        if(this.head == null) System.out.println("Lista Vacia");
        else
        {
            if(this.head == this.tail)
            {
                this.head = this.tail = null;
            }
            else
            {
                Nodo p = this.head;
                while(p.getNext().getNext() != null)
                {
                    p = p.getNext();
                }
                p.setNext(null);
                this.tail = p;
            }
        }
    }
    
    public void DisplayList()
    {
        if(this.head == null) 
        {
            System.out.println("Lista Vacia...");
        }
        
        Nodo p = this.head;
        
        while(p != null)
        {
            System.out.println(p.getDato());
            p = p.getNext();
        }
    }
    
    
}
