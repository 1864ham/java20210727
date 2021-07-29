package variable;

public class CharEx {
//    char c4;
    char c4 = '\u0000';
    public static void main(String[] args) {
        char c1 = 'A'; //65
        char c2 = '0'; //48
        char c3 = 'a'; //97

        System.out.print(c1);
        System.out.print(c2);
        System.out.print(c3+"\n");
        System.out.println(new CharEx().c4);
        System.out.println();
        System.out.print("Take on Me");
        System.out.println(Integer.parseInt("123"));
        System.out.println(c1+1);
        System.out.println(++c1);
    }
}
