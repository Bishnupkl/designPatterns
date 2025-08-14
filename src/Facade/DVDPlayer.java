package Facade;

public class DVDPlayer {

    public void on(){
        System.out.println("DVD player is on");
    }

    public  void play(String mode){
        System.out.println("Playing movie: " +mode);
    }

    public  void off(){
        System.out.println("DVD Player is off");

    }
}
