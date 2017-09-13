package no.weather.models;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

/**
 * Created by ng20 on 11.09.2017.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Forecast implements Serializable {
    @XmlElement
    private Tabular tabular;

    public Tabular getTabular ()
    {
        return tabular;
    }

    public void setTabular (Tabular tabular)
    {
        this.tabular = tabular;
    }
}