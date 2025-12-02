package Excepation_1;

public class Anonymous_class_02 {

	public static void main(String[] args) {

		Student i = new Student() {
			public void Activate() {
				System.out.println("Student is Active ..!");
			}
		};
		i.Activate();
	}

}

interface Student {
	void Activate();
}
