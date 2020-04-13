package in.rdf.rest.webservices.CityResource;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityResource {

  private static final Logger LOGGER = LoggerFactory
      .getLogger(CityResource.class);

  @Autowired
  private CityService cityService;

  @GetMapping("/get-city")
  public List<City> getCityDetails() {
    LOGGER.info("Enter CityResource.getCityDetails() ");
    generatePassword(); //Use this if you need to generate a new password.
    return cityService.getAllCity();
  }

  private void generatePassword(){
    String password = "Password$@!54321";
    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
    String encode = bCryptPasswordEncoder.encode(password);
    LOGGER.info("encode = " + encode);
  }
}