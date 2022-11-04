package part01.controller;

import java.util.List;

import part01.dao.EmployeesDAO;
import part01.dto.EmpDTO;

public class EmpController {

	private EmployeesDAO dao;

	public EmpController() {
		dao = new EmployeesDAO();
	}

	public int countProcess() {
		return dao.countMethod();
	}

	public List<EmpDTO> listProcess() {
		return dao.listMethod();
	}

	public List<EmpDTO> searchProcess(String data) {
		return dao.searchMethod(data);
	}

}
