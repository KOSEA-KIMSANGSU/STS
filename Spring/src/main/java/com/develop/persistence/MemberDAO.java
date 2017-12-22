package com.develop.persistence;

import java.util.List;

import com.develop.domain.MemberVO;

public interface MemberDAO {

	public String getTime();
	
	public void insertMember(MemberVO vo);
	
	public MemberVO selectMember(String m_uid);
	
	public List<MemberVO> selectMemberAll();
	
	public void updateMember(MemberVO vo) throws Exception;
	
	public void deleteMember(String m_uid) throws Exception;
}
