package lsp.solution.test;

import lsp.solution.IPolygon;
import lsp.solution.Rectangle;
import lsp.solution.Square;

public class LspSolutionTest {
	public static void main(String[] args) {
		shouldNotChangeWithIfHeightChangedFor(new Rectangle(10, 20));
		//shouldNotChangeWithIfHeightChangedFor(new Square(10));
	}

	private static void shouldNotChangeWithIfHeightChangedFor(Rectangle polygon) {
		int beforeWidth = polygon.getWidth();
		polygon.setHeight(polygon.getHeight() + 10);
		int afterWidth = polygon.getWidth();
		System.out.println(beforeWidth == afterWidth);
		System.out.println(beforeWidth);
		System.out.println(afterWidth);

	}
}
