package br.com.caelum.vraptor.observers;

import javax.enterprise.event.Observes;
import javax.persistence.EntityManager;

import br.com.caelum.vraptor.dao.ProdutoDao;
import br.com.caelum.vraptor.dao.UsuarioDao;
import br.com.caelum.vraptor.events.VRaptorInitialized;
import br.com.caelum.vraptor.model.Produto;
import br.com.caelum.vraptor.model.Usuario;
import br.com.caelum.vraptor.util.JPAUtil;

public class InitialDataObserver {

	public void insert(@Observes VRaptorInitialized event) {
		
		EntityManager em = JPAUtil.criaEntityManager();
		em.getTransaction().begin();

		em.persist(new Usuario("admin", "123456"));

		em.persist(new Produto("Trator Jhon Deer", 140.800, 5));

		em.getTransaction().commit();
		em.close();
	}	
}