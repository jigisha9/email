/********************************************************************************************************************************************
* Author: Jigisha Shah
* Date of change: 06/01/2017
* Version: 1.0
* Description: Decrypt password
*
*********************************************************************************************************************************************/

import org.apache.log4j.Logger;

import java.util.Base64;
public class PasswordDecrypt {
	static Logger logger = Logger.getLogger(PasswordDecrypt.class);
	/*
	* @param: encryptedPassword
	* @return: decryptedPassword
	* This method will decrypt password from encrypted pwd value
	*/
	public static String decrypt(String encryptedPassword){
		String decryptedPassword;
		//Decrypt password
		byte[] decryptedPasswordBytes = Base64.getDecoder().decode(encryptedPassword);
		decryptedPassword = new String(decryptedPasswordBytes);
		return decryptedPassword;
		}
}
