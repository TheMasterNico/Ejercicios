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
public class LinkedStack<T> implements Stack<T> {

    private Nodo<T> top;
    private int size;
    
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public void push(T key) {
        Nodo<T> nodo = new Nodo<>(key, this.top);
        
        this.top = nodo;//sube el top al nuevo
        size++;
    }

    @Override
    public T pop() {
        T temp;
        
        if(isEmpty())
        {
            System.out.println("Pila vacia...");
            return null;
        }
        
        temp = top();
        top = top.next;
        size--;
        
        return temp;
    }

    @Override
    public T top() {
        if(isEmpty())
        {
            System.out.println("Pila Vacia");
            return null;
        }
        return (T) this.top; //:::::::::::::
    }
    
}
