/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Person {
    private String name;
    private Date birthday;
    private int age;
    private final double SECONDS_TO_MILISECONDS = 1000;
    private final double MINUTES_TO_SECONDS =60.0;
    private final double HOURS_TO_MINUTES =60.0;
    private final double DAYS_TO_HOURS = 24.0;
    private final double YEARS_TO_DAYS = 365.25;

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Date getBirthday() {
        return birthday;
    }

    public int getAge() {
        return toYears(new Date().getTime()- birthday.getTime());
    }

    public String getName() {
        return name;
    }

    private int toYears(long l) {
        return (MINUTES_TO_SECONDS*
                HOURS_TO_MINUTES*
                YEARS_TO_DAYS*
                DAYS_TO_HOURS*
                SECONDS_TO_MILISECONDS);
    }

    
}
