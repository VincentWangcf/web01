package com.company.com.java.java820190125.lambdas;

import com.company.com.java.java820190125.lambdas.Bean.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TestDish {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH) );
            /* List<String> lowCaloricDishesName =
                menu.stream()
                        .filter(d -> d.getCalories() > 400)
                        .sorted(comparing(Dish::getCalories).reversed())
                        .map(Dish::getName)
                        .collect(toList());
        lowCaloricDishesName.stream().forEach(s -> System.out.println(s));*/
//
        Optional<Dish> any = menu.stream()
                .filter(d->d.getName().equals(""))

                .findAny();
//        System.out.println(any.get().getName());
        System.out.println(any);
//                .ifPresent(d -> System.out.println(d.getName()));

    }
}
