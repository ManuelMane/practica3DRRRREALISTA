package practica3.entidades;

import javax.persistence.*;

@Entity
@Table(name = "Table_Ratings")
public class Rating {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idd;
	@Column
	private int userId;
	@Column
	private int movieId;
	@Column
	private double rating;
	@Column
	private int timestamp;


	public Rating(int userId, int movieId, String atributte, String s){
	}

	public Rating(int userId, int movieId, double rating,int timestamp) {
		this.setUserId(userId);
		this.setMovieId(movieId);
		this.setRating(rating);
		this.setTimestamp(timestamp);
	}

	public int getIdd() {
		return idd;
	}

	public void setIdd(int idd) {
		this.idd = idd;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(int timestamp) {
		this.timestamp = timestamp;
	}


	@Override
	public String toString() {
		return "Rating [idd=" + getIdd() + ", User Id=" + getUserId() + ", Movie Id=" + getMovieId()+", Rating="+ getRating() +", Timestamp="+ getTimestamp() +"]";
	}

}
