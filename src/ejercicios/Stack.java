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
public interface Stack<T> {
    
    public int size();
    public boolean isEmpty();
    public void push(T key);
    public T pop();
    public T top();    
}
