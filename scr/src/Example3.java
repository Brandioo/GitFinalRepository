public class Example3 {
    public static void main(String[] args)
    {
        String s1;
        s1="Java";
        StringBuilder sb=new StringBuilder();
        sb.append(s1);
        sb.reverse();
        System.out.println(sb.toString());

        String s2;
        s2="Programmer";
        String result=s2.substring(0,5);
        System.out.println(result);
    }
}
