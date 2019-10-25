package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import bean.Student;

public interface StudentMapper {
	Student selectStudent(long id);

	void insert(Student student);

	void deleteByPrimaryKey(long l);

	void updateByPrimaryKey(Student student);

	List<Student> selectByNameAndAge(Student studentParm);

	List<Student> selectInNames(@Param("names")List<String> names); 

}
