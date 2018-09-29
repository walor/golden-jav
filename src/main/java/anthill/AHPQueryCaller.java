package anthill;
import com.urbancode.anthill3.integration.GetMyProjectsDocument;
import com.urbancode.anthill3.integration.GetMyProjectsResponseDocument;

public interface AHPQueryCaller {

	GetMyProjectsResponseDocument getMyProjects(GetMyProjectsDocument myrequest);
}