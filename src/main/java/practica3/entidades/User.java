package practica3.entidades;

import javax.persistence.*;

@Entity
@Table(name = "Table_Names")
public class User {

	@Id
	private int idd;
	@Column
	private String firstName;
	@Column
	private String familyName;


	public User(){
	}

	public User(int id, String firstName, String familyName) {
		this.setIdd(id);
		this.setFirstName(firstName);
		this.setFamilyName(familyName);
	}


	public int getIdd() {
		return idd;
	}

	public void setIdd(int idd) {
		this.idd = idd;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	@Override
	public String toString() {
		return "User [idd=" + getIdd() + ", First User=" + firstName + ", Family User=" + familyName+"]";
	}
}
