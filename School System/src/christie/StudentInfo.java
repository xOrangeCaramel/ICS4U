package christie;

public class StudentInfo {
	private static long idGenerator = 300000000;
	private String firstName, lastName, strAddress, city, province, postalCode, phoneNum, birthDate;
	private long studentNumber;
	//private int birthDate;
	
	public StudentInfo(){
		this.setFirstName("");
		this.setLastName("");
		this.setStrAddress("");
		this.setCity("");
		this.setProvince("");
		this.setPostalCode("");
		this.setPhoneNum("");
		this.setBirthDate("");
		this.studentNumber=idGenerator;
		idGenerator++;
	}
	public StudentInfo(String fName, String lName, String strAd, String c, String prov, String postCode, String phone, String bDate){
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
	
	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}
	public String getPostalCode(){
		return this.postalCode;
	}
	
	public void setPhoneNum(String phoneNum){
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
	
}
