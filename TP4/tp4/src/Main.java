import java.util.*; 


public class Main 
{
   /**
     * Fonction principale
     */
   public static void main(String[] args) 
   {
      // Creer un monceau avec 22 éléments et un tableau équivalent
      int numItems = 22;
      BinaryHeap<Integer> heap = new BinaryHeap<Integer>(true);
      PriorityQueue<Integer> goodHeap = new PriorityQueue<>();
      
      Integer [ ] items = new Integer[ numItems ];
      Integer [ ] goodItems = new Integer[ numItems ];
      int i;
      int j;


      // En insérant les éléments un a un
      for( i = 11, j = 0; j != numItems; i = ( i + 37 ), j++ )
      {
	  heap.offer( i );
	  goodHeap.offer(i);
	  items[ j ] = i;
	  goodItems[j] = i;

	  i %=  numItems; 
      }
      heap = new BinaryHeap<Integer>(items,true);

      for (int y = 0; y < items.length; y++){
         System.out.print(items[y] + " ");
      }
      System.out.println();
      for (int y = 0; y < goodItems.length; y++){
         System.out.print(goodItems[y] + " ");
      }
      System.out.println();

      heap.poll();
      goodHeap.poll();

      for (int y = 0; y < heap.toArray().length; y++){
        System.out.print(heap.toArray()[y] + " ");
      }
      System.out.println();
      for (int y = 0; y < goodHeap.toArray().length; y++){
         System.out.print(goodHeap.toArray()[y]+ " ");
      }



      // en construisant le monceau depuis le depart
      /*System.out.println("Monceau min contruit element par element:");
      System.out.println( heap.printFancyTree() );

      heap = new BinaryHeap<Integer>(false);
      // en inserant les elements un a un
      for( Integer item : items)
	     heap.offer( item );
      for( Integer goodItem : goodItems)
         goodHeap.offer(goodItem);

      // en construisant le monceau depuis le depart
      System.out.println("Monceau max contruit element par element:");
      System.out.println( heap.printFancyTree() );

      heap = new BinaryHeap<Integer>(items,false);
      System.out.println("Monceau max contruit a partir d'un tableau:");
      System.out.println( heap.printFancyTree() );

      heap = new BinaryHeap<Integer>(items,true);
      System.out.println("Monceau min contruit a partir d'un tableau:");
      System.out.println( heap.printFancyTree() );

      System.out.println();
      System.out.println("Affichage recursif:");
      System.out.println( heap.printFancyTree() );

      System.out.println("Affichage non recursif:");
      System.out.println( heap.nonRecursivePrintFancyTree() );

      System.out.println();
      System.out.println("Tableau d'origine:");
      System.out.println( printArray( items ) );
      System.out.println("Bon Tableau d'origine:");
      System.out.println( printArray( goodItems ) );

      BinaryHeap.heapSort( items );

      System.out.println("Tableau ordonne:");
      System.out.println( printArray( items ) );

      BinaryHeap.heapSortReverse( items );
      System.out.println("Tableau inversement ordonne:");
      System.out.println( printArray( items ) );


*/







   }

   private static <AnyType> String printArray(AnyType[] a)
   {
      String outputString = "";

      for(AnyType item : a)
      {
         outputString += item;
         outputString += ", ";
      }

      return outputString.substring(0,outputString.length()-2);
   }
}
