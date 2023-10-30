package Model;

public class Robot {
    private char icon;
    public char getIcon() {
        return icon;
    }

    private Position position;

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Robot(char icon, Position position) {
        this.icon = icon;
        this.position = position;
    }
}