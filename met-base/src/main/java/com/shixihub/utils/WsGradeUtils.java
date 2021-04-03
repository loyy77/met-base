package com.shixihub.utils;

/**
 * @author LiShixi 2021/3/25 10:57 上午
 */
public class WsGradeUtils {
    static String[] wsGradeArr = new String[]{"",
            "一级",
            "二级",
            "三级",
            "四级",
            "五级",
            "六级",
            "七级",
            "八级",
            "九级",
            "十级",
            "十一级",
            "十二级",
            "十三级",
            "十四级",
            "十五级",
            "十六级",
            "十七级",
            "十八级",
            "十九级"
    };

    public static String of(int wsGrade) {
        if (wsGrade > 0 && wsGrade < wsGradeArr.length) {
            return wsGradeArr[wsGrade];
        } else {
            return wsGrade + "级";
        }

    }
}
