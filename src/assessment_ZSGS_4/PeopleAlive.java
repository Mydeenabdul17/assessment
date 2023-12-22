package assessment_ZSGS_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PeopleAlive {
	Scanner sc = new Scanner(System.in);

	Map<Integer, List<String>> map = new HashMap<>();

	public static void main(String[] args) {
		PeopleAlive alive = new PeopleAlive();
		List<People> l = new ArrayList<>();
		alive.addPeople(l);
		System.out.println("Enter the year to find");
		int year = alive.sc.nextInt();
		List<String> res = alive.peoplesAlive(year);
		System.out.println(res);
	}

	public void addPeople(List<People> l) {
		System.out.println("Enter the number of people ");
		int n = sc.nextInt(), smallest = Integer.MAX_VALUE, largest = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			People p = new People();
			System.out.println("Enter the name");
			p.setName(sc.next());
			System.out.println("Enter the birth year");
			int birth = sc.nextInt();
			p.setBirthYear(birth);
			System.out.println("Enter the death year");
			int death = sc.nextInt();
			p.setDeathYear(death);
			l.add(p);
			smallest = Math.min(smallest, birth);
			largest = Math.max(largest, death);
		}
		for (int i = smallest; i <= largest; i++) {
			for (int j = 0; j < l.size(); j++) {
				if (l.get(j).getBirthYear() <= i && l.get(j).getDeathYear() >= i) {
					if (map.containsKey(i)) {
						map.get(i).add(l.get(j).getName());
					} else {

						map.put(i, new ArrayList<String>());
						map.get(i).add(l.get(j).getName());
					}
				}
			}
		}
	}

	public List<String> peoplesAlive(int year) {
		return map.get(year);
	}
}

class People {
	private String name;
	private int birthYear;
	private int deathYear;

	public People() {
		super();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public int getDeathYear() {
		return deathYear;
	}

	public void setDeathYear(int deathYear) {
		this.deathYear = deathYear;
	}

}
