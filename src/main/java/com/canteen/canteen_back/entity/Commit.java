package com.canteen.canteen_back.entity;

public class Commit
{
    private String name;
    private String commit;

    Commit(String name_,String commit_){
        this.name=name_;
        this.commit=commit_;
    }

    Commit(){}

    public void setName(String name)
    {
        this.name = name;
    }

    public void setCommit(String commit)
    {
        this.commit = commit;
    }

    public String getName()
    {
        return name;
    }

    public String getCommit()
    {
        return commit;
    }
}
