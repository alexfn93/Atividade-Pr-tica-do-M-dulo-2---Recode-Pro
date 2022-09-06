package model;

public class Destino {
	
	private int iddestino;
	private String origem;
	private String destino;
	private String idaData;
	private String voltaData;
	private String hotel;
	private String linhaArea;
	private double valor;
	private int clientes_idclientes;
	
	
	public int getIddestino() {
		return iddestino;
	}
	public void setIddestino(int iddestino) {
		this.iddestino = iddestino;
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
	public String getVoltaData() {
		return voltaData;
	}
	public void setVoltaData(String voltaData) {
		this.voltaData = voltaData;
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
	public int getClientes_idclientes() {
		return clientes_idclientes;
	}
	public void setClientes_idclientes(int clientes_idclientes) {
		this.clientes_idclientes = clientes_idclientes;
	}
	
	@Override
	public String toString() {
		return "Destino [iddestino=" + iddestino + ", origem=" + origem + ", destino=" + destino + ", idaData="
				+ idaData + ", voltaData=" + voltaData + ", hotel=" + hotel + ", linhaArea=" + linhaArea + ", valor="
				+ valor + ", clientes_idclientes=" + clientes_idclientes + "]";
	}
	
	

}
