
package Modelo;

import java.util.Scanner;


public class Vehiculo {
    private String TipoVehiculo;
    private String nPlaca;
    
    public Vehiculo(){
    
    }
    public Vehiculo(String TipoVehiculo, String nPlaca){
        this.TipoVehiculo = TipoVehiculo;
        this.nPlaca = nPlaca;
    }

    public String getTipoVehiculo() {
        return TipoVehiculo;
    }

    public void setTipoVehiculo(String TipoVehiculo) {
        this.TipoVehiculo = TipoVehiculo;
    }

    public String getnPlaca() {
        return nPlaca;
    }

    public void setnPlaca(String nPlaca) {
        this.nPlaca = nPlaca;
    }
    
    public String tipoVehiculo(){
        Scanner mostrar = new Scanner(System.in);
        int Op;
        System.out.print("INGRESE LA PLACA : ");
        nPlaca = mostrar.nextLine();
        System.out.println("---- TIPOS DE VEHICULOS ----");
        System.out.println("1- BICICLETA");
        System.out.println("2- MOTO");
        System.out.println("3- CARRO");
        System.out.println("4- CAMIONETA");
        System.out.println("---------------------------");
        System.out.print("SELECCIONE EL TIPO DE VEHICULO : ");
        Op = mostrar.nextInt();
        
        switch(Op){
            case 1: TipoVehiculo = "BICICLETA";
                break;
            case 2: TipoVehiculo = "MOTO"; 
                break;
            case 3: TipoVehiculo = "CARRO";
                break;
            case 4: TipoVehiculo = "CAMIONETA"; 
                break;
            default: System.out.println("ERROR...NO INGRESO NINGUN VEHICULO");
                break;
        }      
                 
    return "";
    }
}
