public class Circle{
 
// ���Բ�İ뾶
private double radious;
public static void main(String[] args){
 
Circle c=new Circle(10);
c.show();
 
}
// ���뾶��Ϊ0
public Circle(){
 
radious=0.0;
 
}
//����Circle����ʱ���뾶��ʼ��Ϊr
public Circle(double r){
 
this.radious=r;
 
}
public void setRadious(double r){
 
this.radious=r;
 
}
public double getRadious(){
 
return radious;
 
}
//��ȡԲ�����
public double getArea(){
 
return radious*radious*Math.PI;
 
}
//��ȡԲ���ܳ�
public double getPerimeter(){
 
return radious*Math.PI*2;
 
}
//��Բ�İ뾶���ܳ�������������Ļ
public void show(){
 
System.out.println("Բ�İ뾶�ǣ�"+this.getRadious());
System.out.println("Բ���ܳ��ǣ�"+this.getPerimeter());
System.out.println("Բ������ǣ�"+this.getArea());
 
}
 
}