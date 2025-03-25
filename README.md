
# 🧠 **Ejercicio 2: Control de Nómina**

- ¡No todos los datos vienen como los esperamos! Valida que el sueldo sea positivo, por si acaso hay un rebelde con sueldo negativo 😅
- Usa una variable tipo `double acumuladoSueldos`, y cuando imprimas, hazle un casting a `float` solo por estética.
- **Entre `$100 y $300`** incluye ambos extremos, no los dejes por fuera como si no importaran.
- Para separar en rangos, **los operadores `>=` y `<=` son tu espada y escudo.**
- Si te dan una lista de 10 sueldos y te piden saber cuántos están en cierto rango, **no necesitas un array — un contador bien ubicado es suficiente.**

Documentación de ejercicio logico:
1. Le pido al usuario que ingrese la cantidad de usuarios. Creo una variable para acumular los sueldos y lo inicializo en 0. Tambien creo un contador para saber cuantos empleados 
estan entre en rago de sueldo de 100 a 300 (sueldoNormal) y otro para los que son mayores a 300 (sueldoPro) los dos los inicializo en 0.
2. Creo un ciclo for para poder recopilar los sueldos dependiendo del numero de empleados que tenga la empresa.
3. Luego, dentro del for, pido el sueldo de cada empleado y creo un contador para acumular los sueldos, donde sumo el sueldo con lo que ya tengo acumulado.
4. Dentro del for creo un if el cual nos va ha ayudar a contar los rangos de los sueldos.
5. Luego imprimo los resultados, los cuales serian: la cantidad de personas que estan en cada rango y el costo total.


Optimización: 
1. Creo una variable para que se ingrese la cantidad de productos que el cliente va a comprar.
2. Creo un ciclo for, donde pido que se ingrese el nombre del producto y su precio, dentro del for le doy el valor al impuesto que tiene cada producto , tambien le añadi la opcion
de que se escoja la cantidad que vas a comprar de cada producto.
3. Dentro del for creo un if, pongo la condicion de que si el precio es mayor a 10000, le tengo que dar un decuento, le resto esto al precio del producto, muestro en pantalla el 
precio y sigo con el ciclo.
4. Hago un else donde me dice que si el precio no es mayor de 10000, entonces ese producto no tiene descuento y sigo con el ciclo.
5. Al final imprimo los resultados del total a pagar del ciente.