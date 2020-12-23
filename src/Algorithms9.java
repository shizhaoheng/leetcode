/**
 * @author : shi zhao heng
 * @date : 2020/11/30 13:09
 */

/**
 * 难度-简单
 * 9. 回文数
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 121
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 * <p>
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 * 进阶:
 * <p>
 * 你能不将整数转为字符串来解决这个问题吗？
 */

public class Algorithms9 {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(1221%1000);
        System.out.println(221/10);
    }

//解法一：普通解法
    public static boolean isPalindrome(int x) {
        String str = new StringBuilder(x + "").reverse().toString();
        return (x + "").equals(str);
    }
}


