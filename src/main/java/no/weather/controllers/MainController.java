package no.weather.controllers;

import no.weather.models.City;
import no.weather.models.Weatherdata;
import no.weather.services.AllCity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.net.URL;

@Controller
@RequestMapping("/")
@Component
public class MainController {

    @Value("${path.to.noreg}")
    public String pathToNoreg;

    @Autowired
    private AllCity allCity;

    @RequestMapping(method = RequestMethod.GET)
    public String home() {
        return "main";
    }

    @RequestMapping(value = "/getWeatherByCityName",method = RequestMethod.GET)
    public ResponseEntity<?> getWeather(@RequestParam(value="byNavn")String byNavn) throws IOException, JAXBException {
        City city = allCity.getCityByName(byNavn);

        URL url = new URL(city.getUrl());
        JAXBContext jaxbContext = JAXBContext.newInstance(Weatherdata.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Weatherdata weatherdata = (Weatherdata) jaxbUnmarshaller.unmarshal(url);
        return ResponseEntity.ok(weatherdata);
    }
}
