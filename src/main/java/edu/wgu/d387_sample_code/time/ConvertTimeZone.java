package edu.wgu.d387_sample_code.time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ConvertTimeZone {
    private String code;
    private ZoneId zoneId;
    private ZoneId localId;

    public ConvertTimeZone(String code) {
        this.code = code;
    }

    public String getTimeAtTimeZone() {
        switch (code) {
            case "MT":
                zoneId=ZoneId.of("America/Denver");
                break;
            case "ET":
                zoneId= ZoneId.of("America/New_York");
                break;
            case "UTC":
                zoneId = ZoneId.of("Europe/London");
                break;
            default:
                throw new IllegalArgumentException("Invalid code: " + code);
        }

        localId = ZoneId.systemDefault();

        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = localDateTime.atZone(localId);

        ZonedDateTime zonedDateTimeElsewhere = zonedDateTime.withZoneSameInstant(zoneId);
        LocalDateTime elsewhereDateTime= zonedDateTimeElsewhere.toLocalDateTime();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        return elsewhereDateTime.format(formatter);
    }
}
