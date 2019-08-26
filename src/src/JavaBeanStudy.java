/*
 * 软件版权: 恒生电子股份有限公司
 */
package src;

import java.beans.*;
/**
 * 功能说明:
 *
 * @author yangming28071
 */
public class JavaBeanStudy {
    public static void main(String[] args) throws IntrospectionException {
        /*要枚举一个JavaBean的所有属性，可以直接使用Java核心库提供的Introspector：*/
        BeanInfo info = Introspector.getBeanInfo(Human.class);
        for (PropertyDescriptor pd:info.getPropertyDescriptors()){
            System.out.println(pd.getName());
            System.out.println("  " + pd.getReadMethod());
            System.out.println("  " + pd.getWriteMethod());
        }

    }
}

class Human{
    private String name;
    private boolean flag;

    /* 很多class的定义都符合这样的规范的被称为JavaBean：
    若干private实例字段；通过public方法来读写实例字段。读写方法符合以下这种命名规范 getName OR setName ，特殊的boolean isFlag

    IDE中可以快速生成对应的读写属性的方法，Idea中通过光标选择在变量定义处 alt + enter的方式选择对应属性方法创建即可
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}

