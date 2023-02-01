// good, except:
// TODO: this assignment asked you to actually create a new String (i.e. define it in a variable), and not just print a result
public class NegatePhrase {
    public static void main(String[] args) {
        String a = args[0];

        if (a.substring(0,3).equals("not")) {
            System.out.println(a);
        }else{
            System.out.println("not " + a);
        }
    }
}
