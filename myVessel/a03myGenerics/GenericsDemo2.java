package study.byMyself.myVessel.a03myGenerics;

public class GenericsDemo2 {
    public static void main(String[] args) {
        MyArraylist<Integer> list=new MyArraylist<>();
        list.add(111);
        list.add(222);
        list.add(333);
        int i =list.get(0);
        System.out.println(i);
        System.out.println(list);
    }
}
