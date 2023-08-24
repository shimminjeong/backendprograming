package kr.ac.kopo.member.dao;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.member.vo.LoginVO;
import kr.ac.kopo.member.vo.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public MemberVO login(LoginVO loginVO) {
		//1개만 가져오니까 selectOne
		MemberVO memberVO = sqlSessionTemplate.selectOne("springboard.member.dao.MemberDAO.login", loginVO);
		return memberVO;
	}

	@Override
	public void join(MemberVO memberVO) {
		sqlSessionTemplate.insert("springboard.member.dao.MemberDAO.join", memberVO);
		
	}  

}
