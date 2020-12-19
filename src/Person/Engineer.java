package Person;

import Stuff.Plan;
import Stuff.Sketch;

public class Engineer extends Human {
    private Shorty shorty;
    private boolean main;

    public Engineer(String name, int age) {
        super(name, age);
        setShorty(Shorty.replaceable);
        System.out.println(name + " появляется на свет");
    }

    @Override
    public void go() {
        if (this.isMain()) {
            System.out.println(getName() + " носился по всему Солнечному городу как угорелый и поспевал всюду, где требовалось его присутствие, так как он " + this.getShorty());
        } else {
            System.out.println(getName() + " че-то делает, так как он " + this.getShorty());
        }

    }

    @Override
    public void go(String where, Engineer engineer) {

    }

    @Override
    public void go(String where) {

    }

    public Shorty getShorty() {
        return shorty;
    }

    public void setShorty(Shorty shorty) {
        this.shorty = shorty;
    }

    public Plan perform(Sketch sketch) throws InterruptedException {
        System.out.println(this.getName() + " сделал из эскиза прекрасный чертеж");
        Thread.sleep(1000);
        return new Plan(sketch);
    }

    public boolean isMain() {
        return main;
    }

    public void setMain(boolean main) {
        if (getName().equals("Клепка")) {
            this.main = main;
        }
    }
}
