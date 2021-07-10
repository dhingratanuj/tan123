package test123;

public class test2 {

    public static void main(String[] args)
    {
        int[] arr3= {2,3,4,5,6};
        int sum=0;
        int no=5;

        for(int i=0; i<arr3.length;i++)
        {
            if (no==arr3[i])
            {
                System.out.println("found");
            }
            else
            {
                System.out.println(arr3[i]);
            }
        }

        System.out.println(sum);


            }
}
