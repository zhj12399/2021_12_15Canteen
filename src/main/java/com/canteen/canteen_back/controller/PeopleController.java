package com.canteen.canteen_back.controller;

import com.canteen.canteen_back.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/People/")
public class PeopleController
{
    @Autowired
    PeopleService peopleService;

    @RequestMapping(value = "JudgePassword", method = RequestMethod.POST)
    int JudgePassword(@RequestParam("name") String name,
                      @RequestParam("password") String password)
    {//密码相同返回ID，不正确返回0
        String RightPassword = peopleService.GetPasswordByName(name);
        if (RightPassword != null && RightPassword.equals(password))
        {
            return peopleService.GetIdByName(name);
        }
        else
        {
            return 0;
        }
    }

    @RequestMapping(value = "AddPeople", method = RequestMethod.POST)
    int AddPeople(@RequestParam("name") String name,
                  @RequestParam("password") String password)
    {//用户名重复返回0

        if (!peopleService.ExistSameName(name))
        {
            peopleService.AddPeople(name, password);
            return peopleService.GetIdByName(name);
        }
        else
        {
            return 0;
        }
    }

    @RequestMapping(value = "GetNameById", method = RequestMethod.POST)
    String GetNameById(@RequestParam("id") String id)
    {//用户不存在返回0
        return peopleService.GetNameById(Integer.parseInt(id));
    }
}
