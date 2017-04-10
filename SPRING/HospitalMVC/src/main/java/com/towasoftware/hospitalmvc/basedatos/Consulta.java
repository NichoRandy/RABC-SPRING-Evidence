package com.towasoftware.hospitalmvc.basedatos;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.towasoftware.hospitalmvc.model.Cita;
import com.towasoftware.hospitalmvc.model.Departamento;
import com.towasoftware.hospitalmvc.model.Departamento;
import com.towasoftware.hospitalmvc.model.Especialidad;
import com.towasoftware.hospitalmvc.model.Medico;
import com.towasoftware.hospitalmvc.model.Paciente;

import java.sql.Statement;


public class Consulta {

	private Connection conexion;
	private Statement statement;
	private String query;
	private ResultSet resultSet;

	public Consulta() {
		this.conexion = new Conexion().getConnection();
	}

	public List<Paciente> consultaPacientes() throws SQLException {
		 this.query = "Select * FROM paciente;";
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapPaciente mapPaciente = new MapPaciente();
			return mapPaciente.mapPacientes(resultSet);
		} catch (Exception e) {
			return null;
		} finally {
			this.conexion.close();
		}
	}	
	public Paciente consultaUltimoPaciente() throws SQLException {
		 this.query = "SELECT * FROM paciente ORDER BY idPaciente DESC LIMIT 1";
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapPaciente mapPaciente = new MapPaciente();
			return mapPaciente.mapPaciente(resultSet);
		} catch (Exception e) {
			return null;
		} finally {
			this.conexion.close();
		}
	}
	
	public Paciente consultaPacienteId(int id) throws SQLException
	{
		this.setQuery("SELECT * FROM paciente WHERE idPaciente = " + id + ";");
		return consultaPaciente();
	}

	public Paciente consultaPaciente() throws SQLException {
		
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapPaciente mapPaciente = new MapPaciente();
			return mapPaciente.mapPaciente(resultSet);
		} catch (Exception e) {
			return null;
		} finally {
			this.conexion.close();
		}
	}
//====================================================================================================================
	public List<Cita> consultaCitas() throws SQLException {						//consulta citas
		 this.query = "Select * FROM cita;";
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapCitas mapcita = new MapCitas();
			return mapcita.mapCitas(resultSet);
		} catch (Exception e) {
			return null;
		} finally {
			this.conexion.close();
		}
	}
	public Cita consultaUltimaCita() throws SQLException {
		 this.query = "SELECT * FROM cita ORDER BY idCita DESC LIMIT 1";
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapCitas mapCita = new MapCitas();
			return mapCita.mapCita(resultSet);
		} catch (Exception e) {
			return null;
		} finally {
			this.conexion.close();
		}
	}
	
	public Cita consultaCitaId(int id) throws SQLException
	{
		this.setQuery("SELECT * FROM cita WHERE idCita = " + id + ";");
		return consultaCita();
	}

	public Cita consultaCita() throws SQLException {
		
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapCitas mapCita = new MapCitas();
			return mapCita.mapCita(resultSet);
		} catch (Exception e) {
			return null;
		} finally {
			this.conexion.close();
		}
	}

	
//=====================================================================================================================

		public List<Departamento> consultaConsultorios() throws SQLException {						//consulta consultorio
			 this.query = "Select * FROM consultorio;";
			try {
				this.statement = this.conexion.createStatement();
				this.resultSet = this.statement.executeQuery(this.query);
				MapDepartamento mapDepartamento = new MapDepartamento();
				return mapDepartamento.mapDepartamentos(resultSet);
			} catch (Exception e) {
				return null;
			} finally {
				this.conexion.close();
			}
		}
		public Departamento consultaUltimaConsultorio() throws SQLException {
			 this.query = "SELECT * FROM consultorio ORDER BY idPaciente DESC LIMIT 1";
			try {
				this.statement = this.conexion.createStatement();
				this.resultSet = this.statement.executeQuery(this.query);
				MapDepartamento mapDepartamento = new MapDepartamento();
				return mapDepartamento.mapDepartamento(resultSet);
			} catch (Exception e) {
				return null;
			} finally {
				this.conexion.close();
			}
		}
		
		public Departamento consultaConsultorioId(int id) throws SQLException
		{
			this.setQuery("SELECT * FROM consultorio WHERE idConsultorio = " + id + ";");
			return consultaConsultorio();
		}

		public Departamento consultaConsultorio() throws SQLException {
			
			try {
				this.statement = this.conexion.createStatement();
				this.resultSet = this.statement.executeQuery(this.query);
				MapDepartamento mapDepartamento = new MapDepartamento();
				return mapDepartamento.mapDepartamento(resultSet);
			} catch (Exception e) {
				return null;
			} finally {
				this.conexion.close();
			}
		}

		
	//=====================================================================================================================
		public List<Departamento> consultaDepartamentos() throws SQLException {						//consulta consultorio
			 this.query = "Select * FROM Departamento;";
			try {
				this.statement = this.conexion.createStatement();
				this.resultSet = this.statement.executeQuery(this.query);
				MapDepartamento mapConsultorio = new MapDepartamento();
				return mapConsultorio.mapConsultorios(resultSet);
			} catch (Exception e) {
				return null;
			} finally {
				this.conexion.close();
			}
		}
		public Departamento consultaUltimoDepartamento() throws SQLException {
			 this.query = "SELECT * FROM consultorio ORDER BY idPaciente DESC LIMIT 1";
			try {
				this.statement = this.conexion.createStatement();
				this.resultSet = this.statement.executeQuery(this.query);
				MapDepartamento mapConsultorio = new MapDepartamento();
				return mapConsultorio.mapConsultorio(resultSet);
			} catch (Exception e) {
				return null;
			} finally {
				this.conexion.close();
			}
		}
		
		public Departamento consultaDepartamentoId(int id) throws SQLException
		{
			this.setQuery("SELECT * FROM consultorio WHERE idConsultorio = " + id + ";");
			return consultaConsultorio();
		}

		public Departamento consultaDepartamento() throws SQLException {
			
			try {
				this.statement = this.conexion.createStatement();
				this.resultSet = this.statement.executeQuery(this.query);
				MapDepartamento mapConsultorio = new MapDepartamento();
				return mapConsultorio.mapConsultorio(resultSet);
			} catch (Exception e) {
				return null;
			} finally {
				this.conexion.close();
			}
		}

		
	//=====================================================================================================================
	
	public List<Departamento> consultaDepartamentos() throws SQLException {
		// this.query = "Select * FROM Departamento;";
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapDepartamento mapDepartamento = new MapDepartamento();
			return mapDepartamento.mapDepartamentos(resultSet);
		} catch (Exception e) {
			return null;
		} finally {
			this.conexion.close();
		}
	}

	public Departamento consultaDepartamento() throws SQLException {
		// this.query = "Select * FROM Departamento;";
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapDepartamento mapDepartamento = new MapDepartamento();
			return mapDepartamento.mapDepartamento(resultSet);
		} catch (Exception e) {
			return null;
		} finally {
			this.conexion.close();
		}
	}
	
	public List<Especialidad> consultaEspecialidades() throws SQLException {
		// this.query = "Select * FROM Departamento;";
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapEspecialidad mapEspecialidad = new MapEspecialidad();
			return mapEspecialidad.mapEspecialidad(resultSet);
		} catch (Exception e) {
			return null;
		} finally {
			this.conexion.close();
		}
	}
	
	

	public Medico consultaUltimoMedico() throws SQLException {
		 this.query = "SELECT * FROM medico ORDER BY idMedico DESC LIMIT 1";
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapMedico mapMedico = new MapMedico();
			return mapMedico.mapMedico(resultSet);
		} catch (Exception e) {
			return null;
		} finally {
			this.conexion.close();
		}
	}
	public Medico consultaMedicoId(int id) throws SQLException {
		 this.query = "SELECT * FROM medico WHERE idMedico = "+ id + ";";
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapMedico mapMedico = new MapMedico();
			return mapMedico.mapMedico(resultSet);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		} finally {
			this.conexion.close();
		}
	}
	
	public List<Medico> consultaMedicos() throws SQLException {
		 this.query = "Select * FROM Medico;";
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapMedico mapMedico = new MapMedico();
			return mapMedico.mapMedicos(resultSet);
		} catch (Exception e) {
			return null;
		} finally {
			this.conexion.close();
		}
	}
	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}

	/**
	 * @return the statement
	 */
	public Statement getStatement() {
		return statement;
	}

	/**
	 * @param statement
	 *            the statement to set
	 */
	public void setStatement(Statement statement) {
		this.statement = statement;
	}

	/**
	 * @return the query
	 */
	public String getQuery() {
		return query;
	}

	/**
	 * @param query
	 *            the query to set
	 */
	public void setQuery(String query) {
		this.query = query;
	}

}
