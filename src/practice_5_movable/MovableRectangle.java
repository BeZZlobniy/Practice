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

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public void moveUp() {
        if (checkSpeedCorrect()){
            topLeft.moveUp();
            bottomRight.moveUp();
        }
        else{
            System.out.println("Значения скоростей точек прямоугольника не совпадает topLeft: \n xSpeed = " +
                    topLeft.xSpeed + "\n ySpeed = " + topLeft.ySpeed + "\n bottomRight: \n xSpeed = " +
                    bottomRight.xSpeed + "\n ySpeed = " + bottomRight.ySpeed);
        }
    }

    @Override
    public void moveDown() {
        if (checkSpeedCorrect()){
            topLeft.moveDown();
            bottomRight.moveDown();
        }
        else{
            System.out.println("Значения скоростей точек прямоугольника не совпадает topLeft: \n xSpeed = " +
                    topLeft.xSpeed + "\n ySpeed = " + topLeft.ySpeed + "\n bottomRight: \n xSpeed = " +
                    bottomRight.xSpeed + "\n ySpeed = " + bottomRight.ySpeed);
        }
    }

    @Override
    public void moveLeft() {
        if (checkSpeedCorrect()){
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
        else{
            System.out.println("Значения скоростей точек прямоугольника не совпадает topLeft: \n xSpeed = " +
                    topLeft.xSpeed + "\n ySpeed = " + topLeft.ySpeed + "\n bottomRight: \n xSpeed = " +
                    bottomRight.xSpeed + "\n ySpeed = " + bottomRight.ySpeed);
        }
    }

    @Override
    public void moveRight() {
        if (checkSpeedCorrect()){
            topLeft.moveRight();
            bottomRight.moveRight();
        }
        else{
            System.out.println("Значения скоростей точек прямоугольника не совпадает topLeft: \n xSpeed = " +
                    topLeft.xSpeed + "\n ySpeed = " + topLeft.ySpeed + "\n bottomRight: \n xSpeed = " +
                    bottomRight.xSpeed + "\n ySpeed = " + bottomRight.ySpeed);
        }
    }
}
