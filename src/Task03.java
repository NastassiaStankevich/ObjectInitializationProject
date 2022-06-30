public class Task03 {
    public static void main(String[] args) {
        Student student = new Student("Alex", 20,9,true);


        Student student1 = new Student("Anna",18,8,true);
 //       student1.name = "Mark";
 //     student1.age = 20;
 //       student1.mark = 7;
 //       student1.alive = true;
        System.out.println(student1.getInfo());

        Student student2 = new Student("Harry", 19,7,true);
//        student2.name = "Anna";
//        student2.age = 18;
//       student2.mark = 8;
//        student2.alive = true;
        System.out.println(student2.getInfo());
    }
}
