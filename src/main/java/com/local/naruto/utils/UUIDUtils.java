package com.local.naruto.utils;

import java.util.UUID;

public class UUIDUtils {
    public static String generateUuid() {
        String uuid = UUID.randomUUID().toString();
        return uuid.replace("-", "");
    }
}
