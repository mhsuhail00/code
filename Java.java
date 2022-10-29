import java.lang.*;

public class Java
{
    public static void main( String[] args)
    {


    }


    static void sort (int x[],String order) //Sorting int array asc or desc
    {
        for(int i=0;i < x.length;i++)
        {   int a=i;
            for(int j=i+1;j<x.length;j++)
            {
                if((x[j]>x[a] & order=="desc") | (x[j]<x[a] & order=="asc"))
                {
                    a=j;
                }

            }
            if(a!=i)
            {
                x[i] = x[a] + x[i];
                x[a] = x[i] - x[a];
                x[i] = x[i] - x[a];
            }
        }
    }
    static void reverse ( int[] x)
    {
        for (int i = 0; i <= x.length / 2 - 1; i++)
        {
            int z;
            z = x[i];
            x[i] = x[x.length - 1 - i];
            x[x.length - 1 - i] = z;
        }
    }
    static long reverse ( long x)
    {
        long z = 0;
        while (x > 0)
        {
            z = z * 10 + x % 10;
            x = x / 10;
        }
        return z;
    }
    static int gcd ( int x, int y)
    {
        while (x != y)
        {
            if (x > y) x = x - y;
            else y = y - x;
        }
        return x;
    }
    static int hcf ( int x, int y)
    {
        int c, hcf = 1, i = 2;
        if (x < y)
            c = x;
        else
            c = y;

        while (i <= c / 2 + 1 && x != 1 && y != 1)
        {
            if (x % i == 0)
            {
                if (y % i == 0)
                {
                    hcf *= i;
                    x /= i;
                    y /= i;
                } else i++;
            } else i++;
        }
        return hcf;
    }
    static void primeCheck ( int x)
    {
        if (x <= 0)
            System.out.println("ENTER A VALID NATURAL NO.");
        else if (x == 1)
            System.out.println("IT IS NEITHER PRIME NOR ODD");

        else
        {
            for (int i = 2; i <= x / 2; i++)
            {
                if (x % i == 0)
                {
                    System.out.println("NOT A PRIME");
                    System.exit(0);
                }
            }
            System.out.println("IT IS A PRIME");
        }
    }
    static void sort (String x[],String order) //Sorting string array asc or desc
    {
        for (int j = 0; j < x.length; j++)
        {
            int c = j;
            for (int i = j + 1; i < x.length; i++)
            {
                if ((order.equals("asc") & (x[i].compareTo(x[c]) < 0)) | (order.equals("desc") & (x[i].compareTo(x[c]) > 0))) {
                    c = i;
                }
            }
            String temp = x[c];
            for (int k = c; k > j; k--) {
                x[k] = x[k - 1];
            }
            x[j] = temp;
        }
    }
}




