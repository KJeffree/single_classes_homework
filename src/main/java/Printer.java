public class Printer {
    private int paperLeft;
    private int tonerLevel;

    public Printer(int paperLeft, int tonerLevel){
        this.paperLeft = paperLeft;
        this.tonerLevel = tonerLevel;
    }

    public int getPaperLeft() {
        return paperLeft;
    }

    public String print(int pagesToPrint, int numberOfCopies) {
        int numberOfPages = pagesToPrint * numberOfCopies;
        if (this.paperLeft > numberOfPages){
            this.paperLeft -= numberOfPages;
            this.tonerLevel -= numberOfPages;
            return "Success";
        } else {
            return "Error";
        }
    }

    public void refill() {
        this.paperLeft = 50;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }
}
