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
public class DobleNodo<type> {
    type key;
    DobleNodo<type> next;
    DobleNodo<type> prev;

    public DobleNodo(type key, DobleNodo<type> next, DobleNodo<type> prev) {
        this.key = key;
        this.next = next;
        this.prev = prev;
    }

    public DobleNodo(type key) {
        this.key = key;
        this.next = null;
        this.prev = null;
    }

    public DobleNodo() {
    }   
}
