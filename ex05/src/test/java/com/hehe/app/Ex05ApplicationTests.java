package com.hehe.app;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hehe.app.emp.mapper.EmpMapper;
import com.hehe.app.emp.service.EmpVO;

@SpringBootTest
class Ex05ApplicationTests {
	@Autowired
	EmpMapper empmapper;
	
	@Test
	void selectAllTest() {
		List<EmpVO>empList=empmapper.selectAll();
		assertTrue(!empList.isEmpty());
	}
	
	

}
