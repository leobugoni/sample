package br.com.caelum.vraptor.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;

import javax.inject.Inject;

@Controller
public class UsuarioController {

	@Inject
	private Result result;

	@Get("/login")
	public void login() {
		result.include("login", "Fazer Login Aqui");
	}
}
