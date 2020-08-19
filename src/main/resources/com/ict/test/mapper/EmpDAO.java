package com.ict.test.mapper;

import java.util.List;
import org.springframework.stereotype.Service;
import com.ict.test.vo.EmpVO;

@Service
public class EmpDAO {
	
	private EmpMapper empMapper;	
	
	public EmpVO[] getAll() throws Exception{
		List<EmpVO> list = empMapper.all();
		EmpVO[] ar = null;
		
		if(list != null && list.size() > 0) {
			ar = new EmpVO[list.size()];
			list.toArray(ar);
		}
		return ar;
	}	
}
