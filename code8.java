// nested class are regular class
// inner class are static class
public class code8 {
    class Toy{ // non static(regular nested class)
        int price;
    }

    static class playstation{ // static( inner class)
        int price;
    }

    public static void main(String[] args) {
        Toy toy = new code8().new Toy();
        toy.price=150;

        //or second method
        code8 obj = new code8();
        Toy ti = obj.new Toy();
        ti.price = 150;

        playstation ply = new code8.playstation();
        ply.price=80000;
    }

}
