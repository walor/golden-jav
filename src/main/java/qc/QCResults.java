package qc;


public class QCResults {
	private static QCResults singleton = null;
	private String micadena;
	
	QCReporter reporter;
	
	public String getMicadena() {
		System.out.println(micadena);
		return micadena;
	}

	public void setMicadena(String micadena) {
		this.micadena = micadena;
	}

	public QCResults() {
		if (reporter != null) {
			micadena = reporter.QCGetFields();
			System.out.println(micadena);
		}
	}

	public QCResults getInstance() {
		if (singleton == null) {
			singleton = new QCResults();
		}
		return singleton;
	}

	protected static void demoMethod() {
		System.out.println("demoMethod for singleton");
	}
}