package br.com.example.model;

import java.time.LocalDate;

public class ItemToSort {

	private int id;
	private LocalDate data;
	private ItemToSortTipo tipo;

	ItemToSort(int id, LocalDate data, ItemToSortTipo tipo) {
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

	public ItemToSortTipo getTipo() {
		return tipo;
	}

	public void setTipo(ItemToSortTipo tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return this.id +" - "+this.tipo+"- "+this.data;
	}

}
