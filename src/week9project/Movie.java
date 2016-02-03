package week9project;

import java.util.List;

public class Movie {
	String title;
	Genre genre;
	long duration;
	double rate;
	List<Person> cast;

	public Movie(String title, Genre genre, long duration, double rate, List<Person> cast) {

		this.title = title;
		this.genre = genre;
		this.duration = duration;
		this.rate = rate;
		this.cast = cast;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public double getTare() {
		return rate;
	}

	public void setTare(double tare) {
		this.rate = tare;
	}

	public List<Person> getCast() {
		return cast;
	}

	public void setCast(List<Person> cast) {
		this.cast = cast;
	}

	public String toXMLString() {
		String resulttitle = Tools.toXMLTag("title", this.title);
		String resultgenre = Tools.toXMLTag("genre", this.genre.toString());
		String resultduration = Tools.toXMLTag("duration", String.valueOf(this.duration));
		String resultrate = Tools.toXMLTag("rate", String.valueOf(this.rate));
		String result = resulttitle + resultgenre + resultduration + resultrate;
		return Tools.toXMLTag("movie", result);

	}
}
