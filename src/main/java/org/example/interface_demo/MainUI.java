package org.example.interface_demo;

interface Movie{
    public void sound();
}
interface UI extends Movie{
    public static final int MAx=10;
    public void drawCircle();
    public void drawLine();
}

class  MacUI implements UI{
    @Override
    public void drawCircle() {
        System.out.println("Circle is dran as per mac os");
    }

    @Override
    public void sound() {
        System.out.println("Movie sound is on");
    }
    @Override
    public void drawLine(){
        System.out.println("Line is drawn as per mac os");
    }
    public  void drawRectangle(){
        System.out.println("rectangle is drawn as per mac os");
    }
}

public class MainUI {
    public static void main(String[] args) {
        UI ui=new MacUI();
        ui.drawCircle();
        ui.drawLine();
        ui.sound();
//        ui.drawRectangle(); cant be called

        MacUI mac=(MacUI)ui;
        mac.drawRectangle();
    }
}
