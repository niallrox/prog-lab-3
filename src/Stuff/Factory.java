package Stuff;

import Interfaces.FactoryMoves;

public class Factory implements FactoryMoves {
    private int countEngineers;
    private int width;
    private int length;
    public Factory(int countEngineers){
        this.countEngineers=countEngineers;
        this.width=100;
        this.length=100;
    }

    @Override
    public void pack() {
        System.out.print(" пакуют");
    }

    @Override
    public void stamp() {
        System.out.print(", штампуют");
    }

    @Override
    public void pour() {
        System.out.print(", отливают");
    }

    @Override
    public void makeEquip() {
        System.out.println(", изготавливают аппаратуру для управления кораблем");
    }

    public void moves(Plan plan) throws InterruptedException {
        System.out.println("Чертеж передан на завод инженеры начинают работу");
        Thread.sleep((plan.getWidth()+ plan.getHeight() + plan.getLength())/countEngineers * 800);
        System.out.print(countEngineers + " инженеров");
        pack();
        stamp();
        pour();
        makeEquip();
    }
}
