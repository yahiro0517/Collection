package practice;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;


public class Chapter5 {

	public static void main(String[] args) {
		Map<LocalDate, String> tasks = new TreeMap<>();
		tasks.put(LocalDate.parse("2021-10-21"), "牛乳を買う。");
		tasks.put(LocalDate.parse("2021-09-15"), "〇〇社面談。");
		tasks.put(LocalDate.parse("2021-12-04"), "手帳を買う。");
		tasks.put(LocalDate.parse("2021-08-10"), "散髪に行く。");
		tasks.put(LocalDate.parse("2021-11-09"), "スクールの課題を解く。");
		
		for (LocalDate t : tasks.keySet()) {
			System.out.println(tasks.get(t));
		}
		
	}

}
