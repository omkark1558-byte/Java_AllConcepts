package hasMap_Logical;


import java.util.*;



public class Collection_oma {

	/**
	 * @deprecated Use {@link #main(String[],Object)} instead
	 */
	public static void main(String[] args) {
		main(args, null);
	}

	public static void main(String[] args, Object newParam) {
		
	/*	
		Custom_class one = new Custom_class(1,"season",2343.4);
		Custom_class two = new Custom_class(2,"summer",768.4);
		Custom_class three = new Custom_class(4,"winter",2343.4);
		Custom_class four = new Custom_class(2,"season",356.7);
		Custom_class five = new Custom_class(1,"rainy",4567.3);
		
		ArrayList<Custom_class> list = new ArrayList<>();
		list.add(five);
		list.add(four);
		list.add(three);
		list.add(two);
		list.add(one);
		System.out.println(list);
        
		LinkedList<Integer> li = new LinkedList<>();
		li.add(32);
		li.add(90);
		li.add(null);
		li.add(32);
		li.add(null);
		li.add(90);
		li.add(32);
		li.addFirst(1);
		li.addLast(99);
		System.out.println(li);
		System.out.println(li.get(3));
		System.out.println(li.getFirst());
		li.add(4, 78);
        System.out.println(li);
        
        LinkedList<Custom_class> li2 = new LinkedList<>();
        
        li2.add(five);
        li2.add(four);
        li2.add(three);
        li2.add(two);
        li2.add(one);
        
        System.out.println(li2);
        
        Vector<Integer> vec = new Vector<>();
        vec.addAll(li);
        vec.add(45);
        System.out.println(vec.size());
        System.out.println(vec.capacity());
        
         Stack<Integer> sta = new Stack<>();
         sta.addAll(li);
         System.out.println(li);
         System.out.println(li.pop());
         System.out.println(sta);
         System.out.println(sta.get(4));
     */
		
		
		Custom_class one = new Custom_class(1,"aeason",43.4);
		Custom_class two = new Custom_class(2,"summer",768.4);
		Custom_class three = new Custom_class(3,"winter",43.4);
		Custom_class four = new Custom_class(4,"season",356.7);
		Custom_class five = new Custom_class(5,"siason",43.4);
	
	/*	Set<Integer> set= new HashSet<Integer>();
		set.add(43);
		set.add(2);
		set.add(7);
		set.add(24);
		set.add(87);
		set.add(null);
		set.add(43);

		System.out.println(set);
		System.out.println(set.size());
	*/	
		
		Set<Custom_class> hashset = new HashSet<>();
		hashset.add(three);
		hashset.add(one);
		hashset.add(two);
		hashset.add(four);
		hashset.add(five);
		
		for(Custom_class a : hashset) {
			System.out.println(a);
		}
		
//		System.out.println(one.hashCode());
//		System.out.println(five.hashCode());
//		System.out.println(one.equals(five));
		
		System.out.println("***********************************");
		Set<Custom_class> link = new LinkedHashSet<>();
		link.add(one);
		link.add(five);
		link.add(four);
		link.add(three);
		link.add(two);
		
		
		for(Custom_class a : link) {
			System.out.println(a);
		}
		
		System.out.println("*************************************");
	/*	
		Set<Integer> tree = new TreeSet<>();

		tree.add(32);
		tree.add(46);
		tree.add(54);
		tree.add(12);
		tree.add(2);
		tree.add(32);
		for(Integer a : tree) {
			System.out.println(a);
		}
		System.out.println(tree);
	  */
		
		Set<Custom_class> tre = new TreeSet<>();
		tre.add(one);
		tre.add(two);
		tre.add(three);
		tre.add(four);
		tre.add(five);
//		tre.add(null);
		
		for(Custom_class a : tre) {
			System.out.println(a);
		}
		
	}

}

class Custom_class implements Comparable<Custom_class>{
	int id;
	String name;
	double salary;
	
	Custom_class(int i,String n,double d){
		this.id = i;
		this.name = n;
		this.salary = d;
	}
	
	public String toString() {
		return this.id + ":" + this.name + ":" + this.salary;
	}
	
	public int hashCode() {
		
		return id;
	}
	
	public boolean equals(Object o) {
		System.out.println("cheking .equals bcause hashcode is same");
		Custom_class cu = (Custom_class) o;
		return this.name.equals(cu.name) && this.id== cu.id && this.salary == cu.salary;
	}

	@Override
	public int compareTo(Custom_class o) {
		
		return Integer.compare(o.id,this.id);
	}
	
	
}

class Naming implements Comparator<Custom_class> {

	@Override
	public int compare(Custom_class o1, Custom_class o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
}





