import Person.Hero;
import Person.Engineer;
import Stuff.Sketch;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Hero hero = new Hero("Фуксия",23, new Sketch());
        Hero hero1 = new Hero("Селедочка",23, null);
        Engineer engineer = new Engineer("Клепка",20);
        Engineer engineer1 = new Engineer("Федя",50);
        hero1.go("Научный городок");
        hero.go("Научный городок", engineer);
        hero.makeMain(engineer);
        engineer.go();
        engineer1.go();
    }
}
