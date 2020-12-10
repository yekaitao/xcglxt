package tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 * 上传文件,用于选择用户头像
 * 
 *
 */
public class UpLoad {
	
	public static int UpLoad(String fileFrom,String fileTo) {
		int state = 0;
		File fFrom = new File(fileFrom);
		File fTo = new File(fileTo);
		File parentPath = new File(fTo.getParent());
		if(!parentPath.exists()) {
			parentPath.mkdir();
		}
		try {
			FileInputStream fIn = new FileInputStream(fFrom);
			FileOutputStream fOut = new FileOutputStream(fTo);
			FileChannel fileChannelIn = fIn.getChannel();
			FileChannel fileChannelOut = fOut.getChannel();
			fileChannelIn.transferTo(0, fileChannelIn.size(), fileChannelOut);
			fileChannelOut.close();
			fileChannelIn.close();
			fIn.close();
			fOut.close();
			state = 1;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return state;
	}
}
