package com.canteen.canteen_back.entity;

public class People
{
    private int id;
    private String name;
    private String password;

    public People()
    {

    }

    public People(int id_, String name_)
    {
        this.id = id_;
        this.name = name_;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getPassword()
    {
        return password;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}
