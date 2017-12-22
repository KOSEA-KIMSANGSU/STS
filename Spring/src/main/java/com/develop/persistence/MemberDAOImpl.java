package com.develop.persistence;

import java.util.List;

import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.develop.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{
	
	@Inject
	private SqlSession sqlSession;	
	private static final String namespace = "com.develop.mapper";

	@Override
	public List<MemberVO> selectMemberAll() {
		//List<MemberVO> memberVoList = sqlSession.selectList(namespace+".selectMemberAll");
		//return memberVoList;
		
		return sqlSession.selectList(namespace+".selectMemberAll");
	}

	@Override
	public MemberVO selectMember(String m_uid) {
		MemberVO memberVo = (MemberVO) sqlSession.selectOne(namespace+".selectMember", m_uid);		
		return memberVo;
	}

	@Override
	public void insertMember(MemberVO vo) {
		sqlSession.insert(namespace+".insertMember", vo);
		
	}
	
	@Override
	public String getTime() {
		
		return sqlSession.selectOne(namespace+".getTime");
		//return sqlSession.selectOne("com.develop.mapper.memberMapper.getTime");
	}

	@Override
	public void updateMember(MemberVO vo) throws Exception {
		
		sqlSession.update(namespace+".updateMember", vo);
	}
	
}
