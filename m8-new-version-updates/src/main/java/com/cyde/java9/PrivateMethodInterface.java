package com.cyde.java9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface PrivateMethodInterface {

    boolean isHoliday (LocalDate date);

    default  boolean isBusinessDay (LocalDate date){
//        if (date.isBefore(LocalDate.of(2001, 1, 1, ))){
//            throw new IllegalArgumentException();
//        }

        //Instead of if statement and repeated codes, we use private method and implement in those codes; here validate (date);
        validate(date);
        LocalDate nextDate = date.plusDays(1);
        return isHoliday(date   );
    }

    default LocalDate nextDay (LocalDate date){
//        if (date.isBefore(LocalDate.of(2001, 1, 1))){
//            throw new IllegalArgumentException();
//        }

        validate(date);
        LocalDate nextDate = date.plusDays(1);
        return isHoliday(nextDate) ? nextDay(nextDate):nextDate;
    }
    private void validate (LocalDate date){
        if (date.isBefore(LocalDate.of(2001, 1, 1))){
            throw new IllegalArgumentException();
        }



    }
}
