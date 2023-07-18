package com.hehe.app.emp.service;

import java.util.List;

public interface EmpService {
	
	public List<EmpVO> selectAll();
	
	public EmpVO selectEmpInfo(EmpVO vo);
	
	public int insertEmpInfo(EmpVO vo);
	
}
