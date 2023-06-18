public class Main {

    private String berry;

    public Main(String berry) {
        this.berry = berry;
    }

    public static void main(String[] args) {

        Main main = new Main("straw");
        main.printberry(main);
    }

    private void printberry(Main main) {

//        this.berry="rasp";
        System.out.println(berry+"berry");


    }
}