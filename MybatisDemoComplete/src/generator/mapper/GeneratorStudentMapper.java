package generator.mapper;

import generator.example.GeneratorStudent;
import generator.example.GeneratorStudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GeneratorStudentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Fri Oct 25 10:44:32 CST 2019
     */
    long countByExample(GeneratorStudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Fri Oct 25 10:44:32 CST 2019
     */
    int deleteByExample(GeneratorStudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Fri Oct 25 10:44:32 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Fri Oct 25 10:44:32 CST 2019
     */
    int insert(GeneratorStudent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Fri Oct 25 10:44:32 CST 2019
     */
    int insertSelective(GeneratorStudent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Fri Oct 25 10:44:32 CST 2019
     */
    List<GeneratorStudent> selectByExample(GeneratorStudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Fri Oct 25 10:44:32 CST 2019
     */
    GeneratorStudent selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Fri Oct 25 10:44:32 CST 2019
     */
    int updateByExampleSelective(@Param("record") GeneratorStudent record, @Param("example") GeneratorStudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Fri Oct 25 10:44:32 CST 2019
     */
    int updateByExample(@Param("record") GeneratorStudent record, @Param("example") GeneratorStudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Fri Oct 25 10:44:32 CST 2019
     */
    int updateByPrimaryKeySelective(GeneratorStudent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Fri Oct 25 10:44:32 CST 2019
     */
    int updateByPrimaryKey(GeneratorStudent record);
}