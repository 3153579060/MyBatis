package com.mybatis.mapper;

import com.mybatis.pojo.Usen;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface userMapper {
    int serUesr();
    int selectUesr(String usename, int id);
    Integer serUsesrr(Usen usen);

}
