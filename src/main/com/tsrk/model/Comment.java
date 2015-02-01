package tsrk.model;

import java.util.ArrayList;

public class Comment {
	
	private long commentId;
	private String content;
	private int blogId;
	private int userId;
	private ArrayList<Like> likeLists;
	
	public long getCommentId() {
		return commentId;
	}
	public void setCommentId(long commentId) {
		this.commentId = commentId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getBlogId() {
		return blogId;
	}
	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public ArrayList<Like> getLikeLists() {
		return likeLists;
	}
	public void setLikeLists(ArrayList<Like> likeLists) {
		this.likeLists = likeLists;
	}
	
	

}
