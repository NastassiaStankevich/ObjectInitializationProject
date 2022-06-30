public class Student {
    public String name;
    public int age;
    public double mark = 4;
    public boolean alive;

    // default constructor
    public Student(){
        name = "no name";
        age = 16;
        mark = 4;
        alive = true;
    }

    public String getInfo(){
        return  name + ": age = " + age
                + ", mark = " + mark
                + ", is alive = " + (alive ? "yes" : "No");

    }
    // Full constructor with params/args
    public  Student(String name, int age , double mark , boolean alive){
        this.name = name;
        this.age = age;
        this.mark = mark;
        this.alive = alive;

    }
    // copy constructor
    public Student(Student student){
        name = student.name;
        age = student.age;
        mark = student.mark;
        alive = student.alive;
    }


}
