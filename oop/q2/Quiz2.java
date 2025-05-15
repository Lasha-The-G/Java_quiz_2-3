package oop.q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  this is a program that puts strings from the list2 into the list3
 *  based on simple algorithmic calculation of values in list1
 */
public class Quiz2 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(8, 7, 6, 5, 5, 3, 5, 6, 9, 9, 7, 5, 6));

        List<String> list2 = new ArrayList<>(Arrays.asList("jzc", "rNL", "voI", "cvnSX", "EeS", "Ydc", "Vxf", "ItbM",
                "L5w9z", "8Vz", "Kt9", "LdtT", "rpz", "1nzF", "m0j", "lv3",
                "vlO", "IaPs"));
        List<String> list3 = new ArrayList<>();
        for (Integer num: list1){
            list3.add(list2.get(num*2-1));
        }
        for (String str: list3){
            System.out.println(str);
        }
    }
}
