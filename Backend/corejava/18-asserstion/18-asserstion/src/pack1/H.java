package pack1;

class H
{
    public static void main(String[] args)
    {
        System.out.println("main begin");
        assert test();//very simple assert stament
        System.out.println("main end");
    }
    public static boolean test()
    {
        return false;
    }
}
