package br.com.caelum.vraptor.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.model.Produto;

public class ProdutoDao {

	private final EntityManager em;

	public ProdutoDao(final EntityManager em) {
		this.em = em;
	}
	
	public void adiciona(final Produto produto) {
		em.persist(produto);
	}

	public void remove(final Produto produto) {
		em.remove(busca(produto));
	}

	public Produto busca(final Produto produto) {
		return em.find(Produto.class, produto.getId());
	}

	@SuppressWarnings("unchecked")
	public List<Produto> lista() {
		return em.createQuery("select p from Produto p").getResultList();
	}
}