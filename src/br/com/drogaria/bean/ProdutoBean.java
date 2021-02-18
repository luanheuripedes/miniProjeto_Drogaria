package br.com.drogaria.bean;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.drogaria.dao.FabricanteDAO;
import br.com.drogaria.dao.ProdutoDAO;
import br.com.drogaria.util.JSFUtil;
import br.com.drograria.domain.Fabricante;
import br.com.drograria.domain.Produto;

@ManagedBean(name= "MBProduto")
@ViewScoped
public class ProdutoBean {
	//varios produtos consulta geral
	private ArrayList<Produto> itens;
	
	//Consulta Filtrada
	private ArrayList<Produto> itesFiltrados;
	
	//Atributo para guardar os dados do Produto(inclusao)
	private Produto produto;
	
	//Listar Fabricantes
	private ArrayList<Fabricante> comboFabricante;
	

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public ArrayList<Fabricante> getComboFabricante() {
		return comboFabricante;
	}

	public void setComboFabricante(ArrayList<Fabricante> comboFabricante) {
		this.comboFabricante = comboFabricante;
	}

	public ArrayList<Produto> getItesFiltrados() {
		return itesFiltrados;
	}

	public void setItesFiltrados(ArrayList<Produto> itesFiltrados) {
		this.itesFiltrados = itesFiltrados;
	}

	public ArrayList<Produto> getItens() {
		return itens;
	}

	public void setItens(ArrayList<Produto> itens) {
		this.itens = itens;
	}
	
	public void carregarListagem() {
		try {
			ProdutoDAO dao = new ProdutoDAO();
			itens = dao.listar();
		} catch (SQLException ex) {
			ex.printStackTrace();
			JSFUtil.adicionarMensagemErro(ex.getMessage());
		}
	}
	
	public void prepararNovo() {
		
		try {
			produto = new Produto();
			FabricanteDAO dao = new FabricanteDAO();
			comboFabricante = dao.listarFabricantes();
		} catch (SQLException ex) {
			ex.printStackTrace();
			JSFUtil.adicionarMensagemErro(ex.getMessage());
		}
	}
	
	public void novo() {
		try {
			ProdutoDAO dao = new ProdutoDAO();
			dao.salvar(produto);
			itens = dao.listar();
			JSFUtil.adicionarMensagemSucesso("Adicionado com Sucesso");
		}catch(SQLException ex) {
			ex.printStackTrace();
			JSFUtil.adicionarMensagemErro(ex.getMessage());
		}
	}
	
	public void excluir() {
		try {
			ProdutoDAO dao = new ProdutoDAO();
			
			dao.excluir(produto);
			
			itens = dao.listar();
			JSFUtil.adicionarMensagemSucesso("Excluido com Sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
			JSFUtil.adicionarMensagemErro(e.getMessage());
		}
	}
	
	public void prepararEditar() {
		try {
			FabricanteDAO dao = new FabricanteDAO();
			
			comboFabricante = dao.listarFabricantes();
		} catch (SQLException e) {
			e.printStackTrace();
			JSFUtil.adicionarMensagemErro(e.getMessage());
		}
	}
	
	public void editar() {
		try {
			ProdutoDAO dao = new ProdutoDAO();
			
			dao.editar(produto);
			
			itens = dao.listar();
			
			JSFUtil.adicionarMensagemSucesso("Editado com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
			JSFUtil.adicionarMensagemErro(e.getMessage());
		}
	}
	
}
