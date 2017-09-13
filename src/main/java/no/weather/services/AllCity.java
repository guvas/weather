package no.weather.services;


import no.weather.models.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@Service
public class AllCity {

    @Value("${path.to.noreg}")
    public String pathToNoreg;

    private List<City> cityList;

    private City city;

    @Autowired
    public AllCity(){

    }
    @PostConstruct
    public List<City> getCityList(){
        return cityList;
    }
    public City getCityByName(String byNavn){
        city = new City();
        for (City citys:cityList) {
            if(citys.getByNavn().equals(byNavn)) {
                city = citys;
                return city;
            }
        }
        return null;
    }
    @PostConstruct
    public void init() throws FileNotFoundException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(pathToNoreg).getFile());
        Scanner sc = new Scanner(file);
        city = new City();
        String url = null;
        cityList = new ArrayList<City>();
        sc.nextLine();
        while (sc.hasNextLine()){
            String[] temp = sc.nextLine().split("\\s+");
            for(int i = 0; i < temp.length; i++){
                if(temp[i].startsWith("http")&& temp[i].endsWith("varsel.xml")){
                    url = temp[i];
                }
            }
            int postnummer = Integer.parseInt(temp[0]);
            cityList.add(new City(temp[1],postnummer,url));
        }
    }
}
