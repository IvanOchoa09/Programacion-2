package Modelo;





public class Participante {
    private int A;
    private int B;
    private int C;
    private String nombre;
    private String apellido;
    private int num;
    private double llanta;
    private int resultadoLanzamiento;

    public Participante(){
    }
    public Participante(int A, int B, int C, String nombre, String apellido, int num, double llanta) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.nombre = nombre;
        this.apellido = apellido;
        this.num = num;
        this.llanta = llanta;
    }

    public Participante(int A, int B, int C, String nombre, String apellido, int num) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.nombre = nombre;
        this.apellido = apellido;
        this.num = num;
        this.resultadoLanzamiento = 0;
    }
    

    public int getA() {
        return A;
    }

    public void setA(int A) {
        this.A = A;
    }

    public int getB() {
        return B;
    }

    public void setB(int B) {
        this.B = B;
    }

    public int getC() {
        return C;
    }

    public void setC(int C) {
        this.C = C;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getLlanta() {
        return llanta;
    }

    public void setLlanta(double llanta) {
        this.llanta = llanta;
    }
    
    public int Calcular(){
        
        double resultadoLanzamiento = this.llanta*this.num;
        return (int) resultadoLanzamiento;
    }

    @Override
    public String toString() {
        return "Fiestas(" + "A=" + A + 
                ", B=" + B + 
                ", C=" + C + 
                ", nombre=" + nombre + 
                ", apellido=" + apellido + 
                ", num=" + num + 
                ", llanta=" + llanta + ')';
    }
    
    
  
}

