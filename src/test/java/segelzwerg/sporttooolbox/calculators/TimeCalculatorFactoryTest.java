package segelzwerg.sporttooolbox.calculators;

import org.junit.jupiter.api.Test;
import segelzwerg.sporttooolbox.IUnits.Distance;
import segelzwerg.sporttooolbox.IUnits.KilometerPerHour;
import segelzwerg.sporttooolbox.IUnits.Speed;
import segelzwerg.sporttooolbox.web.speed.SpeedForm;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

class TimeCalculatorFactoryTest {
    @Test
    void test_build() {
        int kilometer = 10;
        int meter = 455;
        String majorUnit = "kilometer";
        String minorUnit = "meter";
        Speed speed = new KilometerPerHour((float) (10.455 / 0.4));

        SpeedForm speedForm = new SpeedForm();
        speedForm.setMajor(kilometer);
        speedForm.setMinor(meter);
        speedForm.setDistanceMajorUnit(majorUnit);
        speedForm.setDistanceMinorUnit(minorUnit);
        speedForm.setSpeed(speed);

        Distance distance = new Distance(kilometer, meter);

        TimeCalculator timeCalculator = TimeCalculatorFactory.build(speedForm, majorUnit, minorUnit);

        TimeCalculator expectedTimeCalculator = new TimeCalculator(distance, speed);

        assertThat(timeCalculator, equalTo(expectedTimeCalculator));
    }
}