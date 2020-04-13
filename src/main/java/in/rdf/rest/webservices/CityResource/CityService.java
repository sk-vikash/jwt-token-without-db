package in.rdf.rest.webservices.CityResource;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CityService {

  private static final Logger LOGGER = LoggerFactory.getLogger(CityService.class);
  private static List<City> cities = new ArrayList<>();

  static {
    cities.add(new City("Mumbai", "Maharastra", "India"));
    cities.add(new City("Delhi", "UT", "India"));
    cities.add(new City("Kolkata", "West Bengal", "India"));
    cities.add(new City("Chennai", "Tamilnadu", "India"));
  }

  public List<City> getAllCity() {
    LOGGER.info("CityService.getAllCity() ");
    return cities;
  }
}