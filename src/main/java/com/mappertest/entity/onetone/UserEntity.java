package com.mappertest.entity.onetone;

import lombok.Data;

@Data
public class UserEntity {

    private long id;

    private String name;

    private CartEntity cart;

}
