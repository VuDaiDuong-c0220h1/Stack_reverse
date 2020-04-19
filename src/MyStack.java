public class MyStack {
    public int[] arr;
    public int size;
    public int index = 0;

    public MyStack(int size){
        this.size = size;
        this.arr = new int[size];
    }

    public boolean isFull(){
        if (index == size){
            return true;
        }
        return false;
    }

    public void push(int element){
        if (isFull()){
            throw new StackOverflowError("Stack is Full");
        }
        arr[index] = element;
        index++;
    }

    public boolean isEmpty(){
        if(index == 0){
            return true;
        }
        return false;
    }

    public int pop() throws Exception {
        if (isEmpty()){
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }

    public int size(){
        return index;
    }

    public void display(){
        for(int i=0; i < index; i++){
            System.out.print(arr[i] + "\t");
        }
    }

}
