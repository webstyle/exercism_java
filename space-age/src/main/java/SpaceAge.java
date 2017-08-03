import java.time.LocalDateTime;

class SpaceAge {
    private double seconds;
    private final int oneDayInSeconds = 86400;
    private final double daysInYear = 365.25;
    private final double earth = 365.25 * this.oneDayInSeconds;
    private final double mercury = 0.2408467;
    private final double venus = 0.61519726;
    private final double mars = 1.8808158;
    private final double jupiter = 11.862615;
    private final double saturn = 29.447498;
    private final double urans = 84.016846;
    private final double neptune = 164.79132;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return this.seconds;
    }

    double onEarth() {
        return this.seconds / this.earth;
    }

    double onMercury() {
        return getSpaceYear(this.mercury);
    }

    double onVenus() {
        return this.getSpaceYear(this.venus);
    }

    double onMars() {
        return this.getSpaceYear(this.mars);
    }

    double onJupiter() {
        return this.getSpaceYear(this.jupiter);
    }

    double onSaturn() {
        return  this.getSpaceYear(this.saturn);
    }

    double onUranus() {
        return this.getSpaceYear(this.urans);
    }

    double onNeptune() {
        return getSpaceYear(this.neptune);
    }

    private double getSpaceYear(double orbitalPeriod) {
        return (this.seconds / ((orbitalPeriod * this.daysInYear) * this.oneDayInSeconds));
    }

}
