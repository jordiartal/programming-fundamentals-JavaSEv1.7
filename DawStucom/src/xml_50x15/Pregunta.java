package xml_50x15;

public class Pregunta {
	private String enunciado;
	private String respuesta1;
	private String respuesta2;
	private String respuesta3;
	private String respuesta4;
	private int correcta;
	
	public Pregunta(String enunciado, String respuesta1, String respuesta2,
			String respuesta3, String respuesta4, int correcta) {
		super();
		this.enunciado = enunciado;
		this.respuesta1 = respuesta1;
		this.respuesta2 = respuesta2;
		this.respuesta3 = respuesta3;
		this.respuesta4 = respuesta4;
		this.correcta = correcta;
	}
	public String getEnunciado() {
		return enunciado;
	}
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	public String getRespuesta1() {
		return respuesta1;
	}
	public void setRespuesta1(String respuesta1) {
		this.respuesta1 = respuesta1;
	}
	public String getRespuesta2() {
		return respuesta2;
	}
	public void setRespuesta2(String respuesta2) {
		this.respuesta2 = respuesta2;
	}
	public String getRespuesta3() {
		return respuesta3;
	}
	public void setRespuesta3(String respuesta3) {
		this.respuesta3 = respuesta3;
	}
	public String getRespuesta4() {
		return respuesta4;
	}
	public void setRespuesta4(String respuesta4) {
		this.respuesta4 = respuesta4;
	}
	public int getCorrecta() {
		return correcta;
	}
	public void setCorrecta(int correcta) {
		this.correcta = correcta;
	}
}
