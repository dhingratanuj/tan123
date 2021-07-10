package test123;

public class test4 {

    public static void main(String args[])
    {

        int arrtest[]={2,81,0,-2,90,-12};

        for(int i=0;i<arrtest.length-1;i++) {
            for (int j = i + 1; j < arrtest.length; j++) {
                if (arrtest[i] > arrtest[j]) {
                    int swap;
                    swap = arrtest[i];
                    arrtest[i] = arrtest[j];
                    arrtest[j] = swap;
                }
            }
        }
        System.out.println(arrtest[0]);


    }}
