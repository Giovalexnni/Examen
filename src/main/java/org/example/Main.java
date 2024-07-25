package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner leerTeclado =new Scanner(System.in);

        String nombreEmpleado;
        int heladoSimple;
        int heladoDoble;
        int heladoEspecial;

        int precioSimple=3000;
        int precioDoble=6000;
        int precioEspecial=10000;


        System.out.print("Digite el nombre del vendedor: ");
        nombreEmpleado=leerTeclado.nextLine();
        System.out.print("Digite el numero de ventas de helado simple: ");
        heladoSimple=leerTeclado.nextInt();
        System.out.print("Digite el numero de ventas de helado doble: ");
        heladoDoble=leerTeclado.nextInt();
        System.out.print("Digite el numero de ventas de helado especial: ");
        heladoEspecial=leerTeclado.nextInt();



        int totalVentaSimple=heladoSimple*precioSimple;
        int totalVentasDoble=heladoDoble*precioDoble;
        int totalVentasEspecial=heladoEspecial*precioEspecial;
        int totalVentasDia=heladoDoble+heladoSimple+heladoEspecial;
int totalVentasDiarias=totalVentasDoble+totalVentaSimple+totalVentasEspecial;

        System.out.println("Cantidad helados simples por dia: " +heladoSimple+ " Valor total: " +totalVentaSimple);
        System.out.println("Cantidad helados doble por dia: " + heladoSimple+ " Valor total: " +totalVentaSimple);
        System.out.println("cantidad helados especial por dia:" + heladoEspecial+ " valor total: " +totalVentasEspecial);
        System.out.println("valor total ventas: " +totalVentasDia+ " Valor total helados: "+ totalVentasDiarias);







    }
}