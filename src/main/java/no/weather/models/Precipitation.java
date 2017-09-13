package no.weather.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * Created by ng20 on 11.09.2017.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Precipitation {
    @XmlAttribute(name = "minvalue")
    private String minvalue;
    @XmlAttribute(name = "maxvalue")
    private String maxvalue;
    @XmlAttribute(name = "value")
    private String value;

    public String getMinvalue ()
    {
        return minvalue;
    }

    public void setMinvalue (String minvalue)
    {
        this.minvalue = minvalue;
    }

    public String getMaxvalue ()
    {
        return maxvalue;
    }

    public void setMaxvalue (String maxvalue)
    {
        this.maxvalue = maxvalue;
    }

    public String getValue ()
    {
        return value;
    }

    public void setValue (String value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [minvalue = "+minvalue+", maxvalue = "+maxvalue+", value = "+value+"]";
    }
}