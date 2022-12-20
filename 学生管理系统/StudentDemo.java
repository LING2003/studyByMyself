package study.byMyself.学生管理系统;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo {
    public static void startStudentDemo() {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        //初始菜单
        loop:
        while (true) {
            System.out.println("------------欢迎来到未来大学学生管理系统------------");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.println("请输入您的选择：");
            System.out.println("--------------------------------------------------");
            int choose = sc.nextInt();
            switch (choose) {
                case 1: {
                    System.out.println("添加学生");
                    AddStudent(list);
                    break;
                }
                case 2: {
                    System.out.println("删除学生");
                    removeStudent(list);
                    break;
                }

                case 3: {
                    System.out.println("修改学生");
                    setStudent(list);
                    break;
                }

                case 4: {
                    System.out.println("查询学生");
                    queryStudent(list);
                    break;
                }

                case 5: {
                    System.out.println("退出");
                    break loop;
                }
                default:
                    System.out.println("你输的啥子嘛，输错喽你知不知道");
            }
        }


    }

    //判断学生id是否存在
    public static boolean idContains(ArrayList<Student> list, int id) {
        //循环遍历学生对象，判断学生对象id是否存在
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            int sid = stu.getId();
            if (sid == id) {
                return true;//已存在返回true；
            }
        }
        return false;//不存在返回false；
    }

    //添加学生方法
    public static ArrayList<Student> AddStudent(ArrayList<Student> list) {
        Scanner scanner = new Scanner(System.in);
        //创建学生对象
        Student stu = new Student();
        //创建一个Boolean类型的变量，用来控制while循环
        boolean flag = true;
        //接收需要传递的学生信息
        //
        while (flag) {
            System.out.println("请输入学生id");
            int addId = scanner.nextInt();
            //要求id唯一，判断学生id是否存在
            //已存在返回输入有误
            if (idContains(list, addId)) {
                System.out.println("您输入的学生id已存在,请检查后再输入");
                flag=false;
            } else {
                //id不存在则继续输入
                System.out.println("请输入学生姓名");
                String name = scanner.next();
                System.out.println("请输入学生年龄");
                int age = scanner.nextInt();
                System.out.println("请输入学生住址");
                String address = scanner.next();
                //给学生对象的属性赋值
                stu.setId(addId);
                stu.setName(name);
                stu.setAge(age);
                stu.setAddress(address);
                //将学生对象添加到集合当中
                list.add(stu);
                break;//写法能改，目前只想到用break跳出循环。
            }

        }
        return list;
    }

    //删除学生
    //未完待续
    public static ArrayList<Student> removeStudent(ArrayList<Student> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要删除学生的id");
        int removeId = scanner.nextInt();
        if(idContains(list,removeId)){
            //如果存在，遍历，拿到学生对象
            for (int i = 0; i < list.size(); i++) {
               Student stu = list.get(i);
               //如果id匹配，则删除id
               if (stu.getId()==removeId){
                   list.remove(i);
                   System.out.println("id已删除");
               }
            }

        }else {
            System.out.println("您的输入有误，需要删除的id不存在");
            return list;
        }
        /*for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            int sid = stu.getId();
            if (sid == removeId) {
                list.remove(sid);//id存在则删除
            } else {
                System.out.println("您的输入有误，需要删除的id不存在");
                break;
            }
        }*/
        return list;
    }

    //修改学生
    public static ArrayList<Student> setStudent(ArrayList<Student> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个您要修改的学生id");
        int setId = scanner.nextInt();
        if (idContains(list,setId)){
            //如果存在，遍历集合，拿到要修改的学生对象
            for (int i = 0; i < list.size(); i++) {
                Student stu = list.get(i);
                if (stu.getId()==setId){
                    System.out.println("请输入所要修改id的学生姓名");
                    String setName = scanner.next();
                    System.out.println("请输入所要修改id的学生年龄");
                    int setAge = scanner.nextInt();
                    System.out.println("请输入所要修改id的学生住址");
                    String setAddress = scanner.next();
                    //给学生对象添加属性
                    stu.setName(setName);
                    stu.setAge(setAge);
                    stu.setAddress(setAddress);
                }
            }
        }else{
            //如果不存在，返回list，回到上一级
            return list;
        }
        return list;
    }

    //查询学生
    public static void queryStudent(ArrayList<Student> list) {
        //判断list是否为空
        if (list.isEmpty()) {
            System.out.println("当前无学生信息，请添加后再查寻");
        } else {
            System.out.println("打印所有学生信息");
            System.out.println("id\t" + "姓名\t" + "年龄\t" + "家庭住址\t");
            for (int i = 0; i < list.size(); i++) {
                Student stu = list.get(i);
                System.out.println(stu.getId()+"\t"+ stu.getName() +"\t"+ stu.getAge() +"\t"+ stu.getAddress());
            }
        }
    }
}
