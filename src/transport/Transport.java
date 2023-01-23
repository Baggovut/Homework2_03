package transport;

public class Transport {
    private final String brand, model, productionCountry;
    private final int productionYear;

    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, String productionCountry, int productionYear, String color, int maxSpeed) {
        if(brand == null || brand.isBlank()){
            this.brand = "default";
        }else{
            this.brand = brand;
        }
        if(model == null || model.isBlank()){
            this.model = "default";
        }else{
            this.model = model;
        }
        if(productionCountry == null || productionCountry.isBlank()){
            this.productionCountry = "default";
        }else{
            this.productionCountry = productionCountry;
        }
        if(productionYear <= 0){
            this.productionYear = 2000;
        }else{
            this.productionYear = productionYear;
        }
        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public String getProductionCountry() {
        return this.productionCountry;
    }

    public int getProductionYear() {
        return this.productionYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color == null || color.isBlank()){
            this.color = "белый";
        }else{
            this.color = color;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        int defaultValue = 100;
        if(maxSpeed <= 0){
            this.maxSpeed = defaultValue;
        }else{
            this.maxSpeed = maxSpeed;
        }
    }
}
