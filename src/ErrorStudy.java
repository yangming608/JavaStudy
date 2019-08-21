/*
 * 软件版权: 恒生电子股份有限公司
 */

/**
 * 功能说明:
 *
 * @author yangming28071
 */
public class ErrorStudy {
    public static void main(String[] args){
        try {
            boolean rrr = f1(5, 0);
            System.out.println(rrr + "结果");
        }catch (Exception e){

        }
    }

    static boolean f1(int a, int b){
        boolean res = false;
        try {
            if (a/b > 0){
                res = true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return res;
    }


}

