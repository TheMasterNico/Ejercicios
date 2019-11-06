/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author Estudiante
 * @param <type>
 */
public class ListaDoble<type> {
    DobleNodo<type> head = null;
    DobleNodo<type> tail = null;
    
    // Creamos un nuevo nodo al inicio
    public void PushFront(type key)
    {
        DobleNodo node2 = new DobleNodo(key);
        
        if(this.head == null)
        {
            this.tail = node2;
            this.head = tail;
        }
        else
        {
            node2.next = head;
            node2.prev = null;
            this.head = node2;
            this.head.next.prev = head;
        }
        
        if(this.tail == null)
        {
            this.tail = this.head;
        }
    }
    
    //Creamos un nodo al final
    public void PushBack(type key)
    {
        DobleNodo nodo2 = new DobleNodo(key);
        nodo2.next = null;
        nodo2.prev = tail;
        
        if(this.head == null)
        {
            this.tail = nodo2;
            this.head = tail;
        }
        else
        {
            this.tail.next = nodo2;
            nodo2.prev = this.tail;
            this.tail = nodo2;
        }
    }
    
    public void PopBack()
    {
        if(this.head == null)
        {
            System.out.println("Error!. Lista vacia");
            return;
        }
        
        if(this.head == this.tail) // por si hay uno
        {
            this.tail = null;
            this.head = tail;
        }
        else
        {
            this.tail = this.tail.prev; // ::::::
            this.tail.next = null;
        }
    }
    
    public DobleNodo FindByKey(type key)
    {
        DobleNodo dn = null;
        DobleNodo p = this.head;
        
        while(p != null)
        {
            if(p.key == key)
            {
                dn = p;
                break;
            }
            p = p.next;
        }
        
        return dn;
    }
    
    public void Pop(type key)
    {
        if(this.head == null) 
            return;
        
        //Si es el preimero
        if(this.head.key == key) // Lo encontramos, es el primero
        {
            this.head = this.tail = null;
        }
        else if(head.key == key) // hay otro
        {
            head = head.next;
        }
        else
        {
            DobleNodo anterior = head;
            DobleNodo p = head.next;
            while(p!= tail && p.key != key) // recorremos el puntero por lista
            {
                anterior = anterior.next;
                p = anterior.next;
            }
            
            if(p != null)
            {
                anterior.next = p.next;
                
                if(p == tail)
                {
                    tail = anterior;
                }
            }
        }
    }
    
    public boolean isEmpty()
    {
        return head == null;
    }
    
    public void DisplayList()
    {
        if(this.head == null)
        {
            System.out.println("Lista Vacia...");
            return;
        }
        
        DobleNodo p = this.head;
        
        while(p!=null)
        {
            System.out.println(p.key);
            p = p.next;
        }
    }
    
    public void AddAfter(DobleNodo node, type key)
    {
        DobleNodo node2 = new DobleNodo(key);
        
        node2.next = node.next;
        node2.prev = node;
        node.next = node2;
        
        if(node2.next != null)
        {
            node2.next.prev = node2;
        }
        
        if(this.tail == node)
        {
            this.tail = node2;
        }
    }
    
    public void AddBefore(DobleNodo node, type key)
    {
        DobleNodo node2 = new DobleNodo(key);
        
        node2.next = node;
        node2.prev = node.prev;
        node.prev = node2;
        
        if(node2.prev != null)
        {
            node2.prev.next = node2;
        }
        
        if(this.head == node)
        {
            this.head = node2;
        }
    }
    
    
    
}
