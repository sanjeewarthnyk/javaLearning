package org.leetcode;

import java.util.*;

public class Runner2 {

    public static void main(String[] args){
        /*int[] arrInt = new int[5];
        arrInt = new int[]{1, 3, 10, 90, 123};
       // ArrayList listArr = (ArrayList) Arrays.asList(arrInt);
       // Object[] ar = listArr.toArray();

        List al3 = new ArrayList();
        al3 = Arrays.asList(100, "Pythoin", 12.5, 'W', false);

        //for loop
        for(int i=0;i<al3.size();i++){
            System.out.println(al3.get(i));
        }
        System.out.println("----------------------------------------");

        //for .. each
        for(Object e:al3){
            System.out.println(e);
        }
        System.out.println("----------------------------------------");

        Iterator itr = al3.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        String[] arr = {"One", "Two", "Three", "Four"};
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(arr));
        System.out.println(arr);
        System.out.println(arrayList);

        LinkedList ll = new LinkedList();
        LinkedList ll2 = new LinkedList();

        ll.add("123");
        ll.add(true);
        ll.add(1.5);
        ll.add('A');
        ll.add(null);

        ll2.add("ll2");
        ll2.add("ll3");
        ll2.add("ll4");

        ll2.addAll(ll);
        System.out.println(ll2);

        ll2.addFirst("first");
        ll2.addLast("last");
        System.out.println(ll2);
        ll2.removeFirst();
        ll2.removeLast();
        System.out.println(ll2);

        int[] x = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        ArrayList al = new ArrayList(Arrays.asList(x));
        LinkedList ll3 = new LinkedList(Arrays.asList(x));

        System.out.println(ll3);

        HashSet hs1 = new HashSet();
        HashSet<Integer> hs2= new HashSet<Integer>();
        HashSet hs3 = new HashSet(100, 0.8F);

        hs3.add(1);
        hs3.add(2);
        hs3.add(3);
        hs3.add(4);
        hs3.add(5);

        hs2.add(1);
        hs2.add(2);
        hs2.add(3);

        //union
        System.out.println("Union :"+hs3.addAll(hs2));
        //intersection
        System.out.println("Intersection :"+ hs3.retainAll(hs2));

        for(Object i: hs3){
            System.out.println(i);
        }

        Iterator it = hs3.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        LinkedHashSet lhs = new LinkedHashSet();
        HashSet hs4 = new HashSet();
        lhs.add(1);
        lhs.add(2);
        lhs.add(3);
        lhs.add(4);
        lhs.add(5);
        hs4.add(1);
        hs4.add(2);
        hs4.add(3);
        hs4.add(4);
        hs4.add(5);
        System.out.println("LHS :"+lhs);
        System.out.println("HS :"+hs4);

        PriorityQueue q = new PriorityQueue();

        //add, offer
        q.add(1);
        q.offer(2);

        System.out.println(q);

        //get first element element, peek
        System.out.println(q.element());
        System.out.println(q.peek());

        //return and remove, remove & poll
        System.out.println(q.remove());
        System.out.println(q.poll());

        for(Object i:q){
            System.out.println(i);
        }

        Iterator iter = q.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }


        q.add('W');
       // q.add("add");

        LinkedList lll = new LinkedList();
        lll.add('E');
        lll.add("add");*/

        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "Bob");
        map.put(2, "Will");
        map.put(3, "Steve");
        map.put(4, "Carl");
        map.put(5, "Burl");
        map.put(5, "Carl");

        System.out.println(map);
        map.remove(5);
        System.out.println(map);

        /*for (int i=0;i<map.size();i++){
            System.out.println(map.get(i));
        }*/
        /*for (int i : map.keySet()){
            System.out.println(map.get(i));
        }*/
        /*for (String i : map.values()){
            System.out.println(i);
        }*/
        /*for (String i : map.values()){
            System.out.println(i);
        }*/

        Set set=map.entrySet();

        Iterator itr = set.iterator();

        while(itr.hasNext()){
           Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }


    }
}
