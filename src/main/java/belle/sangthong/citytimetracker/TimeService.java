package belle.sangthong.citytimetracker;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class TimeService {


    Map<String,Integer> cities = Map.of("tokyo",8, "bangkok",6, "new york",-6);

    ArrayList<String> cityList = new ArrayList<>();

    public String getCurrentTimeInCity(String city) {
        Integer i = cities.get(city);

        if (city != null) {
            cityList.add(city);
            return LocalDateTime.now().plusHours(i).toString();
        } else {
            return "Unknown city";
        }
    }

    public List<String> getCities() {
        return cityList;
    }
}
