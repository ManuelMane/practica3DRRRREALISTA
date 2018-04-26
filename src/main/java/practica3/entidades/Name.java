package practica3.entidades;

import javax.persistence.*;

@Entity
@Table(name = "Table_Names")
public class Name {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idd;
	@Column
	private String firstName;
	@Column
	private String familyName;


	public Name(){
	}

	public Name(String firstName, String familyName) {
		this.setFirstName(firstName);
		this.setFamilyName(familyName);
	}


	public long getIdd() {
		return idd;
	}

	public void setIdd(long idd) {
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
		return "Name [idd=" + getIdd() + ", First Name=" + firstName + ", Family Name=" + familyName+"]";
	}
}
