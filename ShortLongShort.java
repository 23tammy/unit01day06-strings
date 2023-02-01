public class ShortLongShort {
    public static void main(String[] args) {
        String a = args[0];
        String b = args[1];

        if (a.length() > b.length()){
            String c = b + a + b;
            System.out.println(c);
        }else{
            String c = a + b + a;
            System.out.println(c);
        }
    }
}
