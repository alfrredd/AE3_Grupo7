/*División de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la solución.
División de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.
Inverso de un número real, tendrá un parámetro de entrada y uno de salida que será la solución.
Raíz de un número, tendrá un parámetro de entrada y uno de salida que será la solución.
 */
package calculadora;

/**
 * Clase en la que se engloban todos los métodos de la división en la calculadora
 * @see calculadora
 * @author Afredo Hernández
 * @version 1.0.0
 * @since 30/01/2022
 *
 */
public class Cociente {

	//Métodos
	/**
	 * Divide dos números reales, recibe dos valores <b>positivos</b> y retorna el resultado
	 * @param a Dividendo de la operación
	 * @param b Divisor de la operación<br>
	 * <ul><li>Si el divisor es 0 el resultado será error (-1) pues no se puede dividir entre cero</li></ul>
	 * @return Resultado de la división<br>
	 * <ul><li>Retorna -1 si el divisor es igual a 0 </li>
	 * <li>Retorna -2 si cualquiera de los argumentos son negativos </li></ul>
	 */
	public float dosReales(float a, float b) {
		if (b==0) {
			return -1;
		}else if (a<0 || b<0) {
			return -2;
		}else {
		return a/b;
		}
	}
	/**
	 * Divide dos números enteros, recibe dos valores <b>positivos</b> y retorna el resultado
	 * @param a Dividendo de la operación
	 * @param b Divisor de la operación <br>
	 * <ul><li>Si el divisor es 0 el resultado será error (-1) pues no se puede dividir entre cero</li></ul>
	 * @return Resultado de la división <br>
	 * <ul><li>Retorna 0 si el divisor es mayor al dividendo. Para ver los decimales usa dosReales()</li>
	 * <li>Retorna -1 si el divisor es igual a 0 </li>
	 * <li>Retorna -2 si cualquiera de los argumentos son negativos </li></ul>
	 * @see dosReales(float, float)
	 */
	public int dosEnteros(int a, int b) {
		if (b==0) {
			return -1;
		}else if (a<0 || b<0) {
			return -2;
		}else {
		return a/b;
		}
	}
	/**
	 * Realiza el inverso del número real dado: cambia un número negativo a positivo y el positivo a negativo.
	 * @param a Número del que se quiere obtener su inverso
	 * @return Número inverso
	 */
	public float inversoReal(float a) {
		return a - (a * 2);
	}
	/**
	 * Raíz cuadrada de un número
	 * @param a Valor del cual se quiere obtener la raíz cuadrada <br>
	 * <ul><li>Solo acepta números <b>positivos</b>. No podemos obtener la raíz cuadrada de un número negativo</li></ul>
	 * @return Resultado de la raíz cuadrada <br>
	 * <ul><li>Retorna -2 si recibe un número negativo</li></ul>
	 */
	public double raiz (double a) {
		if (a<0) {
			return -2;
		}else {
		return Math.sqrt(a);
		}
	}
}
