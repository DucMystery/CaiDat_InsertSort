public class InsertSort {

    public static void insertSort(int []list){
        for (int i=1;i<list.length;i++){
            int currentMin =list[i];
            int key;

            for (key =i-1;key>=0 && list[key]>currentMin;key--){
                list[key+1] = list[key];
            }
            list[key+1] = currentMin;
        }
    }

    public static void main(String[] args) {
        int[]list ={1,3,-2,4,2,7,-3};
        insertSort(list);
        for (int  i=0;i<list.length;i++){
            System.out.print(list[i]+"\t");
        }
    }
}
