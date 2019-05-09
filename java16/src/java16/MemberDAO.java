package java16;

import java.util.ArrayList;

public class MemberDAO {
	public ArrayList selectall() {
		MemberDTO m1 = new MemberDTO("100","111","김김김","011");
		MemberDTO m2 = new MemberDTO("200","222","이이이","012");
		MemberDTO m3 = new MemberDTO("300","333","박박박","013");
		
		ArrayList list = new ArrayList();
		//dto를 3개 만들어서 list로 묶으세요.
		//그 리스트를 리턴.
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		return list;
	}
}
