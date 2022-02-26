/*Resta de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la solución.
Resta de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.
Resta de tres números reales, tendrá 3 parámetros de entrada y uno de salida que será la solución.
Resta con valor acumulado, tendrá un parámetro de entrada y la clase deberá de guardar el valor acumulado.
 */
package calculadora;

/**
 * Clase en la que se engloban todos los métodos de la resta en la calculadora
 * @see calculadora
 * @author Íñigo López
 * @version 1.0.0
 * @since 30/01/2022
 *
 */
public class Resta {
	/**
	 * Se utilizará para guardar el valor de la resta en el método restaAcumulado
	 * @see restaAcumulado(float)
	 */
	public float valorAcumulado;
	
	//Getters y Setters
	public float getValorAcumulado() {
		return valorAcumulado;
	}

	public void setValorAcumulado(float valorAcumulado) {
		this.valorAcumulado = valorAcumulado;
	}
	//Métodos
	/**
	 * Resta dos números reales, recibe dos valores <b>positivos</b> y retorna el resultado
	 * @param a Primer valor de la operación
	 * @param b Segundo valor de la operación
	 * @return Resultado de la resta
	 * <ul><li>Retorna -2 si recibe un número negativo</li></ul>
	 */
	public float dosReales(float a, float b) {
		if (a<0 || b<0) {
			return -2;
		}else {
		return a-b;
		}
	}
	/**
	 * Resta dos números enteros, recibe dos valores <b>positivos</b> y retorna el resultado
	 * @param a Primer valor de la operación
	 * @param b Segundo valor de la operación
	 * @return Resultado de la resta
	 * <ul><li>Retorna -2 si recibe un número negativo</li></ul>
	 */
	public int dosEnteros(int a, int b) {
		if (a<0 || b<0) {
			return -2;
		}else {
		return a-b;
		}
	}
	/**
	 * Resta tres números reales, recibe tres valores <b>positivos</b> y retorna el resultado
	 * @param a Primer valor de la operación
	 * @param b Segundo valor de la operación
	 * @param c Tercer valor de la operación
	 * @return Resultado de la resta
	 * <ul><li>Retorna -2 si recibe un número negativo</li></ul>
	 */
	public float tresReales(float a, float b, float c) {
		if (a<0 || b<0 || c<0) {
			return -2;
		}else {
		return a-b-c;
		}
	}
	/**
	 * Resta con un valor que se guarda en memoria y otro que recibe como argumento
	 * @param a Valor que se quiere restar
	 * @return Valor que resulta de restar el valor que se quiere restar al valor acumulado
	 * @see valorAcumulado
	 */
	public float restaAcumulado(float a) {
		valorAcumulado = valorAcumulado - a;
		return valorAcumulado;
	}
}
