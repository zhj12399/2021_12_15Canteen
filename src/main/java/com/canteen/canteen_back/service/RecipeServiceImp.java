package com.canteen.canteen_back.service;

import com.canteen.canteen_back.entity.Commit;
import com.canteen.canteen_back.mapper.RecipeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeServiceImp implements RecipeService
{
    @Autowired
    RecipeMapper recipeMapper;

    @Override
    public int GetStarByName(String name)
    {
        return recipeMapper.SelectStarByName(name);
    }

    @Override
    public int AddStarByName(String name)
    {
        int star = recipeMapper.SelectStarByName(name);
        recipeMapper.UpdateStarByName(star + 1, name);
        return (star + 1);
    }

    @Override
    public Commit[] GetCommitByName(String name)
    {
        return recipeMapper.SelectCommitByID(recipeMapper.SelectIDByName(name));
    }

    @Override
    public void AddCommitByName(String user_name, String menu_name, String commit)
    {
        recipeMapper.InsertCommitByID(recipeMapper.SelectIDByName(menu_name), user_name, commit);
    }
}
