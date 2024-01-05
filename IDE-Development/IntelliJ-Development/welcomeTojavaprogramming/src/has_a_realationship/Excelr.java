package has_a_realationship;

public class Excelr {
    String place;
    String location;
    void instuite()
    {
        System.out.println("Excelr");
        
    }
}
class Student{
    Excelr purushotham;
    Student(Excelr s1){
        this.purushotham = s1;
    }
    void batch(){
        System.out.println("octber 27 th");
        purushotham.place = "old block excelr";
        System.out.println(purushotham.place + ",");
        purushotham.location = "banglore";
        System.out.println(purushotham.location +  "," );
        purushotham.instuite();
    }

    public static void main(String[] args) {
        Excelr e1 = new Excelr();
        Student ss = new Student(e1);
        ss.batch();
        System.out.println("done");
    }

}
