package br.com.tech.stream;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class StreamDemo {

    public static final Random RANDOM = ThreadLocalRandom.current();

    public static void main(String[] args) {
        final var list = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++) {
            list.add(RANDOM.nextInt(100, 10000));
        }

//        IntStream.range(0, 100)
//                .mapToObj(i -> RANDOM.nextInt(100, 10000))
//                .forEach(list::add);

//        for (var n : list) {
//            if (n < 1000) {
//                System.out.println(n);
//            }
//        }

        list.stream()
                .filter(i -> i < 1000)
                .map(i -> i + 2)
                .forEach(System.out::println);

        var total = list.stream()
                .filter(i -> i >= 5000)
                .map(BigDecimal::valueOf)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println(total);

        var quantidade = list.stream()
                .filter(i -> i >= 5000)
                .count();

        System.out.println(quantidade);


    }
}
