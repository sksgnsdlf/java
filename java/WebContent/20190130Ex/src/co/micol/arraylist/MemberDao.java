package co.micol.arraylist;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

public class MemberDao {
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	private MemberDto dto;

	private String driver;
	private String url;
	private String user;
	private String password;
	// ---------------여기까지가 기본문구
	public MemberDao() {
		try {
			try {
				setProperties(); //프로퍼티 파일을 읽어옴
			} catch (IOException e) {
				e.printStackTrace();
			}
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void setProperties() throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		String path = "config/dbconnector.properties"; //해당 경로에있는 파일을 사용할예정
		//System.out.println(path);
		path = URLDecoder.decode(path,"utf-8"); //프로퍼티 파이란에 한글이 존재할때
		properties.load(new FileReader(path));
		driver = properties.getProperty("driver");
		url = properties.getProperty("url");
		user = properties.getProperty("user");
		password = properties.getProperty("password");
	}
	
	public ArrayList<MemberDto> select(){
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		String sql = "select * from member";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			//리스트 구조 만들기
			while(rs.next()) {
				dto = new MemberDto();
				dto.setMemberNum(rs.getInt("membernum")); //DB 테이블 속성명을 적어야함
				dto.setMemberId(rs.getString("memberid"));
				dto.setMemberPw(rs.getString("memberpw"));
				dto.setMemberName(rs.getString("membername"));
				dto.setMemberTel(rs.getString("membertel"));
				dto.setMemberAddr(rs.getString("memberaddr"));
				dto.setRegisterDay(rs.getDate("registerday"));
				dto.setSecessionDay(rs.getDate("secesseday"));
				list.add(dto); //리스트에 DB 테이블 속성명을 추가한것
			}
		}catch (SQLException e) {
			
		}finally {
			try {
				if(rs != null) rs.close();
				if(psmt != null ) psmt.close();
				if(conn != null) conn.close();
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public int insert(MemberDto dto) {
		int n =0;
		String sql = "insert into member(membernum, memberid, memberpw,membername,membertel) values(?,?,?,?,?)";
		try{
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, dto.getMemberNum());
			psmt.setString(2, dto.getMemberId());
			psmt.setString(3, dto.getMemberPw());
			psmt.setString(4, dto.getMemberName());
			psmt.setString(5, dto.getMemberTel());
			n = psmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB 연결오류");
		}
		return n;//insert구문을 넣을수 있도록하고(59~66줄) 모든 내용을 n에 담아서 리턴시키도록 n을 지정
	}
}
