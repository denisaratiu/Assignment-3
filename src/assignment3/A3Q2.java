/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author ratid6445
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city
        City kitchener = new City();
        // creating the wall in the city to make initial situation
        new Wall(kitchener, 1, 2, Direction.EAST);
        new Wall(kitchener, 2, 1, Direction.WEST);
        new Wall(kitchener, 1, 1, Direction.WEST);
        new Wall(kitchener, 1, 1, Direction.NORTH);
        new Wall(kitchener, 2, 2, Direction.SOUTH);
        new Wall(kitchener, 1, 2, Direction.NORTH);
        new Wall(kitchener, 2, 2, Direction.EAST);
        new Wall(kitchener, 2, 1, Direction.SOUTH);
        // creating a new robot
        RobotSE karel = new RobotSE(kitchener, 0, 2, Direction.WEST);
        //create counter
        int counter = 0;
        //move twice around the square using a condition
        while (counter < 8) {
            karel.move();
            karel.move();
            karel.turnLeft();
            karel.move();
            counter++;
        }

    }
}

            
        
    
