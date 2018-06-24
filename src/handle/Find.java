package handle;
/**
 * 
* @ClassName: Find  
* @Description: 匹配
* @author chaoling  
* @date 2018年6月16日
 */
public class Find {

	/**
	 * 
	* @Title: findString  
	* @Description: 在字符串数组中查找某字符串
	* @param @param s
	* @param @param str
	* @param @return   
	* @return Transmit  
	* @throws
	 */
	public static Transmit findString(String []s,String str) {
		Transmit transmit;
		int i;
		transmit = new Transmit();
		
		for(i = 0;i < s.length;i++) {
			if(s[i].equals(str) ) {
				transmit.setNo(i);
				return transmit;
			}	
		}
		return transmit;
	}
	
}
