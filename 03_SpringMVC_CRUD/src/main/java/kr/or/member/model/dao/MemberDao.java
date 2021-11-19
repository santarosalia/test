package kr.or.member.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.or.member.model.vo.Member;
import kr.or.member.model.vo.MemberRowMapper;

@Repository
public class MemberDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Member selectOneMember(Member member) {
		//pstmt 방식 쿼리문 작성
		String query= "select * from member where member_id=? and member_pw =?";
		// 위치 홀더에 대체되여야할 값을 순서대로 오브젝트 배열로 생성
		Object[] params = {member.getMemberId(),member.getMemberPw()};
		//조회인 경우 jdbct.query 메소드사용
		// -> 매개변수 : 1)쿼리문 , 2) 위치홀더 에 들어갈 값, 3) 결과를 처리할 객체
		List list = jdbcTemplate.query(query,params,new MemberRowMapper());
		if(list.isEmpty()) {
			return null;
			
		}else {
			Member m = (Member)list.get(0);
			return m;
		}
		
	}
	
}
