package br.com.drogaria.teste;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

import br.com.drogaria.dao.ProdutoDAO;
import br.com.drograria.domain.Fabricante;
import br.com.drograria.domain.Produto;

public class ProdutoDAOTeste  {
	
	@Test
	@Ignore
	public void salvar() throws SQLException {
		Produto p = new Produto();
		p.setDescricao("Novalgina 10comprimidos");
		p.setPreco(2.45);
		p.setQuantidade(13L);
		
		Fabricante f = new Fabricante();
		f.setCodigo(32L);
		
		p.setFabricante_idfabricante(f);
		
		ProdutoDAO dao = new ProdutoDAO();
		dao.salvar(p);
	}
		
	@Test
	@Ignore
	public void listar() throws SQLException {
		ProdutoDAO dao = new ProdutoDAO();
		ArrayList<Produto> lista  = dao.listar();
		
		for (Produto p : lista) {
			System.out.println("Codigo: " + p.getIdProduto());
			System.out.println("Descricao " + p.getDescricao());
			System.out.println("Preço: " + p.getPreco());
			System.out.println("Quantidade: " + p.getQuantidade());
			System.out.println("Codigo Fabricante: " + p.getFabricante_idfabricante().getCodigo());
			System.out.println("Des Fabricante: " + p.getFabricante_idfabricante().getDescricao());
			
			System.out.println("---**********------------");
		}
	}
	
	@Test
	@Ignore
	public void excluir() throws SQLException {
		Produto p = new Produto();
		p.setIdProduto(1L);
		
		ProdutoDAO dao = new ProdutoDAO();
		
		dao.excluir(p);
	}
	
	@Test
	@Ignore
	public void editar() throws SQLException{
		Produto p = new Produto();
		p.setIdProduto(5L);
		
		p.setDescricao("Cataflan Pomada 60 Gramas");
		p.setPreco(15.30D);
		p.setQuantidade(7L);
		
//		Fabricante f = new Fabricante();
//		f.setCodigo(49L);
//		
//		p.setFabricante(f);
		
		ProdutoDAO dao = new ProdutoDAO();
		
		dao.editar(p);
	}
	
}
