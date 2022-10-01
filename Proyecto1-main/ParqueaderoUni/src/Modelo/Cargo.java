
package Modelo;

import java.util.Scanner;


public class Cargo {
    private String TipoCargo;
    
    public Cargo(){
    
    }
    public Cargo(String TipoCargo){
        this.TipoCargo = TipoCargo;
        
    }

    public String getTipoCargo() {
        return TipoCargo;
    }

    public void setTipoCargo(String TipoCargo) {
        this.TipoCargo = TipoCargo;
    }

    public String tipoCargo(){
        Scanner mostrar = new Scanner(System.in);
        int Op;
        System.out.println("---- TIPOS DE CARGO ----");
        System.out.println("1- ESTUDIANTE");
        System.out.println("2- DOCENTE");
        System.out.println("3- FUNCIONARIO");
        System.out.println("4- PARTICULAR");
        System.out.println("---------------------------");
        System.out.print("SELECCIONE EL TIPO DE CARGO: ");
        Op = mostrar.nextInt();
        
        switch(Op){
            case 1: TipoCargo = "ESTUDIANTE";
                break;
            case 2: TipoCargo = "DOCENTE"; 
                break;
            case 3: TipoCargo = "FUNCIONARIO";
                break;
            case 4: TipoCargo = "PARTICULAR"; 
                break;
            default: System.out.println("ERROR...NO INGRESO NINGUN CARGO");
                break;
        }
        return "";
    }
}
