import java.util.*;

class Main{
  public static void main(String args[]){
    List<String> colors = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    colors.add("Red");
    colors.add("Yellow");
    colors.add("Green");
    colors.add("Pink");
    
    Iterator itr = colors.iterator();
    int i=1;
    while(itr.hasNext()){
      System.out.println("Color number: "+i+" : "+itr.next());
      i++;
    }
    
    System.out.println("\nEnter the element: ");
    String str = sc.nextLine();
    
    colors.add("");
    for(int j=colors.size()-1;j>0;j--){
      colors.set(j,colors.get(j-1));
    }
    colors.set(0,str);
    
    System.out.println(colors);
  }
}
