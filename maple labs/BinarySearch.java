import java.util.ArrayList;

public class BinarySearch{

    public static void Bubblesort(Integer[] arr)
    {
        int i,temp;
        Boolean flag;
        flag=true;
        while(flag)
        {
            flag=false;
            //iterate for all elem
            for(i=0;i<arr.length-1;i++) //0-4
            {
                if(arr[i]>arr[i+1]) //prev no. is greater than next one
                {
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;

                    flag=true;
                    
                }
            }
        }
    }

    /*public static void Binary(Integer[] arr)
    {
        int i,m,e,b;
        for(i=0;i<arra)
    }*/

    public static void main(String[] args)
    {
        ArrayList<Integer>list=new ArrayList<Integer>();
        list.add(100);
        list.add(52);
        list.add(65);
        list.add(42);
        list.add(99);
        //before sorting => list

        Integer[] arr=new Integer[list.size()];//list size
        arr=list.toArray(arr); //convert list to array
        Bubblesort(arr);
        System.out.println("After Sorting");
        for(int num:arr)
        System.out.println(num);
    }
}