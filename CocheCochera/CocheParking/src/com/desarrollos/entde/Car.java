package com.desarrollos.entde;
//eliminado los import
/**
 * Class that models objects of type "car"
 * 
 * @Java MOOC team, UC3M
 * @2.0
 */
public class Car
{
    // Attributes of the class Car
    static int numberWheels = 4;                // Number of wheels                           
    
    Garage theGarage=null;

    
    /**
     * Constructor of a car specifying the garage object
     */
    public Car (Garage g){
    	theGarage = g;
    }
    /**
     * Method that is being always invoked when the program is running
     * @throws InterruptedException 
     */
    public static void main(String[] args) throws InterruptedException{
    	Garage g = new Garage();
    	Car car = new Car(g);
        Car.accelerate();
        slowDown();
        moveDown();
        accelerate();
        g.printGarage();//corregido 'car' por 'g' 
//        turnRight();
//        turnHeadlightsOn();
//        turnHeadlightsOff();
    }    

   /* private void printGarage() 
    {
        System.out.print("|*]"); //corregido System
    }*/


	/**
     * Accelerate the car
     * @throws InterruptedException 
     */
    public static void accelerate() throws InterruptedException{ //puesto static
        String c = new String("*");
        String space = new String(" ");
    	for(int i=0; i<5; i++)
        {
        	System.out.print(c);
        	c = space.concat(c);
        	Thread.sleep(1000);
        }
    }
    
    /**
     * Slow down the car
     * @throws InterruptedException 
     */
    public static void slowDown() throws InterruptedException{ //puesto static
    	String c = new String("     *"); //corregido string por String
    	for(int i=0; i<5; i++)
        {
        	System.out.print(c);
        	c = c.substring(1);
        	Thread.sleep(1000);
        }
    	System.out.println();
    }    
    
    /**
     * Move the car downwards
     * @throws InterruptedException 
     */    
    public static void moveDown() throws InterruptedException{ //puesto static
    	String c = new String("\t\t\t\t  *"); //string por String y eliminado un ')'
    	for(int i=0; i<5; i++) //corregido las ',' por ';'
        {
    		if(i!=4)
    			System.out.println(c);
    		else 
    			System.out.print(c);
        	Thread.sleep(1000);
        }
    }
    
}
