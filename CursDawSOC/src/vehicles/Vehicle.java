package vehicles;

class Vehicle {

	/**
	 * Aquesta classe conté l'objecte vehicle, atributs y metodes locals.
	 */
	
		Matricula mat = new Matricula();
	
		String fabricant;
		String mod; 
		int any;
		String prov_matr;
		int num_matr;
		String lletres_matr;
		float consum;
		
		public Vehicle(String fabricant, String mod, int any, String prov_matr, int num_matr, String lletres_matr,
				float consum) {
			this.fabricant = fabricant;
			this.mod = mod;
			this.any = any;
			this.mat.setProv_matr(prov_matr);
			this.mat.setNum_matr(num_matr);
			this.mat.setLet_matr(lletres_matr);
			this.consum = consum;
		}

		public String getFabricant() {
			return fabricant;
		}

		public void setFabricant(String fabricant) {
			this.fabricant = fabricant;
		}

		public String getMod() {
			return mod;
		}

		public void setMod(String mod) {
			this.mod = mod;
		}

		public int getAny() {
			return any;
		}

		public void setAny(int any) {
			this.any = any;
		}

		public String getProv_matr() {
			return mat.getProv_matr();
		}

		public void setProv_matr(String prov_matr) {
			this.mat.setProv_matr(prov_matr);
		}

		public int getNum_matr() {
			return mat.getNum_matr();
		}

		public void setNum_matr(int num_matr) {
			this.mat.setNum_matr(num_matr);  
		}

		public String getLletres_matr() {
			return mat.getLet_matr();
		}

		public void setLletres_matr(String lletres_matr) {
			this.mat.setLet_matr(lletres_matr);
		}

		public float getConsum() {
			return consum;
		}

		public void setConsum(float consum) {
			this.consum = consum;
		}

		@Override
		public String toString() {
			return "Vehicle [fabricant=" + fabricant + ", mod=" + mod + ", any=" + any + ", prov_matr=" + prov_matr
					+ ", num_matr=" + num_matr + ", lletres_matr=" + lletres_matr + ", consum=" + consum + "]";
		}
		
		public float calcularKms (String litres, float consum){
			float kms=0;
			kms = Float.parseFloat(litres)/consum*100;
			return (kms);
		}	

}
