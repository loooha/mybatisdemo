package part03.main;

import java.util.List;

import part03.controller.EmpDeptController;
import part03.dto.DeptDTO;
import part03.dto.EmpDTO;

public class MenuMain {

	public static void main(String[] args) {
		EmpDeptController eDeptController = new EmpDeptController();
//		List<EmpDTO> aList = eDeptController.empdeptProcess();
//		for (EmpDTO eDto : aList) {
//			System.out.printf("%d %s %s %d %s\n", eDto.getEmployee_id(), eDto.getFirst_name(), eDto.getJob_id(),
//					eDto.getDept().getDepartment_id(), eDto.getDept().getDepartment_name());
//		}

//		List<DeptDTO> aList = eDeptController.deptempProcess();
//		for (DeptDTO ddto : aList) {
//			for (EmpDTO edto : ddto.getEmpList()) {
//				System.out.printf("%d %s %d %s %s\n", ddto.getDepartment_id(), ddto.getDepartment_name(),
//						edto.getEmployee_id(), edto.getFirst_name(), edto.getJob_id());
//			}
//		}

//		List<EmpDTO> aList = eDeptController.partProcess();
//		for (EmpDTO dto : aList) {
//			System.out.printf("%d %s %s %d\n", dto.getEmployee_id(), dto.getFirst_name(), dto.getJob_id(),
//					dto.getDepartment_id());
//		}
		
		List<EmpDTO> aList = eDeptController.emp_dept_locProcess();
		for (EmpDTO eDto : aList) {
			System.out.printf("%d %s %s %s\n", eDto.getEmployee_id(), eDto.getFirst_name(), eDto.getDept().getDepartment_name(), eDto.getLdto().getCity());
		}

	}
}
