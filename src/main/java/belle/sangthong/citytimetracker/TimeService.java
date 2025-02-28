package belle.sangthong.citytimetracker;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class TimeService {


    Map<String,Integer> cities = Map.of("tokyo",8, "bangkok",6, "new york",-6);

    public String getCurrentTimeInCity(String city) {
        Integer i = cities.get(city);
        if (city != null) {
            return LocalDateTime.now().plusHours(i).toString();
        } else {
            return "Unknown city";
        }
//        switch (city) {
//            case "Bangkok":
//                return LocalDateTime.now().plusHours(6).toString();
//            case "New York":
//                return LocalDateTime.now().minusHours(6).toString();
//            default:
//                return "Unknown city";
//        }
    }

    public Set<String> getCities() {
        return cities.keySet();
    }
}
