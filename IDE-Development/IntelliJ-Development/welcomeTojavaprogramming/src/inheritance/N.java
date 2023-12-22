package inheritance;

class M{
    M()
    {
        System.out.println("M()");
    }
}
class N extends M{
    public static void main(String[] args) {
        N n1 = new N();
        System.out.println("from N main");
    }
}