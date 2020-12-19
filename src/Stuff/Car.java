package Stuff;

import Interfaces.CarMoves;
import Person.Human;

public class Car implements CarMoves {

    @Override
    public void go() {
        System.out.println("Я еду");
    }
}
