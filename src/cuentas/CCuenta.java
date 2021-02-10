package cuentas;

/**
 * Clase que representa la cuenta de un usuario.
 * 
 * @author mercedes cruz portillo
 */
public class CCuenta {

	/**
	 * Almacena el nombre del usuario.
	 */
	private String nombre;

	/**
	 * Almacena la cuenta del usuario.
	 */
	private String cuenta;

	/**
	 * Almacena el saldo de la cuenta del usuario.
	 */
	private double saldo;

	/**
	 * Almacena el tipo de interés.
	 */
	private double tipoInteres;

	/**
	 * Método que devuelve el nombre del usuario.
	 * 
	 * @return
	 */
	String getNombre() {
		return nombre;
	}

	/**
	 * Método que actualiza el nombre del usuario.
	 * 
	 * @param nombre a actualizar
	 */
	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método que devuelve la cuenta del usuario.
	 * 
	 * @return la cuenta del usuario
	 */
	String getCuenta() {
		return cuenta;
	}

	/**
	 * Método que actualiza la cuenta del usuario.
	 * 
	 * @param cuenta a actualizar
	 */
	void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Método que devuelve el saldo de la cuenta del usuario.
	 * 
	 * @return el saldo de la cuenta del usuario
	 */
	double getSaldo() {
		return saldo;
	}

	/**
	 * Método que actualiza el saldo de la cuenta del usuario.
	 * 
	 * @param saldo a actualizar
	 */
	void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Método que devuelve el tipo de interés.
	 * 
	 * @return el tipo de interés
	 */
	double getTipoInterés() {
		return tipoInteres;
	}

	/**
	 * Método que actualiza el tipo de interés.
	 * 
	 * @param tipoInteres a actualizar
	 */
	void setTipoInterés(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	/**
	 * Constructor de la clase.
	 */
	public CCuenta() {
	}

	/**
	 * Constructor sobrecargado para inicializarse con un nombre, cuenta y saldo.
	 * 
	 * @param nom  el nombre
	 * @param cue  la cuenta
	 * @param sal  el saldo
	 * @param tipo el tipo de interés (que se ignora)
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		setNombre(nom);
		setCuenta(cue);
		setSaldo(sal);
	}

	/**
	 * Método que devuelve el saldo de la cuenta del usuario.
	 * 
	 * @return el saldo de la cuenta del usuario.
	 */
	public double estado() {
		return getSaldo();
	}

	/**
	 * Método que se ejecuta cuando el usuario intenta ingresas saldo en la cuenta.
	 * 
	 * @param cantidad a ingresar
	 * @throws Exception lanza una excepción cuando el usuario mete una cantidad
	 *                   negativa
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa.");
		setSaldo(getSaldo() + cantidad);
	}

	/**
	 * Método que se ejecuta cuando el usuario intenta retirar saldo de la cuenta.
	 * 
	 * @param cantidad a retirar
	 * @throws Exception lanza dos excepciones. En el primer caso, lanza una
	 *                   excepción cuando el usuario intenta retirar de la cuenta
	 *                   una cantidad negativa. En el segundo caso, lanza una
	 *                   excepción cuando el usuario intenta retirar de la cuenta
	 *                   una cantidad en el que no hay saldo.
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa.");
		if (estado() < cantidad)
			throw new Exception("No hay suficiente saldo.");
		setSaldo(getSaldo() - cantidad);
	}
}
