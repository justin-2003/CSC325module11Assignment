package NewDrawingSys;

import com.mycompany.oldDrawingSys.Circle;

public class CircleAdapter implements Shape {
    private Circle circle;

    public CircleAdapter(Circle circle){
        this.circle = circle;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        int radius =(x2 - x1)/2;
        circle.draw(x1+radius, y1 + radius,radius);
    }
}
