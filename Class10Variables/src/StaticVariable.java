public class StaticVariable {
//    static double x = 0X01772312;
//    static  String name = " Sonu kumar singh ";
//    static String clgname =" sistec";

     int x = 10;
    static int y=20;
    public static  void main(String[] args){
//        System.out.println("Student Name "+name);
//        System.out.println("College name"+ clgname);
//        System.out.println(" Student Enroll no"+x);

        StaticVariable s = new StaticVariable();
        s.x =333;
        s.y =444;

        StaticVariable s2 = new StaticVariable();
        s2.y = 100;
        System.out.println(s.x+" "+s.y);
        System.out.println(s2.x+" "+s2.y);
    }
}
