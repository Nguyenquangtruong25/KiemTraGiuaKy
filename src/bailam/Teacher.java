package bailam;
	 class Teacher extends Person {
	    private double hsl;
	    private static final double BASE_SALARY = 1800000;

	    public Teacher(String name, int age, double hsl) {
	        super(name, age);
	        this.hsl = hsl;
	    }

	    // Getter and Setter methods
	    public double getHsl() {
	        return hsl;
	    }

	    public void setHsl(double hsl) {
	        this.hsl = hsl;
	    }

	    // Method to calculate salary
	    public double calculateSalary() {
	        return BASE_SALARY * hsl;
	    }
	}

