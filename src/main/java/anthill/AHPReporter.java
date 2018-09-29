package anthill;


import com.urbancode.anthill3.integration.GetMyProjectsDocument;
import com.urbancode.anthill3.integration.GetMyProjectsDocument.GetMyProjects;
import com.urbancode.anthill3.integration.GetMyProjectsResponseDocument;

public class AHPReporter {
	
	AHPQueryCaller ahpQueryCaller;
	
	public void setAhpQueryCaller(AHPQueryCaller ahpQueryCaller){
		this.ahpQueryCaller = ahpQueryCaller; 
	}
	public AHPQueryCaller getAhpQueryCaller()
	{
		return this.ahpQueryCaller;
	}
	
	public GetMyProjectsResponseDocument AHPGetMyProjects()
    {
		GetMyProjectsResponseDocument response = ahpQueryCaller.getMyProjects(myrequest());
		return response;
    }
	
	private GetMyProjectsDocument myrequest() {
		GetMyProjectsDocument reqdoc =GetMyProjectsDocument.Factory.newInstance();
		GetMyProjects getMyProjects= GetMyProjects.Factory.newInstance();
		getMyProjects.setIn0("eormeno");
		getMyProjects.setIn1("anthill");
		reqdoc.setGetMyProjects(getMyProjects);
		
		return reqdoc;
	}
}