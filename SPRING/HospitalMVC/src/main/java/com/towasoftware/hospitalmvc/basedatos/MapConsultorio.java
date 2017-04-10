/**
 * 
 */
package com.towasoftware.hospitalmvc.basedatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.towasoftware.hospitalmvc.model.Consultorio;


public class MapConsultorio {

	public List<Consultorio> mapConsultorios(ResultSet resultSet) throws SQLException {

		List<Consultorio> lista = new ArrayList<Consultorio>();
		while (resultSet.next()) {
			
			lista.add(maper(resultSet));
		}
		return lista;
	}
	
	public Consultorio mapConsultorio(ResultSet resultSet) throws SQLException {
			
			if (!resultSet.next())
			{return null;}
			return maper(resultSet);
			
	}
	
	public Consultorio maper(ResultSet resultSet) throws SQLException
	{
		Consultorio consultorio = new Consultorio();
		consultorio.setIdConsultorio(resultSet.getInt("idConsultorio"));
		consultorio.setIdHospital(resultSet.getInt("idHospital"));
		consultorio.setIdEspecialidad(resultSet.getInt("idEspecialidad"));
		consultorio.setIdMedico(resultSet.getInt("idMedico"));
	
	
		return consultorio;
	}
}
