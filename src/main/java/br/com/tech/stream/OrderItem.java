package br.com.tech.stream;

import java.math.BigDecimal;

public class OrderItem {

    private final int productId;
    private final int quantity;
    private final BigDecimal price;

    public OrderItem(int productId, int quantity, BigDecimal price) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    public BigDecimal total(){
        return price.multiply(BigDecimal.valueOf(quantity));
    }
}
