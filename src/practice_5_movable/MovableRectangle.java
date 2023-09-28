package practice_5_movable;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft, bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2,y2, xSpeed,ySpeed);
    }

    private boolean checkSpeedCorrect(){
        return topLeft.ySpeed == bottomRight.ySpeed && topLeft.xSpeed == bottomRight.xSpeed;
    }

    public void setSpeed(int xSpeed, int ySpeed){
        topLeft.ySpeed = ySpeed;
        topLeft.xSpeed = xSpeed;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=MovablePoint{x=" + topLeft.x + ", y="+ topLeft.y+
                "}, bottomRight=MovablePoint{x=" + bottomRight.x + ", y=" + bottomRight.y +
                "}, xSpeed = " + topLeft.xSpeed +
                ", ySpeed=" + topLeft.ySpeed +
                "}";
    }

    @Override
    public void moveUp() {
        if (checkSpeedCorrect()){
            topLeft.moveUp();
            bottomRight.moveUp();
        }
        else{
            System.out.println("The values of the speeds of the rectangle points do not match topLeft: \nxSpeed = " +
                    topLeft.xSpeed + "\nySpeed = " + topLeft.ySpeed + "\nbottomRight: \nxSpeed = " +
                    bottomRight.xSpeed + "\nySpeed = " + bottomRight.ySpeed);
        }
    }

    @Override
    public void moveDown() {
        if (checkSpeedCorrect()){
            topLeft.moveDown();
            bottomRight.moveDown();
        }
        else{
            System.out.println("The values of the speeds of the rectangle points do not match topLeft: \nxSpeed = " +
                    topLeft.xSpeed + "\nySpeed = " + topLeft.ySpeed + "\nbottomRight: \nxSpeed = " +
                    bottomRight.xSpeed + "\nySpeed = " + bottomRight.ySpeed);
        }
    }

    @Override
    public void moveLeft() {
        if (checkSpeedCorrect()){
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
        else{
            System.out.println("The values of the speeds of the rectangle points do not match topLeft: \nxSpeed = " +
                    topLeft.xSpeed + "\nySpeed = " + topLeft.ySpeed + "\nbottomRight: \nxSpeed = " +
                    bottomRight.xSpeed + "\nySpeed = " + bottomRight.ySpeed);
        }
    }

    @Override
    public void moveRight() {
        if (checkSpeedCorrect()){
            topLeft.moveRight();
            bottomRight.moveRight();
        }
        else{
            System.out.println("The values of the speeds of the rectangle points do not match topLeft: \nxSpeed = " +
                    topLeft.xSpeed + "\nySpeed = " + topLeft.ySpeed + "\nbottomRight: \nxSpeed = " +
                    bottomRight.xSpeed + "\nySpeed = " + bottomRight.ySpeed);
        }
    }
}
