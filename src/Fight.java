public class Fight {
    public static void main(String[] args) {
        Red red = new Red();
        Blue blue = new Blue();
        fight(red, blue);
        

    }

    private static void fight(Red red, Blue blue) {
        while (true) {
            if (!red.isAlive && blue.isAlive) {
                System.out.println("Blue winrr!");
                break;
            } else if (red.isAlive && !blue.isAlive) {
                System.out.println("Red win!");
                break;
            } else if (!red.isAlive && !blue.isAlive) {
                System.out.println("Both died!");
                break;
            }
            if (red.health < 0) {
                red.isAlive = false;
            } else {
                red.health -= blue.kickPower;
            }
            if (blue.health < 0) {
                blue.isAlive = false;
            } else {
                blue.health -= red.kickPower;
            }
        }


    }
}


