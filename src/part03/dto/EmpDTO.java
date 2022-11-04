package part03.dto;

public class EmpDTO {
	private int employee_id, department_id;
	private String first_name, job_id;
	private DeptDTO dept;
	private LocDTO ldto;

	public EmpDTO() {
		// TODO Auto-generated constructor stub
	}

	public LocDTO getLdto() {
		return ldto;
	}

	public void setLdto(LocDTO ldto) {
		this.ldto = ldto;
	}

	public DeptDTO getDept() {
		return dept;
	}

	public void setDept(DeptDTO dept) {
		this.dept = dept;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getJob_id() {
		return job_id;
	}

	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}

}
