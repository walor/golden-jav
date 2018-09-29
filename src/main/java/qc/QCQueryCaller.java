package qc;


public interface QCQueryCaller {

    Entities query(String query);
    Fields myquery(String myyquery);
    String login(String operation);
    QCReporter QCGetFields();
}