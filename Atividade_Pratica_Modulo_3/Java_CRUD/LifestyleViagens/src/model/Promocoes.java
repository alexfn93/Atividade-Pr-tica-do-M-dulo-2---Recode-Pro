package model;

public class Promocoes {
	
	private int idPromocoes;
	private String origem;
	private String destino;
	private String idaData;
	private String idaVolta;
	private String hotel;
	private String linhaArea;
	private double valor;
	private double desconto;
	private int clientes_idclientes;
	private int destino_iddestino;
	private int destino_clientes_idclientes;
	
	
	public int getIdPromocoes() {
		return idPromocoes;
	}
	public void setIdPromocoes(int idPromocoes) {
		this.idPromocoes = idPromocoes;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getIdaData() {
		return idaData;
	}
	public void setIdaData(String idaData) {
		this.idaData = idaData;
	}
	public String getIdaVolta() {
		return idaVolta;
	}
	public void setIdaVolta(String idaVolta) {
		this.idaVolta = idaVolta;
	}
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	public String getLinhaArea() {
		return linhaArea;
	}
	public void setLinhaArea(String linhaArea) {
		this.linhaArea = linhaArea;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}
	public int getClientes_idclientes() {
		return clientes_idclientes;
	}
	public void setClientes_idclientes(int clientes_idclientes) {
		this.clientes_idclientes = clientes_idclientes;
	}
	public int getDestino_iddestino() {
		return destino_iddestino;
	}
	public void setDestino_iddestino(int destino_iddestino) {
		this.destino_iddestino = destino_iddestino;
	}
	public int getDestino_clientes_idclientes() {
		return destino_clientes_idclientes;
	}
	public void setDestino_clientes_idclientes(int destino_clientes_idclientes) {
		this.destino_clientes_idclientes = destino_clientes_idclientes;
	}
	
	@Override
	public String toString() {
		return "Promocoes [idPromocoes=" + idPromocoes + ", origem=" + origem + ", destino=" + destino + ", idaData="
				+ idaData + ", idaVolta=" + idaVolta + ", hotel=" + hotel + ", linhaArea=" + linhaArea + ", valor="
				+ valor + ", desconto=" + desconto + ", clientes_idclientes=" + clientes_idclientes
				+ ", destino_iddestino=" + destino_iddestino + ", destino_clientes_idclientes="
				+ destino_clientes_idclientes + "]";
	}
	


}