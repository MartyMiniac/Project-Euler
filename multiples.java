/*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.*/
class multiples
{
    public static void main(String args[])
    {
        int s=0;
        for(int a=1; a<=1000; a++)
        {
            //Checking if the number is divisible by 3 or 5 or not. If so then adding them to a varriable s
            if(a%3==0 || a%5==0)
            {
                s=s+a;
                System.out.println(a);
            }
        }
        System.out.print("Sum = "+s);
    }
}
