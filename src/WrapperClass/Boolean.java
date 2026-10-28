package WrapperClass;

public class Boolean {
    public Boolean(String yes) {
    }

    public static void main(String[] args) {
        Boolean x = new Boolean("yes");
        Boolean y = new Boolean("no");
        System.out.println(x.equals(y));

    }
}
