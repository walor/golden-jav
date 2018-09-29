package anthill;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class AnthillCertTrustManager {

	public void AnthillCertT() {
		TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
			public java.security.cert.X509Certificate[] getAcceptedIssuers() {
				return null;
			}

			public void checkClientTrusted(X509Certificate[] certs,
					String authType) {
			}

			public void checkServerTrusted(X509Certificate[] certs,
					String authType) {
			}
		} };
		SSLContext sc = null;
		try {
			sc = SSLContext.getInstance("SSL");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		try {
			sc.init(null, trustAllCerts, new java.security.SecureRandom());
		} catch (KeyManagementException e) {
			e.printStackTrace();
		}
		HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
		HostnameVerifier allHostsValid = new HostnameVerifier() {
			public boolean verify(String hostname, SSLSession session) {
				return true;
			}
		};
		HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
		URL url = null;
		try {
			url = new URL("https://10.88.11.73:8443/services/Dashboard");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		URLConnection con = null;
		try {
			con = url.openConnection();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Reader reader = null;
		try {
			reader = new InputStreamReader(con.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		while (true) {
			int ch = 0;
			try {
				ch = reader.read();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (ch == -1) {
				break;
			}
			System.out.print((char) ch);
		}
	}
}
