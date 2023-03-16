package Jan20;
//	Garbage Collection : It is used for collecting unused Memory Space.
//	className1 obj0 = new className1();
//	className2 obj1 = new className2();
/*
 * 	When we use the same reference to allocate the same object.
 * 	The previous reference is overrided.
 * 	So When we refered to the className1 then that is reffered to as the Garbage Collection.
 *  
 *  So in such case we have to mark that object as unused so that it is not used.
 *  In java there is a code GarbageCollector, in JAVA in a regular interval of time is invoked automatically at a particular interval.
 *  It will search the entire memory space and when it find anything un-used then it will mark it as Garbage.
 *  
 *  It is generally required at large space.
 *  
 *  When we create a object then it is created in a Heap Area.
 *  
 *  
 *  There are three Types of memory : 
 *  	System	: Memory is allocated for the  memory.
 *  	Stack	: When the memory is allocated then it is stored in Stack Memory.
 *  	Heap 	: Dynamically created objects is stored in Heap.
 *  
 *  
 *  Heap Area of three Types.
 *  	Young Generation : When the object is currently created goes to Young SPace.
 *		Old :  Once One garbage collection is invoked and after the first cycle of the garbage collection then the memory space becomes old.
 *		Permanent : And after multiple cycles it goes to the Permanent Area.
 *					When the program is active then there is no grabage collection from Permanent.
 *
 *==================== Types of Garbage Collection ========================================
 *Garbage First (G1 - Garbage collection ) 
 *	-> Its is introduced in JAVA7
 *	-> Properties : 
 *					1. Uncommiting(unsaving) Unused Heap.
 *					2. Free of memory space without using a long pause time.
 *					3. Work concurrently such as without interrupting or stopping application threads.
 *					4. Dealing with very large heap.
 *					5. It can collection both young and old generation space at once.
 *
 *Concurrent Mark sweep : (CMS) Garbage Collection
 *					1. It uses multiple thread which are used to scan through the heap and mark the unused object.
 *					2. It distributes the used memory are pushed to one side and those momory which is not free then it is arranged to other side. 
 *						(Memory Reallocation) this is used now a days.
 * 
 * 
 * < Making Objects eligible for Garbage collection >
 * 1. Unreachable Object :  
 * 						
 * to innvoke Garbage collection manually then : System Invoking Garbage collection : System.gc();
 *					1. 
 *
 *  Garbage Compaction : Compaction means rearranging the memory space.
 *  All the unused memory goes to one side and all the used memoruy goes to one side of the memory space.
 */
//public class intro_GarbageCollection {
//	public static void main(String[] args) {
//		int x = 10;
//		System.out.println();
//		x = 23;
//		
//		System.gc();
//	}
//
//}
