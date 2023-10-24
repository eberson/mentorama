package br.com.tech.stream;

import java.math.BigDecimal;
import java.util.List;

public class OrderTotalDemo {
    public static void main(String[] args) {
        var items = List.of(
                new OrderItem(1, 2, BigDecimal.valueOf(2.50)),
                new OrderItem(2, 3, BigDecimal.valueOf(3.45)),
                new OrderItem(3, 4, BigDecimal.valueOf(4.40)),
                new OrderItem(4, 5, BigDecimal.valueOf(5.35)),
                new OrderItem(5, 6, BigDecimal.valueOf(6.30))
        );

//        var total = BigDecimal.ZERO;
//
//        for (var item : items) {
//            total = total.add(item.total());
//        }
//
//        System.out.println("total: " + total);

        var total = items.stream()
                .map(OrderItem::total)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println("total: " + total);

    }
}
