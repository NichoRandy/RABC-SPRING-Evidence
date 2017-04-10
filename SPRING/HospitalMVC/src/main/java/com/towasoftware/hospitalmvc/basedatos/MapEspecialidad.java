package com.towasoftware.hospitalmvc.basedatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.towasoftware.hospitalmvc.model.Especialidad;


public class MapEspecialidad {
	
	public List<Especialidad> mapEspecialidad(ResultSet resultSet) throws SQLException {

		List<Especialidad> lista = new ArrayList<Especialidad>();
		while (resultSet.next()) {
			Especialidad especialidad = new Especialidad();
			especialidad.setIdEspecialidad(resultSet.getInt("idEspecialidad"));
			especialidad.setNombre(resultSet.getString("Nombre"));
			lista.add(especialidad);
		}
		return lista;
	}

}
