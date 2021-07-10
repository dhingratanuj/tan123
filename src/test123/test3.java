package test123;

public class test3 {

    public static void main(String args[])
    {
        int arr[] = {2,81,0,-2};
        int max=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if (arr[i]>max)
            {
                max=arr[i];
            }
        }

        System.out.println("max:"+max);

    }
}
