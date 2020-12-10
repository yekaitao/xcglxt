package viewItem;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import tools.UpLoad;

import javax.swing.JTextField;

/**
 * ��ʾͷ��ͼƬ
 * 
 * */
public class ShowImg extends JDialog implements ActionListener{

	private ImagePanel contentPanel;
	private JTextField textField;
	private String userId;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the dialog.
	 */
	public ShowImg(String userId) {
		this.userId = userId;
		setBounds(0, 0, 400, 530);
		getContentPane().setLayout(new BorderLayout());
		contentPanel = new ImagePanel(userId+".jpg");
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
			textField = new JTextField();
			buttonPane.add(textField);
			textField.setColumns(25);
			
			JButton btnNewButton = new JButton("\u66F4\u65B0\u56FE\u50CF");
			btnNewButton.addActionListener(this);
			buttonPane.add(btnNewButton);
		}
	}

	//���������ͼ�񡿰�ť�����ļ�ѡ���
	@Override
	public void actionPerformed(ActionEvent e) {
		JFileChooser jfc = new JFileChooser();
		jfc.setDialogTitle("ѡ��jpgͼ���ļ�");//�ļ�ѡ�����ı���
		int result = jfc.showOpenDialog(this);
		if(result == JFileChooser.APPROVE_OPTION) {
			File fFrom = jfc.getSelectedFile();//��ȡ�ļ�
			String fromPath = fFrom.getAbsolutePath();//��ȡ�ļ�·��
			textField.setText(fromPath);//����׶˵��ı����ڵ���������Ϊ�ļ��ľ���·��
			String toPath;
			URL imgPath = ShowImg.class.getResource("/img/");
			if(imgPath == null) {
				String path = ShowImg.class.getResource("/").getPath()+"/img/";
				File f = new File(path);
				f.mkdir();
				toPath = ShowImg.class.getResource("/img/").getPath()+userId+".jpg";
			}
			else {
				toPath = ShowImg.class.getResource("/img/").getPath()+userId+".jpg";
			}
			int state = UpLoad.UpLoad(fromPath, toPath);
			if(state == 1) {
				contentPanel.setImg(Toolkit.getDefaultToolkit().getImage(fromPath));
				contentPanel.repaint();
			}
			else {
				JOptionPane.showMessageDialog(null, "�ļ��ϴ�ʧ��");
			}
		}
	}

}
