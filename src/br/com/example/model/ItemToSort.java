package br.com.example.model;

import java.time.LocalDate;

public class ItemToSort {

	private int id;
	private LocalDate data;
	private String tipo;

	public ItemToSort(int id, LocalDate data, String tipo) {
		this.id = id;
		this.data = data;
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return this.id +" - "+this.tipo+"- "+this.data;
	}

}
