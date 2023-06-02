package com.spring.basecurd.Utils;

import java.util.UUID;

public class UuidUtils {
    public static String generateUUID() {
        return UUID.randomUUID().toString();
    }

}
