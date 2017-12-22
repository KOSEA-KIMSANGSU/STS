package com.develop.web;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.develop.domain.MemberVO;
import com.develop.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MemberDAOTest {
	
	@Inject
	private MemberDAO memberDao;

	@Test
	public void testDeleteMember() throws Exception {
		
		String m_uid = "spring4";
		memberDao.deleteMember(m_uid);
		
		//memberDao.deleteMember("spring4");	
	}
	
	@Test
	public void testUpdateMember() throws Exception {
	
		MemberVO memberVo = new MemberVO();
		memberVo.setM_uid("spring4");
		memberVo.setM_phone("010-1234-5678");
		
		memberDao.updateMember(memberVo);
	}
	
	
	//@Test
	public void testSelectMemberAll() throws Exception {
		List<MemberVO> memberVoList = new ArrayList<MemberVO>();
		memberVoList = memberDao.selectMemberAll();
		
		System.out.println(memberVoList);
/*		for(int index=0; index<memberVoList.size(); index++) {
			
			System.out.println("�������̵�: " + memberVoList.get(index).getM_uid());
		}*/
	}
	
	
	//@Test
	public void testSelectMember() throws Exception {
		
		String search_m_uid = "spring4";
		
		MemberVO memberVo = new MemberVO();
		memberVo = memberDao.selectMember(search_m_uid);
		
		if(memberVo==null) {
			System.out.println("��ȸ�� ����� �����ϴ�.");
		} else {
			System.out.println("��ȸ���̵�: " + search_m_uid);
			System.out.println("���: "       + memberVo.getM_pwd());
			System.out.println("�̸�: "       + memberVo.getM_name());
			System.out.println("�̸���: "     + memberVo.getM_email());
			System.out.println("�ֹι�ȣ: "   + memberVo.getM_ssn());
			System.out.println("�湮Ƚ��: "   + memberVo.getM_visit());
			System.out.println("������: "     + memberVo.getM_regdate().toLocaleString());
		}
	}
	
	//@Test
	public void testInsertMember() throws Exception {
		
/*		MemberVO vo = new MemberVO();
		vo.setM_uid("spring4");
		vo.setM_pwd("PW4444");
		vo.setM_name("������4");
		vo.setM_ssn("820221-2323765");
		vo.setM_email("rlatkdtn97@gami.com");
		vo.setM_phone("053-777-1255");
*/
		
		//vo.setM_regdate("");
		//vo.setM_visit(0);
		//vo.setM_lastvisit("");
		
/*		System.out.println(vo);
		System.out.println(vo.getM_uid());
		System.out.println(vo.getM_pwd());
		System.out.println(vo.getM_name());
		System.out.println(vo.getM_ssn());
		System.out.println(vo.getM_email());*/
		
		//memberDao.insertMember(vo);
		
	}
		
	@Test
	public void testTime() throws Exception {
		String time = memberDao.getTime();
		System.out.println("time: " + time);
	}	
}
