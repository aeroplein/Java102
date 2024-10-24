public class MyList<T> {
    private int capacity;
    private int size;
    private T[] myListArray;
    private T type;

    public MyList(int capacity){
        this.capacity = capacity;
        myListArray = (T[]) new Object[capacity];
        size = 0;

    }

    public MyList(){
        myListArray = (T[]) new Object[10];
        size = 0;

    }

    public int size(){
        return this.size;

    }

    public void add(T data){
        if (isFull()){
            capacity = capacity*2;
            T[] newArray = (T[]) new Object[capacity];
            System.arraycopy(myListArray, 0, newArray, 0, myListArray.length);
            size++;
            newArray[getSize()-1]= data;
            myListArray = newArray;


        }else{
            size++;
            myListArray[getSize()-1] = data;

        }

    }

    public boolean isFull(){
        //eğer en sondaki indexe sahip elemanın indexi array.length-1'e eşitse
        //array capacity dolmuş demektir.
        if(size == myListArray.length){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if (size==0){
            return true;
        }
        return false;
    }

    public T get(int index){
        //and yerine veya kullanmamız gerek çünkü aynı anda hem negatif
        // hem de max indexten bbüyük olması aynı anda mümkün değlil.
        //O yüzden veya
        if(index<0 || index>myListArray.length-1){
            return null;
        }else{
            return myListArray[index];
        }

    }

    public T remove(int index){
        if (index<0 || index> myListArray.length-1){
            return null;
        }else{

            T removedElements = myListArray[index];
            T[] newArray = (T[]) new Object[capacity];
            for(int i = index; i<size-1; i++){
                myListArray[i] = myListArray[i+1];

            }
            myListArray[size-1] = null;
            size--;
            return removedElements;
        }
    }

    public T set(int index, T data){
        if (index<0 || index>size){
            return null;
        }else{
            myListArray[index]=data;
            return myListArray[index];
        }
    }

    public int indexOf(T data){
        for(int i = 0; i<size; i++){
            if(data==myListArray[i]){
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data){
        //for'u tersten yapıyoruz ki son indexi bulabilelim
        for(int i = size-1; i>=0; i--){
            if (myListArray[i]==data){
                return i;
            }
        }
        return -1;
    }



    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i<size; i++){
            sb.append(myListArray[i]);
            if (i==size-1){
                sb.append("]");
            }else{
                sb.append(", ");
            }

        }

        String string = sb.toString();
        return string;
    }

    public T[] toArray(){
        T[] toArray = (T[]) new Object[size];
        for (int i = 0; i<size; i++){
            toArray[i] = myListArray[i];
        }
        return toArray;
    }

    public void clear(){
        T[] temp = (T[]) new Object[capacity];
     myListArray =  temp;
    }

    MyList<T> sublist(int start, int finish){
        T[] newArray = (T[]) new Object[capacity];
        MyList<T> list = new MyList<>(capacity);
        System.arraycopy(myListArray, start, newArray, 0, finish-start-1);
        for (int i = 0; i< newArray.length; i++){
            list.add(newArray[i]);
        }
        return list;
    }

    public boolean contains(T data){
        for(int i = 0; i<size; i++){
            if(data==myListArray[i]){
                return true;
            }
        }
        return false;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public T[] getMyListArray() {
        return myListArray;
    }

    public void setMyListArray(T[] myListArray) {
        this.myListArray = myListArray;
    }

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }
}
