package ru.netology.stats;

import java.util.Comparator;

public class TicketTimeComparator implements Comparator<Ticket> {
       @Override
    public int compare(Ticket t1, Ticket t2) {
        // ваш код
        int flightTime1 = t1.getTimeTo() - t1.getTimeFrom();
        int flightTime2 = t2.getTimeTo() - t2.getTimeFrom();
        return  flightTime1 - flightTime2;
    }
}