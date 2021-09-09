package com.github.anacarolcosta.shoppingcart.repository;

import com.github.anacarolcosta.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {
}
