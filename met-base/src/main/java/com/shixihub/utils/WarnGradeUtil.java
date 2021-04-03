package com.shixihub.utils;

/**
 * @author LiShixi 2021/4/2 2:30 下午
 */
public class WarnGradeUtil {
    static String[] warnGradeArr = new String[]{"红色", "橙色", "黄色", "蓝色"};

    public static String of(Integer warnGrade) {
        if (warnGrade >= 1 && warnGrade <= 4) {
            return warnGradeArr[warnGrade - 1];
        } else {
            return String.valueOf(warnGrade);
        }
    }
}
