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
 * Licensee: 
 * License Type: Evaluation
 */
public class Consultorio {
	public Consultorio() {
	}
	
	
	public int getIdHospital() {
		return idHospital;
	}

	public void setIdHospital(int idHospital) {
		this.idHospital = idHospital;
	}

	public int getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(int idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	public int getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(int idMedico) {
		this.idMedico = idMedico;
	}


	@Override
	public String toString() {
		return "Consultorio [idConsultorio=" + idConsultorio + ", idHospital=" + idHospital + ", idEspecialidad="
				+ idEspecialidad + ", idMedico=" + idMedico + "]";
	}


	private int idConsultorio;
	private int idHospital;
	private int idEspecialidad;
	private int idMedico;

	/**
	 * @return the idConsultorio
	 */
	public int getIdConsultorio() {
		return idConsultorio;
	}

	/**
	 * @param idConsultorio the idConsultorio to set
	 */
	public void setIdConsultorio(int idConsultorio) {
		this.idConsultorio = idConsultorio;
	}


	
	
}
