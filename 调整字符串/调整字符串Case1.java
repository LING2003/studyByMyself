package study.byMyself.调整字符串;

public class 调整字符串Case1 {
    public static void main(String[] args) {
        //给定两个字符串，A和B
        String A = "abcde";
        String B = "cdeab";
        //A的旋转操作就是将A最左边的字符移动到最右边
        //采用substring字符串拼接的方法
        //比较字符串
        Boolean flag = compareStrings(A, B);
        System.out.println(flag);
    }

    //比较字符串
    public static boolean compareStrings(String A, String B) {
        if (A.length() == B.length()) {
            for (int i = 0; i < A.length(); i++) {
                A = rotate(A);
                System.out.println(A);
                if (A.equals(B)) {
                    return true;
                }
            }
        }
        return false;

    }

    //字符串拼接旋转
    public static String rotate(String str) {
        String start = str.substring(0, 1);
        String end = str.substring(1);
        return end + start;
    }
}
