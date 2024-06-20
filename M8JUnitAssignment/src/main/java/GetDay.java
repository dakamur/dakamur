import java.util.ArrayList;

public class GetDay {

    public String getDay (Integer dayNumber) {
        ArrayList<String> daysList = new ArrayList<>();
        daysList.add("Sunday");
        daysList.add("Monday");
        daysList.add("Tuesday");
        daysList.add("Wednesday");
        daysList.add("Thursday");
        daysList.add("Friday");
        daysList.add("Saturday");

        System.out.println("The day of the week is: " + daysList.get(dayNumber));

        if (dayNumber == null) {

            throw new NullPointerException();
        }

        else if (dayNumber <1){
            return "The number should be equal or larger than 1";
        }
        else if ( dayNumber >7 ) {
            return "The number should be equal or smaller than 7";
        }
        else {
            return daysList.get(dayNumber - 1);
        }


        }

    }


