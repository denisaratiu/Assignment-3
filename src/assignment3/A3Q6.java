/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author ratid6445
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city
        City kw = new City();
        //create robot
        RobotSE karel = new RobotSE(kw, 0, 1, Direction.SOUTH);
        //create each group of things
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 2, 1);
        new Thing(kw, 2, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);
        //show thing count
        kw.showThingCounts(true);
        //step onto first part of path
        karel.move();
        //loop
        while(true){
        //if there are things pick them all up
            if(karel.canPickThing()){
            karel.pickAllThings();
            }
        // if 3 thing - move left
            if(karel.countThingsInBackpack()== 3){
                karel.turnLeft();
                karel.putThing();
                karel.move();
            }if(karel.countThingsInBackpack() == 2){
                karel.putThing();
                karel.move();
            }if(karel.countThingsInBackpack() == 1){
                karel.putThing();
                karel.turnAround();
                karel.move();
                //karel move to street 1 and avenue 2
                karel.move();
                karel.turnLeft();
                karel.move();
        }if(karel.countThingsInBackpack() == 2 && karel.getStreet()==2){
                karel.putThing();
                karel.turnLeft();
                karel.move();
        }
}
}
}