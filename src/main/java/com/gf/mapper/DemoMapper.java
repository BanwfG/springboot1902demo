package com.gf.mapper;

import com.gf.pojo.Demo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface DemoMapper {
    @Select("select * from Demo where name=#{name}")
    public List<Demo> likeName(String name);
    @Select("select * from Demo where id=#{id}")
    public List<Demo> likeId(long id);
    @Select("select name from Demo where id=#{id}")
    public List<Demo> getNameById(long id);
    @Insert("insert into Demo(name) values(#{name}")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    public void save(Demo demo);
}
