package tsrk.model;

import java.sql.Blob;
import java.util.ArrayList;
import java.util.Date;

import tsrk.model.enums.Status;
import tsrk.model.enums.Visibility;

public class Blog {
	
	private long blogId;
	private String blogTitle;
	private String blogCategory;
	private Status blogStatus;
	private Blob blogImage;
	private Visibility blogVisibility;
	private String blogContent;
	private int blogUser;
	private Date publishDate;
	private ArrayList<Comment> comments;
	private ArrayList<Like> likes;
	
	public long getBlogId() {
		return blogId;
	}
	public void setBlogId(long blogId) {
		this.blogId = blogId;
	}
	
	public String getBlogTitle() {
		return blogTitle;
	}
	
	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}
	public String getBlogCategory() {
		return blogCategory;
	}
	public void setBlogCategory(String blogCategory) {
		this.blogCategory = blogCategory;
	}
	
	public Blob getBlogImage() {
		return blogImage;
	}
	public void setBlogImage(Blob blogImage) {
		this.blogImage = blogImage;
	}
	
	public String getBlogContent() {
		return blogContent;
	}
	public void setBlogContent(String blogContent) {
		this.blogContent = blogContent;
	}
	public int getBlogUser() {
		return blogUser;
	}
	public void setBlogUser(int blogUser) {
		this.blogUser = blogUser;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public Status getBlogStatus() {
		return blogStatus;
	}
	public void setBlogStatus(Status blogStatus) {
		this.blogStatus = blogStatus;
	}
	public Visibility getBlogVisibility() {
		return blogVisibility;
	}
	public void setBlogVisibility(Visibility blogVisibility) {
		this.blogVisibility = blogVisibility;
	}
	public ArrayList<Comment> getComments() {
		return comments;
	}
	public void setComments(ArrayList<Comment> comments) {
		this.comments = comments;
	}
	public ArrayList<Like> getLikes() {
		return likes;
	}
	public void setLikes(ArrayList<Like> likes) {
		this.likes = likes;
	}
	
	

}
