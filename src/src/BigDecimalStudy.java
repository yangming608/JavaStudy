/*
 * 软件版权: 恒生电子股份有限公司
 */
package src;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

/**
 * 功能说明:
 *
 * @author yangming28071
 */
public class BigDecimalStudy {
    public static void main(String[] args) {
        /*BigDecimal可以表示一个任意大小且精度完全准确的浮点数*/
        BigDecimal bd1 = new BigDecimal("1234.45000");
        BigDecimal bd2 = new BigDecimal("2345.67");

        /*BigDecimal和BigInteger一样，都是不变类型*/
        System.out.println(bd2.add(bd1));
        System.out.println(bd2);


        /*BigDecimal用scale()表示小数位数*/
        System.out.println(bd1.scale());

        /*stripTrailingZeros()方法，可以将一个BigDecimal格式化为一个相等的，但去掉了末尾0的BigDecimal*/
        System.out.println(bd1.stripTrailingZeros());

        BigDecimal d3 = new BigDecimal("1234500");
        BigDecimal d4 = d3.stripTrailingZeros();
        System.out.println(d3.scale()); // 0
        /*如果一个BigDecimal的scale()返回负数，例如，-2，表示这个数是个整数，并且末尾有2个0。*/
        System.out.println(d4.scale()); // -2
        System.out.println(d4);         // 1.2345E+6

        /*设置精度，可以设置截断方式*/
        System.out.println(bd1.setScale(1, RoundingMode.HALF_UP));  /*四舍五入*/
        System.out.println(bd1.setScale(1, RoundingMode.DOWN));     /*直接截断*/

        /*做除法时，存在无法除尽的情况，这时就必须指定精度以及如何进行截断*/
        System.out.println(bd1.divide(bd2, 3, RoundingMode.HALF_UP));

        /*两个BigDecimal数值进行比较时，必须使用compareTo()方法来比较，它根据两个值的大小分别返回负数、正数和0，分别表示小于、大于和等于*/
        System.out.println(bd1.compareTo(bd2));

    }
}

