class Game {

    private Window window;
    private Pannel pannel;

    public Game() {

        pannel=new Pannel();
        window=new Window(pannel);
        pannel.requestFocus();

    }
}