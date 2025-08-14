package Facade;

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private Screen screen;
    private SoundSystem soundSystem;


    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, Screen screen, SoundSystem soundSystem) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.screen = screen;
        this.soundSystem = soundSystem;
    }

    public  void  watchMovie(String movie){
        System.out.println("Get ready to watch movie");
        screen.down();
        projector.on();
        projector.setInput("DVD");
        soundSystem.on();
        soundSystem.setVolume(10);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public  void endMovie(){
        System.out.println("Shutting down movie");
        projector.off();
        soundSystem.off();
        dvdPlayer.off();
        screen.up();
    }



}
