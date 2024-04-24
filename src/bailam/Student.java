package bailam;


	 public class Student extends Person {
		
	    private double toan;
	    private double ly;
	    private double hoa;

	    public Student(String name, int age, double toan, double ly, double hoa) {
	        super(name, age);
	        this.toan = toan;
	        this.ly = ly;
	        this.hoa = hoa;
	    }

	    // Getter and Setter methods
	    public double getMath() {
	        return toan;
	    }

	    public void setMath(double math) {
	        this.toan = math;
	    }

	    public double getPhysics() {
	        return ly;
	    }

	    public void setPhysics(double physics) {
	        this.ly = physics;
	    }

	    public double getChemistry() {
	        return hoa;
	    }

	    public void setChemistry(double chemistry) {
	        this.hoa = chemistry;
	    }

	    // Method to calculate average score
	    public double calculateAverage() {
	        return (toan + ly + hoa) / 3;
	    }
	}

