package lesson3.prob1;

/*
* 1. Because Person checks only the name,
*  it thinks both are equal.
*  But PersonWithJob also checks salary and
*  doesn’t accept regular Person, so it returns false.
* */



public class PersonWithJob  {
	
	private double salary;
	private Person person;
	public double getSalary() {
		return salary;
	}
	PersonWithJob(String n, double s) {
		//super(n);
		this.person = new Person(n);
		salary = s;
	}
	@Override
     public boolean equals(Object obj){
		if(obj == null) return false;
		if(!(obj instanceof PersonWithJob)) return false;
		PersonWithJob p = (PersonWithJob)obj;
		boolean isEqual = this.person.equals(p.person) &&
				this.salary == p.salary;
		return isEqual;
	}



	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		PersonWithJob p2 = new PersonWithJob("Joe",30000);
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}


}
