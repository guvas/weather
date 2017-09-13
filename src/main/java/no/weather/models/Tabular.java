package no.weather.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by ng20 on 11.09.2017.
 */
@XmlRootElement(name = "forecast")
@XmlAccessorType(XmlAccessType.FIELD)
public class Tabular {
    @XmlElement
    private Time[] time;

    public Time[] getTime ()
    {
        return time;
    }

    public void setTime (Time[] time)
    {
        this.time = time;
    }

}
