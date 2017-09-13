package no.weather.models;

import javax.xml.bind.annotation.*;

/**
 * Created by ng20 on 11.09.2017.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Symbol {
    @XmlAttribute(name = "numberEx")
    private String numberEx;
    @XmlAttribute(name = "var")
    private String var;
    @XmlAttribute(name = "name")
    private String name;
    @XmlAttribute(name = "number")
    private String number;

    public String getNumberEx ()
    {
        return numberEx;
    }

    public void setNumberEx (String numberEx)
    {
        this.numberEx = numberEx;
    }

    public String getVar ()
    {
        return var;
    }

    public void setVar (String var)
    {
        this.var = var;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getNumber ()
    {
        return number;
    }

    public void setNumber (String number)
    {
        this.number = number;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [numberEx = "+numberEx+", var = "+var+", name = "+name+", number = "+number+"]";
    }
}
