package java19;

import java.util.ArrayList;

public class ListTest3 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("나는 스트링"); 
		//String(자,작다) -> Object(부,크다)
		//자동형변환, 업캐스팅
		list.add(100);
		System.out.println(list);
		String name = (String)list.get(0);
		//Object(부,크다) -> String(작, 자식)
		//강제형변환, 다운캐스팅
	}

}
