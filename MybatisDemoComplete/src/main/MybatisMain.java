package main;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import bean.Student;
import generator.example.GeneratorStudent;
import generator.example.GeneratorStudentExample;
import generator.mapper.GeneratorStudentMapper;
import mapper.StudentMapper;



public class MybatisMain {
	
/*	public static void main(String[] agrs) throws Exception{
//		Resources resource = new Resources();
		String resource = "config/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		SqlSession session = sqlSessionFactory.openSession();
		try {
			Student student = (Student)session.selectOne("mapper.myMapper.selectStudent", 8);
			System.out.println("student::"+student.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		
	}*/

	
	/*public static void main(String[] agrs) throws Exception{
//		Resources resource = new Resources();
		String resource = "config/mybatis-config.xml";

				Reader reader = Resources.getResourceAsReader(resource);
				SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader,"mysql2");
				SqlSession session = sqlSessionFactory.openSession();

				try {
					StudentMapper mapper = session.getMapper(StudentMapper.class);
					Student student = mapper.selectStudent((long)8);
					System.out.println("demo2Db student::"+student.toString());

				} catch (Exception e) {
					e.printStackTrace();

				}finally {
					session.close();
			}
	}*/
	
	public static void main(String[] agrs) throws Exception{
//		Resources resource = new Resources();
		generatorTest();
	}
	
	/*private static void insert() throws IOException{
		String resource = "config/mybatis-config.xml";

		Reader reader = Resources.getResourceAsReader(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader,"mysql2");
		
		SqlSession session = sqlSessionFactory.openSession();

		try {
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			Student student = new Student("Insert man",60);
			mapper.Insert(student);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();

		}finally {
			session.close();
		}
	}*/
	
	
	private static void generatorTest() throws IOException{
		String resource = "config/mybatis-config.xml";

		Reader reader = Resources.getResourceAsReader(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader,"mysql2");
		
		SqlSession session = sqlSessionFactory.openSession();

		try {
			GeneratorStudentMapper mapper = session.getMapper(GeneratorStudentMapper.class);
			
			GeneratorStudentExample example = new GeneratorStudentExample();
			
//			example.or().andNameEqualTo("bill");
			example.or().andAgeEqualTo(44);
			List<GeneratorStudent> result = mapper.selectByExample(example);
//			System.out.println(result.get(0).getName());
			System.out.println("select by name and age size : "+result.size());
		} catch (Exception e) {
			e.printStackTrace();

		}finally {
			session.close();
		}
	}
	
	
}
