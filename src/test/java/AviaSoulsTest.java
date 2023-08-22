import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.Ticket;
import ru.netology.stats.AviaSouls;
import ru.netology.stats.TicketTimeComparator;

import static org.junit.Assert.assertEquals;

public class AviaSoulsTest {
    @Test
    public void testSearchAndSortByPrice() {
        AviaSouls souls = new AviaSouls();
        Ticket ticket1 = new Ticket("Москва", "Сочи", 600, 10, 11);
        Ticket ticket2 = new Ticket("Москва", "Калининград", 500, 22, 2);
        Ticket ticket3 = new Ticket("Стамбул", "Москва", 1200, 15, 18);
        Ticket ticket4 = new Ticket("Москва", "Сочи", 550, 3, 5);
        Ticket ticket5 = new Ticket("Москва", "Сочи", 400, 12, 13);
        Ticket ticket6 = new Ticket("Чита", "Владивосток", 600, 15, 23);
        Ticket ticket7 = new Ticket("Москва", "Сочи", 800, 12, 17);
        Ticket ticket8 = new Ticket("Чита", "Москва", 600, 10, 16);
        Ticket ticket9 = new Ticket("Москва", "Сочи", 250, 13, 23);
        Ticket ticket10 = new Ticket("Ташкент", "Москва", 1500, 15, 1);
        souls.add(ticket1);
        souls.add(ticket2);
        souls.add(ticket3);
        souls.add(ticket4);
        souls.add(ticket5);
        souls.add(ticket6);
        souls.add(ticket7);
        souls.add(ticket8);
        souls.add(ticket9);
        souls.add(ticket10);

        Ticket[] expected = {ticket9, ticket5, ticket4, ticket1, ticket7};
        Ticket[] actual = souls.search("Москва", "Сочи");
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testSearchAndSortByPriceOneTicket() {
        AviaSouls souls = new AviaSouls();
        Ticket ticket1 = new Ticket("Москва", "Сочи", 600, 10, 11);
        Ticket ticket2 = new Ticket("Москва", "Калининград", 500, 22, 2);
        Ticket ticket3 = new Ticket("Стамбул", "Москва", 1200, 15, 18);
        Ticket ticket4 = new Ticket("Москва", "Сочи", 550, 3, 5);
        Ticket ticket5 = new Ticket("Москва", "Сочи", 400, 12, 13);
        Ticket ticket6 = new Ticket("Чита", "Владивосток", 600, 15, 23);
        Ticket ticket7 = new Ticket("Москва", "Сочи", 800, 12, 17);
        Ticket ticket8 = new Ticket("Чита", "Москва", 600, 10, 16);
        Ticket ticket9 = new Ticket("Москва", "Сочи", 250, 13, 23);
        Ticket ticket10 = new Ticket("Ташкент", "Москва", 1500, 15, 1);
        souls.add(ticket1);
        souls.add(ticket2);
        souls.add(ticket3);
        souls.add(ticket4);
        souls.add(ticket5);
        souls.add(ticket6);
        souls.add(ticket7);
        souls.add(ticket8);
        souls.add(ticket9);
        souls.add(ticket10);

        Ticket[] expected = {ticket3};
        Ticket[] actual = souls.search("Стамбул", "Москва");
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testSearchAndSortByPriceNotFound() {
        AviaSouls souls = new AviaSouls();
        Ticket ticket1 = new Ticket("Москва", "Сочи", 600, 10, 11);
        Ticket ticket2 = new Ticket("Москва", "Калининград", 500, 22, 2);
        Ticket ticket3 = new Ticket("Стамбул", "Москва", 1200, 15, 18);
        Ticket ticket4 = new Ticket("Москва", "Сочи", 550, 3, 5);
        Ticket ticket5 = new Ticket("Москва", "Сочи", 400, 12, 13);
        Ticket ticket6 = new Ticket("Чита", "Владивосток", 600, 15, 23);
        Ticket ticket7 = new Ticket("Москва", "Сочи", 800, 12, 17);
        Ticket ticket8 = new Ticket("Чита", "Москва", 600, 10, 16);
        Ticket ticket9 = new Ticket("Москва", "Сочи", 250, 13, 23);
        Ticket ticket10 = new Ticket("Ташкент", "Москва", 1500, 15, 1);
        souls.add(ticket1);
        souls.add(ticket2);
        souls.add(ticket3);
        souls.add(ticket4);
        souls.add(ticket5);
        souls.add(ticket6);
        souls.add(ticket7);
        souls.add(ticket8);
        souls.add(ticket9);
        souls.add(ticket10);

        Ticket[] expected = { };
        Ticket[] actual = souls.search("Париж", "Лондон");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSearchAndSortByFlightTime() {
        AviaSouls souls = new AviaSouls();
        Ticket ticket1 = new Ticket("Москва", "Сочи", 600, 10, 11);
        Ticket ticket2 = new Ticket("Москва", "Калининград", 500, 22, 2);
        Ticket ticket3 = new Ticket("Стамбул", "Москва", 1200, 15, 18);
        Ticket ticket4 = new Ticket("Москва", "Сочи", 550, 3, 5);
        Ticket ticket5 = new Ticket("Москва", "Сочи", 400, 12, 13);
        Ticket ticket6 = new Ticket("Чита", "Владивосток", 600, 15, 23);
        Ticket ticket7 = new Ticket("Москва", "Сочи", 800, 12, 17);
        Ticket ticket8 = new Ticket("Чита", "Москва", 600, 10, 16);
        Ticket ticket9 = new Ticket("Москва", "Сочи", 250, 13, 23);
        Ticket ticket10 = new Ticket("Ташкент", "Москва", 1500, 15, 1);
        souls.add(ticket1);
        souls.add(ticket2);
        souls.add(ticket3);
        souls.add(ticket4);
        souls.add(ticket5);
        souls.add(ticket6);
        souls.add(ticket7);
        souls.add(ticket8);
        souls.add(ticket9);
        souls.add(ticket10);

        Ticket[] expected = {ticket1, ticket5, ticket4, ticket7, ticket9};
        Ticket[] actual = souls.searchAndSortBy("Москва", "Сочи");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testCompareToPrice() {
        AviaSouls souls = new AviaSouls();
        Ticket ticket1 = new Ticket("Москва", "Сочи", 600, 10, 11);
        Ticket ticket2 = new Ticket("Москва", "Калининград", 500, 22, 2);
        souls.add(ticket1);
        souls.add(ticket2);


        int expected = 100;
        int actual = ticket1.compareTo(ticket2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testComparator() {
        AviaSouls souls = new AviaSouls();
        Ticket ticket1 = new Ticket("Москва", "Сочи", 600, 10, 11);
        Ticket ticket2 = new Ticket("Москва", "Калининград", 500, 19, 23);
        souls.add(ticket1);
        souls.add(ticket2);
        TicketTimeComparator timeComparator = new TicketTimeComparator();

        int expected = 3;
        int actual = timeComparator.compare(ticket2, ticket1);
        Assertions.assertEquals(expected, actual);

    }

}


