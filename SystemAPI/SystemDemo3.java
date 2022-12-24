package study.byMyself.SystemAPI;
//记住计算机是不会骗人的
public class SystemDemo3 {
    //拷贝数组
    //System.arraycopy(数据源数组,从源数组第几个索引开始拷贝，目的地，目的地数组的索引，拷贝的个数)
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6,7,8};
        int[] arr2=new int[8];
        System.arraycopy(arr1,0,arr2,0,8);
        //遍历，验证结果
        for (int i = 0; i <arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}
