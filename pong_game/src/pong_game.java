import javax.swing.JFrame;
 
public class pong_game extends JFrame 
{	
	private final static String WINDOW_TITLE = "Pong";
    private final static int WINDOW_WIDTH = 800;
    private final static int WINDOW_HEIGHT = 600;
    
    public pong_game() 
	{
        setTitle(WINDOW_TITLE);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setResizable(false);
        add(new pong_panel());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
 
	public static void main(String[] args) 
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				new pong_game();
			}
		});
	} 
}