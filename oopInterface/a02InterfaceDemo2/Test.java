package study.byMyself.oopInterface.a02InterfaceDemo2;

public class Test {
    public static void main(String[] args) {
        BasketballCoach bc = new BasketballCoach("张三",33);
        bc.teach();
        System.out.println("篮球教练：姓名"+bc.getName()+"， 年龄"+bc.getAge());
        System.out.println("-----------------------------------");
        BasketballSportAthlete bs = new BasketballSportAthlete("李四",23);
        bs.study();
        System.out.println("篮球运动员：姓名"+bs.getName()+"， 年龄"+bs.getAge());
        System.out.println("-----------------------------------");
        PingPongCoach ppc = new PingPongCoach("王五",27);
        ppc.teach();
        System.out.println("乒乓球教练：姓名"+ppc.getName()+"， 年龄"+ppc.getAge());
        ppc.speakEnglish();
        System.out.println("-----------------------------------");
        PingPongSportAthlete pps = new PingPongSportAthlete("宋六",19);
        pps.study();
        System.out.println("乒乓球运动员：姓名"+pps.getName()+"， 年龄"+pps.getAge());
        pps.speakEnglish();
        System.out.println("-----------------------------------");
    }
}
