package pointerbasedindex;

public class PointerBasedIndex {

	    public static void main(String[] args) {
	        Kuyruk kuyruk = new Kuyruk();
	        Dugum dugum1 = new Dugum(1);
	        Dugum dugum2 = new Dugum(2);
	        Dugum dugum3 = new Dugum(3);
	        kuyruk.add(dugum1);
	        kuyruk.add(dugum2);
	        kuyruk.add(dugum3);
	        kuyruk.showAllMembers();
	        System.out.println(kuyruk.head.value);
	        kuyruk.remove();
	        System.out.println(kuyruk.head.value);
	        kuyruk.showAllMembers();     
	        System.out.println(kuyruk.get(2));
	        System.out.println(kuyruk.getDeger(1));
	    }
	    
	}