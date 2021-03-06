package segelzwerg.sporttooolbox.web.speed;

import lombok.Data;

@Data
public class SpeedForm {
    private int major;
    private int minor;
    private int hour;
    private int minute;
    private int second;
    private String distanceMajorUnit;
    private String distanceMinorUnit;
    private String resultUnit;
}
