import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.text.*;

public class MyFrame extends JFrame {
	
	Calendar calendar;
	SimpleDateFormat timeFormat;
	SimpleDateFormat dayFormat;
	SimpleDateFormat dateFormat;
	JLabel timeLabel;
	JLabel dayLabel;
	JLabel dateLabel;
	String time;
	String day;
	String date;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Clock Program");
		this.setLayout(new FlowLayout());
		this.setSize(350, 220);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		
		timeFormat = new SimpleDateFormat("hh:mm:ss a");
		dayFormat = new SimpleDateFormat("EEEE");
		dateFormat = new SimpleDateFormat("MMMMM, dd, yyyy");
		
		dayLabel = new JLabel();
		dayLabel.setFont(new Font("Ink Free", Font.PLAIN, 40));
		
		dateLabel = new JLabel();
		dateLabel.setFont(new Font("Ink Free", Font.PLAIN, 40));
		
		timeLabel = new JLabel();
		timeLabel.setFont(new Font("Verdana", Font.PLAIN, 50));
		timeLabel.setForeground(Color.pink);
		timeLabel.setBackground(Color.blue);
		timeLabel.setOpaque(true);
		
		time = timeFormat.format(Calendar.getInstance().getTime());
		timeLabel.setText(time);
	
		
		this.add(timeLabel);
		this.add(dayLabel);
		this.add(dateLabel);
		this.setVisible(true);
		setTime();
	}
	
	public void setTime() {
		while(true) {
			time = timeFormat.format(Calendar.getInstance().getTime());
			timeLabel.setText(time);
			
			day = dayFormat.format(Calendar.getInstance().getTime());
			dayLabel.setText(day);

			date = dateFormat.format(Calendar.getInstance().getTime());
			dateLabel.setText(date);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
