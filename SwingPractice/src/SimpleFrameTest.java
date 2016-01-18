import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleFrameTest
{

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			
			@Override
			public void run()
			{
				SimpleFrame testFrame = new SimpleFrame();
				testFrame.setTitle("Color Panel");
				testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				testFrame.setResizable(false);
				testFrame.setVisible(true);
			}
		});
	}
}

class SimpleFrame extends JFrame
{
	private JPanel buttonPanel;
	private JPanel imagePanel;
	private static final int DEFAULT_WIDTH = 450;
	private static final int DEFAULT_HEIGHT = 600;
	private static final Image aCard = new ImageIcon("img/cards/2C.png").getImage();
	
	public SimpleFrame()
	{
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
		JButton yButton = new JButton("Yellow");
		JButton bButton = new JButton("Blue");
		
		buttonPanel = new JPanel();
		buttonPanel.add(yButton);
		buttonPanel.add(bButton);
		
		imagePanel = new JPanel();
		imagePanel.add(new ImageComponet("img/cards/2C.png"));
		
		add(buttonPanel, BorderLayout.SOUTH);
		add(imagePanel, BorderLayout.NORTH);
		
		ColorAction yAction = new ColorAction(Color.YELLOW);
		ColorAction bAction = new ColorAction(Color.BLUE);
		
		yButton.addActionListener(yAction);
		bButton.addActionListener(bAction);
	}
	
	private class ColorAction implements ActionListener
	{
		private Color backgroundColor;
		
		public ColorAction(Color c)
		{
			backgroundColor = c;
		}
		
		public void actionPerformed(ActionEvent event)
		{
			buttonPanel.setBackground(backgroundColor);
			
		}
	}
	
	private class ImageComponet extends JComponent
	{
		private static final int DEFAULT_WIDTH = 100;
		private static final int DEFAULT_HEIGHT = 145;
		private Image image;
		
		public ImageComponet(String imgSrc)
		{
			image = new ImageIcon(imgSrc).getImage();
		}
		
		public void paintComponent(Graphics g)
		{
			if (image == null)
			{
				return;
			}
			
			int imageWidth = image.getWidth(this);
			int imageHeight = image.getHeight(this);
			
			g.drawImage(image, 0, 0, null);
		}
		
		public Dimension getPreferredSize()
		{
			return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		}
	}
}