package pointerbasedindex;

public class Kuyruk {
    Dugum head,tail;
    
    boolean kontrol = false;
    public void add(Dugum dugum)
    {
        if (!kontrol) {
            kontrol = true;
            head = dugum;
            tail = dugum;
        }else{
            Dugum temp = getTail();
            temp.sonraki = dugum;
            dugum.onceki = temp;
            tail = dugum;
        }
    }
    
    public void remove()
    {
        head = head.sonraki;
        head.onceki = null;
    } 
    
    private Dugum getTail() {
        return tail;
    }
    
    public void showAllMembers()
    {
        Dugum d = head;
        System.out.print("{");
        while (d != null) {            
            System.out.print(" "+d.value+" ");
            d = d.sonraki;
        }
        System.out.print("}\n");
    }
    
    public Dugum get(int i)
    {

        Dugum result = this.head;
        for (int j = 0; j < i; j++) {
            result = result.sonraki;
        }
        if (result == null) {
            System.out.print("Index not found ");
        }
        return result;
    }
    public int getDeger(int i)
    {

        Dugum result = this.head;
        for (int j = 0; j < i; j++) {
            result = result.sonraki;
        }
        if (result == null) {
            System.out.print("Index not found ");
            return -1;
        }
        return result.value;
    }
}