package VehiculoDualEveris_TomasMota;

import java.io.Serializable;

/**
 * Clase Vehiculo
 *
 * Contiene informacion de un vehiculo
 *
 * @author TomasMota
 */
public class Vehiculo implements Serializable {
	private static final long serialVersionUID = 7695874286508524707L;

	// Atributos
	/**
	 * Matricula del vehiculo
	 */
	private String matricula;

	/**
	 * Marca del vehiculo
	 */
	private String marca;

	/**
	 * Tama�o del deposito del vehiculo
	 */
	private double tama�oDeposito;

	/**
	 * Modelo del vehiculo
	 */
	private String modelo;

	// Constructor
	/**
	 * Constructor con 4 parametros
	 * 
	 * @param matricula
	 * @param marca
	 * @param tama�oDeposito
	 * @param modelo
	 */
	public Vehiculo(String matricula, String marca, double tama�oDeposito, String modelo) {
		this.matricula = matricula;
		this.tama�oDeposito = tama�oDeposito;
		this.marca = marca;
		this.modelo = modelo;
	}

	// M�todos
	/**
	 * Devuelve la matricula del vehiculo
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * Devuelve la marca del vehiculo
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * Devuelve el tama�o del deposito
	 */
	public double getTama�oDeposito() {
		return tama�oDeposito;
	}

	/**
	 * Devuelve el modelo del vehiculo
	 */
	public String getModelo() {
		return modelo;
	}

}

