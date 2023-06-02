package com.spring.basecurd.Utils;

import lombok.Getter;

import java.time.format.DateTimeFormatter;

@Getter
public class DateTimeFormatUtils {
    public static DateTimeFormatter FORMAT_DEFAULT;

    static {
        FORMAT_DEFAULT = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    }
}
