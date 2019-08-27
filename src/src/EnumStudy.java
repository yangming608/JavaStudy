/*
 * 软件版权: 恒生电子股份有限公司
 */
package src;

/**
 * 功能说明:
 *
 * @author yangming28071
 */
public class EnumStudy {
    public static void main(String[] args) {
        Weekday day = Weekday.fromChineseStr("星期一");
        if (day != null) {
            switch(day) {
                case MON:
                case TUE:
                case WED:
                case THU:
                case FRI:
                    System.out.println("Today is " + day + ". Work at office!");
                    System.out.println(day.name() + day.getDayValue());
                    break;
                case SAT:
                case SUN:
                    System.out.println("Today is " + day + ". Work at home!");

                    break;
                default:
                    throw new RuntimeException("cannot process " + day);
            }
        }
    }
}

enum Weekday{
/*    Java使用enum定义枚举类型，它被编译器编译为final class Xxx extends Enum { … }；
    通过name()获取常量定义的字符串，注意不要使用toString()；
    通过ordinal()返回常量定义的顺序（无实质意义）；
    可以为enum编写构造方法、字段和方法
    enum的构造方法要声明为private，字段强烈建议声明为final；
    enum适合用在switch语句中。*/
    MON(1, "星期一"),
    TUE(2, "星期二"),
    WED(3, "星期三"),
    THU(4, "星期四"),
    FRI(5, "星期五"),
    SAT(6, "星期六"),
    SUN(0, "星期日");

    private final int dayValue;
    private final String chinese;

    Weekday(int dayValue, String chinese) {
        this.dayValue = dayValue;
        this.chinese = chinese;
    }

    public String getChinese() {
        return chinese;
    }

    public int getDayValue() {
        return dayValue;
    }

    @Override
    public String toString() {
        return this.getChinese();
    }

    public static Weekday fromChineseStr(String chineseStr){
        for (Weekday weekday:Weekday.values()) {
            if (weekday.getChinese().equals(chineseStr)){
                return weekday;
            }
        }
        return null;
    }

}

