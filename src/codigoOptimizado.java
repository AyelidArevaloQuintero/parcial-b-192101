import java.util.Scanner;

public class codigoOptimizado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese cantidad de productos: ");
        int productos = input.nextInt();

        double porcentajeDescuento = 0.10;
        double porcentajeImpuesto = 0.19;
        double suma = 0;

        for(int i = 0; i<=productos; i++){
            System.out.println("Escriba el nombre del producto:");
            String nomProducto = input.nextLine();
            input.nextLine();
            System.out.println("Ingrese el precio:");
            double precio = input.nextDouble();
            System.out.println("Cuantos productos vas a llevar: ");
            double cantidad = input.nextDouble();

            cantidad = 0;
            precio = cantidad * precio;
            
            double impuesto = precio * porcentajeImpuesto;

            if (precio > 10000) {
                double descuento = (precio *  porcentajeDescuento);
                double total = precio + impuesto - descuento;
                System.out.println("Producto: " + nomProducto + ", Precio final: " + total);
                suma += total;
            } else {
                System.out.println("No tiene descuento: ");
                double total = precio + impuesto ;
                System.out.println("Producto: " + nomProducto + ", Precio final: " + total);
                suma += total;
            }
        }
        System.out.println("El total de la compra es: " + suma);
        input.close();
    }   
}

