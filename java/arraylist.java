import java.util.ArrayList;

public class arraylist {

    public static void Bubblesort(Integer[] au) {
        int j, temp;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (j = 0; j < au.length - 1; j++) {
                if (au[j] > au[j + 1]) {
                    temp = au[j];
                    au[j] = au[j + 1];
                    au[j + 1] = temp;
                    flag = true;
                }

            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(13);
        list.add(6);
        list.add(2);
        list.add(12);
        System.out.println("Before sorting:\n" + list);

        Integer[] au = new Integer[list.size()];
        au = list.toArray(au);
        Bubblesort(au);
        System.out.println("After Sorting:");
        for (int num : au)
            System.out.println(num + "\t");

    }
}