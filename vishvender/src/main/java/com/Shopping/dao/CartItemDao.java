package com.Shopping.dao;

import com.Shopping.model.Cart;
import com.Shopping.model.CartItem;

public interface CartItemDao 
{
	void addCartItem(CartItem cartItem);

void removeCartItem(CartItem cartItem);

void removeAllCartItems(Cart cart);

CartItem getCartItemByProductId(int productId);
}
