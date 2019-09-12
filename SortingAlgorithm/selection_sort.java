/*Selection sort */
/*Algorithm description: 
    keep select the minimum element in the unsorted array into sorted array 
*/
/*
    Data Structure
    Selection sort prefer list because most of the time it will run through all of the data in sequence
    arrayList is good for sequencial access
 */
public class Selection_sort{
    private ArrayList<Integer> outputArr;
    private ArrayList<Integer> inputArr;
    public Selection_sort(ArrayList<Integer> inputArr){
        this.inputArr=inputArr;
    }
    public void sort(){
        for(int i=0; i<inputArr.size()-1, i++){             //walk through all of the element in the unsorted array
            min=inputArr.get(i);
            for(int j=(i+1); j<=inputArr.size()-1, j++){
                if(inputArr.get(j) < min){
                    min=inputArr.get(j);
                }
            }
        outputArr.add(min);
        }
    }
    //return the current image of sorted array
    public ArrayList<Integer> getOutput(){
        return outputArr;
    }
}