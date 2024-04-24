package bailam;

public class Person {
	
		String name;
		private int age;
		
		public Person (String name, int age ) {
			this.name =name;
			this.age = age;
		}
		public Person(String name){
			this.name = name;
		}
		public Person() {}
		
		public void setAge(int age) {
			if(age < 0)age =1;
			this.age = age;
			
		}
		public int getAge() {
			return this.age;
		}
	}

