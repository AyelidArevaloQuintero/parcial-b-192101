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
            input.nextLine();

            System.out.println("Escriba el nombre del producto:");
            String nomProducto = input.nextLine();
            
            System.out.println("Ingrese el precio:");
            double precio = input.nextDouble();

            System.out.println("Cuantos productos vas a llevar: ");
            double cantidad = input.nextDouble();

            
            precio *= cantidad;
            double impuesto = precio * porcentajeImpuesto;

            double total = precio + impuesto;

            if (precio > 10000) {
                double descuento = (precio *  porcentajeDescuento);
                total -= descuento;
                System.out.println("Producto: " + nomProducto + ", Precio final: " + total);
            } else {
                System.out.println("No tiene descuento: ");
                System.out.println("Producto: " + nomProducto + ", Precio final: " + total);
            }
            suma += total;
        }
        System.out.println("El total de la compra es: " + suma);
        input.close();
    }   
}

