package com.shixihub.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author LiShixi 2021/4/3 8:53 下午
 */
class WsGradeUtilsTest {

    @Test
    void getWsGradeStr() {
        assertEquals("一级", WsGradeUtils.of(1));
        assertEquals("二级", WsGradeUtils.of(2));
        assertEquals("三级", WsGradeUtils.of(3));
        assertEquals("四级", WsGradeUtils.of(4));
        assertEquals("五级", WsGradeUtils.of(5));
        assertEquals("六级", WsGradeUtils.of(6));

        // 测试匹配不上时，仅追加"级"字
        assertEquals("0级", WsGradeUtils.of(0));
        assertEquals("-1级", WsGradeUtils.of(-1));
    }
}
