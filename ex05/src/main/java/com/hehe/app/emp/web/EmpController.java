package com.hehe.app.emp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.hehe.app.emp.service.EmpService;
import com.hehe.app.emp.service.EmpVO;

@Controller
public class EmpController {
	@Autowired
	EmpService empservice;
	
	@GetMapping("empList")
	public String empList(Model m) {
		m.addAttribute("empList",empservice.selectAll());
		return "emp/empList";
	}
	
	@GetMapping("empInfo")
	public String empInfo(EmpVO vo,Model m) {
		EmpVO find=empservice.selectEmpInfo(vo);
		m.addAttribute("empInfo",find);
		return "emp/empInfo";
	}
	
	@GetMapping("InsertEmp")
	public String InsertForm(Model m) {
		m.addAttribute("empVO",new EmpVO());
		return "emp/InsertEmp";
	}
	
	@PostMapping("InsertEmp")
	public String empInsertprocess(EmpVO vo) {
		empservice.insertEmpInfo(vo);
		return "redirect:/empList";
	}
}
