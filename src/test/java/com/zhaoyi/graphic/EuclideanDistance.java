package com.zhaoyi.graphic;

import java.util.List;

/**
 * 欧式距离计算
 */
public class EuclideanDistance {
    public static double caculate(List<Double> p1, List<Double> p2){
        double sum = 0.0;
        int length = p1.size();
        for (int i = 0; i < length; i++) {
            sum += Math.pow(p1.get(i) - p2.get(i),2.0);
        }
        return Math.sqrt(sum);
    }
}
