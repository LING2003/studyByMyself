package study.byMyself.对象数组5;

public class StudentTest {
    public static void main(String[] args) {
        //1.定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据
        Student[] stu = new Student[3];
        Student stu1 = new Student(1, "张三", 18);
        Student stu2 = new Student(2, "李四", 19);
        Student stu3 = new Student(3, "王五", 20);
        stu[0] = stu1;
        stu[1] = stu2;
        stu[2]=stu3;
        Student stu4 = new Student(4, "宋六", 20);
        boolean flag = contains(stu, stu4.getId());
        if (flag) {
            System.out.println("当前id重复，请修改id");
        } else {
            int count = getCount(stu);
            if (count == stu.length) {
                //已经存满
                //创建一个新的数组，长度=老数组长度加1
                //然后把老数组的元素，拷贝到新数组当中
                Student[] newStu = createNewArr(stu);
//                for (int i = 0; i < newStu.length; i++) {
//                    System.out.println(newStu[i]);
//                }
                newStu[count] = stu4;
                traverseArr(newStu);


            } else {
                //没有存满
                //[stu1,stu2,null]
                //getCount获取到的是2，表示数组当中已经有了2个元素
                //还有一层意思：如果下一次要添加数组，就是添加到2索引的位置
                stu[count] = stu4;
                traverseArr(stu);
            }
            //通过id删除学生信息
            int index = getIndex(stu,4);
            System.out.println(index);
            //存在--删除
            if (index>=0){
                stu[index]=null;
                traverseArr(stu);
            }
            //不存在--提示
            else{
                System.out.println("id不存在，删除失败。");
            }
            //查询数组id为2的学生，存在则年龄加一

            int changeInfoIndex=getIndex(stu,2);
            //存在
            if (changeInfoIndex>=0){
                stu[changeInfoIndex].setAge(stu[changeInfoIndex].getAge()+1);
                System.out.println(stu[changeInfoIndex].getAge());
            }

        }

    }
    //1.我要干嘛？-->判断是否存在
    //2.我干这件事，需要什么？-->数组，id
    //3，调用处是否有结果需要返回？

    //找到id所在数组的索引
    public static int getIndex(Student[] stu, int id) {
        for (int i = 0; i < stu.length; i++) {
            if (stu[i] != null) {
                if (id == stu[i].getId()) {
                    return i;
                }
            }

        }
        return -1;
    }


    //遍历数组
    public static void traverseArr(Student[] stu) {
        for (int i = 0; i < stu.length; i++) {
            if (stu[i] != null) {

                System.out.println(stu[i].getId() + "," + stu[i].getName() + "," + stu[i].getAge());
            }

        }

    }


    //创建一个新数组
    public static Student[] createNewArr(Student[] stu) {
        Student[] newStu = new Student[stu.length + 1];
        for (int i = 0; i < stu.length; i++) {
//            newStu[i].setId(stu[i].getId());
//            newStu[i].setName(stu[i].getName());
//            newStu[i].setAge(stu[i].getAge());
            newStu[i] = stu[i];
        }
        return newStu;
    }

    //定义一个方法判断数组中已经存了几个元素
    public static int getCount(Student[] stu) {
        int count = 0;
        for (int i = 0; i < stu.length; i++) {
            if (stu[i] != null) {
                count++;
            }
        }
        return count;
    }

    public static boolean contains(Student[] stu, int id) {
        for (int i = 0; i < stu.length; i++) {
            if (stu[i] != null) {
                if (stu[i].getId() == id) {
                    return true;
                }

            }

        }
        return false;
    }
}
