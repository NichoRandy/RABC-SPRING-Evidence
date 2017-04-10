package com.towasoftware.hospitalmvc.model;

/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: License Type: Evaluation
 */
public class Especialidad {

	private int idEspecialidad;

	private String nombreEspecialidad;


	/**
	 * @return the idEspecialidad
	 */
	public int getIdEspecialidad() {
		return idEspecialidad;
	}

	/**
	 * @param idEspecialidad the idEspecialidad to set
	 */
	public void setIdEspecialidad(int idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}


	public String getNombre() {
		return nombreEspecialidad;
	}

	/**
	 * @param nombre the nombreDepartamento to set
	 */
	public void setNombre(String nombreEspecialidad) {
		this.nombreEspecialidad = nombreEspecialidad;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Especialidad [idEspecialidad=" + idEspecialidad + ", nombre=" + nombreEspecialidad +"]";
	}
}
