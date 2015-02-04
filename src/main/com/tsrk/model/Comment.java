package tsrk.model;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Comment {
	
	private long commentId;
	private String content;
	private int blogId;
	private int userId;
	private ArrayList<Like> likeLists;
	
	public long getCommentId() {
		return commentId;
	}
	@Id(name="comment_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public void setCommentId(long commentId) {
		this.commentId = commentId;
	}
	public String getContent() {
		return content;
	}
	@Column(name="content", length="500")
	public void setContent(String content) {
		this.content = content;
	}
	public int getBlogId() {
		return blogId;
	}
	@Column(name="blog_id")
	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}
	public int getUserId() {
		return userId;
	}
	@Column(name="user_id")
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public ArrayList<Like> getLikeLists() {
		return likeLists;
	}
	@OneToMany(cascade=CascadeType.ALL)
	@JoinedColumn(name="comment_id")
	public void setLikeLists(ArrayList<Like> likeLists) {
		this.likeLists = likeLists;
	}
	
	

}
