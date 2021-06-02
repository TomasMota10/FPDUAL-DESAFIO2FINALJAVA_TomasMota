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
	 * Tamaño del deposito del vehiculo
	 */
	private double tamañoDeposito;

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
	 * @param tamañoDeposito
	 * @param modelo
	 */
	public Vehiculo(String matricula, String marca, double tamañoDeposito, String modelo) {
		this.matricula = matricula;
		this.tamañoDeposito = tamañoDeposito;
		this.marca = marca;
		this.modelo = modelo;
	}

	// Métodos
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
	 * Devuelve el tamaño del deposito
	 */
	public double getTamañoDeposito() {
		return tamañoDeposito;
	}

	/**
	 * Devuelve el modelo del vehiculo
	 */
	public String getModelo() {
		return modelo;
	}

}

