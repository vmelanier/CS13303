package lib;

public class Comment {
	private String name;
	private int postId;
	private int id;
	private String email;
	private String body;
	
	public Comment(String name, int postId, int id, String email, String body){
		this.name = name;
		this.postId = postId;
		this.id = id;
		this.email = email;
		this.body = body;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String toString(){
		return String.format("<%s %s in post %s>", this.getClass().getSimpleName(), this.id, this.postId);
	}
}
