import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str1=sc.nextLine();
        String str2="CAMBRIDGE";
        String str3="";
        str1=str1.toUpperCase();
        for(int i=0;i<str1.length();i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j))
                {
                    str3=str1-str1.charAt(i);
                }

            }

        }
        System.out.println(str3);

    }
}
