import java.awt.Color;

public class ping_ball extends sprite
{
	private final static int BALL_WIDTH = 25;
    private final static int BALL_HEIGHT = 25;
    private final static  Color BALL_COLOUR = Color.WHITE;
    
    public ping_ball(int panelWidth, int panelHeight)
    {
    	setWidth(BALL_WIDTH);
    	setHeight(BALL_HEIGHT);
    	setColor(BALL_COLOUR);
    	setInitialPosition(panelWidth / 2 - (getWidth() / 2), panelHeight / 2 - (getHeight() / 2));
    	resetToInitialPosition();
    }
}