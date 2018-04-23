public class Circle{
 
// 存放圆的半径
private double radious;
public static void main(String[] args){
 
Circle c=new Circle(10);
c.show();
 
}
// 将半径设为0
public Circle(){
 
radious=0.0;
 
}
//创建Circle对象时将半径初始化为r
public Circle(double r){
 
this.radious=r;
 
}
public void setRadious(double r){
 
this.radious=r;
 
}
public double getRadious(){
 
return radious;
 
}
//获取圆的面积
public double getArea(){
 
return radious*radious*Math.PI;
 
}
//获取圆的周长
public double getPerimeter(){
 
return radious*Math.PI*2;
 
}
//将圆的半径、周长、面积输出到屏幕
public void show(){
 
System.out.println("圆的半径是："+this.getRadious());
System.out.println("圆的周长是："+this.getPerimeter());
System.out.println("圆的面积是："+this.getArea());
 
}
 
}