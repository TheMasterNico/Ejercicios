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
public class Nodo<type> {
    private type dato;
    private Nodo<type> next;
    
    public Nodo(type dato)
    {
        this.dato = dato;
        this.next = null;
    }

    public Nodo(type dato, Nodo<type> next) {
        this.dato = dato;
        this.next = next;
    }

    public void setDato(type dato) {
        this.dato = dato;
    }

    public void setNext(Nodo<type> next) {
        this.next = next;
    }

    public type getDato() {
        return dato;
    }

    public Nodo<type> getNext() {
        return next;
    }

    
}
