// good
public class Abbreviate {
    public static void main(String[] args) {
        String a = args[0];
        String b;

        if (a.length() < 8){
            b = a;
            System.out.println(b);
        }else{
            int beforeLastLetter = a.length() - 2;
            int lastLetter = a.length();
            b = (a.substring(0,2) + "..." + a.substring(beforeLastLetter, lastLetter));
            System.out.println(b);
        }
    }
}
