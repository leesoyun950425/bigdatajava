package string�׽�Ʈ;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ���Խ��׽�Ʈ {

	public static void main(String[] args) {
		String[] data = {"bat","baby","bonus","cA","ca","co","c.","c0","car","combat","count","date","disc"};
		System.out.println(data.length);
		String s2 = "Hi, Hello!! call";
		String s4 = "Hi7, Hello! call";
		
		String[] s3 = s4.split("H[a-z][0-9]");
		for (String s : s3) {
			System.out.println(s);
		}
		  // c�� �����ϴ� 2���� ã��(ca, co)
	      System.out.println("c�� �����ϴ� 2���� ã��");
	      System.out.println("-----------------");
	      Pattern p = Pattern.compile("c[a-z]");
	      for (int i = 0; i < data.length; i++) {
	         Matcher match = p.matcher(data[i]);
	         if (match.matches()) {
	            System.out.println(data[i]);
	         }
	      }
	      System.out.println("-----------------");
	      System.out.println();
	      
	      // a�� �����ϴ� ���� ã��
	      System.out.println("a�� �����ϴ� ���� ã��");
	      System.out.println("-----------------");
	      Pattern p2 = Pattern.compile(".*a.*");
	      for (int i = 0; i < data.length; i++) {
	         Matcher match = p2.matcher(data[i]);
	         if (match.matches()) {
	            System.out.println(data[i]);
	         }
	      }
	      System.out.println("-----------------");
	   }
	

}
