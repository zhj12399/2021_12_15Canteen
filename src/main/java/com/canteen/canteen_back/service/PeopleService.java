package com.canteen.canteen_back.service;

public interface PeopleService
{
    String GetPasswordByName(String name);
    int GetIdByName(String name);
    Boolean ExistSameName(String name);
    void AddPeople(String name,String password);
    String GetNameById(int id);
}
