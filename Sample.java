class Box{
	private int length, width, height;
	
	public void setDimension(int l, int w, int h) {
		length = l;
		width = w;
		height = h;
	}
	
	public void showDimension() {
		System.out.println("Length " +length);
		System.out.println("Width " +width);
		System.out.println("Height " +height);
		}
}
public class Sample {

	public static void main(String[] args) {
		Box box = new Box();
		box.setDimension(12, 10, 20);
		box.showDimension();
		//creating new object then old object box will handled by garbage collection.
		box = new Box();
		box.setDimension(0, 1, 2);
		box.showDimension();
	}

}
