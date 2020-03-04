
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HomeWorkCollectionsTwo {
	public static <T> Collection<T> add(Collection<T> a, T[] b) {
		for(int i=0;i<b.length;i++) {
			
			a.add(b[i]);
		}
		return a;
	}
	public static <T> Collection<T> del(Collection<T> a, T[] b) {
		for(int i=0;i<b.length;i++) {
			if(a instanceof ArrayList ) {
				a.remove(i);
			}
			else {
			a.remove(b[i]);}
		}
		return a;
	}
	public static <T> Collection<T> find(Collection<T> a, T[] b) {
		for(int i=0;i<b.length;i++) {
			a.contains(b[i]);
		}
		return a;
	}
	
	public static void main(String[] args) {
		
//		1.	Создайте коллекцию ArrayDeque, добавьте в нее элементы и 
//		выведите их на экран так, как будто это стек. 
//		Т.е. используйте ArrayDeque как стек. (ArrayDeque.java)
		ArrayDeque<String> arr = new ArrayDeque<String>();
		arr.push("The Last of Us: Part 2");
		arr.push("God of War (2018)");
		arr.push("Days Gone");
		arr.push("Horizon: Zero Dawn");
		arr.push("Infamous: Second Son");
		arr.push("Death Stranding");
		arr.push("Uncharted 4: A Thief's End");
		while (arr.peek() != null) {
			System.out.println(arr.pop());
		}
//		E pop(): возвращает с удалением элемент из начала очереди. Если очередь пуста, генерирует исключение NoSuchElementException
//      void push(E element): добавляет элемент в самое начало очереди
//		E peek(): возвращает без удаления элемент из начала очереди. Если очередь пуста, возвращает значение null
		// ---------------------------------------------------------

		System.out.println("---------------------------------------");
//	    2.	Создайте структуру данных ArrayList(). Добавьте в него 10 элементов. Выведите массив на экран. 
//		Удалите каждый второй элемент списка и снова выведите его на экран. 
//		Выведите размер массива. Отсортируйте список. (ArrayListDemo.java)

		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("Injustice: Gods Among Us Ultimate Edition");
		arr2.add("Cyberpunk 2077");
		arr2.add("Killzone: Shadow Fall");
		arr2.add("Detroit: Become Human");
		arr2.add("Destiny 2");
		arr2.add("Doom");
		arr2.add("Dragon Age: Inquisition");
		arr2.add("Driveclub");
		arr2.add("God of War III");
		arr2.add("Grand Theft Auto V");

		arr2.sort(null);
		for (String a : arr2) {
			System.out.println(a);
		}

		System.out.println();
		System.out.println("После удаления");
		for (int i = 1; i < arr2.size(); i += 2) {

			arr2.remove(i);
			i--;

		}
		for (int i = 0; i < arr2.size(); i++) {

			System.out.println(arr2.get(i));

		}
		// ---------------------------------------------------------
//		3.	Создайте ArrayList типа Integer. 
//		Преобразуйте его в массив, подсчитайте сумму его элементов и 
//		выведите их на экран. (ArrayListToArray.java)
		System.out.println("---------------------------------------");
		ArrayList<Integer> myNum = new ArrayList<Integer>();
		myNum.add(10);
		myNum.add(11);
		myNum.add(100);
		myNum.add(5);
		myNum.add(7);
		myNum.add(1);
		myNum.add(88);
		Integer sum = 0;
		Integer[] myMas = myNum.parallelStream().toArray(Integer[]::new);
		// Integer[] myMas=myNum.toArray(new Integer[0]);
//        Существует два стиля для преобразования коллекции в массив: либо с использованием предварительно заданного размера 
//        (например, c.toArray(new String [c.size()])), либо с использованием пустого массива (например, c.toArray(new String [ 0]).
//        В более старых версиях Java было рекомендовано использование массива с предварительно заданным размером, поскольку вызов отражения, 
//        который необходим для создания массива правильного размера, был довольно медленным. Однако после поздних обновлений OpenJDK 6 этот вызов был встроен, 
//        что сделало производительность версии с пустым массивом такой же, а иногда даже лучше, по сравнению с версией предварительного размера. 
//        Также передача массива предварительно заданного размера опасна для одновременной или синхронизированной коллекции, поскольку возможна гонка данных между вызовом size и toArray, 
//        что может привести к появлению дополнительных нулей в конце массива, если коллекция одновременно сокращалась во время операции.
//        Эта проверка позволяет следовать единому стилю: либо с использованием пустого массива (что рекомендуется в современной Java), 
//        либо с использованием массива предварительно заданного размера (который может быть быстрее в старых версиях Java или JVM не на основе HotSpot).
		for (int i = 0; i < myMas.length; i++) {
			sum += myMas[i];
			System.out.println(myMas[i]);
		}

		System.out.println("Сумма элементов массива " + sum);
		sum = 0;
		// Второй способ

		System.out.println("\nВторой способ");
		int[] myMas2 = new int[myNum.size()];
		for (int i = 0; i < myNum.size(); i++) {
			myMas2[i] = myNum.get(i);
			System.out.println(myMas[i]);
		}
		// ---------------------------------------------------------
//		4.	Дано предложение: “ Spring, spring we like it very much. We prefer Summer, summer we like, summer is the best season.”.
//		Подсчитать количество вхождений каждого слова.
//		Использовать  (Map, HashMap). Вывести результат на экран различными способами. (CollectionHashmapMap-NumberOfWordsInProp)
		System.out.println("---------------------------------------");
		String str = "          Spring, spring we like it very much. We prefer Summer, summer we like, summer is the best season, we like ItStep.";
		str = str.trim();
		str = str.toLowerCase();
		System.out.println(str + "\n");

		String[] words = str.split("\\W+");
		Map<String, Integer> countWords = new TreeMap<String, Integer>();// Я использовал TreeMap чтобы Коллекция была
																			// отсортированна
		for (int i = 0; i < words.length; i++) {
			if (countWords.containsKey(words[i])) {
				Integer count = countWords.get(words[i]);
				count++;
				countWords.replace(words[i], count);
			} else {
				countWords.put(words[i], 1);
			}
		}

		for (Map.Entry<String, Integer> item : countWords.entrySet()) {
			System.out.println(item.getKey() + " - " + item.getValue());
		}

		// ---------------------------------------------------------
//		5.	Заданы два списка (Set) сотрудников,  работающих в разных отделах.
//		•	Объединить сотрудников в один отдел. Учесть, что некоторые сотрудники могут работать в двух отделах.
//		•	Составить список сотрудников на премирование и на получение подарков.
//		•	Исключить из списка сотрудников на премирование сотрудников, представленных на подарки.
//		•	Вывести список сотрудников, которые работают только в первом отделе. (CollectionOfEmployees)
		System.out.println("---------------------------------------\n");
		HashSet<String> DepartmentOne = new HashSet<String>();
		HashSet<String> DepartmentTwo = new HashSet<String>();
		DepartmentOne.add("Иванов Владимир");
		DepartmentOne.add("Симбирев Евгений");
		DepartmentOne.add("Протащик Александр");

		DepartmentTwo.add("Болокан Николай");
		DepartmentTwo.add("Иванов Владимир");

//        HashSet<String>CommonDepartment= new HashSet<String>() {{
//        	addAll(DepartmentOne);
//        	addAll(DepartmentTwo);
//        }};
		HashSet<String> CommonDepartment = new HashSet<String>();
		CommonDepartment.addAll(DepartmentOne);
		CommonDepartment.addAll(DepartmentTwo);

		for (String a : CommonDepartment) {
			System.out.println(a);
		}

		Set<String> Prize = new HashSet<String>();
		Prize.addAll(CommonDepartment);

		Set<String> Gifts = new HashSet<String>();
		Gifts.add("Болокан Николай");

		Prize.removeAll(Gifts);
//        removeAll(Collection c) — удаляет элементы, принадлежащие переданной коллекции 
//        retainAll(Collection c) — удаляет элементы, не принадлежащие переданной коллекции

		System.out.println("\nСотрудники на премию:");
		for (String a : Prize) {
			System.out.println(a);
		}
		// ---------------------------------------------------------

		System.out.println("---------------------------------------\n");
//		6.	Замерить время добавления, поиска и удаления объектов из коллекции в LinkedList, ArrayList, TreeSet, HashSet. 
//		Сравнить время и сделать вывод о том, в каких условиях какая коллекция работает быстрее.
//		Использовать в коллекциях элементы типа Integer. Для проверки написать методы add(array), remove(array), contains(array), 
//		где в цикле, например, для i = 0 до 100 000 добавляются элементы, для i = 0 до 10 000 удаляются или проверяются contains(i). 
		
		LinkedList<Integer> Llist=new LinkedList<Integer>();
		ArrayList<Integer> Alist= new ArrayList<Integer>();
		Set<Integer> Tset=new TreeSet<Integer>();
		Set<Integer> Hset = new HashSet<Integer>();
		
		Integer[] masInt=new Integer[100_000];
		for(int i=0;i<masInt.length;i++) {
			masInt[i]=new Random().nextInt();
		}
		
		long stamp = System.currentTimeMillis();
		add(Llist, masInt);
		System.out.println("Добавление в LinkedList = "+(System.currentTimeMillis() - stamp)/1000d);
		
		stamp = System.currentTimeMillis();
		add(Alist, masInt);
		System.out.println("Добавление в ArrayList = "+(System.currentTimeMillis() - stamp)/1000d);
		
		stamp = System.currentTimeMillis();
		add(Tset, masInt);
		System.out.println("Добавление в TreeSet = "+(System.currentTimeMillis() - stamp)/1000d);

		stamp = System.currentTimeMillis();
		add(Hset, masInt);
		System.out.println("Добавление в HashSet = "+(System.currentTimeMillis() - stamp)/1000d);
        System.out.println();
		//---------
        
        stamp = System.currentTimeMillis();
		del(Llist, masInt);
		System.out.println("Удаление в LinkedList = "+(System.currentTimeMillis() - stamp)/1000d);
		
		stamp = System.currentTimeMillis();
		del(Alist, masInt);
		System.out.println("Удаление в ArrayList = "+(System.currentTimeMillis() - stamp)/1000d);
		
		stamp = System.currentTimeMillis();
		del(Tset, masInt);
		System.out.println("Удаление в TreeSet = "+(System.currentTimeMillis() - stamp)/1000d);

		stamp = System.currentTimeMillis();
		del(Hset, masInt);
		System.out.println("Удаление в HashSet = "+(System.currentTimeMillis() - stamp)/1000d);
		//------------------
		System.out.println();
		
		stamp = System.currentTimeMillis();
		find(Llist, masInt);
		System.out.println("Поиск в LinkedList = "+(System.currentTimeMillis() - stamp)/1000d);
		
		stamp = System.currentTimeMillis();
		find(Alist, masInt);
		System.out.println("Поиск в ArrayList = "+(System.currentTimeMillis() - stamp)/1000d);
		
		stamp = System.currentTimeMillis();
		find(Tset, masInt);
		System.out.println("Поиск в TreeSet = "+(System.currentTimeMillis() - stamp)/1000d);

		stamp = System.currentTimeMillis();
		find(Hset, masInt);
		System.out.println("Поиск в HashSet = "+(System.currentTimeMillis() - stamp)/1000d);
		
	}
}
