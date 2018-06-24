package handle;

import java.util.Scanner;
/**
 * 
* @ClassName: Matching  
* @Description: 输入内容匹配
* @author chaoling  
* @date 2018年6月16日
 */
public class Matching {

	public static String inPut(String str) {
		Transmit transmit = new Transmit();
		transmit =Cmd.Cmd(str); 
			
		return transmit.getStr();
	}
}
