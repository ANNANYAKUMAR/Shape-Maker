Main.java

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("What shape? 1 for box");
    int select = sc.nextInt();
    if(select == 1) {
       System.out.println("What is the length?");
    int tempLength = sc.nextInt();
     System.out.println("What is the width?");
    int tempWidth = sc.nextInt(); 
    System.out.println("What is the height?");
    int tempHeight = sc.nextInt();

    }
    Box myBox = new Box(tempLength,tempWidth,tempHeight);
    System.out.println(myBox.calcVolume());
  }
}

Box.java
//classname
public class Box {
//member variables
int l, w, h;
//constructor
Box(int l, int w, int h) {
this.l = length;
this.w = width;
this.h = height;
}
//calculates volume
int calcVolume() {
int volume = l * w * h;
return volume;
}
//calculates surface area
int calcSurfaceArea() {
int surfaceArea = ((2 * l * w) + (2 * h * l) + (2 * h * w));
return surfaceArea;
}
}
Pyramid.java
//classname
public class Pyramid {
//member variables
int l, w, h;
//constructor
Pyramid(int l, int w, int h) {
this.l = length;
this.w = width;
this.h = height;
}
//calculates volume
int calcVolume() {
int volume = (l * w * h)/3;
return volume;
}
//calculates surface area
int calcArea() {
int Area = ((l * w));
return Area;
}
}
Sphere.java
//classname
public class Sphere {
//member variables
int r;
//constructor
Sphere(int r) {
this.r = radius;
}
//calculates volume
int calcVolume() {
int volume = (4/3 * π * r^3);
return volume;
}
//calculates surface area
int calcSurfaceArea() {
int SurfaceArea = ((4 * π * r^2));
return SurfaceArea;
}
}
