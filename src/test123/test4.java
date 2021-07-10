package test123;

public class test4 {

    public static void main(String args[])
    {

        int arrtest[]={2,81,0,-2};

        for(int i=0;i<arrtest.length-1;i++)
        {
            if(arrtest[i]>arrtest[i+1])
            {
                int swap;
                swap=arrtest[i];
                arrtest[i]=arrtest[i+1];
                arrtest[i+1]=swap;
            }
        }

        System.out.println(arrtest[1]);


    }}
