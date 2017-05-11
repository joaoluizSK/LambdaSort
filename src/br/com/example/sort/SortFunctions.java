package br.com.example.sort;

import java.util.List;

import br.com.example.model.ItemToSort;

public class SortFunctions {

	public ItemToSort getMaxItemDate(List<ItemToSort> valores) {
		return valores.stream().max((item1, item2) -> item1.getData().compareTo(item2.getData())).get();
	}
}
