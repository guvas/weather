package no.weather.models;

import javax.xml.bind.annotation.*;

/**
 * Created by ng20 on 11.09.2017.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Time {
    @XmlAttribute(name = "to")
    private String to;
    @XmlElement 
    private WindSpeed windSpeed;
    @XmlElement 
    private Symbol symbol;
    @XmlElement 
    private Pressure pressure;
    @XmlElement 
    private WindDirection windDirection;
    @XmlElement 
    private Precipitation precipitation;
    @XmlAttribute(name = "from")
    private String from;
    @XmlAttribute(name = "period")
    private String period;
    @XmlElement 
    private Temperature temperature;

    public String getTo ()
    {
        return to;
    }

    public void setTo (String to)
    {
        this.to = to;
    }

    public WindSpeed getWindSpeed ()
    {
        return windSpeed;
    }

    public void setWindSpeed (WindSpeed windSpeed)
    {
        this.windSpeed = windSpeed;
    }

    public Symbol getSymbol ()
    {
        return symbol;
    }

    public void setSymbol (Symbol symbol)
    {
        this.symbol = symbol;
    }

    public Pressure getPressure ()
    {
        return pressure;
    }

    public void setPressure (Pressure pressure)
    {
        this.pressure = pressure;
    }

    public WindDirection getWindDirection ()
    {
        return windDirection;
    }

    public void setWindDirection (WindDirection windDirection)
    {
        this.windDirection = windDirection;
    }

    public Precipitation getPrecipitation ()
    {
        return precipitation;
    }

    public void setPrecipitation (Precipitation precipitation)
    {
        this.precipitation = precipitation;
    }

    public String getFrom ()
    {
        return from;
    }

    public void setFrom (String from)
    {
        this.from = from;
    }

    public String getPeriod ()
    {
        return period;
    }

    public void setPeriod (String period)
    {
        this.period = period;
    }

    public Temperature getTemperature ()
    {
        return temperature;
    }

    public void setTemperature (Temperature temperature)
    {
        this.temperature = temperature;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [to = "+to+", windSpeed = "+windSpeed+", symbol = "+symbol+", pressure = "+pressure+", windDirection = "+windDirection+", precipitation = "+precipitation+", from = "+from+", period = "+period+", temperature = "+temperature+"]";
    }
}

