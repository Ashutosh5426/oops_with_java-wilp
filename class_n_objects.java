class class_n_objects{
  public static void main(String[] args){
    NameNAge nameAge = new NameNAge();
    nameAge.initializeNameAge();
    nameAge.printNameAge();
  }
}

class NameNAge{
  int num; String name;

  void initializeNameAge(){
    num = 20;
    name = "Ashutosh Gupta";
  }
  
  void printNameAge(){
    System.out.println(num + " "+ name);
  }
}