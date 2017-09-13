package no.weather.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "weatherdata")
public class Weatherdata implements Serializable {
    @XmlElement
    private Forecast forecast;

    public Forecast getForecast ()
    {
        return forecast;
    }

    public void setForecast (Forecast forecast)
    {
        this.forecast = forecast;
    }


}