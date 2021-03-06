package com.spring.springboot.dao;

import com.spring.springboot.entity.XtUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface XtUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xt_user
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String userMi);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xt_user
     *
     * @mbg.generated
     */
    int insert(XtUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xt_user
     *
     * @mbg.generated
     */
    XtUser selectByPrimaryKey(String userMi);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xt_user
     *
     * @mbg.generated
     */
    List<XtUser> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xt_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(XtUser record);
}