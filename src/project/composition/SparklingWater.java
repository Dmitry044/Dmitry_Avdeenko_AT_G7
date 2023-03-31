/*
package project.composition;

public class SparklingWater extends Water {
    private boolean isOpened;
    private Bubble[] bubbles;

    public SparklingWater(){
        super(new Bubble[0]);
        isOpened();
    }

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
        //setBubbles(Bubble)
    }

    public void setOpened(boolean isOpened){
        this.isOpened = isOpened;
    }

    public boolean isSparkle(){
        return bubbles != null && bubbles.length > 0;
    }

    private void isOpened(){
        Thread thread = new Thread(()->{
            while (true){
                if(isOpened){
                    degas();
                } try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }

    private void degas() {
        int batchSize = 10 + 5 * getTemperature();
        int count = 0;
        while (bubbles != null && count < bubbles.length) {
            int batchCount = Math.min(batchSize, bubbles.length - count);
            Bubble[] batch = new Bubble[batchCount];
            for (int i = 0; i < batchCount; i++) {
                batch[i] = bubbles[count];
                count++;
            }
            System.out.println("Degas " + batchCount + " bubbles");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }
        thread.start();
        }



public void degas() {
        int batchSize = 10 + 5 * getTemperature();
        int count = 0;
        while (bubbles != null && count < bubbles.length) {
            int batchCount = Math.min(batchSize, bubbles.length - count);
            Bubble[] batch = new Bubble[batchCount];
            for (int i = 0; i < batchCount; i++) {
                batch[i] = bubbles[count];
                count++;
            }
            System.out.println("Degas " + batchCount + " bubbles");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }




//SparklingWater:
//------ наследуется от Water
//------ содеждит приватные поля boolean isOpened, Bubble[] bubbles
//------ содержит конструктор SparklingWater(), который вызывает внутренний метод isOpened();
//------ есть публичный метод void pump(Bubble[] bubbles), который сетает массив из пузырьков в воду
//------ есть публичный метод void setOpened(boolean isOpened), который меняет состояние воды на "открытое"
//------ есть приватный метод void isOpened(), который в новом потоке проверят состояние воды на "открытость" и в случае, если она открыта запускает метод degas()
//------ есть приватный метод degas(), который каждую секунду выпускает по партии пузырьков из рассчета 10 + 5 * температура_воды
//------ есть публичный метод boolean isSparkle(), возвращающий true если в воде еще есть пузырьки газа
//-- каждый метод должен содержать сообщение о том, что он делает, например:
//System.out.printf("Warming water to: %s", temperature).println();
//-- сообщения должны быть написаны 1-й строкой System.out.print* (пример см строкой выше)
*/
