package com.towasoftware.hospitalmvc.basedatos;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.towasoftware.hospitalmvc.model.Cita;
import com.towasoftware.hospitalmvc.model.Consultorio;
import com.towasoftware.hospitalmvc.model.Departamento;
import com.towasoftware.hospitalmvc.model.Especialidad;
import com.towasoftware.hospitalmvc.model.Medico;
import com.towasoftware.hospitalmvc.model.Paciente;



public class Insert {

	private Connection conexion;
	private Statement statement;
	private String query;
	
	public void InsertarPaciente(Paciente paciente) throws SQLException
	{
		String insertTableSQL = "INSERT INTO Paciente" + " (`Nombre`, `Apellido`,"
				+ " `Direccion`, `Telefono`, `Email`, `TipoSangre`, `Alergias`, `NSS`, `Sexo`"
				+ " ) "
				+ "VALUES ('"+paciente.getNombre()+"','"+paciente.getApellido()+"',"
				+ "'"+paciente.getDireccion()+"','"+paciente.getTelefono()+"',"
				+ "'"+paciente.getEmail()+"','"+paciente.getTipoSangre()+"',"
				+ "'"+paciente.getAlergias()+"','"+paciente.getNSS()+"',"
						+ "'"+paciente.getSexo()+"')"; 
		
		this.query =insertTableSQL;
		this.insertar();
		
	}
	public void InsertarCita(Cita cita) throws SQLException
	{
		String insertTableSQL = "INSERT INTO cita" + "( `fecha`, `hora`,"
				+ " `idPaciente`, `idMedico`, `idConsultorio`, `idEspecialidad`) "
				+ "VALUES ('"+cita.getFecha()+"','"+cita.getHora()+"',"
				+ ""+cita.getIdPaciente()+","+cita.getIdMedico()+","+cita.getIdConsultorio()+","
				+ ""+cita.getIdEspecialidad()+")"; 
		
		this.query = insertTableSQL;
		this.insertar();
	}
	
	
	public void InsertarDepartamento(Departamento depto) throws SQLException
	{
		String insertTableSQL = "INSERT INTO Departamento" + " ( `idDepartamento`,`Nombre`)"
				+ "VALUES ("+depto.getIdDepartamento()+",'"+depto.getNombre()
				+"')"; 
		
		this.query = insertTableSQL;
		this.insertar();
	}
	
	public void InsertarConsultorio(Consultorio consultorio) throws SQLException
	{
		String insertTableSQL = "INSERT INTO Consultorio" + " ( `idConsultorio`,`idHospital`,`idEspecialidad`,`idMedico`)"
				+ "VALUES ("+consultorio.getIdConsultorio()+","+consultorio.getIdHospital()+","
				+consultorio.getIdEspecialidad()+","+consultorio.getIdMedico()
				+")"; 
		
		this.query = insertTableSQL;
		this.insertar();
	}
	
	public void InsertarEspecialidad(Especialidad especialidad) throws SQLException
	{
		String insertTableSQL = "INSERT INTO Especialidad" + " ( `idEspecialidad`, `nombreEspecialidad`)"
				+ "VALUES ('"+especialidad.getIdEspecialidad()+"',"+especialidad.getNombre()
				+")"; 		
		this.query = insertTableSQL;
		this.insertar();
	}
	

	public void InsertarMedico(Medico medico) throws SQLException
	{
		String insertTableSQL = "INSERT INTO Medico" + " (`Nombre`, `Apellido`,"
				+ " `idEspecialidad`, `Telefono`, `Correo`,`Direccion`, `CedulaProfesional`"
				+ ", `Horario`) "
				+ "VALUES ('"+medico.getNombre()+"','"+medico.getApellido()+"',"
				+ " "+medico.getIdEspecialidad()+",'"+medico.getTelefono()+"',"
				+ "'"+medico.getCorreo()+"','"+medico.getDireccion()+"',"
				+ "'"+medico.getCedulaProfesional()+"','"+medico.getHorario()+"')"; 
		
		this.query =insertTableSQL;
		this.insertar();
		
	}
	
	
	public Insert() {
		this.conexion = new Conexion().getConnection();
	}

	public void insertar() throws SQLException {
		try {
			
			this.statement = this.conexion.createStatement();

			System.out.println(this.query);

			// execute insert SQL stetement
			statement.executeUpdate(this.query);

			System.out.println("Record is inserted into DBUSER table!");

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (statement != null) {
				statement.close();
			}

			if ( this.conexion!= null) {
				this.conexion.close();
			}
		}
	}
}
