package problem2;

public class IntegerList
{
    int currentNum = 0 ;
    int currentSize = 0 ;
    int[] list; //values in the list
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
        currentSize = size ;
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
        currentNum = list.length ;  // index of last element would be currentNum-1
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }

    public int[] increaseSize() {
        int[] newlist = new int[list.length * 2] ;
        for (int i=0; i<list.length; i++){
            newlist[i] = list[i];
        }
        return newlist ;
    }

    public void addElement( int n){
        if (currentSize != currentNum){
            list[currentNum] = n ;
        }
        else {
            list = increaseSize();
            list[list.length-1] = n ;
        }
    }

    public void removeFirst(int newVal){
        int foundindex = -1 ;
        for (int i=0 ; i<list.length ; i++){
            if (list[i]==newVal){
                foundindex = i ;
                break ;
            }
        }
        if (foundindex != -1){
            for (int i=foundindex ; i<currentNum ; i++){
                list[i] = list[i+1] ;
                currentNum -- ;
            }
        }
    }

    public void removeAll(int newVal){
        for (int i=0 ; i<list.length ; i++){
            if (list[i]==newVal){

                for (int j=i ; j<currentNum ; j++){
                    list[j] = list[j+1] ;
                    currentNum -- ;
                }

            }
        }

    }
}