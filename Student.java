  class Student {
      int id = 1000;	
	  
	  byte age = 18;
	  short rank = 165; //[-128, 127]
	  long phone = 223_456_7890L; // Java 7 -- readability
	  
	  // Integer literals: int literal, long literal
	  
	  byte minValue = Byte.MIN_VALUE;
	  byte maxValue = Byte.MAX_VALUE;
	
	  void compute() {	    
		  int nextId = id + 1;
		
	      System.out.println("id: " + id);
		  System.out.println("nextId: " + nextId);
		  System.out.println("age: " + age);
		  System.out.println("phone: " + phone);
		  System.out.println("minValue: " + minValue);
		  System.out.println("maxValue: " + maxValue);
	  }
	
	  public static void main(String[] args) {
	      Student s = new Student();
		  s.compute();
	  }
  }