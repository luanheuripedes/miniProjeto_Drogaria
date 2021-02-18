package br.com.drograria.domain;

public class Produto {
	private Long idProduto;
	private String descricao;
	private Long quantidade;
	private Double preco;
	private Fabricante fabricante_idfabricante;
	
	
	public Produto() {
		fabricante_idfabricante = new Fabricante();
	}
	
	public Long getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Long getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Fabricante getFabricante_idfabricante() {
		return fabricante_idfabricante;
	}
	public void setFabricante_idfabricante(Fabricante fabricante_idfabricante) {
		this.fabricante_idfabricante = fabricante_idfabricante;
	}
	
	
	
	
}
