public class static_block_n_instance_block {
  /// main method
  public static void main(String [] args){
    static_block_n_instance_block object = new static_block_n_instance_block();
    System.out.println("Main Method Executed.");
  }

  /// Instance Block will be executed after before main method and after static block
  /// Instance Block is similar to method which has no name
  /// Instance Block is executed before constructor 
  /// We can use only variables inside the Instance Block not method
  /// It is generally used to write time consuming code like - JDBC Connectivity
  /// Will execute only if the class object is created
  /// Instance block can access static variables as well as instance variables
  {
    System.out.println("Instance Block Executed.");
  }

  /// Static Block will be excuted just before when JVM's class loader loader the class file into JVM Memory
  /// Static Block can only access static variables
  static {
    System.out.println("Static Block Executed.");
  }
}
