package iteratorEnumeration;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Enumeration days;
        Vector weekdays = new Vector();
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        days = weekdays.elements();

        Iterator enumerationIterator = new EnumerationAdapter(days);
        while(days.hasMoreElements()){
            System.out.println(days.nextElement());
        }

        while(enumerationIterator.hasNext()){
            System.out.println(enumerationIterator.next());
        }
    }
}