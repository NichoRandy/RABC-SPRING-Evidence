/**
 * 
 */
package com.towasoftware.hospitalmvc.basedatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.towasoftware.hospitalmvc.model.Cita;


public class MapCitas {

	public List<Cita> mapCitas(ResultSet resultSet) throws SQLException {

		List<Cita> lista = new ArrayList<Cita>();
		while (resultSet.next()) {
			
			lista.add(maper(resultSet));
		}
		return lista;
	}
	
	public Cita mapCita(ResultSet resultSet) throws SQLException {
			
			if (!resultSet.next())
			{return null;}
			return maper(resultSet);
			
	}
	
	public Cita maper(ResultSet resultSet) throws SQLException
	{
		Cita cita = new Cita();
		cita.setIdCita(resultSet.getInt("idCita"));
		cita.setFecha(resultSet.getString("fecha"));
		cita.setHora(resultSet.getString("hora"));
		cita.setIdPaciente(resultSet.getInt("idPaciente"));
		cita.setIdMedico(resultSet.getInt("idMedico"));
		cita.setIdConsultorio(resultSet.getInt("idConsultorio"));
		cita.setIdEspecialidad(resultSet.getInt("idEspecialidad"));
	
		return cita;
	}
}
