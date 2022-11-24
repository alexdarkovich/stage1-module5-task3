package com.epam.mjc;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        return list.stream()
                .filter(x -> x % 2 == 0).
                collect(Collectors.toList());
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        return list.stream()
                .map(x -> x.toUpperCase())
                .collect(Collectors.toList());
    }

    public Optional<Integer> findMax(List<Integer> list) {
        return Optional.of(list.stream()
                .mapToInt(Integer::intValue)
                .max()
                .getAsInt());
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        return Optional.of(list.stream()
                .flatMap(lists -> lists.stream())
                .mapToInt(Integer::intValue)
                .min()
                .getAsInt());
    }

    public Integer sum(List<Integer> list) {
        return list.stream()
                .mapToInt(Integer::intValue)
                .reduce(0,(x, y) -> x + y);
    }
}
