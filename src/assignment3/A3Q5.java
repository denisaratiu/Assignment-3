/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author ratid6445
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city
        City kw = new City();
        //create robot
        RobotSE karel = new RobotSE(kw, 1, 1, Direction.EAST);
        //create pile of 10 things
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        //show thing count
        kw.showThingCounts(true);
        //create counter
        int counter = 0;
        //karel pick one thing at a time and move it to a new interscetion
        while (counter < 10) {
            if (karel.canPickThing() && karel.getAvenue() == 1) {
                karel.pickThing();
                karel.move();
                karel.putThing();
            }
            if (karel.countThingsInBackpack(IPredicate.aThing) < 10 && karel.getAvenue() == 2) {
                karel.turnAround();
            }
            if (karel.isBesideThing(IPredicate.aThing)) {
                karel.move();
                karel.turnAround();
                counter++;
            }
        }
        karel.move();
    }
}
