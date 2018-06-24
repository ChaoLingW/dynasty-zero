package handle;

import java.io.IOException;

import bean.Command;
/**
 * 
* @ClassName: Cmd  
* @Description: cmd命令执行
* @author chaoling  
* @date 2018年6月16日
 */
public class Cmd {
	public static Transmit Cmd(String str) {
		Transmit transmit= new Transmit();
		Runtime run=Runtime.getRuntime();  
		Command c = new Command();
		
		String cmd[] = c.getCMD();
		transmit =Find.findString(cmd, str);
		
		if(transmit.getNo() == -1) {
			transmit.setStr("未找到");
			return transmit;
		}
		try {
			run.exec(str);
			transmit.setStr("已执行");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return transmit;	
	}

}
