
package Modelo;

import java.util.Scanner;

public class Tarifa {
    private double Valor;
    private double Descuento;
    private double Total;
    private Parqueadero HorasUso;
    public Tarifa(){
    
    }
    public Tarifa(double Valor, double Descuento, double Total, Parqueadero HorasUso){
        this.Valor = Valor;
        this.Descuento = Descuento;
        this.HorasUso = HorasUso;
        this.Total = Total;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public Parqueadero getHorasUso() {
        return HorasUso;
    }

    public void setHorasUso(Parqueadero HorasUso) {
        this.HorasUso = HorasUso;
    }

    public double getDescuento() {
        return Descuento;
    }

    public void setDescuento(double Descuento) {
        this.Descuento = Descuento;
    }
    
    
    
    public String PagoTarifa(){
        Scanner leer = new Scanner(System.in);
        System.out.print("INGRESE EL VALOR DE LA TARIFA : ");
        Valor = leer.nextDouble();
        Descuento = Valor*0.2;
        Total = Valor - Descuento;
        System.out.println("EL TOTA A PAGAR ES : " + Total);
    return "";
    }
}
