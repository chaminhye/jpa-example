package hellojpa;

import javax.persistence.Embeddable;
import java.time.LocalDateTime;

@Embeddable
public class Period {
    private LocalDateTime endDate;
    private LocalDateTime startDate;

    public Period() {}

    public Period(LocalDateTime endDate, LocalDateTime startDate) {
        this.endDate = endDate;
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }
}
