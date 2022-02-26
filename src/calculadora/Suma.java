/*Suma de dos n�meros reales, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n.
Suma de dos n�meros enteros, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n.
Suma de tres n�meros reales, tendr� 3 par�metros de entrada y uno de salida que ser� la soluci�n.
Suma con valor acumulado, tendr� un par�metro de entrada y la clase deber� de guardar el valor acumulado.
*/
package calculadora;

/**
 * Clase en la que se engloban todos los m�todos de la suma en la calculadora
 * @see calculadora
 * @author Carlos Alonso
 * @version 1.0.0
 * @since 30/01/2022
 *
 */
public class Suma {
	/**
	 * Se utilizar� para guardar el valor de la suma en el m�todo sumaAcumulado
	 * @see sumaAcumulado(float)
	 */
	public float valorAcumulado;
	
	//Getters y Setters
	public float getValorAcumulado() {
		return valorAcumulado;
	}

	public void setValorAcumulado(float valorAcumulado) {
		this.valorAcumulado = valorAcumulado;
	}
	
	//M�todos
	/**
	 * Suma dos n�meros reales, recibe dos valores <b>positivos</b> y retorna el resultado
	 * @param a Primer valor de la operaci�n
	 * @param b Segundo valor de la operaci�n
	 * @return Resultado de la suma
	 * <ul><li>Retorna -2 si recibe un n�mero negativo</li></ul>
	 */
	public float dosReales(float a, float b) {
		if (a<0 || b<0) {
			return -2;
		}else {
		return a+b;
		}
	}
	/**
	 * Suma dos n�meros enteros, recibe dos valores <b>positivos</b> y retorna el resultado
	 * @param a Primer valor de la operaci�n
	 * @param b Segundo valor de la operaci�n
	 * @return Resultado de la suma
	 * <ul><li>Retorna -2 si recibe un n�mero negativo</li></ul>
	 */
	public int dosEnteros(int a, int b) {
		if (a<0 || b<0) {
			return -2;
		}else {
		return a+b;
		}
	}
	/**
	 * Suma tres n�meros reales, recibe tres valores <b>positivos</b> y retorna el resultado
	 * @param a Primer valor de la operaci�n
	 * @param b Segundo valor de la operaci�n
	 * @param c Tercer valor de la operaci�n
	 * @return Resultado de la suma
	 * <ul><li>Retorna -2 si recibe un n�mero negativo</li></ul>
	 */
	public float tresReales(float a, float b, float c) {
		if (a<0 || b<0 || c<0) {
			return -2;
		}else {
		return a+b+c;
		}
	}
	/**
	 * Suma con un valor que se guarda en memoria y otro que recibe como argumento
	 * @param a Valor que se quiere sumar<b>(positivo)</b>
	 * @return Valor que resulta de sumar el valor acumulado al valor que se quiere sumar
	 * @see valorAcumulado
	 */
	public float sumaAcumulado(float a) {
		valorAcumulado = a + valorAcumulado;
		return valorAcumulado;
	}
}



