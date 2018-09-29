package qc;

import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.impl.client.BasicCredentialsProvider;

public class MyCredentialsProvider extends BasicCredentialsProvider {

    public MyCredentialsProvider(String username, String password) {
        setCredentials(AuthScope.ANY, new UsernamePasswordCredentials(username, password));
    }

}