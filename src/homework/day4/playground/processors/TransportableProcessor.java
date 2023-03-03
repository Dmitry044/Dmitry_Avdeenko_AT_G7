package homework.day4.playground.processors;

import homework.day4.playground.essence.craft.Transportable;
import homework.day4.playground.utils.CoordinatesGenerator;

public class TransportableProcessor {
    public void runTransportable(Transportable transportable, int pointA, int pointB){
        int distance = transportable.move(pointA,pointB);
        String className = transportable.getClass().getSimpleName();
        System.out.printf("Transportable %s was moved to %s points", className, distance);
    }

    public void runTransportable(Transportable transportable){
        int pointA = CoordinatesGenerator.generateCoordinate();
        int pointB = CoordinatesGenerator.generateCoordinate();
        int distance = transportable.move(pointA, pointB);
        String className = transportable.getClass().getSimpleName();
        System.out.printf("Transportable %s was moved to %s points", className, distance);
    }
}

//-- class TransportableProcessor
//у него есть перегруженный публичный невозвратный метод:
//runTransportable(Transportable transportable, int pointA, int pointB) - принимает обьект перемещающего и числа
// точек перемещения А и В, и вызывает у первого метод move, которому передает точки перемещения,
// после чего печатает в консоль строку "Transportable N was moved to M points",
// где N - название класса соответствующего обьекта,
// M - получаемое значение расстояния в результате выполнения метода move

//runTransportable(Transportable transportable) - принимает обьект перемещающего, и вызывает у него move,
// которому передает случайные значения точек перемещения, которые генерируется вызовами метода generateCoordinate()
// из утилиты CoordinatesGenerator, после чего печатает в консоль строку "Transportable N was moved to M points",
// где N - название класса соответствующего обьекта, M - получаемое значение расстояния
// в результате выполнения метода move