package java08;

public class Ch6_22_MemberService {
	
	boolean login(String id, String pw) {
		if (id.equals("yourid") && pw.equals("12345"))return true;
		else return false;
	}
	void logout(String id) {
		System.out.println(id+"님 로그아웃 되었습니다.");
	}

}
