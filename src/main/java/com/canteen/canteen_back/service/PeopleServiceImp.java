package com.canteen.canteen_back.service;

import com.canteen.canteen_back.mapper.PeopleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleServiceImp implements PeopleService
{
    @Autowired
    PeopleMapper peopleMapper;

    @Override
    public String GetPasswordByName(String name)
    {
        return peopleMapper.SelectPasswordByName(name);
    }

    @Override
    public int GetIdByName(String name)
    {
        return peopleMapper.SelectIdByName(name);
    }

    @Override
    public Boolean ExistSameName(String name)
    {
        return peopleMapper.SelectSameName(name) != 0;
    }

    @Override
    public void AddPeople(String name, String password)
    {
        peopleMapper.InsertAddPeople(name, password);
    }

    @Override
    public String GetNameById(int id)
    {
        String user_name = peopleMapper.SelectNameById(id);
        if (user_name != null)
        {
            return user_name;
        }
        else
        {
            return "0";
        }
    }
}
