/*
 * 软件版权: 恒生电子股份有限公司
 */
package src;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能说明:
 *
 * @author yangming28071
 */
public class CollectionStudy {
    /*
    * Java标准库自带的java.util包提供了集合类：Collection，它是所有其他集合类的根接口。在Collection的基础上，Java的java.util包主要提供了以下三种类型的集合：
List：一种有序列表的集合，例如，按索引排列的Student的List；
Set：一种保证没有重复元素的集合，例如，所有无重复名称的Student的Set；
Map：一种通过键值（key-value）查找的映射表集合，例如，根据Student的name查找对应Student的Map
Java集合使用统一的Iterator遍历
* */
    public static void main(String[] args) {
        /*一是实现了接口和实现类相分离，例如，有序表的接口是List，具体的实现类有ArrayList，LinkedList等，二是支持泛型，我们可以限制在一个集合中只能放入同一种数据类型的元素，*/
        List<String> stringList = new ArrayList<>();


    }
}

