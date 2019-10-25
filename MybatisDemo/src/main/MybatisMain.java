package main;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import bean.Student;



public class MybatisMain {
	
	public static void main(String[] agrs) throws Exception{
//		Resources resource = new Resources();
		String resource = "config/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		SqlSession session = sqlSessionFactory.openSession();
		try {
			Student student = (Student)session.selectOne("mapper.myMapper.selectStudent", 1);
			System.out.println("student::"+student.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		
	}

}
