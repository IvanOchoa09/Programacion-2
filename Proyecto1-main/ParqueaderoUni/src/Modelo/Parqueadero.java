
package Modelo;

import java.util.Scanner;


public class Parqueadero {
    private String BloqueParqueadero;
    private int HorasUso;
    public Parqueadero(){
    
    }
    public Parqueadero(String BloqueParqueadero, int HorasUso){
        this.BloqueParqueadero = BloqueParqueadero;
        this.HorasUso = HorasUso;
    }

    public String getBloqueParqueadero() {
        return BloqueParqueadero;
    }

    public void setBloqueParqueadero(String BloqueParqueadero) {
        this.BloqueParqueadero = BloqueParqueadero;
    }

    public int getHorasUso() {
        return HorasUso;
    }

    public void setHorasUso(int HorasUso) {
        this.HorasUso = HorasUso;
    }
    
    
    
    public String NombreBloque(){
        Scanner mostrar = new Scanner(System.in);
        int Op;
        System.out.println("---- BLOQUES CON PARQUEADERO ----");
        System.out.println("1- BLOQUE I");
        System.out.println("2- BLOQUE P");
        System.out.println("3- BLOQUE H");
        System.out.println("4- BLOQUE A");
        System.out.println("---------------------------");
        System.out.print("SELECCIONE EL BLOQUE : ");
        Op = mostrar.nextInt();
        
        switch(Op){
            case 1: BloqueParqueadero = "BLOQUE I";
                break;
            case 2: BloqueParqueadero = "BLOQUE P"; 
                break;
            case 3: BloqueParqueadero = "BLOQUE H";
                break;
            case 4: BloqueParqueadero = "BLOQUE A"; 
                break;
            default: System.out.println("ERROR...NO INGRESO NINGUN BLOQUE");
                break;
        }
    return "";
    }
}
