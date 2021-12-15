package com.canteen.canteen_back.service;

import com.canteen.canteen_back.entity.Commit;

public interface RecipeService
{
    int GetStarByName(String name);
    int AddStarByName(String name);
    Commit [] GetCommitByName(String name);
    void AddCommitByName(String user_name,String menu_name,String commit);
}
