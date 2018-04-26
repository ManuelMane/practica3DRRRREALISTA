package practica3.entidades;

import javax.persistence.*;

@Entity
@Table(name = "Table_Ratings")
public class Rating {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idd;
	@Column
	private long userId;
	@Column
	private long movieId;
	@Column
	private double rating;
	@Column
	private int timestamp;


	public Rating(){
	}

	public Rating(long userId, long movieId, double rating,int timestamp) {
		this.setUserId(userId);
		this.setMovieId(movieId);
		this.setRating(rating);
		this.setTimestamp(timestamp);
	}

	public long getIdd() {
		return idd;
	}

	public void setIdd(long idd) {
		this.idd = idd;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getMovieId() {
		return movieId;
	}

	public void setMovieId(long movieId) {
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
