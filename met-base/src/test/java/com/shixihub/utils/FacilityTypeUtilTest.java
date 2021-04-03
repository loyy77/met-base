package com.shixihub.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author LiShixi 2021/4/3 8:42 下午
 */
class FacilityTypeUtilTest {

    @Test
    void of() {
        assertEquals("变电站",FacilityTypeUtil.of("substation"));
        assertEquals("misskey",FacilityTypeUtil.of("misskey"));
    }
}
