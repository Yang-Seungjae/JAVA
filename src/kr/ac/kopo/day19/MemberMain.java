package kr.ac.kopo.day19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import kr.ac.kopo.day18.Member;

public class MemberMain {

	public static void main(String[] args) {

		List<Member> members = new ArrayList<>();
		members.add(new Member("aaa", "1111"));
		members.add(new Member("bbb", "2222"));
		members.add(new Member("ccc", "3333"));
		members.add(new Member("ddd", "4444"));

		Scanner sc = new Scanner(System.in);
		System.out.println("*** 비밀번호 변경서비스 ***");
		System.out.print("아이디를 입력 : ");
		String id = sc.nextLine(); 

		int idx = members.indexOf(new Member(id)); // 해당 객체의 값이 인덱스 몇번에 위치해? ==> indexOf 메소드 사용
		// elements 위치에  객체가 들어갈 경우 hashcode(), equals(), 가 같아야 동일한것으로 인식하기때문에 무조건 두 메소드를 정의해야 사용가능
		if (idx == -1) { // 인덱스 값을 찾지 못했을 경우 -1 이나옴
			System.out.println("입력하신 아이디 [" + id + "]는 존재하지 않습니다");
			System.out.println("서비스를 종료합니다");
			System.exit(0);
		}
		Member mem = members.get(idx);

		System.out.print("패스워드를 입력하세요 : ");
		String password = sc.nextLine();
		if (!mem.getPassword().equals(password)) {
			System.out.println("패스워드가 올바르지 않습니다");
			System.out.println("서비스를 종료합니다");
			System.exit(0);
		}

		System.out.print("변경할 패스워드를 입력하세요 : ");
		password = sc.nextLine();
		mem.setPassword(password);
		System.out.println("패스워드 변경을 완료하였습니다");

		System.out.println("-----------------------------");
		System.out.println("\t전체회원 정보 출력");
		System.out.println("-----------------------------");
		System.out.println("아이디\t패스워드");
		System.out.println("-----------------------------");
		for (Member m : members) {
			System.out.println(m.getId() + "\t" + m.getPassword());
		}
		System.out.println("-----------------------------");

	}
}
