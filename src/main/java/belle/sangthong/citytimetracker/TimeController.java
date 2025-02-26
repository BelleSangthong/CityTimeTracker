package belle.sangthong.citytimetracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TimeController {

    @Autowired
    TimeService tService;

    @GetMapping("/citytimetracker")
    String time(Model model) {

        model.addAttribute("thailand", tService.getCurrentTimeInThailand());
        return "timepage";
    }
}
