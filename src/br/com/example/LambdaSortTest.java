package br.com.example;

import br.com.example.model.ItemToSort;
import br.com.example.model.ItemToSortBuilder;
import br.com.example.model.ItemToSortTipo;
import br.com.example.sort.SortFunctions;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class LambdaSortTest {

    @Test
    public void testOrderning() {
        ItemToSort item = new ItemToSortBuilder().comId(3).comTipo(ItemToSortTipo.TRES).comData(LocalDate.now().plusDays(2)).build();
        assertEquals(item.getId(), SortFunctions.getMaxItemDate(Arrays.asList(
                item,
                new ItemToSortBuilder().build(),
                new ItemToSortBuilder().comId(2).comTipo(ItemToSortTipo.DOIS).comData(LocalDate.now().minusDays(2)).build(),
                new ItemToSortBuilder().comId(4).comTipo(ItemToSortTipo.DOIS).comData(LocalDate.now().minusDays(12)).build()
        )).getId());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyList() {
        SortFunctions.getMaxItemDate(new ArrayList<>());
    }

    @Test(expected = NullPointerException.class)
    public void testNullList() {
        SortFunctions.getMaxItemDate(null);
    }

}
