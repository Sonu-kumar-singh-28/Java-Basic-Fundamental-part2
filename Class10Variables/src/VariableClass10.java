public class VariableClass10 {
    int x = 10;    // instance variable

    public static void main(String[] args) {
        // System.out.println(x); // ❌ This is not allowed because 'x' is an instance variable.

        // ✅ To access 'x' inside a static method, you must create an object.
        VariableClass10 v = new VariableClass10();
        System.out.println(v.x); // ✅ This is correct.
    }

    // ✅ This is a non-static method, so it can directly access the instance variable.
    public void m1() {
        System.out.println(x); // ✅ No error here.
    }
}
