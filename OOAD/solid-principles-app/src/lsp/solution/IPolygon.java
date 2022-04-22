package lsp.solution;

public interface IPolygon {
	public default int caculateArea(int width, int height) {
		return width * height;
	}
}
