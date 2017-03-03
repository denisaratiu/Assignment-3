/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author ratid6445
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city
        City kw = new City();
        //create wall
        new Wall(kw, 0, 4, Direction.WEST);
        //create robot
        RobotSE karel = new RobotSE(kw, 0, 0, Direction.EAST);
        //create things
        new Thing(kw, 0, 3);
        new Thing(kw, 0, 2);
        //karel stop at first object or wall that it encounters
        while (karel.frontIsClear() && !karel.canPickThing()) {
            karel.move();
        }
    }
    }

