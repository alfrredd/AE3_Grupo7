/*Producto de dos n�meros reales, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n.
Producto de dos n�meros enteros, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n.
Producto de tres n�meros reales, tendr� 3 par�metros de entrada y uno de salida que ser� la soluci�n.
Potencia, tendr� dos par�metro de entrada (base y exponente) y uno de salida que ser� la soluci�n.
 */
package calculadora;

/**
 * Clase en la que se engloban todos los m�todos de la multiplicaci�n en la calculadora
 * @see calculadora
 * @author Julio Fern�ndez
 * @version 1.0.0
 * @since 30/01/2022
 *
 */
public class Producto {

	//M�todos
	/**
	 * Multiplica dos n�meros reales, recibe dos valores <b>positivos</b> y retorna el resultado
	 * @param a Primer valor de la operaci�n
	 * @param b Segundo valor de la operaci�n
	 * @return Resultado de la multiplicaci�n
	 * <ul><li>Retorna -2 si recibe un n�mero negativo</li></ul>
	 */
	public float dosReales(float a, float b) {
		if (a<0 || b<0) {
			return -2;
		}else {
		return a*b;
		}
	}
	/**
	 * Multiplica dos n�meros enteros, recibe dos valores <b>positivos</b> y retorna el resultado
	 * @param a Primer valor de la operaci�n
	 * @param b Segundo valor de la operaci�n
	 * @return Resultado de la multiplicaci�n
	 * <ul><li>Retorna -2 si recibe un n�mero negativo</li></ul>
	 */
	public int dosEnteros(int a, int b) {
		if (a<0 || b<0) {
			return -2;
		}else {
		return a*b;
		}
	}
	/**
	 * Multiplica tres n�meros reales, recibe tres valores <b>positivos</b> y retorna el resultado
	 * @param a Primer valor de la operaci�n
	 * @param b Segundo valor de la operaci�n
	 * @param c Tercer valor de la operaci�n
	 * @return Resultado de la multiplicaci�n
	 * <ul><li>Retorna -2 si recibe un n�mero negativo</li></ul>
	 */
	public float tresReales(float a, float b, float c) {
		if (a<0 || b<0 || c<0) {
			return -2;
		}else {
		return a*b*c;
		}
	}
	/**
	 * Realiza la potencia dados los par�metros de base y exponente
	 * @param base Valor <b>positivo</b> que ser� la base de la potencia
	 * @param exponente Valor <b>positivo</b> que ser� el exponente de la potencia
	 * @return Resultado de la potencia <br>
	 * <ul><li>Para n�meros extremadamente grandes, el resultado ser� "Infinity"</li>
	 * <li>Retorna -2 si recibe un n�mero negativo</li></ul>
	 */
	public double potencia(double base, double exponente) {
		if (base<0 || exponente<0) {
			return -2;
		}else {
		return Math.pow(base, exponente);
		}
	}
}
