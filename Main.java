class Main
{
    public static void main(String args[])
    {
        
        Single x = Single.getInstance();
        Single y = Single.getInstance();
        x.s = (x.s).toUpperCase();
 
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("\n");
 
        y.s = (y.s).toLowerCase();
 
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
    }
}