package com.softusing.xuzhining.domain;

import com.softusing.xuzhining.domain.User;
import com.softusing.xuzhining.domain.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user2
     *
     * @mbg.generated Fri May 19 10:25:24 JST 2023
     */
    long countByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user2
     *
     * @mbg.generated Fri May 19 10:25:24 JST 2023
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user2
     *
     * @mbg.generated Fri May 19 10:25:24 JST 2023
     */
    @Delete({
        "delete from user2",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user2
     *
     * @mbg.generated Fri May 19 10:25:24 JST 2023
     */
    @Insert({
        "insert into user2 (email, password, ",
        "phone, username)",
        "values (#{email,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
        "#{phone,jdbcType=VARCHAR}, #{username,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(User row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user2
     *
     * @mbg.generated Fri May 19 10:25:24 JST 2023
     */
    int insertSelective(User row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user2
     *
     * @mbg.generated Fri May 19 10:25:24 JST 2023
     */
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user2
     *
     * @mbg.generated Fri May 19 10:25:24 JST 2023
     */
    @Select({
        "select",
        "id, email, password, phone, username",
        "from user2",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("com.softusing.xuzhining.domain.UserMapper.BaseResultMap")
    User selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user2
     *
     * @mbg.generated Fri May 19 10:25:24 JST 2023
     */
    int updateByExampleSelective(@Param("row") User row, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user2
     *
     * @mbg.generated Fri May 19 10:25:24 JST 2023
     */
    int updateByExample(@Param("row") User row, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user2
     *
     * @mbg.generated Fri May 19 10:25:24 JST 2023
     */
    int updateByPrimaryKeySelective(User row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user2
     *
     * @mbg.generated Fri May 19 10:25:24 JST 2023
     */
    @Update({
        "update user2",
        "set email = #{email,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "phone = #{phone,jdbcType=VARCHAR},",
          "username = #{username,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(User row);
}