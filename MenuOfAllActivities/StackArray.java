
class StackArray {
   private String[] array;
   private int count;
   private int size;

   public StackArray (int size) {
      array = new String[size];
      count = 0;
   }
   public StackArray () {
      this(10);
   }
   private boolean isEmpty() {
      return count == 0;
   }
   private boolean isFull() {
      return count == array.length;
   }
   public boolean push(String item) {
      if (!isFull()) {
         array[count++] = item;
         return true;
      }
      return false;
   }
   public boolean pop() {
      if (!isEmpty()) {
         array[count-1] = null;
         count--;
         return true;
      }
      return false;
   }
   public String peek() {
      if (!isEmpty()) {
         return array[count-1];
      }
      return null;
   }
   public void display() {
      if(!isEmpty()) {
         for(int i = count-1; i >= 0; i--){
            System.out.println("["+array[i]+"]");
         }
      }
      else
         System.out.println("Stack is empty");
   }
}