package viewItem;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * 绘制显示用户头像
 * 
 *
 */
public class ImagePanel extends JPanel {

	private Image img;
	public Image getImg() {
		return img;
	}
	public void setImg(Image img) {
		this.img = img;
	}
	public ImagePanel(String imgName) {
		URL imgURL = ImagePanel.class.getResource("/img/"+imgName);
		if(imgURL!=null) {
			img = Toolkit.getDefaultToolkit().getImage(imgURL);
		}
		else {
			imgURL = ImagePanel.class.getResource("/img/default.jpg");
			if(imgURL!=null) {
				img = Toolkit.getDefaultToolkit().getImage(imgURL);
			}else {
				JOptionPane.showMessageDialog(null,"img文件夹中不存在default.jpg");
			}
		}
	}
	
	//绘制头像
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(img, 0, 0, 400, 500,this);
	}

}
