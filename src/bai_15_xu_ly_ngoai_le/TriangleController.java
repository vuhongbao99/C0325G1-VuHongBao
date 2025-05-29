package bai_15_xu_ly_ngoai_le;

public class TriangleController {
    private TriangleView view = new TriangleView();

    public void run() {
        double a = view.inputSide("a");
        double b = view.inputSide("b");
        double c = view.inputSide("c");

        try {
            Triangle triangle = new Triangle(a, b, c);
            view.showMessage(triangle.toString());
        } catch (IllegalTriangleException e) {
            view.showMessage("Lỗi: " + e.getMessage());
        }
    }
}

