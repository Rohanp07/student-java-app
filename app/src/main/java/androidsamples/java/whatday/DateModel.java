package androidsamples.java.whatday;

import android.icu.util.Calendar;
import android.os.Build;

import androidx.annotation.NonNull;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Represents the date to be set, whether it is a valid date, and the message with error status or the day of the week.
 */
public class DateModel {
  private static String message;
  static int daysNonLeap[] = {31,28,31,30,31,30,31,31,30,31,30,31};
  static int daysLeap[] = {31,29,31,30,31,30,31,31,30,31,30,31};
  /**
   * Initializes the {@link DateModel} with the given year, month, and date.
   * If the date is not valid, it sets the appropriate error message.
   * If it is valid, it sets the appropriate day of the week message.
   *
   * @param yearStr  a {@code String} representing the year, e.g., "1947"
   * @param monthStr a {@code String} representing the month, e.g., "8"
   * @param dateStr  a {@code String} representing the date, e.g., "15"
   */

  public static void initialize(String yearStr, String monthStr, String dateStr) {
    // TODO implement the method to match the description
    int date, month, year;
    try {
      year = Integer.parseInt(yearStr);
    } catch (NumberFormatException e) {
      message = "Enter values in a proper numeric format";
      return;
    }
    try {
      month = Integer.parseInt(monthStr);
    } catch (NumberFormatException e) {
      message = "Enter values in a proper numeric format";
      return;
    }
    try {
      date = Integer.parseInt(dateStr);
    } catch (NumberFormatException e) {
      message = "Enter values in a proper numeric format";
      return;
    }
    if (year < 0) {
      message = "Invalid year";
      return;
    }
    if (month > 12 || month < 1) {
      message = "Invalid month";
      return;
    }
    if (date > 31 || date < 1) {
      message = "Invalid date";
      return;
    }
    if(month == 2)
    {
      if((year%100==0 && year%400==0) || (year%100!=0 &&year%4==0))
      {
        if(date>daysLeap[month-1] || date<1)
        {
          message = "This month does not have "+date+" days";
          return;
        }
      }
      else
      {
        if(date>daysNonLeap[month-1] || date<1)
        {
          if(date == 29)
          {
            message = "February of "+year+ " does not have 29 days";
            return;
          }
          message = "This month does not have "+date+" days";
          return;
        }
      }
    }
    else
    {
      if(date>daysNonLeap[month-1] || date<1)
      {
        message = "This month does not have "+date+" days";
        return;
      }
    }
    int day = dayofweek(date, month, year);
    if(day==0)
    {
      message="Sunday";
    }
    else if(day==1)
    {
      message="Monday";
    }
    else if(day==2)
    {
      message="Tuesday";
    }
    else if(day==3)
    {
      message="Wednesday";
    }
    else if(day==4)
    {
      message="Thursday";
    }
    else if(day==5)
    {
      message="Friday";
    }
    else if(day==6)
    {
      message="Saturday";
    }
  }

  static int dayofweek(int d, int m, int y)
  {
    int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
    if (m < 3)
      y--;
    return (y + y / 4 - y / 100 + y / 400 + t[m - 1]
            + d)
            % 7;
  }

  /**
   * Retrieves the message from the {@link DateModel}.
   * It can be an error message like "February of 2019 does not have 29 days"
   * or a success message like "Friday".
   *
   * @return the message from the model
   */
  @NonNull
  public static String getMessage() {
    // TODO implement the method to match the description
    return message;
  }
}
