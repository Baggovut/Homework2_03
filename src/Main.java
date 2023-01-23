import transport.Bus;
import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new transport.Car("Lada","Granta","жёлтый","Россия",
                1.7f,2015, 0,
                "автоматическая","универсал","Б111ВГ777",4,false);
        car1.createKey(true,true);
        Car car2 = new transport.Car("Audi","A8 50 L TDI quattro","чёрный","Германия",
                3.0f,2020, 0,
                "","","",0,false);
        car2.createKey(true,false);
        Car car3 = new transport.Car("BMW","Z8","чёрный","Германия",
                3.0f,2021, 0,
                "","","",0,false);
        car3.createKey(false,true);
        Car car4 = new transport.Car("Kia","Sportage 4","красный","Южная Корея",
                2.4f,2018,0,
                "","","",0,false);
        car4.createKey(false,false);
        Car car5 = new transport.Car("Hyundai","Avante","оранжевый","Южная Корея",
                1.6f,2016,0,
                "","","",0,false);
        Car car6 = new Car("","","","",
                0,0,0,
                "","","",0,false);

        System.out.println(car1);
        car2.changeTires(5);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5.getBrand()+"\n"+
                car5.getModel()+"\n"+
                car5.getColor()+"\n"+
                car5.getProductionCountry()+"\n"+
                car5.getEngineVolume()+"\n"+
                car5.getProductionYear()+"\n"+
                car5.getMaxSpeed()+"\n"+
                car5.getTransmission()+"\n"+
                car5.getCarBody()+"\n"+
                car5.getRegistrationNumber()+"\n"+
                car5.getNumberOfSeats()+"\n"+
                car5.isSummerTires()+"\n"
                +(car5.getKey() != null ? car5.getKey().isKeylessAccess() : "")
                +"\n"+(car5.getKey() != null ? car5.getKey().isRemoteStart() : ""));
        System.out.println(car6);

        Bus bus1 = new Bus("brand1","model1","",0,"",99);
        Bus bus2 = new Bus("brand2","model2","",0,"",120);
        Bus bus3 = new Bus("brand3","model3","",0,"",140);

        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);

    }
}