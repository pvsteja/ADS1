class Candidates implements Comparable<Candidates> {
	int id;
	String name;
	String degree;
	double percent;
	Candidates(int id, String name, String degree, double percent) {
		this.id = id;
		this.name = name;
		this.degree = degree;
		this.percent = percent;
	}
	public void setId(int id){
		this.id = id;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setDegree(String degree){
		this.degree = degree;
	}
	public void setPercent(double percent){
		this.percent = percent;
	}
	public int getId(){
		return this.id = id;
	}
	public String getName(){
		return this.name = name;
	}
	public String getDegree(){
		return this.degree = degree;
	}
	public double getPercent(){
		return this.percent = percent;
	}
	public int compareTo(Candidates that) {
		if (this.percent > that.percent) {
			return 1;
		}
		if (this.percent < that.percent) {
			return -1;
		}
		if (this.id < that.id) {
			return 1;
		}
		if (this.id > that.id) {
			return -1;
		}
		else {
			return 0;
		}
	}
	public String toString(){
		String s = "";
		s = s + this.id + "," + this.name + "," + this.degree +","+this.percent;
		return s;
	}
}