package no.weather.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.*;

/**
 * Created by ng20 on 11.09.2017.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class WindSpeed {
    @XmlAttribute(name = "mps")
    private String mps;
    @XmlAttribute(name = "name")
    private String name;

    public String getMps ()
    {
        return mps;
    }

    public void setMps (String mps)
    {
        this.mps = mps;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [mps = "+mps+", name = "+name+"]";
    }
}
