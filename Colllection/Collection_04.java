package Colllection;

import java.util.ArrayList;
import java.util.List;

public class Collection_04 {
	public static void main(String args[]) {

		List<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(15);
		list.add(11);
		list.add(12);
		list.add(10);
		list.add(13);
		list.add(13);

		System.out.println(List_Remover.remove(list));

	}
}

class List_Remover
{
	public static List<Integer> remove(List<Integer> list2){
		List<Integer> list = list2;

		List<Integer> list3 = new ArrayList<>();
		for(int i=0; i<list.size();i++)
		{
			for(int j=i+1; j< list.size();j++)
			{
				if(list.get(i) == list.get(j))
				{
					list3.add(list.get(i));
					break;
				}
			}
		}
		System.out.println("Before :"+list);

		for(int i : list3) {
			list.remove(Integer.valueOf(i));
		}
		return list;
	}
}