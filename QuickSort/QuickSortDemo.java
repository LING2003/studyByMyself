package study.byMyself.QuickSort;

public class QuickSortDemo {
    /*
    快速排序:
      第一轮：以0索引的数字为基准数，确定基准数在数组中正确的位置。
            比基准数小的全部在左边，比基准数大的全部在右边。
            后面以此类推。
            //注意循环！！！
     */
    public static void main(String[] args) {
        int[] arr = {6, 4, 2, 5, 7, 1, 3, 8, 9};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void quickSort(int[] arr, int i, int j) {
        int start = i;
        int end = j;
        int baseNum = arr[i];//基准数

        //递归出口
        if (start>end){
            return;
        }

        while (start != end) {
            //先从end开始找，从后往前找start到end之间比baseNum小的数
            while (true) {
                if (end <= start || arr[end] < baseNum) {
                    break;
                }
                end--;
            }

            //再从start开始找，从前往后找start到end之间比baseNum大的数
            while (true) {
                if (start >= end || arr[start] > baseNum) {
                    break;
                }
                start++;
            }
            //将end和start数据进行交换
            //注意：交换的是数据不是索引
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
        }
        //当start和end指向了同一个元素的时候，那么上面的循环就会结束
            //表示已经找到了基准数在数组中应存入的位置
            //基准数归位
            //就是拿着这个范围中的第一个数字和start指向的元素进行交换
            int temp = arr[i];
            arr[i] = arr[start];
            arr[start] = temp;

            //确定6左边的范围，重复刚才所做的事情
            quickSort(arr, i, start-1);
            //确定6右边的范围，重复刚才所做的事情
            quickSort(arr,start+1,j);

        }


    }