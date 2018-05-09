package Builder.example;

/**
 * @description:
 * @Author: jdyo
 * @date: 2018/5/5-16:04
 */
public class Main {
    public static void main(String[] args){
        Builder build911=new Build911();
        Builder buildCayma=new BuildCayma();
        Director director911=new Director(build911);
        Director directorCayma=new Director(buildCayma);
        director911.buildProduct();
        directorCayma.buildProduct();
        Car car911=build911.buildCar();
        Car carCayma=buildCayma.buildCar();
        System.out.println(car911.toString());
        System.out.println(carCayma.toString());
    }
}
