import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatesAndTimes {

// DATES AND TIMES IN JAVA:
// (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

    public static void main(String[] args){
//-------------------------------------------------------------------------------
        LocalDate date = LocalDate.now();
        System.out.println(date); //2025-09-06

        LocalTime time = LocalTime.now();
        System.out.println(time); //22:14:35.745599200

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);//2025-09-06T22:14:35.745599200

        Instant instant = Instant.now();
        System.out.println(instant); //2025-09-06T16:44:35.746599800Z
//-------------------------------------------------------------------------------
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime); //06-09-2025 23:05:12
//-------------------------------------------------------------------------------
        LocalDate date1 = LocalDate.of(2025, 12, 25);
        System.out.println(date1); //2025-12-25
//-------------------------------------------------------------------------------
        LocalDateTime dateTime1 = LocalDateTime.of(2025, 12, 25, 12, 0, 0);
        LocalDateTime dateTime2 = LocalDateTime.of(2026, 1, 1, 0, 0, 0);
        System.out.println(dateTime1);
        System.out.println(dateTime2);

        if(dateTime1.isBefore(dateTime2)){
            System.out.println(dateTime1 + " is earlier than " + dateTime2);
        }
        else if(dateTime1.isAfter(dateTime2)){
            System.out.println(dateTime1 + " is later than " + dateTime2);
        }
        else if(dateTime1.isEqual(dateTime2)){
            System.out.println(dateTime1 + " is equal to " + dateTime2);
        }
    }
}
