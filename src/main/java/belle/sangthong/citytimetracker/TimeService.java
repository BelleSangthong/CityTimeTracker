package belle.sangthong.citytimetracker;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TimeService {

    public LocalDateTime getCurrentTimeInThailand() {
        return LocalDateTime.now().plusHours(6);
    }
}
