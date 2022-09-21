import java.awt.Color;

public class ping_ball extends sprite
{
    private final static int BALL_WIDTH = 30;   // ball size adjusted from 25 to 30
    private final static int BALL_HEIGHT = 30;	// ball size adjusted from 25 to 30
    private final static  Color BALL_COLOUR = Color.PINK;	// ball colour adjusted from white to pink
    
    public ping_ball(int panelWidth, int panelHeight)
    {
    	setWidth(BALL_WIDTH);
    	setHeight(BALL_HEIGHT);
    	setColor(BALL_COLOUR);
    	setInitialPosition(panelWidth / 2 - (getWidth() / 2), panelHeight / 2 - (getHeight() / 2));
    	resetToInitialPosition();
    }
}
