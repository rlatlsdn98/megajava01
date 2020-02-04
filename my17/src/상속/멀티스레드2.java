package 상속;

public class 멀티스레드2 {

	public static void main(String[] args) {
		star s = new star();
		name n = new name();
		s.start();
		n.start();

	}

}
