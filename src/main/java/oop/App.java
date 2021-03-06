package oop;

/**
 * 'Click' Counter
 *  Starter code for demonstrating a simple class.
 */
public class App 
{
    public static void main( String[] args )
    {
        App app = new App();
        app.start();
    }

    public void start() {
        System.out.println("\n*** Counter App ***");

        Counter myCounter = new Counter(10);
        myCounter.display();
        myCounter.click();
        myCounter.click();
        myCounter.click();

        //TODO - add call to reset() that you implement in Counter class

        myCounter.reset();

        //TODO - add call to undo() that you implement in Counter class

        myCounter.undo();

        //TODO
        // Add a JUnit test method to test undo()



        //TODO
        // Create a second Counter object, then
        // click() it once, undo() twice, click(), then display()
        // What count do you expect?

        Counter myCounter1 = new Counter(10);
        myCounter1.click();
        myCounter1.undo();
        myCounter1.undo();
        myCounter1.click();
        myCounter1.display();



        Counter myCounter2 = new Counter(5);
        myCounter2.click();
        myCounter2.click();
        myCounter2.click();
        myCounter2.click();
        myCounter2.click();
        myCounter2.click();
        myCounter2.display();

    }

}
