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
public class ConsultorioMedico {
	public ConsultorioMedico() {
	}
	
	public int getIdConsultorio() {
		return idConsultorio;
	}
	public void setIdConsultorio(int idConsultorio) {
		this.idConsultorio = idConsultorio;
	}
	public int getIdHospital() {
		return idHospital;
	}
	public void setIdHospital(int idHospital) {
		this.idHospital = idHospital;
	}
	public int getHorario() {
		return horario;
	}
	public void setHorario(int horario) {
		this.horario = horario;
	}
	public int getIdMedico() {
		return idMedico;
	}
	public void setIdMedico(int idMedico) {
		this.idMedico = idMedico;
	}

	@Override
	public String toString() {
		return "ConsultorioMedico [idConsultorio=" + idConsultorio + ", idHospital=" + idHospital + ", horario="
				+ horario + ", idMedico=" + idMedico + "]";
	}

	private int idConsultorio;
	private int idHospital;
	private int horario;;
	private int idMedico;

	
	
}
