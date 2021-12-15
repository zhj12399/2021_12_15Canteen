package com.canteen.canteen_back.mapper;

import com.canteen.canteen_back.entity.Commit;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

@Component(value = "RecipeMapper")
public interface RecipeMapper
{
    @Select("select star from recipe where name=#{name}")
    int SelectStarByName(String name);

    @Update("update recipe set star=#{star} where name=#{name}")
    void UpdateStarByName(int star, String name);

    @Select("select name,commit from menu_#{id} order by id desc limit 10")
    Commit[] SelectCommitByID(int id);

    @Select("select id from recipe where name=#{name}")
    int SelectIDByName(String name);

    @Insert("insert into menu_#{id}(id, name, commit) values (null,#{name},#{commit})")
    void InsertCommitByID(int id, String name, String commit);
}
