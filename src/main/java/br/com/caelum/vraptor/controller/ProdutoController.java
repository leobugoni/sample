package br.com.caelum.vraptor.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.dao.ProdutoDao;
import br.com.caelum.vraptor.model.Produto;
import br.com.caelum.vraptor.util.JPAUtil;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@Controller
public class ProdutoController {

	@Inject
	private Result result;

	@Path("/")
	public void inicio() {
		result.include("hello", "Hello World");
	}

	@Path("/produto/lista")
	public List<Produto> lista() {
		final EntityManager em = JPAUtil.criaEntityManager();
		final ProdutoDao dao = new ProdutoDao(em);
		return dao.lista();
	}

	@Path("/produto/novo")
	public List<Produto> novo() {
		final EntityManager em = JPAUtil.criaEntityManager();
		final ProdutoDao dao = new ProdutoDao(em);
		return dao.lista();
	}

	@Path("/produto/criar")
	public void criar(final Produto produto){
		final EntityManager em = JPAUtil.criaEntityManager();
		final ProdutoDao dao = new ProdutoDao(em);
		em.getTransaction().begin();
		dao.adiciona(produto);
		em.getTransaction().commit();
	}


}
