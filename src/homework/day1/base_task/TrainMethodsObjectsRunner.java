package homework.day1.base_task;

public class TrainMethodsObjectsRunner {
    public static void main(String[] args) {
        TrainMethodsObjects trainMethodsObjects = new TrainMethodsObjects();

        Mouse mouse = new Mouse();
        trainMethodsObjects.processMouse(mouse);

        Souce souce = new Souce();
        trainMethodsObjects.processSouce(souce);

        Bee bee = new Bee();
        trainMethodsObjects.processBee(bee);

        Obstacle obstacle = new Obstacle();
        trainMethodsObjects.processObstacle(obstacle);

        Pineapple pineapple = new Pineapple();
        trainMethodsObjects.processPineapple(pineapple);
    }
}


//создать класс TrainMethodsObjectsRunner с методом main, в котором создать обьект
// класса TrainMethodsObjects, и вызвать всего его методы