package language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsFramework {
	

	public static void main(String[] args) {
		
		// Level 1 - Individual variables
		
		String empName = "Akhil";
		int empId = 1;
		
		// Level 2 - Arrays
		
		String [] empNames = new String [3];
		System.out.println("Length of Array: "+ empNames.length);
		int [] empIds = new int[3];
		
		empNames[0] ="Akhil";
		empNames[1] ="Anitha";
		empNames[2] ="Deeksha";
		
		empIds[0]=1;
		empIds[1]=2;
		empIds[2]=3;
		
		// Collections
		// List --> ArrayList and LinkedList
		// Set --> HashSet, LinkedHashSet and TreeSet
		// Map --> HashMap, LinkedHashMap, TreeMap and Hashtable
		
		
		//ArrayList 
		//--> We Can store multiple values with same datatype
		//--> dynamic memory allocation
		//--> can store duplicate values
		//--> can store null values
		//--> can store the values in Insertion order
		
		System.out.println("================ArrayList======================");	
		List<String> empNamesArrayList = new ArrayList<String>();
		System.out.println("Size of ArrayList: "+ empNamesArrayList.size());
		
		empNamesArrayList.add("Akhil");
		empNamesArrayList.add("Anitha");
		empNamesArrayList.add("Deeksha");
		empNamesArrayList.add("Anil");
		empNamesArrayList.add("Akhil");
		empNamesArrayList.add(null);
		
		System.out.println(empNamesArrayList);

		List<Integer> empIdsArrayList = new ArrayList<Integer>();
		empIdsArrayList.add(1);
		empIdsArrayList.add(2);
		empIdsArrayList.add(3);
		empIdsArrayList.add(4);
		empIdsArrayList.add(1);
		empIdsArrayList.add(null);
		System.out.println(empIdsArrayList);
		

		System.out.println("================LinkedList======================");
		// LinkedList
		// --> We Can store multiple values with same datatype
		// --> dynamic memory allocation
		// --> can store duplicate values
		// --> can store null values
		// --> can store the values in Insertion order
		
		List<String> empNamesLinkedList = new LinkedList<String>();
		System.out.println("Size of LinkedList: " + empNamesLinkedList.size());

		empNamesLinkedList.add("Akhil");
		empNamesLinkedList.add("Anitha");
		empNamesLinkedList.add("Deeksha");
		empNamesLinkedList.add("Anil");
		empNamesLinkedList.add("Akhil");
		empNamesLinkedList.add(null);

		System.out.println(empNamesLinkedList);

		List<Integer> empIdsLinkedList = new LinkedList<Integer>();
		empIdsLinkedList.add(1);
		empIdsLinkedList.add(2);
		empIdsLinkedList.add(3);
		empIdsLinkedList.add(4);
		empIdsLinkedList.add(1);
		empIdsLinkedList.add(null);
		System.out.println(empIdsLinkedList);
		
		System.out.println("================HashSet======================");
		// HashSet
		// --> We Can store multiple values with same datatype
		// --> dynamic memory allocation
		// --> cannot store duplicate values
		// --> can store null values 
		// --> can store the values in random order in case of strings , ascending order in case of numbers
		
		Set<String> empNamesHashSet = new HashSet<String>();
		System.out.println("Size of HashSet: " + empNamesHashSet.size());

		empNamesHashSet.add("Akhil");
		empNamesHashSet.add("Anitha");
		empNamesHashSet.add("Deeksha");
		empNamesHashSet.add("Anil");
		empNamesHashSet.add("Akhil");
		empNamesHashSet.add(null);

		System.out.println(empNamesHashSet);

		Set<Integer> empIdsHashSet = new HashSet<Integer>();
		empIdsHashSet.add(1);
		empIdsHashSet.add(2);
		empIdsHashSet.add(3);
		empIdsHashSet.add(4);
		empIdsHashSet.add(1);
		empIdsHashSet.add(null);
		System.out.println(empIdsHashSet);
		
		System.out.println("================LinkedHashSet======================");
		// LinkedHashSet
		// --> We Can store multiple values with same datatype
		// --> dynamic memory allocation
		// --> cannot store duplicate values
		// --> can store null values 
		// --> can store the values in insertion order 
		
		Set<String> empNamesLinkedHashSet = new LinkedHashSet<String>();
		System.out.println("Size of LinkedHashSet: " + empNamesLinkedHashSet.size());

		empNamesLinkedHashSet.add("Akhil");
		empNamesLinkedHashSet.add("Anitha");
		empNamesLinkedHashSet.add("Deeksha");
		empNamesLinkedHashSet.add("Anil");
		empNamesLinkedHashSet.add("Akhil");
		empNamesLinkedHashSet.add(null);

		System.out.println(empNamesLinkedHashSet);

		Set<Integer> empIdsLinkedHashSet = new LinkedHashSet<Integer>();
		empIdsLinkedHashSet.add(1);
		empIdsLinkedHashSet.add(2);
		empIdsLinkedHashSet.add(3);
		empIdsLinkedHashSet.add(4);
		empIdsLinkedHashSet.add(1);
		empIdsLinkedHashSet.add(null);
		System.out.println(empIdsLinkedHashSet);
		
		System.out.println("================TreeSet======================");
		// TreeSet
		// --> We Can store multiple values with same datatype
		// --> dynamic memory allocation
		// --> cannot store duplicate values
		// --> cannot store null values 
		// --> can store the values in ascending/alphabetical order 
		
		Set<String> empNamesTreeSet = new TreeSet<String>();
		System.out.println("Size of TreeSet: " + empNamesTreeSet.size());

		empNamesTreeSet.add("Akhil");
		empNamesTreeSet.add("Anitha");
		empNamesTreeSet.add("Deeksha");
		empNamesTreeSet.add("Anil");
		empNamesTreeSet.add("Akhil");
//		empNamesTreeSet.add(null);

		System.out.println(empNamesTreeSet);

		Set<Integer> empIdsTreeSet = new TreeSet<Integer>();
		empIdsTreeSet.add(1);
		empIdsTreeSet.add(2);
		empIdsTreeSet.add(3);
		empIdsTreeSet.add(4);
		empIdsTreeSet.add(1);
//		empIdsTreeSet.add(null);
		System.out.println(empIdsTreeSet);
		
		System.out.println("================HashMap======================");
		// HashMap
		// --> We Can store multiple values with two different datatypes together
		// --> dynamic memory allocation
		// --> can store duplicate values but not duplicate keys
		// --> can store null values and can store null keys
		// --> can store the values in Random order of Keys
		
		Map<String,Integer> empDetailsHashMap = new HashMap<String,Integer>();
		System.out.println("Size of HashMap: " + empDetailsHashMap.size());
		empDetailsHashMap.put("Akhil", 1);
		empDetailsHashMap.put("Anitha", 2);
		empDetailsHashMap.put("Deeksha", 3);
		empDetailsHashMap.put("Anil", 3);
		empDetailsHashMap.put("Akhil", 5);
		empDetailsHashMap.put("ABC", null);
		empDetailsHashMap.put(null, 7);
		
		System.out.println(empDetailsHashMap);
		
		System.out.println("================LinkedHashMap======================");
		// LinkedHashMap
		// --> We Can store multiple values with two different datatypes together
		// --> dynamic memory allocation
		// --> can store duplicate values but not duplicate keys
		// --> can store null values and can store null keys
		// --> can store the values in Insertion order of Keys
		
		Map<String,Integer> empDetailsLinkedHashMap = new LinkedHashMap<String,Integer>();
		System.out.println("Size of LinkedHashMap: " + empDetailsLinkedHashMap.size());
		empDetailsLinkedHashMap.put("Akhil", 1);
		empDetailsLinkedHashMap.put("Anitha", 2);
		empDetailsLinkedHashMap.put("Deeksha", 3);
		empDetailsLinkedHashMap.put("Anil", 3);
		empDetailsLinkedHashMap.put("Akhil", 5);
		empDetailsLinkedHashMap.put("ABC", null);
		empDetailsLinkedHashMap.put(null, 7);
		
		System.out.println("================TreeMap======================");
		// TreeMap
		// --> We Can store multiple values with two different datatypes together
		// --> dynamic memory allocation
		// --> can store duplicate values but not duplicate keys
		// --> can store null values but cannot store null keys
		// --> can store the values in Ascending/Alphabetical order of Keys
		
		Map<String,Integer> empDetailsTreeMap = new TreeMap<String,Integer>();
		System.out.println("Size of TreeMap: " + empDetailsTreeMap.size());
		empDetailsTreeMap.put("Akhil", 1);
		empDetailsTreeMap.put("Anitha", 2);
		empDetailsTreeMap.put("Deeksha", 3);
		empDetailsTreeMap.put("Anil", 3);
		empDetailsTreeMap.put("Akhil", 5);
		empDetailsTreeMap.put("ABC", null);
//		empDetailsTreeMap.put(null, 7);
		
		System.out.println(empDetailsTreeMap);
		
		System.out.println("================Hashtable======================");
		// Hashtable
		// --> We Can store multiple values with two different datatypes together
		// --> dynamic memory allocation
		// --> can store duplicate values but not duplicate keys
		// --> can store null values but cannot store null keys
		// --> can store the values in Ascending/Alphabetical order of Keys
		
		Map<String,Integer> empDetailsHashtable = new Hashtable<String,Integer>();
		System.out.println("Size of Hashtable: " + empDetailsHashtable.size());
		empDetailsHashtable.put("Akhil", 1);
		empDetailsHashtable.put("Anitha", 2);
		empDetailsHashtable.put("Deeksha", 3);
		empDetailsHashtable.put("Anil", 3);
		empDetailsHashtable.put("Akhil", 5);
//		empDetailsHashtable.put("ABC", null);
//		empDetailsHashtable.put(null, 7);
		
		System.out.println(empDetailsHashtable);
		
	}

}
