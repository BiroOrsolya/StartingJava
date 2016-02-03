package week9project;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MovieManager {
	public static final String FILE_PATH = "C:\\Workspace\\LetsStartJava\\movies.xml";

	public static void main(String[] args) {
		Person me = new Person("Biro", "Orsi", Gender.FEMALE, false, false);
		List<Person> persons = new ArrayList<Person>();
		List<Movie> movies = new ArrayList<Movie>();
		persons.add(me);
		Movie myfilm = new Movie("My Little Pony", Genre.THRILLER, 40, 9.9, persons);
		movies.add(myfilm);
		try {
			BufferedWriter buffer = new BufferedWriter(new FileWriter(new File(FILE_PATH)));
			StringBuffer strbuffer = new StringBuffer();
			strbuffer.append("<movies>");
			strbuffer.append(myfilm.toXMLString());
			strbuffer.append(me.toXMLString());
			strbuffer.append("</movies>");
			buffer.write(strbuffer.toString());
			buffer.flush();
			buffer.close();
		} catch (IOException ex) {
			System.out.println(ex);
		}
	}

}