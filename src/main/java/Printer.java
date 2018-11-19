public class Printer {
    private int paperLeft;
    private int tonerLevel;

    public Printer(){
        this.paperLeft = 50;
        this.tonerLevel = 200;
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

    public void refillPaper() {
        this.paperLeft = 50;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }


    public void refillToner() {
        this.tonerLevel = 200;
    }
}
