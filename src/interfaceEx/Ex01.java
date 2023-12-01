package interfaceEx;

interface SomethingDoI {

	public void doI();
}

public class Ex01 implements SomethingDoI {

	public void forStart() {
		  int size = 10;



	        // 눈부터 얼굴 위쪽까지
	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size * 2 - 1; j++) {
	                if (j >= size - i - 1 && j <= size + i - 1) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }

	        // 얼굴 아래쪽
	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size * 2 - 1; j++) {
	                if (j >= i && j < size * 2 - 1 - i) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }

	}

	public void forCharacter(char something) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(something);
		}
	}

	public void forSomethingDo(SomethingDoI somethingDo) {
		for (int i = 1; i <= 5; i++) {

			somethingDo.doI();
		}
	}

	@Override
	public void doI() {
		System.out.println("d=====(￣▽￣*)b");

	}

}
