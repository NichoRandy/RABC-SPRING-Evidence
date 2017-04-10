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
import com.towasoftware.hospitalmvc.model.Cita;

@Controller
@RequestMapping(value = "/mobile/cita", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class MobileCita {

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Cita createUser(@RequestBody Cita cita) throws SQLException {

		Insert i = new Insert();
		i.InsertarCita(cita);
		Consulta c = new Consulta();
		cita = c.consultaUltimaCita();
		return cita;

	}

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Cita> getAllUsers() throws SQLException {

		Consulta c = new Consulta();
		List<Cita> lstCitas = c.consultaCitas();

		return lstCitas;

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody Cita getCitaById(@PathVariable Integer id) throws SQLException {

		Cita cita = null;

		Consulta c = new Consulta();

		cita = c.consultaCitaId(id);

		return cita;

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public @ResponseBody Cita updateUser(@RequestBody Cita cita, @PathVariable Integer id)
			throws SQLException {

		Update u = new Update();
		u.updateCita(cita, id);

		Consulta c = new Consulta();
		cita = c.consultaCitaId(id);
		return cita;

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public @ResponseBody Boolean deleteUser(@PathVariable Integer id) throws SQLException {

		Delete d = new Delete();
		if (d.deleteCita(id))
			{return true;}
		else
			{return false;}

	}
}
