/*
 * 软件版权: 恒生电子股份有限公司
 */
package src;

import java.util.ArrayList;

/**
 * 功能说明: 泛型学习
 *
 * @author yangming28071
 */
public class GenericStudy {
    public static void main(String[] args) {
        /*泛型就是编写模板代码来适应任意类型；
泛型的好处是使用时不必对类型进行强制转换，它通过编译器对类型进行检查；
注意泛型的继承关系：可以把ArrayList<Integer>向上转型为List<Integer>（T不能变！），但不能把ArrayList<Integer>向上转型为ArrayList<Number>（T不能变成父类）。*/
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("123");
        arrayList.add("456");
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.toString());
        System.out.println(arrayList.get(1));
    }
}

