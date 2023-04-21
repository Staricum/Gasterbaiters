public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    public static ChocolateBoiler a = null;
    
    private ChocolateBoiler()
    {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler BB()
    {
        if (a == null)
        {
            a=new ChocolateBoiler();
        }

        return a;
    }

    public void fill()
    {
        if (isEmpty())
        {
            empty = false;
            boiled = false;
            System.out.println("Sam ti bebra");
        }
    }
    public void drain()
    {
        if(!isEmpty() && isBoiled())
        {
            empty = true;
        }
    }
    public void boil()
    {
        if (!isEmpty() && !isBoiled())
        {
            boiled = true;
        }
    }
    public boolean isEmpty()
    {
        return empty;
    }

    public boolean isBoiled()
    {
        return boiled;
    }
}