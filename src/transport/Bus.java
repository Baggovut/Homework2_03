package transport;

public class Bus extends Transport{
    public Bus(String brand, String model, String productionCountry, int productionYear, String color, int maxSpeed) {
        super(brand, model, productionCountry, productionYear, color, maxSpeed);
    }

    @Override
    public String toString() {
        return "Автобус={" +
                "Марка = '" + getBrand() + '\'' +
                ", модель = '" + getModel() + '\'' +
                ", цвет кузова = '" + getColor() + '\'' +
                ", страна сборки = '" + getProductionCountry() + '\'' +
                ", год производства = " + getProductionYear() +
                ", максимальная скорость передвижения = " + getMaxSpeed() +
                '}';
    }
}
