 
package Modelo;

import java.util.Scanner;


public class Persona {
    private String Nombre;
    private String Apellido;
    private Cargo TipoCargo;
    
    
    public Persona(){
    
    }
    public Persona(String Nombre, String Apellido, Cargo TipoCargo){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.TipoCargo = TipoCargo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Cargo getTipoCargo() {
        return TipoCargo;
    }

    public void setTipoCargo(Cargo TipoCargo) {
        this.TipoCargo = TipoCargo;
    }
    
    public String DatosPersona(){
        Scanner leer = new Scanner(System.in);
        System.out.print("DIGITE SU NOMBRE : ");
        Nombre = leer.nextLine();
        System.out.print("DIGITE SU APELLIDO : ");
        Apellido = leer.nextLine();
        
    return "";
    }
}
