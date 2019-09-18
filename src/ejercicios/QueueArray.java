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
public class QueueArray {
    
    private final int N = 4;
    private int front, rear, count, qarray[];
    
    public QueueArray()
    {
        front = rear = count = 0;
        qarray = new int[N];
    }
    
    public int dequeue()
    {
        int item = -1;
        if(empty())
            System.out.println("Cola está vacia: " + "el item no desencolado");
        else
        {
            item = qarray[front];
            front = (front +1) % N;
            count --;
        }
        return item;
    }
    
    public void enqueue(int item)
    {
        if(full())
            System.out.println("La cola esta llena: el item no fue encolado");
        else
        {
            qarray[rear] = item;
            rear = (rear +1) % N;
            count++;
        }
    }
    
    public boolean empty()
    {
        return count <= 0;
    }
    
    public boolean full()
    {
        return count >= N;
    }
    
    
}
