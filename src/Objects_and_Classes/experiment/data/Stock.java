package Objects_and_Classes.experiment.data;

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currectPrice;

    public Stock (String symbol,String name,double previousClosingPrice, double currectPrice) {
        this.currectPrice = currectPrice;
        this.previousClosingPrice = previousClosingPrice;
        this.symbol = symbol;
        this.name = name;
    }

    public String getSymbol (){
        return  symbol;
    }

    public String getName (){
        return name;
    }

    public double getCurrectPrice() {
        return currectPrice;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setCurrectPrice(double currectPrice) {
        this.currectPrice = currectPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getChangePercent() {
        return (currectPrice - previousClosingPrice) / previousClosingPrice;
    }
}
