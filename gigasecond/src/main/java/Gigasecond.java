import java.time.*;

class Gigasecond {
    private LocalDateTime birthDate;

    Gigasecond(LocalDateTime birthDateTime) {
        this.birthDate = birthDateTime;
    }

    Gigasecond(LocalDate birthDate) {
        this.birthDate = birthDate.atStartOfDay();
    }

    LocalDateTime getDate() {
        long gigasecond = 1000000000L;
        return birthDate.plusSeconds(gigasecond);
    }

}
