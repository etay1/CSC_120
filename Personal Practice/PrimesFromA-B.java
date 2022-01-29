public class Primes 
    public static void main (String [] args) 
        final int NUM = 50;
        final int PER_LINE = 10;
        int count = 0;
        int n = 2;
        while (count < NUM)
        {
            boolean isPrime = true;
            for (int d = 2; d < n && isPrime; d++)
            {
                if (n % d == 0)
                    isPrime = false;
            }
            if (isPrime)
            {
                count++;
                if (count % PER_LINE == 0)
                    System.out.println (n);
                else
                    System.out.print (n + "\t");
            }
            n++;	
        }
    }
}
