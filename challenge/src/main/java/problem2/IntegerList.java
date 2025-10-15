package problem2;

public class IntegerList
{
    int currentNum = 0 ;
    int[] list; //values in the list
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
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
        if (list.length == currentNum){
            list = increaseSize();
        }
        list[currentNum] = n ;
        currentNum++;
    }

    public void removeFirst(int newVal){
        int foundindex = -1 ;
        for (int i=0 ; i<currentNum ; i++){
            if (list[i]==newVal){
                foundindex = i ;
                break ;
            }
        }
        if (foundindex != -1){
            for (int i=foundindex ; i<currentNum -1 ; i++){
                list[i] = list[i+1] ;
            }

            currentNum -- ;
            list[currentNum] = 0;
        }

    }

    public void removeAll(int newVal){
        int i=0 ;
        while (i<currentNum){
            if (list[i]==newVal){
                for (int j=i ; j<currentNum-1 ; j++){
                    list[j] = list[j+1] ;

                }
                currentNum -- ;
                list[currentNum] = 0;
            }
            else{ i++ ;}  // if we do a for loop that just increments i, we can skip values
        }

    }
}