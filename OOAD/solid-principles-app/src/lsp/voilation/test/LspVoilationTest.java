package lsp.voilation.test;

import lsp.voilation.Rectangle;
import lsp.voilation.Square;

public class LspVoilationTest {
	public static void main(String[] args) {
		shouldNotChangeWithIfHeightChangedFor(new Rectangle(10, 20));
		shouldNotChangeWithIfHeightChangedFor(new Square(10));
	}

	private static void shouldNotChangeWithIfHeightChangedFor(Rectangle rectangle) {
		int beforeWidth = rectangle.getWidth();
		rectangle.setHeight(rectangle.getHeight() + 10);
		int afterWidth = rectangle.getWidth();
		System.out.println(beforeWidth == afterWidth);
		System.out.println(beforeWidth);
		System.out.println(afterWidth);

	}
}
