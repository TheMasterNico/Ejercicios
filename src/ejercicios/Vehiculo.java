/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios;

/**
 *
 * @author Nicolas Castillo
 */

public class Vehiculo 
{   
    int PasajerosMaximos;
    int PasajerosActuales;
    int Ruedas;
    int fechaMatricula;
    int MedioDesplaza; // 0: Terrestre, 1: Acuatico, 2: Aereo
    int Color;
    int VelocidadMax;

    public Vehiculo(int PasajerosMaximos, int Ruedas, int fechaMatricula, int MedioDesplaza, int Color) {
        this.PasajerosMaximos = PasajerosMaximos;
        this.Ruedas = Ruedas;
        this.fechaMatricula = fechaMatricula;
        this.MedioDesplaza = MedioDesplaza;
        this.Color = Color;
    }

    
    
    public int getVelocidadMax() {
        return VelocidadMax;
    }

    public void setVelocidadMax(int VelocidadMax) {
        this.VelocidadMax = VelocidadMax;
    }             

    public int getPasajerosMaximos() {
        return PasajerosMaximos;
    }

    public void setPasajerosMaximos(int PasajerosMaximos) {
        this.PasajerosMaximos = PasajerosMaximos;
    }

    public int getPasajerosActuales() {
        return PasajerosActuales;
    }

    public void setPasajerosActuales(int PasajerosActuales) {
        this.PasajerosActuales = PasajerosActuales;
    }

    public int getRuedas() {
        return Ruedas;
    }

    public void setRuedas(int Ruedas) {
        this.Ruedas = Ruedas;
    }

    public int getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(int fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    public int getMedioDesplaza() {
        return MedioDesplaza;
    }

    public void setMedioDesplaza(int MedioDesplaza) {
        this.MedioDesplaza = MedioDesplaza;
    }

    public int getColor() {
        return Color;
    }

    public void setColor(int Color) {
        this.Color = Color;
    }
    
    
}
