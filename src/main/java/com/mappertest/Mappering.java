package com.mappertest;

import com.mappertest.bo.onetone.Cart;
import com.mappertest.bo.onetone.User;
import com.mappertest.entity.onetone.CartEntity;
import com.mappertest.mapper.CycleAvoidingMappingContext;
import com.mappertest.mapper.onetoone.CartEntityMapper;

public class Mappering {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("hello world");
        Cart cart = new Cart();
        User user = new User();
        
        user.setId("ID" + 2);
        user.setName("John Doe");
        user.setCart(cart);
        
        cart.setId("ID" + 1);
        cart.setUser(user);
        
        CartEntity entity = CartEntityMapper.INSTANCE.boToEntity(cart, new CycleAvoidingMappingContext());
    }

}
