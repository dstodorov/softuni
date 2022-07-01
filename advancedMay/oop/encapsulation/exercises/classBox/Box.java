package SoftUni.advancedMay.oop.encapsulation.exercises.classBox;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    public double getLength() {
        return length;
    }

    private void setLength(double length) {
        if (!validSide(length)) throw new IllegalArgumentException("Length cannot be zero or negative.");
        this.length = length;
    }



    public double getWidth() {
        return width;
    }

    private void setWidth(double width) {
        if (!validSide(width)) throw new IllegalArgumentException("Width cannot be zero or negative.");
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    private void setHeight(double height) {
        if (!validSide(height)) throw new IllegalArgumentException("Height cannot be zero or negative.");
        this.height = height;
    }

    public double calculateSurfaceArea() {
        // 2lw + 2lh + 2wh
        return 2 * this.length * this.width + 2 * this.length * this.height + 2 * this.width * this.height;
    }

    public double calculateLateralSurfaceArea() {
        return 2 * this.length * this.height + 2 * this.width * this.height;
    }

    public double calculateVolume() {
        //lwh
        return this.length * this.width * this.height;
    }

    private boolean validSide(double length) {
        if (length > 0) return true;
        return false;
    }


}
