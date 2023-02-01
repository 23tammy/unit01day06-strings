// good, except:
public class NegatePhrase {
    public static void main(String[] args) {
        String a = args[0];

        if (a.substring(0,3).equals("not")) {
            String b = a;
            System.out.println(b);
        }else{
            String b = ("not " + a);
            System.out.println(b);
        }
    }
}
