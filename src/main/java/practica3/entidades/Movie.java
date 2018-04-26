package practica3.entidades;

import javax.persistence.*;

@Entity
@Table(name = "Table_Movies")
public class Movie {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idd;
	@Column
	private String title;
	@Column
	private String date;
	@Column
	private String genres;

	
	public Movie(){		
	}
	
	public Movie(String title, String date, String genres) {
		this.setTitle(title);
		this.setDate(date);
		this.setGenres(genres);
	}


	public int getIdd() {
		return idd;
	}

	public void setIdd(int idd) {
		this.idd = idd;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getGenres() {
		return genres;
	}

	public void setGenres(String genres) {
		this.genres = genres;
	}

	@Override
	public String toString() {
		return "Movie [idd=" + getIdd() + ", Title=" + title + ", date=" + date + ", genres=" + genres+"]";
	}
}
