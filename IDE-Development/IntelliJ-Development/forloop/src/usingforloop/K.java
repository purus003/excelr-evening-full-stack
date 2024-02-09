class F
{
    int i;
    F(int i)
    {
        this.i = i;
    }
    public boolean equals(Object obj)
    {
        if (obj instanceof O)
        {
            O ref = (O)obj;
            return (this.i == ref.i);

        }
        if(obj instanceof P)
        {
            P ref = (P) obj;
            return (this.i == ref.i);
        }
        return false;
    }
}
class O
{
    int i;
}
class P
{
    int j;
}
class  M18
{
    public static void main(String[] args)
    {
        F f1 = new F(900);
        F f2 = new F(900);

        O o1 = new O();
        o1.i = 900;

        P p1 = new P();
        p1.i =900;




        System.out.println(f1.equals(f2));
        System.out.println(f1.equals(o1));
        System.out.println(f1.equals(p1));
        System.out.println(f1.equals("xyz"));
    }
}
