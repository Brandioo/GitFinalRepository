import java.util.Scanner;

public class Example {

        public static void main(String []args)
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
            System.out.println(s2.length());

            //Example 8
            System.out.println("Example 8");
            String text1="This is a comparisson";
            String text2="This is something";
            System.out.println(text1.equalsIgnoreCase(text2));

            //Ex-9
            System.out.println("--------------Example 9:-------------------");
            String text3="Java exercises";
            String s;
            Scanner sc=new Scanner(System.in);
            s=sc.nextLine();
            System.out.println(text3.endsWith(s));


        }
    }


