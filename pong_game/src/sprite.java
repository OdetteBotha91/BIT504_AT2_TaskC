import java.awt.Color;
import java.awt.Rectangle;

public class sprite 
{
	private int initialXPosition, initialYPosition;
	private int xPosition, yPosition;
	private int xVelocity, yVelocity;
	private int width, height;
	private Color colour;

	// set initial x and y positions
	public void setInitialPosition(int initialX, int initialY)
	{
		initialXPosition = initialX;
		initialYPosition = initialY;
	}
	
	// reset game to initial x and y positions
	public void resetToInitialPosition()
	{
		setxPosition(initialXPosition);
		setyPosition(initialYPosition);
	}
	
	// Getter methods
	public int getxPosition()
	{
		return xPosition;
	}

	public int getyPosition()
	{
		return yPosition;
	}

	public int getxVelocity()
	{
		return xVelocity;
	}

	public int getyVelocity()
	{
		return yVelocity;
	}

	public int getWidth()
	{
		return width;
	}

	public int getHeight()
	{
		return height;
	}

	public Color getColor()
	{
		return colour;
	}
	
	public Rectangle getRectangle() 
	{
        return new Rectangle(getxPosition(), getyPosition(), getWidth(), getHeight());
    }
	
	// Setter methods
	public void setxPosition(int xPosition)
	{
		this.xPosition = xPosition;
	}

	public void setyPosition(int yPosition)
	{
		this.yPosition = yPosition;
	}

	public void setxPosition(int newX, int panelWidth)
	{
		xPosition = newX;
		
		if(xPosition < 0)
		{
			xPosition = 0;
		}
		
		else if(xPosition + width > panelWidth)
		{
			xPosition = panelWidth - width;
		}		
	}

	public void setyPosition(int newY, int panelHeight)
	{
		yPosition = newY;
		
		if(yPosition < 0)
		{
			yPosition = 0;
		}
		
		else if(yPosition + height > panelHeight)
		{
			yPosition = panelHeight - height;
		}		
	}
	
	public void setxVelocity(int xVelocity)
	{
		this.xVelocity = xVelocity;
	}

	public void setyVelocity(int yVelocity)
	{
		this.yVelocity = yVelocity;
	}

	public void setWidth(int width)
	{
		this.width = width;
	}

	public void setHeight(int height)
	{
		this.height = height;
	}
	
	public void setColor(Color colour)
	{
		this.colour = colour;
	}
}