package com.develop.domain;

import java.util.Date;

public class MemberVO {

	private String m_uid;
	private String m_pwd;
	private String m_name;	
	private String m_ssn;	
	private String m_email;	
	
	
	private String m_phone;
	private Date   m_regdate;   // 테이블 컬럼타입 datetime
	private int    m_visit;     // 테이블 컬럼타입 int
	private Date   m_lastvisit; // 테이블 컬럼타입 datetime
	
	public String getM_uid() {
		return m_uid;
	}
	public void setM_uid(String m_uid) {
		this.m_uid = m_uid;
	}
	public String getM_pwd() {
		return m_pwd;
	}
	public void setM_pwd(String m_pwd) {
		this.m_pwd = m_pwd;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_ssn() {
		return m_ssn;
	}
	public void setM_ssn(String m_ssn) {
		this.m_ssn = m_ssn;
	}
	public String getM_email() {
		return m_email;
	}
	public void setM_email(String m_email) {
		this.m_email = m_email;
	}
	
	
	public String getM_phone() {
		return m_phone;
	}
	public void setM_phone(String m_phone) {
		this.m_phone = m_phone;
	}
	public Date getM_regdate() {
		return m_regdate;
	}
	public void setM_regdate(Date m_regdate) {
		this.m_regdate = m_regdate;
	}
	public int getM_visit() {
		return m_visit;
	}
	public void setM_visit(int m_visit) {
		this.m_visit = m_visit;
	}
	public Date getM_lastvisit() {
		return m_lastvisit;
	}
	public void setM_lastvisit(Date m_lastvisit) {
		this.m_lastvisit = m_lastvisit;
	}
}
