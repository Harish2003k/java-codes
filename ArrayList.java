import java.util.*;
class Arraylist_Demo{
    public static void main(String args[]){
        ArrayList<String> arraylist=new ArrayList<String>();
        arraylist.add("C");
        arraylist.add("C++");
        arraylist.add("Java");
        arraylist.add("JavaScript");
        arraylist.add("C#");
        System.out.println("\n ArrayList:\n");
        System.out.println(arraylist);
        arraylist.add(2,"j#"); // 2 show position of array index 
        System.out.println("\n Arraylist after adding new item at postion[ 2]:\n");
        System.out.println(arraylist);
        arraylist.remove("j#");
        System.out.println("\n After removing j#:"+arraylist);
    }
}