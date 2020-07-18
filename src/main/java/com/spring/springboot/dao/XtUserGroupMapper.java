package com.spring.springboot.dao;

import com.spring.springboot.entity.XtUserGroup;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface XtUserGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xt_user_group
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("userMi") String userMi, @Param("funcName") String funcName);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xt_user_group
     *
     * @mbg.generated
     */
    int insert(XtUserGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xt_user_group
     *
     * @mbg.generated
     */
    List<XtUserGroup> selectAll();
}