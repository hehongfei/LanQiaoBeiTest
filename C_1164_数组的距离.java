package C语言网;

import java.util.Scanner;

/**
 * 题目描述
 * 已知元素从小到大排列的两个数组x[]和y[]，请写出一个程序算出两个数组彼此之间差的绝对值中最小的一个，这叫做数组的距离
 * <p>
 * 输入
 * 第一行为两个整数m, n(1≤m, n≤1000)，分别代表数组f[], g[]的长度。
 * 第二行有m个元素，为数组f[]。
 * 第三行有n个元素，为数组g[]。
 * <p>
 * 输出
 * 数组的最短距离
 * <p>
 * 样例输入
 * 5 5
 * 1 2 3 4 5
 * 6 7 8 9 10
 * 样例输出
 * 1
 *
 * @author hongfei He
 */
public class C_1164_数组的距离 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] f = new int[m];
        int[] g = new int[n];
        for (int i = 0; i < f.length; i++) {
            f[i] = sc.nextInt();
        }
        for (int i = 0; i < g.length; i++)
            g[i] = sc.nextInt();
        int absMin = f[f.length - 1];
        for (int item : f) {
            for (int value : g) {
                int x = Math.abs(item - value);
                if (x < absMin) {
                    absMin = x;
                }
            }
        }
        System.out.println(absMin);
        sc.close();
    }
}
