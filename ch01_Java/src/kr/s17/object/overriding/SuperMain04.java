package kr.s17.object.overriding;

//부모 클래스
class Point{
	int x;
	int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String getLocation() {
		return "x: " + x + ", y: " + y;
	}
}

//자식 클래스
class Point3D extends Point{
	int z;
	public Point3D(int x, int y, int z) {
		super(x, y); //부모 클래스에 인자가 있는 생성자가 있으면 자식 생성자에 무조건적으로 호출해줘야함
		this.z = z;
	}
	@Override
	public String getLocation() {
		return "x: " + x + ", y: " + y + ", z: " + z;
	}
}


public class SuperMain04 {
	public static void main(String[] args) {
		Point3D p3 = new Point3D(10, 20, 30);
		System.out.println(p3.getLocation());
	}
}
