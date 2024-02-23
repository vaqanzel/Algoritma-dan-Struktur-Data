public class dragon {
    int x;
    int y;
    int width;
    int height;

    public dragon() {

    }

    public dragon(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void moveLeft() {
        x--;
        if (x < 0 && x > width) {
            detectCollision(x, y);
        }
    }

    public void moveRight() {
        x++;
        if (x < 0 && x > width) {
            detectCollision(x, y);
        }
    }

    public void moveUp() {
        y--;
        if (y < 0 && y > height) {
            detectCollision(x, y);
        }
    }

    public void moveDown() {
        y++;
        if (y < 0 && y > height) {
            detectCollision(x, y);
        }
    }

    public void printPosition() {
        if (x >= 0 && y >= 0 && x <= width && y <= height) {
        System.out.println("Posisi Dragon: (" + x + ", " + y + ")");
        } else {
            detectCollision(x, y);
        }
    }

    public void detectCollision(int x, int y) {
        System.out.println("Game Over");
    }

}



