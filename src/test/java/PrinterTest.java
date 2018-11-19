import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    private Printer printer;

    @Before
    public void before(){
        printer = new Printer();
    }

    @Test
    public void hasPaperLeft(){
        assertEquals(50, printer.getPaperLeft());
    }

    @Test
    public void canPrint(){
        assertEquals("Success", printer.print(10, 3));
        assertEquals(20, printer.getPaperLeft());
    }

    @Test
    public void cannotPrintIfNotEnoughPaper(){
        assertEquals("Error", printer.print(10, 10));
    }

    @Test
    public void canRefillPrinter(){
        printer.print(10, 2);
        printer.refillPaper();
        assertEquals(50, printer.getPaperLeft());
    }

    @Test
    public void hasTonerLevel(){
        assertEquals(200, printer.getTonerLevel());
    }

    @Test
    public void canUseToner(){
        printer.print(10, 2);
        assertEquals(180, printer.getTonerLevel());
    }

    @Test
    public void canRefillToner(){
        printer.print(10, 2);
        printer.refillToner();
        assertEquals(200, printer.getTonerLevel());
    }

}
