package kata;

public class Rover {
    public String Direction = "N";

    public String execute(String command) {

        for (char c : command.toCharArray()) {
            if (c == 'R') {
                rotate_right();
            }

            if (c == 'L') {
                Direction = rotate_left();
            }

        }
        return "0:0:" + Direction;
    }

    private String rotate_left() {
        if (Direction.equals("S")) {
            Direction = "E";
            return Direction;
        }
        if (Direction.equals("W")) {
            Direction = "S";
            return Direction;
        }
        if (Direction.equals("N")) {
            Direction = "W";
            return Direction;
        }
        if (Direction.equals("E")) {
            Direction = "N";
            return Direction;
        }
        return Direction;
    }

    private void rotate_right() {
        if (Direction.equals("S")) {
            Direction = "W";
        } else if (Direction.equals("E")) {
            Direction = "S";
        } else if (Direction.equals("N")) {
            Direction = "E";
        } else {
            Direction = "N";
        }
    }
}
