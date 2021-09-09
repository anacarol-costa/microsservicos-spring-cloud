package com.github.anacarolcosta.shoppingcart.model;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("item")
public class Item {

    private Integer productId;
    private Integer amount;

    public Item(Integer productId, Integer amount) {
        this.productId = productId;
        this.amount = amount;
    }

    public Integer getAmount() {
        return amount;
    }
}
