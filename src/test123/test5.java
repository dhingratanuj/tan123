package test123;

public class test5 {

    public static void main(String[] args)
    {
        String sty = new String("Test678 Is a nw");

        StringBuffer sty_rev = new StringBuffer();

        for(int i=0;i<sty.length();i++)
        {
            sty_rev.insert(i,sty.charAt(sty.length()-i-1));
        }
        int count=1;

        for(int i=0;i<sty.length();i++)
        {
            if(sty.charAt(i)==' ' && sty.charAt(i+1)!=' ')
                count++;
        }

        System.out.println(sty_rev);
        System.out.println(count);


    }
}
