package br.com.example;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.example.builder.ItemToSortBuilder;
import br.com.example.model.ItemToSort;
import br.com.example.sort.SortFunctions;

public class LambdaSortTest {

	@Test
	public void test() {
		List<ItemToSort> valores = new ArrayList<>();

		ItemToSort item1 = new ItemToSortBuilder().build();
		ItemToSort item2 = new ItemToSortBuilder().comId(2).comTipo("2").comData(LocalDate.now().minusDays(2)).build();
		ItemToSort item3 = new ItemToSortBuilder().comId(3).comTipo("3").comData(LocalDate.now().plusDays(2)).build();
		ItemToSort item4 = new ItemToSortBuilder().comId(4).comTipo("2").comData(LocalDate.now().minusDays(12)).build();

		valores.add(item1);
		valores.add(item2);
		valores.add(item3);
		valores.add(item4);

		assertEquals(item3.getId(), new SortFunctions().getMaxItemDate(valores).getId());

	}

}
