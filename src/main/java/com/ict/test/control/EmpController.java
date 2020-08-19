package com.ict.test.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ict.test.mapper.EmpDAO;
import com.ict.test.vo.EmpVO;

@RestController
public class EmpController {
	@Autowired 
	EmpDAO empDAO;

	@RequestMapping("/emp_all.inc")
	public ModelAndView emp_all( ) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("emp_all");
		EmpVO[] ar = empDAO.getAll();
		mv.addObject("ar", ar);
		return mv;
	}
	
}
