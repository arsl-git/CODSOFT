package javainternship;

class Student
{
    private String name;
    private int age;
    private int roolno;
    private String grade;
    private  String country;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRoolno() {
        return roolno;
    }

    public String getGrade() {
        return grade;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRoolno(int roolno) {
        this.roolno = roolno;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", roolno=" + roolno +
                ", grade='" + grade + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
class StudentManagementSystem extends Student
{
    public void add(String name,int age,String country)
    {
         System.out.println(name);
        System.out.println(age);
        System.out.println(country);
    }
}












public class task3sms {
    public static void main(String[] args) {
         Student student=new Student();
         StudentManagementSystem sms=new StudentManagementSystem();
         sms.add("arsalan",12,"india");
    }
}
