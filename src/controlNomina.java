import java.util.Scanner;

public class controlNomina {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el numero de empleados: ");
        int numEmpleados = input.nextInt();

        int acumuladoSueldos = 0;
        int sueldoNormal = 0;
        int sueldoPro = 0;

        for(int i = 1; i <= numEmpleados; i++){
            System.out.println("Ingrese su sueldo: ");
            int sueldo = input.nextInt();
            acumuladoSueldos += sueldo; 

            if(sueldo >= 100 && sueldo <= 300){
                sueldoNormal++;
            }else if (sueldo > 300){
                sueldoPro++;
            }
        }
        System.out.println("La cantidad de empleados que tienen un sueldo entre 100 y 300 son: " + sueldoNormal);
        System.out.println("La cantidad de empleados que tienen un sueldo mayor a 300 son: " + sueldoPro);
        System.out.println("El costo total de sueldos de la empresa es: " + acumuladoSueldos);

        input.close();
    }   
}
