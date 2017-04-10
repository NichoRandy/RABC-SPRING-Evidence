package com.towasoftware.hospitalmvc.basedatos;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.towasoftware.hospitalmvc.model.Cita;
import com.towasoftware.hospitalmvc.model.Consultorio;
import com.towasoftware.hospitalmvc.model.Departamento;
import com.towasoftware.hospitalmvc.model.Especialidad;
import com.towasoftware.hospitalmvc.model.Medico;
import com.towasoftware.hospitalmvc.model.Paciente;



public class Update {

	private Connection conexion;
	private Statement statement;
	private String query;


	
	public void updatePaciente(Paciente paciente, int id) throws SQLException
	{
		String insertTableSQL = "UPDATE Paciente  SET" + 
				" `Nombre` = '"+paciente.getNombre()+"' ,"
				+ " `Apellido` = '"+paciente.getApellido()+"' ,"
				+ " `Direccion` = '"+paciente.getDireccion()+"', "
				+ "`Telefono` = '"+paciente.getTelefono()+"',"
				+ " `Email`= '"+paciente.getEmail()+"', "
				+ "`TipoSangre` = '"+paciente.getTipoSangre()+"',"
				+ " `Alergias` = '"+paciente.getAlergias()+"', "
				+ "`NSS` = '"+paciente.getNSS()+"',"
				+ " `Sexo` = '"+paciente.getSexo()+"' "
				+ "WHERE `idPaciente` = "+id
						+ " ;"; 
		
		this.query =insertTableSQL;
		this.actualizar();
		
	}
//=========================================================================================================================
	
	public void updateCita(Cita cita, int id) throws SQLException
	{
		String insertTableSQL = "UPDATE cita  SET" + 
				" `fecha` = '"+ cita.getFecha() +"' ,"
				+ " `hora` = '"+cita.getHora() +"' ,"
				+ " `idPaciente` = "+cita.getIdPaciente()+", "
				+ "`idMedico` = "+cita.getIdMedico()+","
				+ " `idConsultorio`= "+ cita.getIdConsultorio() +", "
				+ "`idEspecialidad` = "+cita.getIdEspecialidad()+" "
				+ "WHERE `idCita` = "+id
						+ " ;"; 
		
		this.query =insertTableSQL;
		this.actualizar();
		
	}
	//=========================================================================================================================	
	public void updateConsultorio(Consultorio consultorio, int id) throws SQLException
	{
		String insertTableSQL = "UPDATE consultorio  SET" + 
				" `idConsultorio` = "+ consultorio.getIdConsultorio() +" ,"
				+ " `idEspecialidad` = "+consultorio.getIdEspecialidad() +" ,"
				+ " `idHospital` = "+consultorio.getIdHospital() +", "
				+ "`idMedico` = "+consultorio.getIdMedico() +" "
				+ "WHERE `idConsultorio` = "+id 
						+ " ;"; 
		
		this.query =insertTableSQL;
		this.actualizar();
		
	}
	//=========================================================================================================================	
	public void actualizarDepartamento(Departamento depto) throws SQLException
	{
		String insertTableSQL = "INSERT INTO Departamento" + " ( `idDepartamento`,`Nombre`)"
				+ "VALUES ("+depto.getIdDepartamento()+",'"+depto.getNombre()
				+"')"; 
		
		this.query = insertTableSQL;
		this.actualizar();
	}
	
	public void actualizarConsultorio(Consultorio consultorio) throws SQLException
	{
		String insertTableSQL = "INSERT INTO Consultorio" + " ( `idConsultorio`,`Piso`)"
				+ "VALUES ("+consultorio.getIdConsultorio()+","+consultorio.getPiso()
				+")"; 
		
		this.query = insertTableSQL;
		this.actualizar();
	}
	
	public void actualizarEspecialidad(Especialidad especialidad) throws SQLException
	{
		String insertTableSQL = "INSERT INTO Especialidad" + " ( `Nombre`, `idDepartamento`)"
				+ "VALUES ('"+especialidad.getNombre()+"',"+especialidad.getIdDepartamento()
				+")"; 
		
		this.query = insertTableSQL;
		this.actualizar();
	}
	
	public void actualizarCita(Cita cita) throws SQLException
	{
		String insertTableSQL = "INSERT INTO `cita`( `Fecha`, `Hora`, `idPaciente`,"
				+ " `idMedico`, `idConsultorio`, `Presion`, `Peso`, `Talla`, `Temperatura`, "
				+ "`Diagnostico`, `Observacion`) "
				+ "VALUES ('"+cita.getFecha()+"','"+cita.getHora()+"',"+cita.getIdPaciente()+","
				+ ""+cita.getIdMedico()+","+cita.getIdConsultorio()+",'"+cita.getPresion()+"',"
				+ ""+cita.getPeso()+","+cita.getTalla()+","+cita.getTemperatura()+","
				+ "'"+cita.getDiagnostico()+"','"+cita.getObservacion()+"'"
				+")"; 
		
		this.query = insertTableSQL;
		this.actualizar();
	}
	
	public void updateMedico(Medico medico, int id) throws SQLException
	{
		String insertTableSQL = "UPDATE Medico  SET" 
				+" (`Nombre`, `Apellido`,"
				+ " `idEspecialidad`, `Telefono`, `Correo`,`Direccion`, `CedulaProfesional`"
				+ ", `Horario`) "
				+ "VALUES ('"+medico.getNombre()+"','"+medico.getApellido()+"',"
				+ " "+medico.getIdEspecialidad()+",'"+medico.getTelefono()+"',"
				+ "'"+medico.getCorreo()+"','"+medico.getDireccion()+"',"
				+ "'"+medico.getCedulaProfesional()+"','"+medico.getHorario()+"')"; 
		
		this.query =insertTableSQL;
		this.actualizar();
		
	}
	
	
	public Update() {
		this.conexion = new Conexion().getConnection();
	}

	public void actualizar() throws SQLException {
		try {
			
			this.statement = this.conexion.createStatement();

			System.out.println(this.query);

			// execute insert SQL stetement
			statement.executeUpdate(this.query);

			System.out.println("Record is updated into DBUSER table!");

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
