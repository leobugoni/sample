package br.com.caelum.vraptor.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;

import javax.inject.Inject;

@Controller
public class ProdutoController {

	@Inject
	private Result result;

	@Get("/inicio")
	public void inicio() {
		result.include("hello", "Hello World");
	}
}
