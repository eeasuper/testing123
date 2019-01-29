package hello;

//import javax.persistence.Entity;
//import javax.persistence.Id;

//@Entity
public class Greeting {
	
//	@Id
    private Long  id;
    private String content;

    public Greeting() {
    	
    }
    
//    public Greeting() {
//        this.id = -1;
//        this.content = "";
//    }

    public Greeting(long id, String content) {
    	super();
        this.id = id;
        this.content = content;
    }

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setId(long id) {
		this.id = id;
	}

 
}
