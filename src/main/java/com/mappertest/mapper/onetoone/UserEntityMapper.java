package com.mappertest.mapper.onetoone;

import com.mappertest.bo.onetone.User;
import com.mappertest.entity.onetone.UserEntity;
import com.mappertest.mapper.CycleAvoidingMappingContext;
import com.mappertest.mapper.IdMapper;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {IdMapper.class, CartEntityMapper.class})
public interface UserEntityMapper {
    
    UserEntityMapper INSTANCE = Mappers.getMapper(UserEntityMapper.class);

    @Mapping(target = "id", qualifiedByName = "encrypt")
    //@Mapping(target = "cart", expression = "java(null)")
    User entityToBo(UserEntity entity, @Context CycleAvoidingMappingContext context);
    
    @Mapping(target = "id", qualifiedByName = "decrypt")
    //@Mapping(target = "cart", expression = "java(null)")
    UserEntity boToEntity(User bo, @Context CycleAvoidingMappingContext context);
}
