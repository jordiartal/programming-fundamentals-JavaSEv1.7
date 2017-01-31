package vehicles;

class Matricula {

	String prov_matr;
	int num_matr;
	String let_matr;
	
	
	public Matricula() {
	}
	public Matricula(String prov_matr, int num_matr, String let_matr) {
		super();
		this.prov_matr = prov_matr;
		this.num_matr = num_matr;
		this.let_matr = let_matr;
	}
	public String getProv_matr() {
		return prov_matr;
	}
	public void setProv_matr(String prov_matr) {
		this.prov_matr = prov_matr;
	}
	public int getNum_matr() {
		return num_matr;
	}
	public void setNum_matr(int num_matr) {
		this.num_matr = num_matr;
	}
	public String getLet_matr() {
		return let_matr;
	}
	public void setLet_matr(String let_matr) {
		this.let_matr = let_matr;
	}
	@Override
	public String toString() {
		String matr_cmp = prov_matr+"-"+num_matr+"-"+let_matr;
		return matr_cmp;
	}
	
	
}
