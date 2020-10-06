package com.lyl.util;

/**
 * @PACKAGE_NAME: com.lyl.util
 * @ClassName: StringUtil
 * @Description:
 * @Date: 2020-10-04 21:08
 * @Author: liyl@gmrz-bj.com
 **/
public class StringUtil {

    public static void test1(String str){
        if (str == null || "".equals(str)){
            return;
        }
        int[] arrays1 = new int[Integer.valueOf(str)];
        for (int i = 0; i < Integer.valueOf(str); i++){
            arrays1[i] = i;
        }
    }


    public static void test2(String str){
        if (str == null || "".equals(str)){
            return;
        }

        boolean flag = false;
        int i = 0;

        while (!flag){
            i++;
            // 此处应该是 i = Integer.valueOf(str)
            if (i == Integer.valueOf(str) * Integer.valueOf(str)){
                flag = true;
            }
        }
    }
}
