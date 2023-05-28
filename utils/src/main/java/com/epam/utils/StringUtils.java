package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        //here magic will happen
        try {
            return NumberUtils.createNumber(str).doubleValue() > 0;
        } catch (Exception e) {
            return false;
        }
    }
}
