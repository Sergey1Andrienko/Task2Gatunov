package com.company;
public class Women extends Human {
    @Override
    public boolean speak(Human m1) {
        return true;
    }

    @Override
    public Human relative(Human m1) {
        if(m1.sex==false)
            return null;
        else return givebaby();
    }

    @Override
    public boolean terpeti(Human m1) {
        if(m1.sex==false)
            return false;
        else return true;
    }

    @Override
    public boolean somethingtime(Human m1) {
        return true;
    }
    public Women( String name,String surname,float casse,float weight)
    {
        this.name=name;
        this.casse=casse;
        this.sex=false;
        this.weight=weight;
        this.surname=surname;
    }
    public  Human givebaby()
    {Human m2=new Men();
        return m2;
    }
}

