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
public class receta {
	
	
	@Override
	public String toString() {
		return "receta [idReceta=" + idReceta + ", descripcion=" + descripcion + ", fecha=" + fecha + ", idMedico="
				+ idMedico + ", idPaciente=" + idPaciente + "]";
	}




	public int getIdReceta() {
		return idReceta;
	}




	public void setIdReceta(int idReceta) {
		this.idReceta = idReceta;
	}




	public String getDescripcion() {
		return descripcion;
	}




	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}




	public String getFecha() {
		return fecha;
	}




	public void setFecha(String fecha) {
		this.fecha = fecha;
	}




	public int getIdMedico() {
		return idMedico;
	}




	public void setIdMedico(int idMedico) {
		this.idMedico = idMedico;
	}




	public int getIdPaciente() {
		return idPaciente;
	}




	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}




	private int idReceta;	
	private String descripcion;	
	private String fecha;	
	private int idMedico;
	private int idPaciente;

	
	

	public receta(){};
	

	
	
}
