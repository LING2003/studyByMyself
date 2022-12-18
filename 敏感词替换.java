package study.byMyself;

public class 敏感词替换 {
    public static void main(String[] args) {
        //1.获取到说的话
        String talk = "你TND玩的真好，以后不要完了，TMD，C。";
        //2.定义一个敏感词库
        String[] arr = {"TMD","CNM","TND","NDY","C"};
        //3.循环的到数组中的每一个敏感词，依次进行替换
        for (int i = 0; i < arr.length; i++) {
            talk=talk.replace(arr[i],"***");
        }
        //打印结果
        System.out.println(talk);
    }

}
