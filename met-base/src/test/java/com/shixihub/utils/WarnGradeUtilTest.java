package com.shixihub.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author LiShixi 2021/4/3 8:51 下午
 */
class WarnGradeUtilTest {

    @Test
    void of() {
        assertEquals("红色",WarnGradeUtil.of(1));
        assertEquals("橙色",WarnGradeUtil.of(2));
        assertEquals("黄色",WarnGradeUtil.of(3));
        assertEquals("蓝色",WarnGradeUtil.of(4));
        assertEquals("-1",WarnGradeUtil.of(-1));
    }
}
