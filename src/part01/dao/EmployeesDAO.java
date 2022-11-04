package part01.dao;
/*
 * apahe.org -> iBatis -> jdk1.4 이상
 * google.com -> myBatis -> jdk1.5 이상
 */

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import part01.dto.EmpDTO;

public class EmployeesDAO {
	private SqlSession session;

	public EmployeesDAO() {
		// 1. 트랜젝션이 설정되어 있는 파일의 경로를 정의한다.
		String resource = "config/configuration.xml";

		// 2. 설정 파일을 로딩하기 위해 입출력스트림과 연결한다.
		try (Reader reader = Resources.getResourceAsReader(resource)) {

			// 3. 설정파일을 저장하기 위한 팩토리를 생성해 줄 수 있는 빌더를 생성한다.
			SqlSessionFactoryBuilder sqlBuilder = new SqlSessionFactoryBuilder();

			// 4. 설정파일의 정보를 읽어와 sqlBuilder에 생성한다.
			SqlSessionFactory factory = sqlBuilder.build(reader);

			// 5. 쿼리문에 접근할 수 있도록 sqlSession객체를 리턴한다.
			// openSession( )의 기본값은 false이다.
			// 자동 커밋을 설정하고 싶으면 openSession(true)로 설정한다.
			// 실무에서는 자동커밋을 하지 않는다.
			session = factory.openSession(true);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}// end EmployeeDAO()

	public int countMethod() {
		// namespace.id
		return session.selectOne("emp.cnt");
	}// end countMethod()

	public List<EmpDTO> listMethod() {
		return session.selectList("emp.list");
	}

	public List<EmpDTO> searchMethod(String data) {
		return session.selectList("emp.searchList", data);
	}
}// end class
