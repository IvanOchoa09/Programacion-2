
package Vista;

import Modelo.Participante;


public class Concurso {

    public Concurso(Participante A, Participante B) {
    }

    
    public static void main(String[] args) {
        
        Participante A = new Participante ("Ivan ","Ochoa",1, new llanta(10));
        Participante B = new Participante ("Dario ","Beleño",2, new llanta(10));
        Participante C = new Participante ("Lizdary ","Rodriguez",3, new llanta(10));
        
        Concurso concurso = new Concurso (A,B);
        concurso.setC(C);
        
        System.out.println("Resultado lanzamientos");
        System.out.println("--------------------------------");
        System.out.println("Resultado A: "+concurso.getA().resultadoLanzamiento(3));
        System.out.println("Resultado A: "+concurso.getB().resultadoLanzamiento(6.001));
        System.out.println("Resultado A: "+concurso.getC().resultadoLanzamiento(4));
        System.out.println("");
        
        Participante ganador = concurso.getGanador();
        System.out.println("Ganador: " + ganador);
    }

    private void setC(Participante C) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Object getA() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Object getB() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Object getC() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Participante getGanador() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
