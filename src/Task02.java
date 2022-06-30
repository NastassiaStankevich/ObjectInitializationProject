public class Task02 {
    public static void main(String[] args) {
        Student st = new Student();
        st.name = "Alex";
        st.age = 20;
//        System.out.println(st.name);
//        System.out.println(st.age);
//        System.out.println(st.mark);
//       System.out.println(st.alive);

        System.out.println(st.getInfo());

        Student st2 = new Student();
        st2.name = "Anna";
        st2.age = 18;
        System.out.println(st2.getInfo());

        Student st3 = new Student();
        st3.name = "Peter";
        st3.age = 21;
        System.out.println(st3.getInfo());

    }
}
