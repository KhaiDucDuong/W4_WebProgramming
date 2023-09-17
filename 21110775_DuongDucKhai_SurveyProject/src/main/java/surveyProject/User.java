package surveyProject;

import java.io.Serializable;

public class User implements Serializable{
    private String firstName;
    private String lastName;
    private String email;
    private String dateOfBirth;
    private String hearOption;
    private Boolean isAnnoucement;
    private Boolean isEmailAnnoucement;
    private String contactOption;

    public User(){
        firstName = "";
        lastName = "";
        email = "";
        dateOfBirth ="";
        hearOption ="";
        isAnnoucement = false;
        isEmailAnnoucement = false;
        contactOption = "";
    }
    
    public User(String firstName, String lastName, String email, String dateOfBirth,
    		String hearOption, Boolean isAnnoucement, Boolean isEmailAnnoucement, String contactOption)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.hearOption = hearOption;
        this.isAnnoucement = isAnnoucement;
        this.isEmailAnnoucement = isEmailAnnoucement;
        this.contactOption = contactOption;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getHearOption() {
		return hearOption;
	}

	public void setHearOption(String hearOption) {
		this.hearOption = hearOption;
	}

	public Boolean getIsAnnoucement() {
		return isAnnoucement;
	}

	public void setIsAnnoucement(Boolean isAnnoucement) {
		this.isAnnoucement = isAnnoucement;
	}

	public Boolean getIsEmailAnnoucement() {
		return isEmailAnnoucement;
	}

	public void setIsEmailAnnoucement(Boolean isEmailAnnoucement) {
		this.isEmailAnnoucement = isEmailAnnoucement;
	}

	public String getContactOption() {
		return contactOption;
	}

	public void setContactOption(String contactOption) {
		this.contactOption = contactOption;
	}
}
