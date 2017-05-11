package br.com.example.sort;

import br.com.example.model.ItemToSort;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public final class SortFunctions {

    public static ItemToSort getMaxItemDate(final List<ItemToSort> valores) {
        Objects.isNull(valores);
        final Optional<ItemToSort> optional = getMax(valores);
        if (optional.isPresent()) {
            return optional.get();
        }
        throw new IllegalArgumentException("Return list is empty");
    }

    private static Optional<ItemToSort> getMax(List<ItemToSort> valores) {
        return valores.stream().max(Comparator.comparing((ItemToSort::getData)));
    }

    private SortFunctions() {
    }

}
