public class PNC 
{

    private int num;

    public PNC(int num)
    {
        this.num = num;
    }

    public boolean check()
    {
        if(num <= 1)
        {
            return false;
        }

        for(int i = 2; i<num; i++)
        {
            if(num % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[])
    {
        PNC num= new PNC(12);
        boolean test = num.check();
        PNC num2= new PNC(11);
        boolean test2 = num2.check();

        System.out.print("" + test + test2);
    }
}