package study.byMyself;

public class 身份证号码信息查看 {
    public static void main(String[] args) {
        String idNumber="371500200002022345";
        String year = idNumber.substring(6,10);
        String month = idNumber.substring(10,12);
        String day = idNumber.substring(12,14);
        char genderIdentity= idNumber.charAt(16);
        String gender;
        if ((genderIdentity-48)%2==0){
            gender="女";
        }else gender="男";

        System.out.println("生日："+year+"年"+month+"月"+day+"日");
        System.out.println("性别："+gender);
    }
    //优化写法：char genderIdentity = idNumber.charAt(16);--->获得的值-48即是数字


}
