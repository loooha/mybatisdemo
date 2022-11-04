package part01.main;

import java.util.List;

import part01.controller.EmpController;
import part01.dto.EmpDTO;

public class EmpMain {

	public static void main(String[] args) {
		EmpController eController = new EmpController();
		System.out.printf("record count:%d\n", eController.countProcess());

		List<EmpDTO> aList = eController.listProcess();
		for (EmpDTO dto : aList) {
			System.out.printf("%d %s %d %s\n", dto.getEmployee_id(), dto.getFirst_name(), dto.getSalary(),
					dto.getHire_date());
		}
		System.out.println("=========SEARCH=================");
		List<EmpDTO> searchList = eController.searchProcess("eve");
		for (EmpDTO dto : searchList) {
			System.out.printf("%d %s %d %s\n", dto.getEmployee_id(), dto.getFirst_name(), dto.getSalary(),
					dto.getHire_date());
		}
	}

}
