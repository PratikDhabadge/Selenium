import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class S14_114_Streams {
	// TODO Auto-generated method stub

	@Test

	public void regular()

	{

		ArrayList<String> names = new ArrayList<String>();

		names.add("Aarav");
		names.add("Anubhuti");
		names.add("Bhumi");
		names.add("Akshatagowda");

		int count = 0;

		for (int i = 0; i < names.size(); i++){

			String actuals = names.get(i);

			if (actuals.startsWith("A")){
				count++;
			}
		}
		System.out.println(count);
	}

	@Test

	public void streamfilter(){
		ArrayList<String> names = new ArrayList<String>();

		names.add("Aarav");
		names.add("Anubhuti");
		names.add("Bhumi");
		names.add("Akshatagowda");
		names.add("Kir");

		Long c = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(c);

		Long d = Stream.of("Aarav", "Anubhuti", "Bhumi", "Akshatagowda").filter(s ->
		{
			return s.startsWith("A");
		}).count();

		System.out.println(d);

		names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));

		// names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));

	}

}
