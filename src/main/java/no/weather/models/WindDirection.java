package no.weather.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * Created by ng20 on 11.09.2017.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class WindDirection {
    @XmlAttribute(name = "deg")
    private String deg;
    @XmlAttribute(name = "name")
    private String name;
    @XmlAttribute(name = "code")
    private String code;

    public String getDeg ()
    {
        return deg;
    }

    public void setDeg (String deg)
    {
        this.deg = deg;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getCode ()
    {
        return code;
    }

    public void setCode (String code)
    {
        this.code = code;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [deg = "+deg+", name = "+name+", code = "+code+"]";
    }
}