package com.company.com.java.java820190125.lambdas;

import com.company.com.java.java820190125.lambdas.Bean.Apple;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Test0128 {
    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> results = new ArrayList<>();
        for (T s : list) {
            if (p.test(s)) {
                results.add(s);
            }
        }
        return results;
    }


//    public static <T, R> List<R> map(List<T> list,
//                                     Function<T, R> f) {
//        List<R> result = new ArrayList<>();
//        for (T s : list) {
//            result.add(f.apply(s));
//        }
//        return result;
//    }

    public static void main(String[] args) {
//        Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();
//        List<String> listOfStrings= Arrays.asList("abc","","bbb");
//        List<String> nonEmpty = filter(listOfStrings, nonEmptyStringPredicate);
//        System.out.println(nonEmpty.size());

//        List<Integer> l = map(
//                Arrays.asList("lambdas", "in", "action"),
//                (String s) -> s.length()
//
//        );
//        for (Integer i :
//                l) {
//            System.out.println("out...." + i);
//        }
//
//        System.out.println("------------------");
//        l.stream().forEach(integer -> System.out.println(integer));

//        Supplier<Apple> c1= Apple::new;
//        Apple apple = c1.get();

//        Supplier<Apple> c1= () -> new Apple();
//        Apple apple = c1.get();

        /*Function<Integer, Apple> c2 = Apple::new;
        Apple a2 = c2.apply(110);*/


//        Function<Integer, Apple> c2 = (weight) -> new Apple(weight);
//        Apple a2 = c2.apply(110);

//        Function<Integer,Apple> c2 =(weight) -> new Apple(weight);
//       Apple a1 = c2.apply(11);
//        Integer integer = a1.getWeight();
//        System.out.println("int"+integer);

//


//        BiFunction<String, Integer, Apple> c3 = Apple::new;
//        Apple greenApple = c3.apply("green", 110);
//        BiFunction <String,Integer,Apple> c3 = (color, weight) -> new Apple(color, weight);
//       Apple c33= c3.apply("green",100);
        Comparator<Apple> c = Comparator.comparing(Apple::getWeight);
//        List inventory = new ArrayList();
//        inventory.sort(comparing(Apple::getWeight)
//                .reversed()
//                .thenComparing(Apple::getCountry));
//
//    }
//    public static List<Apple> map(List<Integer> list,
//                                  Function<Integer, Apple> f){
//        List<Apple> result = new ArrayList<>();
//        for(Integer e: list){
//            result.add(f.apply(e));
//        }
//        return result;
//    }
    }
}
