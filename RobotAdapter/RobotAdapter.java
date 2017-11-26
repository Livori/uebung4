public class RobotAdapter implements Spieler {

    Robot roboter;

    public RobotAdapter(Robot roboter) {
        this.roboter = roboter;
    }

    public int geheNachLinks(int distance) {
        roboter.rolleNach(roboter.getX() - distance, roboter.getY());
        return (int) roboter.getX();
    }

    public int geheNachRechts(int distance) {
        roboter.rolleNach(roboter.getX() + distance, roboter.getY());
        return (int) roboter.getX();
    }

    public int geheNachOben(int distance) {
        roboter.rolleNach(roboter.getX(), roboter.getY() + distance);
        return (int) roboter.getY();
    }

    public int geheNachUnten(int distance) {
        roboter.rolleNach(roboter.getX(), roboter.getY() - distance);
        return (int) roboter.getY();
    }

}
