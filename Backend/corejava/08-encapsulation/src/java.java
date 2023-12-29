class HelloWorld {
    private int age;
    private String name;
    private String college;
    public int getAge() {
      return age;
   }
    public String getName() {
      return name;
   }
    public String getCollege() {
      return college;
   }
    public void setAge( int newAge) {
      age = newAge;
   }
   public void setName(String newName) {
      name = newName;
   }

   public void setCollege(String newCollege) {
      college = newCollege;
   }

}
class java
{
    public static void main(String... args){
        HelloWorld hello = new HelloWorld();
       hello.setAge(20);
       hello.setName("bije purushotham");
       hello.setCollege("KSRM COLLEGE OF ENGINEERING");
    System.out.println(hello.getAge());
    System.out.println(hello.getName());
    System.out.println(hello.getCollege());
    }
}