package co.micol.friends;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Friends[] fri = new Friends[5];
		fri[0] = new UniversityFriends("길동", "010-1234-1234", "경영학");
		fri[1] = new UniversityFriends("치국", "010-1236-1236", "컴공");
		fri[2] = new ComapyFriends("기자", "010-2345-2345", "영업부");
		fri[3] = new ComapyFriends("박승리", "010-3456-3456", "기술부");
		fri[4] = new UniversityFriends("김공부", "010-2345-3456", "컴공");
		for(Friends n : fri) {
			n.showInfo();
		}	
	}
}
