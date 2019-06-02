/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author Makot
 */
public class EX25 {
    
    public static int Ackermann(int m, int n)
    {
        if(m == 0) return n+1;
        else if(m > 0 && n == 0) return Ackermann(m-1, 1);
        else if(m > 0 && n > 0) return Ackermann(m-1, Ackermann(m, n-1));
        return 0;
    }
    
    public static long factorial(int n)
    {
        if(n == 0) return 1;
        return (factorial(n-1))*n;
    }
    
}
