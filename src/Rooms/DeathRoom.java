package Rooms;

import Game.Runner;
import People.Person;

public class DeathRoom extends Room{

    public DeathRoom(int x2, int y2) {
        super(x2, y2);

    }

    /**
     * Triggers the game ending conditions.
     * @param x the Person entering
     * The room will kill the player
     */
    @Override
    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You enter a room rigged with spikes! You are dead!");
        Runner.gameOff();
    }

}
