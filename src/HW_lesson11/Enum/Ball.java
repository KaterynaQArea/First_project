package HW_lesson11.Enum;

public enum Ball {
    BASKETBALL(24.84,"basketball", 111, "leather and rubber"),
    VOLLEYBALL(25.59,"volleyball", 301, "leather"),
    FOOTBALL (27.01,"football", 500, "polyurethane"),
    TENNIS (2.63,"tennis", 111, "wool"),
    RUGBY (22.83,"rugby", 121, "rubber");
    private final double size;
    private final String sport;
    private final double price;
    private final String material;
    Ball(double size, String sport, double price, String material){
        this.size = size;
        this.sport = sport;
        this.price = price;
        this.material = material;
    }
    public double getSize() { return size;}
    public String getSport() {return sport;}
    public double getPrice() { return price;}
    public String getMaterial() {return material;}

   public String toString() {
        return "Size = " + size + " Sport: " + sport + " Price = " + price + " Material: " + material;
    }
}
