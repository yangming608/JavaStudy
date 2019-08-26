/*
 * 软件版权: 恒生电子股份有限公司
 */
package src;

import java.util.StringJoiner;

/**
 * 功能说明:包装类型学习
 *
 * @author yangming28071
 */
public class WrapperClassStudy {
    public static void main(String[] args) {

/*        Java的数据类型分两种：
        基本类型：byte，short，int，long，boolean，float，double，char
        引用类型：所有class和interface类型
        引用类型可以赋值为null，表示空，但基本类型不能赋值为null*/

/* 所有的包装类型都是不变类,即final，进行比较要特别注意：绝对不能用==比较，因为Integer是引用类型，必须使用equals()比较*/
        Integer n2 = Integer.valueOf(123);
        Integer n = 123;                    /*这句相比于上一句，是自动装箱 auto boxing*/
    }
}

