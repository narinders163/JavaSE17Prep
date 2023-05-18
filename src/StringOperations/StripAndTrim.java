package StringOperations;

public class StripAndTrim {
    public static void main(String[] args) {
//        System.out.println("\t abc \n xyz \n");
//        System.out.println("\t abc \n xyz \n".stripLeading());
//        System.out.println("\t abc \n xyz \n".stripTrailing());
//        System.out.println("\t abc \n xyz \n".strip());

        String s = "Hi My name is Narinderpal Singh".indent(5);
        System.out.println(s);
        System.out.println(s.indent(-1));
        System.out.println(s.indent(-2));

        String s1 = "Hi my name is %s and i am living in canada for %d years".formatted("Narinderpal Singh", 7);
        System.out.println(s1);

        StringBuilder sb = new StringBuilder("Narinderpal Singh");
        StringBuilder reverse = sb.reverse();
        System.out.println(reverse);

        for(int i=s.length();i>=1;i--){
            System.out.print(s.charAt(i-1));
        }
    }
}
