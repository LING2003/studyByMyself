package study.byMyself.对象数组4;

public class girlFriendTest {
    public static void main(String[] args) {
        //1.定义数组存储4个女朋友的对象
        girlFriend[] girls = new girlFriend[4];
        girlFriend g1 = new girlFriend("李星辰",20,'女',"羽毛球");
        girls[0]=g1;
        girlFriend g2 = new girlFriend("张喵喵",18,'女',"养猫，看书，唱歌，跳舞");
        girls[1]=g2;
        girlFriend g3 = new girlFriend("刘圆圆",20,'女',"懒猫爱睡觉");
        girls[2]=g3;
        girlFriend g4 = new girlFriend("肖彤彤",18,'女',"吃饭睡觉打豆豆");
        girls[3]=g4;
        int sum =0;
        for (int i = 0; i < girls.length; i++) {
            sum=sum+girls[i].getAge();
        }
        int avg = sum/girls.length;
        System.out.println(avg);
        for (int i = 0; i < girls.length; i++) {
            if ( girls[i].getAge()<avg)
                System.out.println( girls[i].getName()
                        +","+ girls[i].getAge()
                        +","+ girls[i].getGender()
                        +","+ girls[i].getHobby());
        }
    }
}
