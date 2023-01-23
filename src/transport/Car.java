package transport;

import java.util.regex.Pattern;

public class Car extends Transport{
    //private final String brand, model,  color,  productionCountry;
    //private final int productionYear;
    private final float engineVolume;

    private String transmission, carBody, registrationNumber;
    boolean summerTires;
    private int numberOfSeats;

    private Key key;

    public Car(String brand, String model, String color, String productionCountry, float engineVolume, int productionYear, int maxSpeed,
               String transmission, String carBody, String registrationNumber, int numberOfSeats, boolean summerTires) {

        super(brand,model,productionCountry,productionYear,color,maxSpeed);
        if(engineVolume <= 0){
            this.engineVolume = 1.5f;
        }else{
            this.engineVolume = engineVolume;
        }

        setTransmission(transmission);
        setCarBody(carBody);
        setRegistrationNumber(registrationNumber);
        setNumberOfSeats(numberOfSeats);
        setSummerTires(summerTires);
    }
    public float getEngineVolume() {
        return this.engineVolume;
    }
    public String getTransmission() {
        return this.transmission;
    }
    public String getCarBody() {
        return this.carBody;
    }
    public String getRegistrationNumber() {
        return this.registrationNumber;
    }
    public boolean isSummerTires() {
        return this.summerTires;
    }
    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }
    public void setTransmission(String transmission) {
        String defaultValue = "ручная";
        if(transmission == null || transmission.isBlank()){
            this.transmission = defaultValue;
        }else{
            this.transmission = transmission;
        }
    }
    public void setCarBody(String carBody) {
        String defaultValue = "универсал";
        if(carBody == null || carBody.isBlank()){
            this.carBody = defaultValue;
        }else{
            this.carBody = carBody;
        }
    }
    public void setRegistrationNumber(String registrationNumber) {
        String defaultValue = "А001БВ777";
        if(Pattern.matches("[а-яА-Я]+[0-9]{3}+[а-яА-Я]{2}+[0-9]{1,3}",registrationNumber)){
            this.registrationNumber = registrationNumber;
        }else{
            this.registrationNumber = defaultValue;
        }
    }
    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }
    public void setNumberOfSeats(int numberOfSeats) {
        int defaultValue = 4;
        if(numberOfSeats <= 0){
            this.numberOfSeats = defaultValue;
        }else {
            this.numberOfSeats = numberOfSeats;
        }
    }
    public void changeTires(int month){
        if(month <= 0 || month > 12){
            throw new IllegalArgumentException("Значение месяца должно быть от 1 до 12 включительно.");
        }
        setSummerTires(month != 11 && month != 12 && month != 1);
    }
    public Key getKey(){
        return  this.key;
    }
    public void createKey(boolean remoteStart, boolean keylessAccess){
        this.key = new Key(remoteStart, keylessAccess);
    }
    @Override
    public String toString() {
        return "Автомобиль={" +
                "Марка = '" + getBrand() + '\'' +
                ", модель = '" + getModel() + '\'' +
                ", цвет кузова = '" + getColor() + '\'' +
                ", страна сборки = '" + getProductionCountry() + '\'' +
                ", объем двигателя в литрах = " + engineVolume +
                ", год производства = " + getProductionYear() +
                ", максимальная скорость передвижения = " + getMaxSpeed() +
                ", коробка передач = " + transmission +
                ", тип кузова = " + carBody +
                ", регистрационный номе = " + registrationNumber +
                ", количество мест = " + numberOfSeats +
                ", летняя резина = " + summerTires +
                ", удаленный запуск двигателя = " + (this.key != null ? key.isRemoteStart() : "значение не установлено") +
                ", бесключевой доступ = " + (this.key != null ? key.isKeylessAccess() : "значение не установлено") +
                '}';
    }
    public class Key{
        private final boolean remoteStart, keylessAccess;

        public Key(boolean remoteStart, boolean keylessAccess){
            this.remoteStart = remoteStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteStart() {
            return this.remoteStart;
        }

        public boolean isKeylessAccess() {
            return this.keylessAccess;
        }
    }
}
