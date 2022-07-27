class Student{
   String name;
   int year;
   String address;
    Student(String n,int y,String a){
        name=n;
        year=y;
        address=a;
    }
   void show(){
       System.out.println(name+"\t"+year+"\t\t"+address);
   }
}
public class StudentMain
{
	public static void main(String[] args) {
	    Student st1=new Student("Hari",2010,"1-4 eluru");
	    Student st2=new Student("Vishnu",2012,"245-C hyd");
	    Student st3=new Student("Vamsi",2015,"1-45 Vjd");
		System.out.println("Name \tYearOfJoining \tAddress");
		st1.show();
		st2.show();
		st3.show();
	}
}
