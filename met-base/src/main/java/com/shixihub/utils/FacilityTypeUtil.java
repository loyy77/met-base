package com.shixihub.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LiShixi 2021/4/2 2:32 下午
 */
public class FacilityTypeUtil {
    public static Map<String, String> facilityTypeMap = new HashMap<>();

    static {
        facilityTypeMap.put("substation", "变电站");
    }

    public static String of(String key) {
        return facilityTypeMap.getOrDefault(key, key);
    }

}
