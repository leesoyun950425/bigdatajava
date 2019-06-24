package bean;

import java.util.ArrayList;
import java.util.Random;

public class Statement {
	public static void main(String[] args) {
		InfoDAO dao = new InfoDAO();
		 Random r = new Random();
		 ArrayList<InfoDTO> list = dao.selectAll();
	      int index = 0;
	      int i1 = 0;
	      boolean b = false;
	      int[] rNum = new int[5];
	      while(true) {
	         b =false;
	         index = r.nextInt(list.size());
	         if(i1 ==0) {
	            rNum[i1] = index;
	            i1++;
	         }else if(i1 ==5) {
	            break;
	         }else if(1<=i1 && i1<5) {
	            rNum[i1] = index;
	            System.out.println(i1);
	            for (int j = i1; j >= 0; j--) {
	               for (int k = i1; k >= 0; k--) {
	                  if(j!=k) {
	                     if(rNum[j] != rNum[k]) {
	                        b=true;
	                     }else {
	                        b=false;
	                        j=0;
	                        k=0;
	                     }
	                  }
	               }
	            }
	         }
	         if(b) {
	            i1++;
	         }else {
	         }
	      }
	}
}
