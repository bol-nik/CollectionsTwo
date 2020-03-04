
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
		
//		1.	�������� ��������� ArrayDeque, �������� � ��� �������� � 
//		�������� �� �� ����� ���, ��� ����� ��� ����. 
//		�.�. ����������� ArrayDeque ��� ����. (ArrayDeque.java)
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
//		E pop(): ���������� � ��������� ������� �� ������ �������. ���� ������� �����, ���������� ���������� NoSuchElementException
//      void push(E element): ��������� ������� � ����� ������ �������
//		E peek(): ���������� ��� �������� ������� �� ������ �������. ���� ������� �����, ���������� �������� null
		// ---------------------------------------------------------

		System.out.println("---------------------------------------");
//	    2.	�������� ��������� ������ ArrayList(). �������� � ���� 10 ���������. �������� ������ �� �����. 
//		������� ������ ������ ������� ������ � ����� �������� ��� �� �����. 
//		�������� ������ �������. ������������ ������. (ArrayListDemo.java)

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
		System.out.println("����� ��������");
		for (int i = 1; i < arr2.size(); i += 2) {

			arr2.remove(i);
			i--;

		}
		for (int i = 0; i < arr2.size(); i++) {

			System.out.println(arr2.get(i));

		}
		// ---------------------------------------------------------
//		3.	�������� ArrayList ���� Integer. 
//		������������ ��� � ������, ����������� ����� ��� ��������� � 
//		�������� �� �� �����. (ArrayListToArray.java)
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
//        ���������� ��� ����� ��� �������������� ��������� � ������: ���� � �������������� �������������� ��������� ������� 
//        (��������, c.toArray(new String [c.size()])), ���� � �������������� ������� ������� (��������, c.toArray(new String [ 0]).
//        � ����� ������ ������� Java ���� ������������� ������������� ������� � �������������� �������� ��������, ��������� ����� ���������, 
//        ������� ��������� ��� �������� ������� ����������� �������, ��� �������� ���������. ������ ����� ������� ���������� OpenJDK 6 ���� ����� ��� �������, 
//        ��� ������� ������������������ ������ � ������ �������� ����� ��, � ������ ���� �����, �� ��������� � ������� ���������������� �������. 
//        ����� �������� ������� �������������� ��������� ������� ������ ��� ������������� ��� ������������������ ���������, ��������� �������� ����� ������ ����� ������� size � toArray, 
//        ��� ����� �������� � ��������� �������������� ����� � ����� �������, ���� ��������� ������������ ����������� �� ����� ��������.
//        ��� �������� ��������� ��������� ������� �����: ���� � �������������� ������� ������� (��� ������������� � ����������� Java), 
//        ���� � �������������� ������� �������������� ��������� ������� (������� ����� ���� ������� � ������ ������� Java ��� JVM �� �� ������ HotSpot).
		for (int i = 0; i < myMas.length; i++) {
			sum += myMas[i];
			System.out.println(myMas[i]);
		}

		System.out.println("����� ��������� ������� " + sum);
		sum = 0;
		// ������ ������

		System.out.println("\n������ ������");
		int[] myMas2 = new int[myNum.size()];
		for (int i = 0; i < myNum.size(); i++) {
			myMas2[i] = myNum.get(i);
			System.out.println(myMas[i]);
		}
		// ---------------------------------------------------------
//		4.	���� �����������: � Spring, spring we like it very much. We prefer Summer, summer we like, summer is the best season.�.
//		���������� ���������� ��������� ������� �����.
//		������������  (Map, HashMap). ������� ��������� �� ����� ���������� ���������. (CollectionHashmapMap-NumberOfWordsInProp)
		System.out.println("---------------------------------------");
		String str = "          Spring, spring we like it very much. We prefer Summer, summer we like, summer is the best season, we like ItStep.";
		str = str.trim();
		str = str.toLowerCase();
		System.out.println(str + "\n");

		String[] words = str.split("\\W+");
		Map<String, Integer> countWords = new TreeMap<String, Integer>();// � ����������� TreeMap ����� ��������� ����
																			// ��������������
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
//		5.	������ ��� ������ (Set) �����������,  ���������� � ������ �������.
//		�	���������� ����������� � ���� �����. ������, ��� ��������� ���������� ����� �������� � ���� �������.
//		�	��������� ������ ����������� �� ������������ � �� ��������� ��������.
//		�	��������� �� ������ ����������� �� ������������ �����������, �������������� �� �������.
//		�	������� ������ �����������, ������� �������� ������ � ������ ������. (CollectionOfEmployees)
		System.out.println("---------------------------------------\n");
		HashSet<String> DepartmentOne = new HashSet<String>();
		HashSet<String> DepartmentTwo = new HashSet<String>();
		DepartmentOne.add("������ ��������");
		DepartmentOne.add("�������� �������");
		DepartmentOne.add("�������� ���������");

		DepartmentTwo.add("������� �������");
		DepartmentTwo.add("������ ��������");

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
		Gifts.add("������� �������");

		Prize.removeAll(Gifts);
//        removeAll(Collection c) � ������� ��������, ������������� ���������� ��������� 
//        retainAll(Collection c) � ������� ��������, �� ������������� ���������� ���������

		System.out.println("\n���������� �� ������:");
		for (String a : Prize) {
			System.out.println(a);
		}
		// ---------------------------------------------------------

		System.out.println("---------------------------------------\n");
//		6.	�������� ����� ����������, ������ � �������� �������� �� ��������� � LinkedList, ArrayList, TreeSet, HashSet. 
//		�������� ����� � ������� ����� � ���, � ����� �������� ����� ��������� �������� �������.
//		������������ � ���������� �������� ���� Integer. ��� �������� �������� ������ add(array), remove(array), contains(array), 
//		��� � �����, ��������, ��� i = 0 �� 100 000 ����������� ��������, ��� i = 0 �� 10 000 ��������� ��� ����������� contains(i). 
		
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
		System.out.println("���������� � LinkedList = "+(System.currentTimeMillis() - stamp)/1000d);
		
		stamp = System.currentTimeMillis();
		add(Alist, masInt);
		System.out.println("���������� � ArrayList = "+(System.currentTimeMillis() - stamp)/1000d);
		
		stamp = System.currentTimeMillis();
		add(Tset, masInt);
		System.out.println("���������� � TreeSet = "+(System.currentTimeMillis() - stamp)/1000d);

		stamp = System.currentTimeMillis();
		add(Hset, masInt);
		System.out.println("���������� � HashSet = "+(System.currentTimeMillis() - stamp)/1000d);
        System.out.println();
		//---------
        
        stamp = System.currentTimeMillis();
		del(Llist, masInt);
		System.out.println("�������� � LinkedList = "+(System.currentTimeMillis() - stamp)/1000d);
		
		stamp = System.currentTimeMillis();
		del(Alist, masInt);
		System.out.println("�������� � ArrayList = "+(System.currentTimeMillis() - stamp)/1000d);
		
		stamp = System.currentTimeMillis();
		del(Tset, masInt);
		System.out.println("�������� � TreeSet = "+(System.currentTimeMillis() - stamp)/1000d);

		stamp = System.currentTimeMillis();
		del(Hset, masInt);
		System.out.println("�������� � HashSet = "+(System.currentTimeMillis() - stamp)/1000d);
		//------------------
		System.out.println();
		
		stamp = System.currentTimeMillis();
		find(Llist, masInt);
		System.out.println("����� � LinkedList = "+(System.currentTimeMillis() - stamp)/1000d);
		
		stamp = System.currentTimeMillis();
		find(Alist, masInt);
		System.out.println("����� � ArrayList = "+(System.currentTimeMillis() - stamp)/1000d);
		
		stamp = System.currentTimeMillis();
		find(Tset, masInt);
		System.out.println("����� � TreeSet = "+(System.currentTimeMillis() - stamp)/1000d);

		stamp = System.currentTimeMillis();
		find(Hset, masInt);
		System.out.println("����� � HashSet = "+(System.currentTimeMillis() - stamp)/1000d);
		
	}
}
