package com.canteen.canteen_back.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component(value = "PeopleMapper")
public interface PeopleMapper
{
    @Select("select password from people where name=#{name}")
    String SelectPasswordByName(String name);

    @Select("select id from people where name=#{name}")
    int SelectIdByName(String name);

    @Select("select name from people where id=#{id}")
    String SelectNameById(int id);

    @Select("select count(*) from people where name=#{name}")
    int SelectSameName(String name);

    @Insert("insert into people(id,name,password)"+
    "values(null,#{name},#{password})")
    void InsertAddPeople(String name,String password);


}
