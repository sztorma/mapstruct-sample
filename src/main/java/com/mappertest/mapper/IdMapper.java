package com.mappertest.mapper;

import org.mapstruct.Named;

public class IdMapper {

    @Named(value = "encrypt")
    public String encryptId(long id) {
        String result = "ID" + String.valueOf(id);
        return result;
    }

    @Named(value = "decrypt")
    public long decryptId(String id) {
        if (id == null) {
            return 0;
        }
        return Long.valueOf(id.substring(2));
    }
}
