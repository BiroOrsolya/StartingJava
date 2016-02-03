package week9project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Tools {

	public static String toXMLTag(String tag, String value) {
		return "<" + tag + ">" + value + "</" + tag + ">";
	}

	public static HashMap<Person, Integer> countMoviesPerPerson(List<Movie> movies) {
		HashMap<Person, Integer> moviePerPerson = new HashMap<>();
		for (Movie movie : movies) {
			for (Person person : movie.cast) {
				if (!moviePerPerson.containsKey(person)) {
					moviePerPerson.put(person, 1);
				}
			}

		}
		return moviePerPerson;
	}

	public static String[] getMovieTitles(ArrayList<Movie> movies) {
		int movieItems = movies.size();
		String[] result = new String[movieItems];

		for (int i = 0; i < movieItems; i++) {
			result[i] = movies.get(i).getTitle();
		}
		return result;
	}

}