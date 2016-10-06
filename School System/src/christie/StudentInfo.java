package christie;

public class StudentInfo {
	private static long idGenerator = 300000000;
	private String firstName, lastName, strAddress, city, province, postalCode, phoneNum, birthDate;
	private long studentNumber;
	
	public StudentInfo(){
		this.setFirstName("");
		this.setLastName("");
		this.setStrAddress("");
		this.setCity("");
		this.setProvince("");
		this.setPostalCode("");
		try {
			this.setPhoneNum("");
		} catch (InvalidInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setBirthDate("");
		this.studentNumber=idGenerator;
		idGenerator++;
	}
	public StudentInfo(String fName, String lName, String strAd, String c, String prov, String postCode, String phone, String bDate) throws InvalidInputException{
		setFirstName(fName);
		setLastName(lName);
		setStrAddress(strAd);
		setCity(c);
		setPostalCode(postCode);
		setProvince(prov);
		setPhoneNum(phone);
		setBirthDate(bDate);
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getFirstName(){
		return this.firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public String getLastName(){
		return this.lastName;
	}
	
	public void setStrAddress(String strAddress){
		this.strAddress = strAddress;
	}
	public String getStrAddress(){
		return this.strAddress;
	}
	
	public void setCity(String city){
		this.city = city;
	}
	public String getCity(){
		return this.city;
	}
	
	public void setProvince(String province){
		this.province = province;
	}
	public String getProvince(){
		return this.province;
	}
	
	public void setPostalCode(String postalCode) throws InvalidInputException{
		checkPostalCode(postalCode);
		this.postalCode = postalCode;
	}
	public String getPostalCode(){
		return this.postalCode;
	}
	
	public void setPhoneNum(String phoneNum) throws InvalidInputException{
		checkPhoneNum(phoneNum);
		this.phoneNum = phoneNum;
	}
	public String getPhoneNum(){
		return this.phoneNum;
	}
	
	public void setBirthDate(String birthDate){
		this.birthDate = birthDate;
	}
	public String getBirthDate(){
		return this.birthDate;
	}
	
	private static String checkPostalCode(String postCode) throws InvalidInputException{
		if (postCode.length() == 6){
			if (postCode.substring(0).contentEquals("M3N1M5")){
				if(Character.isLetter(postCode.charAt(0))){
					if(Character.isDigit(postCode.charAt(1))){
						if(Character.isLetter(postCode.charAt(2))){
							if(postCode.substring(3).equals(" ")){
								if(Character.isDigit(postCode.charAt(4))){
									if(Character.isLetter(postCode.charAt(5))){
										if(Character.isDigit(postCode.charAt(6))){
											
										}
									}
								}
							}
						}
					}
					
				}
				return postCode.substring(0, 3) + " " + postCode.substring(3);
			}
			return postCode.substring(0, 3).toUpperCase() + " " + postCode.substring(3).toUpperCase();
		}else{
			throw new InvalidInputException("Invalid postal code. Please enter a postal code.");
		}
		
	}
	private static String checkPhoneNum(String num) throws InvalidInputException{
		if (num.length() == 10){
			String pnum= num.substring(0, 3) + "-" + num.substring(3, 6) + "-" + num.substring(6);
			return pnum;
		}else if(num.length() == 12){
			if (num.substring(3,3).equals("-")){
				if (num.substring(7,7).equals("-")){
					return num;
				}
				return num;
			}
			return num;
		}else{
			throw new InvalidInputException("Invalid number. Please enter a phone number.");
		}
		
	}
	
}
