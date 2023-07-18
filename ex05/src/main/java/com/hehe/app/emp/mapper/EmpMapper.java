package com.hehe.app.emp.mapper;

import java.util.List;

import com.hehe.app.emp.service.EmpVO;

public interface EmpMapper {
	public List<EmpVO> selectAll();
	
	public EmpVO selectEmpInfo(EmpVO vo);
	
	public int insertEmpInfo(EmpVO vo);
	
	
}
