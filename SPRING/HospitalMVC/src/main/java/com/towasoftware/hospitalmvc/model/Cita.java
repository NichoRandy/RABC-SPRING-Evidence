package com.towasoftware.hospitalmvc.model;


public class Cita {
	
	
	
	public int getIdEspecialidad() {
		return idEspecialidad;
	}
	public void setIdEspecialidad(int idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}
	private int idCita;	
	private String fecha;	
	private String hora;	
	private int idPaciente;	
	private int idMedico;	
	private int idConsultorio;
	private int idEspecialidad;
	public Cita(){};



	/**
	 * @return the idCita
	 */
	public int getIdCita() {
		return idCita;
	}

	/**
	 * @param idCita the idCita to set
	 */
	public void setIdCita(int idCita) {
		this.idCita = idCita;
	}

	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the hora
	 */
	public String getHora() {
		return hora;
	}

	/**
	 * @param hora the hora to set
	 */
	public void setHora(String hora) {
		this.hora = hora;
	}

	/**
	 * @return the idPaciente
	 */
	public int getIdPaciente() {
		return idPaciente;
	}

	/**
	 * @param idPaciente the idPaciente to set
	 */
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	/**
	 * @return the idMedico
	 */
	public int getIdMedico() {
		return idMedico;
	}

	/**
	 * @param idMedico the idMedico to set
	 */
	public void setIdMedico(int idMedico) {
		this.idMedico = idMedico;
	}

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


	@Override
	public String toString() {
		return "Cita [idCita=" + idCita + ", fecha=" + fecha + ", hora=" + hora + ", idPaciente=" + idPaciente
				+ ", idMedico=" + idMedico + ", idConsultorio=" + idConsultorio + ", idEspecialidad=" + idEspecialidad
				+ "]";
	}

	
	
	}
