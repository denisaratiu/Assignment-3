/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author ratid6445
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city
        City kw = new City();
        //create robot
        RobotSE karel = new RobotSE(kw, 1, 2, Direction.NORTH);
        //create rectangular enclosure 
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);

        //create algorithm
        while (karel.getAvenue() < 5) {
            if (!karel.frontIsClear()) {
                karel.turnRight();
            }
            if (karel.frontIsClear()) {
                karel.move();
            } else if (karel.getDirection() == Direction.EAST) {
                karel.move();
            } else if (karel.getDirection() == Direction.NORTH) {
                karel.turnRight();
            } else if (karel.getDirection() == Direction.SOUTH) {
                karel.turnRight();
            } else if (karel.getDirection() == Direction.WEST) {
                karel.turnRight();
                karel.turnRight();
            }
            if (!karel.isBesideThing(IPredicate.aWall)) {
                karel.turnLeft();
            }
        }
    }
}

