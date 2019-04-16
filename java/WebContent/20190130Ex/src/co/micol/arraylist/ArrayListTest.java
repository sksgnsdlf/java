package co.micol.arraylist;

import java.sql.SQLException;
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		MemberDao dao = new MemberDao(); //Db 연결과 결과를 돌려받음
		MemberDto dto = new MemberDto(); //데이터 변수들의 집합 , insert문 연관(이건 배열이아님)
//		dto.setMemberNum(3); //insert의 첫번째 Num값을 3으로 한것
//		dto.setMemberId("abcdefg");
//		dto.setMemberPw("@1345");
//		dto.setMemberName("박승리");
//		dto.setMemberTel("010-1236-1236");
//		
//		int n = dao.insert(dto);
//		if(n == 0) System.out.println("입력 실패");
//		else System.out.println("정상적으로 입력되었음");
		
		list = dao.select();
		for(MemberDto data : list) {
			data.toString(); //Dto클래스 맨밑에 있는 toString을 말함
		}
	}
}
