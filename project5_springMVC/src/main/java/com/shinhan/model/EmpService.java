package com.shinhan.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.shinhan.dto.EmpVO;

//@Component
@Service("eService")
public class EmpService {
	@Autowired
	@Qualifier("empDAOMybatis")
	EmpDAOInterface dao;
	//EmpDAOMybatis dao;

	public int empInsert(EmpVO emp) {
		return dao.empInsert(emp);		
	}

	public int empDelete(int empid) {
		System.out.println(empid+"76?&&?==============================================");
	
		return dao.empDelete(empid);
	}
	
	public int empUpdate(EmpVO emp) {
		return dao.empUpdate(emp);		
	}
	
	public EmpVO loginCheck(String email, int password) {
		return dao.loginCheck(email, password);
	}
	
	public EmpVO selectById(int empid) {
		return dao.selectById(empid) ;
	}

	public List<EmpVO> selectAll(ArrayList<Integer> deptid, String jobid, int sal, String hiredate) {
		return dao.selectAll(deptid, jobid, sal, hiredate);
	}

	public List<EmpVO> selectManagerAll() {
		return dao.selectManagerAll();
	}
}