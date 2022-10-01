
package Vista;

import Modelo.*;

public class RegistroParqueadero {


    public static void main(String[] args) {
        Persona persona = new Persona();
        Vehiculo vehiculo = new Vehiculo();
        Parqueadero parqueadero = new Parqueadero();
        Cargo cargo = new Cargo();
        Tarifa tarifa = new Tarifa();
        
        System.out.println("");
        System.out.println(persona.DatosPersona());
        System.out.println(vehiculo.tipoVehiculo());
        System.out.println(parqueadero.NombreBloque());
        System.out.println(cargo.tipoCargo());
        System.out.println(tarifa.PagoTarifa());
        System.out.println("--------------------------------------------");
        System.out.println("---- REGISTRO DE ENTRADA AL PARQUEADERO ----");
        System.out.println("NOMBRE                 :  " + persona.getNombre());
        System.out.println("APELIDO                : " + persona.getApellido());
        System.out.println("TIPO DE VEHICULO       : " + vehiculo.getTipoVehiculo());
        System.out.println("NUMERO DE PLACA        : "+ vehiculo.getnPlaca());
        System.out.println("BLOQUE DEL PARQUEADERO : " + parqueadero.getBloqueParqueadero());
        System.out.println("CARGO                  : " + cargo.getTipoCargo());
        System.out.println("TARIFA                 : " + tarifa.getTotal());
        
        
        
        
    }
    
}
