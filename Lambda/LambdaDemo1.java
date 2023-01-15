package study.byMyself.Lambda;

import java.util.Arrays;

public class LambdaDemo1 {

        public static void main(String[] args) {
            //按照指定规则排序：
            //底层原理:
            //利用插入排序+二分查找的方式进行排序的。
            //默认把索引的数据当做是有序的序列，1索引到最后认为是无序的序列。
            //遍历无序的序列得到里面的每一个元素，假设当前遍历得到的元素是A元素
            //把A往有序序列中进行插入，在插入的时候，是利用二分查找确定A元素的插入点。
            //拿着A元素，跟插入点的元素进行比较，比较的规则就是compare方法的方法体
            //如果方法的返回值是负数，拿着A继续跟前面的数据进行比较
            //如果方法的返回值是正数，拿着A继续跟后面的数据进行比较
            //如果方法的返回值是0,也拿着A跟后面的数据进行比较
            //直到能确定A的最终位置为止。


            //compare方法的形式参数:
            //参数一 o1:表示在无序序列中，遍历得到的每一个元素
            //参数二 o2:有序序列中的元素


            //返回值:
            //负数:表示当前要插入的元素是小的，放在前面
            //正数:表示当前要插入的元素是大的，放在后面
            //0:表示当前要插入的元素跟现在的元素比是一样的们也会放在后面



            Integer [] arr = {3,2,7,9,1,10,6,4,5,8};
            /*不用lambda表达式的完整格式
            Arrays.sort(arr, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1-o2;
                    //简单理解：
                    // o2-o1 升序排列
                    // o1-o2 降序排列
                }
            });
            System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        }

             */

            //使用lambda表达式的完整格式
             Arrays.sort(arr, (Integer o1, Integer o2)->{
                    return o1-o2;

            });
            System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

            //使用lambda表达式的省略格式
            Arrays.sort(arr,(o1, o2) -> o1-o2); //参数的数据类型可以省略，分号、{}、return需要同时省略
            System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        }
    }

