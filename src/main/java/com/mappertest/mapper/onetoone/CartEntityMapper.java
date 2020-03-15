package com.mappertest.mapper.onetoone;

import com.mappertest.bo.onetone.Cart;
import com.mappertest.entity.onetone.CartEntity;
import com.mappertest.mapper.IdMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {IdMapper.class, UserEntityMapper.class})
public interface CartEntityMapper {

    CartEntityMapper INSTANCE = Mappers.getMapper(CartEntityMapper.class);
    
    @Mapping(target = "id", qualifiedByName = "encrypt")
    @Mapping(target = "user", expression = "java(null)")
    Cart entityToBo(CartEntity entity);

    @Mapping(target = "id", qualifiedByName = "decrypt")
    @Mapping(target = "user", expression = "java(null)")
    CartEntity boToEntity(Cart bo);
}
