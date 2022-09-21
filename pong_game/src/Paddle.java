import java.awt.Color;

public class Paddle extends sprite
{
	private final static int PADDLE_WIDTH = 10;
    private final static int PADDLE_HEIGHT = 100;
    private final static int PADDLE_DISTANCE_FROM_EDGE = 40;
    private final static  Color PADDLE_COLOUR = Color.WHITE;
    
    public Paddle (Player player, int panelWidth, int panelHeight)
    {
    	setWidth(PADDLE_WIDTH);
    	setHeight(PADDLE_HEIGHT);
    	setColor(PADDLE_COLOUR);
    	
    	int xPos;
    	
    	if(player == Player.One)
    	{
    		xPos = PADDLE_DISTANCE_FROM_EDGE;
    	}
    	
    	else
    	{
    		xPos = panelWidth - PADDLE_DISTANCE_FROM_EDGE - getWidth();
    	}
    	
    	setInitialPosition(xPos, panelHeight / 2 - (getHeight() / 2));
    	resetToInitialPosition();
    }
}