package bean;
/**
 * 
* @ClassName: Command  
* @Description: 命令
* @author chaoling  
* @date 2018年6月16日
 */
public class Command{
	private static String CMD[] = {"explorer.exe", "mspaint"}; //CMD命令

	public static String[] getCMD() {
		return CMD;
	}

	public static void setCMD(String[] cmd) {
		CMD = cmd;
	} 
	
	
}
