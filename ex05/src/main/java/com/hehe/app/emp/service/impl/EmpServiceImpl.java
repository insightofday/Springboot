package com.hehe.app.emp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hehe.app.emp.mapper.EmpMapper;
import com.hehe.app.emp.service.EmpService;
import com.hehe.app.emp.service.EmpVO;
@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpMapper empmapper;
	
	@Override
	public List<EmpVO> selectAll() {
		return empmapper.selectAll();
	}

	@Override
	public EmpVO selectEmpInfo(EmpVO vo) {
		return empmapper.selectEmpInfo(vo);
	}

	@Override
	public int insertEmpInfo(EmpVO vo) {
		return empmapper.insertEmpInfo(vo);
	}

}
