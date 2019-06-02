/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios;


import java.sql.*;
/**
 *
 * @author Nicolas Castillo
 */

public class MySQl 
{
    public static void Conectar()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conexionMySQL = DriverManager.getConnection("jdbc:mysql://localhost:3360/inventario", "root", "6582039");
            

            //boolean valid = conexionMySQL.isValid(50000);
            //Log.e("Valid", valid ? "TEST OK" : "TEST FAIL");


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
