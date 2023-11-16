package prueba_tecnica;

import java.util.Scanner;

/**
 *
 * @author Alejandro-pc
 */
public class Prueba_tecnica {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        String nombre;
        double valor, valorDescuento, total_pagar;
        double descuento = 0.0;
        
        System.out.print("Por favor digite su nombre: ");
        nombre=sc.nextLine();
        System.out.print("Digite el valor de la compra: $");
        valor=sc.nextFloat();
        
        if (valor >= 200000){
            descuento = 0.15;
        }
        else if (valor >= 50000){
            descuento = 0.2;
        }
        else if(valor >= 20000){
            descuento = 0.015;
        }
        
        valorDescuento = valor * descuento;
        total_pagar = valor - valorDescuento;
        
        System.out.println("\n-------- Factura --------");
        System.out.println("Cliente: " + nombre);
        System.out.println("Monto de la compra: $" + valor);
        System.out.println("Descuento aplicado: $" + valorDescuento);
        System.out.println("Total a pagar: $" + total_pagar);
        System.out.println("\nGracias por su compra, " + nombre);
    }
}
