package cn.tsxygfy.beyond.mapper;

import cn.tsxygfy.beyond.model.po.LoginLog;

import java.util.List;

public interface LoginLogMapper {
    Long deleteByPrimaryKey(Long id);

    Long insert(LoginLog record);

    LoginLog selectByPrimaryKey(Long id);

    List<LoginLog> selectAll();

    Long updateByPrimaryKey(LoginLog record);
}