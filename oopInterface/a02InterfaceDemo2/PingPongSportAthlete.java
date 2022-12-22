package study.byMyself.oopInterface.a02InterfaceDemo2;

public class PingPongSportAthlete extends SportAthlete implements SpeakEnglish{
    public PingPongSportAthlete() {
    }

    public PingPongSportAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("说英语");
    }
}
