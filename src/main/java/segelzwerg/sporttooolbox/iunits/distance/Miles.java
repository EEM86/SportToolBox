package segelzwerg.sporttooolbox.iunits.distance;

import segelzwerg.sporttooolbox.iunits.Time;
import segelzwerg.sporttooolbox.iunits.pace.Pace;
import segelzwerg.sporttooolbox.iunits.speed.Speed;

class Miles implements Distance {
    private static final double MILES_TO_YARDS = 1760.0;

    private final int miles;
    private final int yards;

    Miles(int miles) {
        this(miles, 0);
    }

    Miles(int miles, int yards) {
        double total = yards + (miles / Miles.MILES_TO_YARDS);
        this.miles = (int) Math.abs(total);
        this.yards = (int) ((total - this.miles) * Miles.MILES_TO_YARDS);
    }

    /**
     * Add distance
     *
     * @param toAdd distance to add
     * @return new distance
     */
    @Override
    public Distance addDistance(Distance toAdd) {
        return null;
    }

    /**
     * Compute speed for specific time
     *
     * @param time Amount of time
     * @return calculated speed
     */
    @Override
    public Speed computeSpeed(Time time) {
        return null;
    }

    /**
     * Compute pace given a specific time
     *
     * @param time amount of time
     * @return calculated pace
     */
    @Override
    public Pace computePace(Time time) {
        return null;
    }

    /**
     * computes the time for a given speed
     *
     * @param speed {@link Speed}
     * @return {@link Time}
     */
    @Override
    public Time computeTime(Speed speed) {
        return null;
    }
}