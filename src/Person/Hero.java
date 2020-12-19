package Person;

import Stuff.Sketch;
import Stuff.Factory;

public class Hero extends Human {
    private Sketch sketch;

    public Hero(String name, int age, Sketch sketch) {
        super(name, age);
        this.sketch = sketch;
        if (this.sketch != null && (name.equals("Фуксия") || name.equals("Селедочка"))) {
            System.out.println(name + " появляется на свет и несет эскиз с собой");
        } else {
            this.sketch =null;
            System.out.println(name + " появляется на свет");
        }
    }

    @Override
    public void go(String where) {
        System.out.println(this.getName() + " идет в " + where);
    }

    @Override
    public void go(String where, Engineer engineer) throws InterruptedException {
        if (where.equals("Научный городок") && (getName().equals("Фуксия") || getName().equals("Селедочка")) && getSketch()!=null) {
            System.out.println(getName() + " пришел/ла в научный городок отдать эскиз");
            Thread.sleep(1000);
            Factory factory = new Factory(engineer.getAge());
            factory.moves(engineer.perform(getSketch()));
        } else go(where);
    }

    @Override
    public void go() {

    }

    public void makeMain(Engineer engineer) throws InterruptedException {
        if (engineer.getName().equals("Клепка") && (getName().equals("Фуксия") || getName().equals("Селедочка"))) {
            engineer.setMain(true);
            System.out.println(getName() + " назначил/а главного: " + engineer.getName() + " теперь главный");
            engineer.setShorty(Shorty.irreplaceable);
            Thread.sleep(1000);
        }
    }

    public Sketch getSketch() {
        return sketch;
    }
}
