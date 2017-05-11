package br.com.example.model;

import java.time.LocalDate;

public class ItemToSortBuilder {

	private int id = -1;
	private LocalDate data = LocalDate.now();
	private ItemToSortTipo tipo = ItemToSortTipo.UM;

	public ItemToSortBuilder() {}

	public ItemToSortBuilder comId(int id) {
		this.id = id;
		return this;
	}

	public ItemToSortBuilder comData(LocalDate data) {
		this.data = data;
		return this;
	}

	public ItemToSortBuilder comTipo(ItemToSortTipo tipo) {
		this.tipo = tipo;
		return this;
	}

	public ItemToSort build() {
		return new ItemToSort(id, data, tipo);
	}

}
