/*Resta de dos n�meros reales, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n.
Resta de dos n�meros enteros, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n.
Resta de tres n�meros reales, tendr� 3 par�metros de entrada y uno de salida que ser� la soluci�n.
Resta con valor acumulado, tendr� un par�metro de entrada y la clase deber� de guardar el valor acumulado.
 */
package calculadora;

/**
 * Clase en la que se engloban todos los m�todos de la resta en la calculadora
 * @see calculadora
 * @author ��igo L�pez
 * @version 1.0.0
 * @since 30/01/2022
 *
 */
public class Resta {
	/**
	 * Se utilizar� para guardar el valor de la resta en el m�todo restaAcumulado
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
	//M�todos
	/**
	 * Resta dos n�meros reales, recibe dos valores <b>positivos</b> y retorna el resultado
	 * @param a Primer valor de la operaci�n
	 * @param b Segundo valor de la operaci�n
	 * @return Resultado de la resta
	 * <ul><li>Retorna -2 si recibe un n�mero negativo</li></ul>
	 */
	public float dosReales(float a, float b) {
		if (a<0 || b<0) {
			return -2;
		}else {
		return a-b;
		}
	}
	/**
	 * Resta dos n�meros enteros, recibe dos valores <b>positivos</b> y retorna el resultado
	 * @param a Primer valor de la operaci�n
	 * @param b Segundo valor de la operaci�n
	 * @return Resultado de la resta
	 * <ul><li>Retorna -2 si recibe un n�mero negativo</li></ul>
	 */
	public int dosEnteros(int a, int b) {
		if (a<0 || b<0) {
			return -2;
		}else {
		return a-b;
		}
	}
	/**
	 * Resta tres n�meros reales, recibe tres valores <b>positivos</b> y retorna el resultado
	 * @param a Primer valor de la operaci�n
	 * @param b Segundo valor de la operaci�n
	 * @param c Tercer valor de la operaci�n
	 * @return Resultado de la resta
	 * <ul><li>Retorna -2 si recibe un n�mero negativo</li></ul>
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
