package bigdata;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
//import java.util.Iterator;

class iterator {

   public static void main(String[] args){
       List<Float> random = new ArrayList<Float>();
       random.add(2f);
       random.add(4f);
       random.add(5f);
       random.add(10f);
       random.add(99.9f);
       random.add(101f);
       iteratebwd(random);
       iteratealtn(random);
   }


   public static void iteratebwd(List<Float> arr) {
	  ListIterator<Float> listiterator = arr.listIterator(arr.size());
	 
	 /* while(listiterator.hasNext()){
		  listiterator.next();
	       
	    }*/
	  while(listiterator.hasPrevious()){
		 
	       System.out.println(listiterator.previous());
	    }
       }
   
   public static void iteratealtn(List<Float> arr) {
		  ListIterator<Float> it = arr.listIterator();
		  while(it.hasNext()) {
	           it.next();
	           if(it.hasNext()) {
	               System.out.println(it.next());
	           }
	       }
		   /*while(listiterator.hasNext())
		   {
			  
			   float data=listiterator.next();
			   int pos=listiterator.nextIndex();
			  
			   if((pos%2)==0)
			   {
				   System.out.println(data);
			   }
			   
				   
		    }*/
		   }
	       
	   
} 