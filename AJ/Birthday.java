// Birthday.java
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Birthday {
    private int dd;
    private int mm;
    private int yyyy;
    private String day;

    // Parameterized constructor
    public Birthday(int dd, int mm, int yyyy) throws WrongInputException {
        if (!isValidDate(dd, mm, yyyy)) {
            throw new WrongInputException("Invalid date input");
        }

        this.dd = dd;
        this.mm = mm;
        this.yyyy = yyyy;
        calculateDay();
    }

    // Default constructor
    public Birthday() {
        // Set default values
        this.dd = 1;
        this.mm = 1;
        this.yyyy = 2000;
        calculateDay();
    }

    // Getter methods

    // Setters are omitted for simplicity

    // Override toString() method
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.set(yyyy, mm - 1, dd);
        Date date = calendar.getTime();
        return sdf.format(date);
    }

    // Calculate the day of the week for the given date of birth
    private void calculateDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(yyyy, mm - 1, dd);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        this.day = daysOfWeek[dayOfWeek - 1];
    }

    // Check if the date is valid
    private boolean isValidDate(int dd, int mm, int yyyy) {
        // Perform validation logic here
        // For simplicity, assume all years are valid and months are in the range [1, 12]
        return dd >= 1 && dd <= 31 && mm >= 1 && mm <= 12;
    }
}