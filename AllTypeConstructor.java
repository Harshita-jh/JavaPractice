
public class AllTypeConstructor {
	
		private int l, w, h;
		
		public AllTypeConstructor() {
			l=10;
			w=8;
			h=4;
		}
		public AllTypeConstructor(int L, int W, int H) {
			l=L;
			w=W;
			h=H;
		}
	
	public static void main(String[] args) {
		AllTypeConstructor c1=new AllTypeConstructor();
		AllTypeConstructor c2=new AllTypeConstructor(20, 15, 5);;

	}
	
}
