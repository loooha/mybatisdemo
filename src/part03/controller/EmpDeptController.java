package part03.controller;

import java.util.List;

import part03.dto.DeptDTO;
import part03.dto.EmpDTO;
import part03.dao.JoinDAO;

public class EmpDeptController {
	private JoinDAO dao;

	public EmpDeptController() {
		dao = new JoinDAO();
	}

	public List<EmpDTO> empdeptProcess() {
		return dao.emp_deptMethod();
	}

	public List<DeptDTO> deptempProcess() {
		return dao.dept_empMethod();
	}

	public List<EmpDTO> partProcess() {
		return dao.partMethod();
	}
}
