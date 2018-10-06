class Information {
	private String name;
	private String dob;
	private Integer marks1;
	private Integer marks2;
	private Integer marks3;
	private Integer total;
	private String category;

	Information(String name, String dob, Integer marks1, Integer marks2, Integer marks3, Integer total, String category) {
		this.name = name;
		this.dob = dob;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
		this.total = total;
		this.category = category;
	}
	public String getStudentname() {
		return this.name;
	}
	public String getDateofbirth() {
		return this.dob;
	}
	public Integer getStudent1marks () {
		return this.marks1;
	}
	public Integer getStudent2marks () {
		return this.marks2;
	}
	public Integer getStudent3marks () {
		return this.marks3;
	}
	public Integer getTotalmarks () {
		return this.total;
	}
	public String getReservationcategory() {
		return this.category;
	}
	public void setStudentname(String name) {
		this.name = name;
	}
	public void setDateofbirth(String dob) {
		this.dob = dob;
	}
	public void setStudent1marks (Integer marks1) {
		this.marks1 = marks1;
	}
	public void setStudent2marks (Integer marks2) {
		this.marks2 = marks2;
	}
	public void setStudent3marks (Integer marks3) {
		this.marks3 = marks3;
	}
	public void setTotalmarks (Integer total) {
		this.total = total;
	}
	public void setReservationcategory(String category) {
		this.category = category;
	}
	public String toString() {
		return this.name+","+this.total+","+this.category;
	}
	public int compareTo(Information that) {
		if(this.total > that.total) return -1;
		if(this.total < that.total) return 1;
		if(this.marks1 > that.marks1) return -1;
		if(this.marks1 < that.marks1) return 1;
		if(this.marks2 > that.marks2) return -1;
		if(this.marks2 < that.marks2) return 1;
		if(this.marks3 > that.marks3) return -1;
		if(this.marks3 < that.marks3) return 1;
		return 0;
	}
}