package com.towasoftware.hospitalmvc.basedatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	private Connection conexion;
	private Statement statement;
	private String query;

	public Delete()
	{
		this.conexion = new Conexion().getConnection();
	}

	public Boolean deletePaciente(int id) throws SQLException {
		this.setQuery("DELETE from `Paciente` WHERE idPaciente = " + id + ";");
		try {
			this.statement = this.conexion.createStatement();

			this.statement.executeUpdate(this.query);
			return true;
			
		} catch (Exception e) {
			System.out.println(e);
			return false;
		} finally {
			this.conexion.close();
		}
	}
	public Boolean deleteConsultorio(int id) throws SQLException {
		this.setQuery("DELETE from `consultorio` WHERE idConsultorio = " + id + ";");
		try {
			this.statement = this.conexion.createStatement();

			this.statement.executeUpdate(this.query);
			return true;
			
		} catch (Exception e) {
			System.out.println(e);
			return false;
		} finally {
			this.conexion.close();
		}
	}
	public Boolean deleteDepartamento(int id) throws SQLException {
		this.setQuery("DELETE from `consultorio` WHERE idDepartamento = " + id + ";");
		try {
			this.statement = this.conexion.createStatement();

			this.statement.executeUpdate(this.query);
			return true;
			
		} catch (Exception e) {
			System.out.println(e);
			return false;
		} finally {
			this.conexion.close();
		}
	}
	
	public Boolean deleteCita(int id) throws SQLException {
		this.setQuery("DELETE from `cita` WHERE idcita = " + id + ";");
		try {
			this.statement = this.conexion.createStatement();

			this.statement.executeUpdate(this.query);
			return true;
			
		} catch (Exception e) {
			System.out.println(e);
			return false;
		} finally {
			this.conexion.close();
		}
	}
	
	public Boolean deleteMedico(int id) throws SQLException {
		this.setQuery("DELETE from `Medico` WHERE idMedico = " + id + ";");
		try {
			this.statement = this.conexion.createStatement();

			this.statement.executeUpdate(this.query);
			return true;
			
		} catch (Exception e) {
			System.out.println(e);
			return false;
		} finally {
			this.conexion.close();
		}
	}
	/**
	 * @return the conexion
	 */
	public Connection getConexion() {
		return conexion;
	}
	/**
	 * @param conexion the conexion to set
	 */
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
	 * @param statement the statement to set
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
	 * @param query the query to set
	 */
	public void setQuery(String query) {
		this.query = query;
	}
}
