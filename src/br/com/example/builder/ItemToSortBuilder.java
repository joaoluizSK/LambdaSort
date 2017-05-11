package br.com.example.builder;

import java.time.LocalDate;

import br.com.example.model.ItemToSort;

public class ItemToSortBuilder {

	private int id = -1;
	private LocalDate data = LocalDate.now();
	private String tipo = "1";

	public ItemToSortBuilder() {

	}

	public ItemToSortBuilder comId(int id) {
		this.id = id;
		return this;
	}

	public ItemToSortBuilder comData(LocalDate data) {
		this.data = data;
		return this;
	}

	public ItemToSortBuilder comTipo(String tipo) {
		this.tipo = tipo;
		return this;
	}

	public ItemToSort build() {
		return new ItemToSort(id, data, tipo);
	}

}
