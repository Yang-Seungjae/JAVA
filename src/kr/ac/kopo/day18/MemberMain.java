package kr.ac.kopo.day18;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberMain {
	
	public static void main(String[] args) {
		
		List<Member> members = new ArrayList<>();
		members.add(new Member("aaa", "1111"));
		members.add(new Member("bbb", "2222"));
		members.add(new Member("ccc", "3333"));
		members.add(new Member("ddd", "4444"));
		
//		System.out.println("전체 회원수 : " + members.size());
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** 비밀번호 변경 서비스 ***");
		System.out.print("ID를 입력하세요 : ");
		String id = sc.nextLine();
		int cnt = 0;
		for (int i = 0; i < members.size(); i++) {
			if ((members.get(i)).getId().equals(id)) {// contains가 안되는 이유는?
				break;
			} 
//			else if (cnt == members.size()) {
//				System.out.println("입력하신 [" + id + "]는 존재하지 않습니다.");
//				System.out.println("서비스를 종료합니다.");
//				System.exit(0);
//			}//왜 돌아가나요? 
			else {
				cnt++;
			}
		}
		if(cnt == members.size()) {
			System.out.println("입력하신 [" + id + "]는 존재하지 않습니다.");
			System.out.println("서비스를 종료합니다.");
			System.exit(0);
		}

		System.out.print("현재 패스워드를 입력하세요 : ");
		String password = sc.nextLine();
		int pcnt = 0;
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).getPassword().equals(password)) {// contains가 안되는 이유는?
				break;
			} else {
				pcnt++;
			}

		}
		if (pcnt == members.size()) {
			System.out.println("입력하신 [" + password + "]는 존재하지 않습니다.");
			System.out.println("서비스를 종료합니다.");
			System.exit(0);
			}
		
			System.out.print("변경할 패스워드를 입력하세요 : ");
			String password2 = sc.nextLine();
			for (int i = 0; i < members.size(); i++) {
				if (members.get(i).getPassword().equals(password)) {// contains가 안되는 이유는?
					members.get(i).setPassword(password2);
					break;
				} 
			}
			for (Member m : members) {
				System.out.println(m.getId() + m.getPassword());
			}
	}
}