//by mschro67

package Chapter2;

public class Ex6{
    public static void main(String[] args) {
        boolean a = true, b = false, c, d, e, f, g;
        c=a^b;
        d=!a||b;
        e=(d&&!c)||!a;
        f=(d==e)||(d!=e);
        g=5==7;

        System.out.println("a: "+a+", b: "+b+", c: "+c+", d: "+d+", e: "+e+", f: "+f+", g: "+g);
    }
}
