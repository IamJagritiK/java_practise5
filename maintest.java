import java.util.*;
class StudentSorter implements Comparator<student>
{
   public int compare(student stu, student stu1 ) {
       if (stu.getage() == stu1.getage()) {
           if (stu.getname().equals(stu1.getname()))
               return stu1.getid() - stu.getid();
           else
               return stu1.getname().compareTo(stu.getname());
       } else {
           return stu1.getage() - stu.getage();
       }
   }
}
class maintest{
   public static void main(String[] args){   
       
    student s1=new student();
   student s2=new student();
   student s3=new student();
   student s4=new student();
   student s5=new student();
   s1.setage(18);
   s1.setid(1);
   s1.setname("andrea");
   s2.setage(19);
   s2.setid(2);
   s2.setname("edward");
   s3.setage(20);
   s3.setid(3);
   s3.setname("john");
   s4.setage(20);
   s4.setid(4);
   s4.setname("mcqueen");
   s5.setage(19);
   s5.setid(5);
   s5.setname("julia");   System.out.println("for student 1"+s1.getage()+" "+s1.getid()+" "+s1.getname());
  System.out.println("for student 2"+s2.getage()+" "+s2.getid()+" "+s2.getname());
  System.out.println("for student 3"+s3.getage()+" "+s3.getid()+" "+s3.getname());
  System.out.println("for student 4"+s4.getage()+" "+s4.getid()+" "+s4.getname());
  System.out.println("for student 5"+s5.getage()+" "+s5.getid()+" "+s5.getname());
  List<student> listStrings = new ArrayList<>();
   listStrings.add(s1);
   listStrings.add(s2);
   listStrings.add(s3);
   listStrings.add(s4);
   listStrings.add(s5);    Collections.sort(listStrings,new StudentSorter());
    //System.out.println("   ");
    for(student b:listStrings){
      System.out.println("Id:"+b.getid()+" "+"Age:"+b.getage()+" "+"Name:"+b.getname());
   }
}
}
class student{
 private  int age;
 private  String name;
 private  int id;    public int getage(){
       return this.age;
   }
   public void setage(int age)
   {
       this.age=age;
   }
   public String getname(){
       return this.name;
   }
   public void setname(String name)
   {
       this.name=name;
   }
   public int getid(){
       return this.id;
   }
   public void setid(int id)
   {
       this.id=id;
   }}