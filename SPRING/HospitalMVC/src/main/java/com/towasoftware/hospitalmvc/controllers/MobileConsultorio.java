package com.towasoftware.hospitalmvc.controllers;

import java.sql.SQLException;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.towasoftware.hospitalmvc.basedatos.Consulta;
import com.towasoftware.hospitalmvc.basedatos.Delete;
import com.towasoftware.hospitalmvc.basedatos.Insert;
import com.towasoftware.hospitalmvc.basedatos.Update;
import com.towasoftware.hospitalmvc.model.Consultorio;

@Controller
@RequestMapping(value = "/mobile/consultorio", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class MobileConsultorio {

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Consultorio createUser(@RequestBody Consultorio consultorio) throws SQLException {

		Insert i = new Insert();
		i.InsertarConsultorio(consultorio);
		Consulta c = new Consulta();
		consultorio = c.consultaUltimaConsultorio();
		return consultorio;

	}

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Consultorio> getAllUsers() throws SQLException {

		Consulta c = new Consulta();
		List<Consultorio> lstCitas = c.consultaConsultorios();

		return lstCitas;

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody Consultorio getCitaById(@PathVariable Integer id) throws SQLException {

		Consultorio cita = null;

		Consulta c = new Consulta();

		cita = c.consultaConsultorioId(id);

		return cita;

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public @ResponseBody Consultorio updateUser(@RequestBody Consultorio cita, @PathVariable Integer id)
			throws SQLException {

		Update u = new Update();
		u.updateConsultorio(cita, id);

		Consulta c = new Consulta();
		cita = c.consultaConsultorioId(id);
		return cita;

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public @ResponseBody Boolean deleteUser(@PathVariable Integer id) throws SQLException {

		Delete d = new Delete();
		if (d.deleteConsultorio(id))
			{return true;}
		else
			{return false;}

	}
}
