package com.canteen.canteen_back.controller;

import com.canteen.canteen_back.entity.Commit;
import com.canteen.canteen_back.service.PeopleService;
import com.canteen.canteen_back.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/Recipe/")
public class RecipeController
{
    @Autowired
    RecipeService recipeService;
    @Autowired
    PeopleService peopleService;

    @RequestMapping(value = "GetStarByName", method = RequestMethod.POST)
    int GetStarByName(@RequestParam("name") String name)
    {
        return recipeService.GetStarByName(name);
    }

    @RequestMapping(value = "AddStarByName", method = RequestMethod.POST)
    int AddStarByName(@RequestParam("name") String name)
    {
        return recipeService.AddStarByName(name);
    }

    @RequestMapping(value = "GetCommitByName", method = RequestMethod.POST)
    Commit[] GetCommitByName(@RequestParam("name") String name)
    {
        return recipeService.GetCommitByName(name);
    }

    @RequestMapping(value = "AddCommitByID", method = RequestMethod.POST)
    Commit[] AddCommitByName(@RequestParam("id") String userid,
                             @RequestParam("name") String name,
                             @RequestParam("commit") String commit)
    {
        String user_name = peopleService.GetNameById(Integer.parseInt(userid));
        recipeService.AddCommitByName(user_name, name, commit);
        return recipeService.GetCommitByName(name);
    }
}
