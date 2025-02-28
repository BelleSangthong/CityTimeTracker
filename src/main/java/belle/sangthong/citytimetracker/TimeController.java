package belle.sangthong.citytimetracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TimeController {

    @Autowired
    TimeService tService;

    @GetMapping("/citytimetracker")
    String time(Model model) {
        return "timepage";
    }

    @PostMapping("/citytimetracker")
    String timePost(Model model,
                    @RequestParam("city") String city) {
        String time = tService.getCurrentTimeInCity(city);
        model.addAttribute("time", time);
        return "timepage";
    }

    @GetMapping("/listofcities")
    String cityList(Model model) {
        List<String> cities = tService.getCities();
        model.addAttribute("cities", cities);
        return "citylist";
    }
}
