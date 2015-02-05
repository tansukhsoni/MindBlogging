package main.com.bean;

import java.sql.Blob;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

import main.com.tsrk.model.enums.Status;
import main.com.tsrk.model.enums.Visibility;

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
	@Id
	@Column(name="blog_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public void setBlogId(long blogId) {
		this.blogId = blogId;
	}
	
	public String getBlogTitle() {
		return blogTitle;
	}
	@Column(name="title")
	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}
	public String getBlogCategory() {
		return blogCategory;
	}
	@Column(name="category")
	public void setBlogCategory(String blogCategory) {
		this.blogCategory = blogCategory;
	}
	
	public Blob getBlogImage() {
		return blogImage;
	}
	@Lob
	public void setBlogImage(Blob blogImage) {
		this.blogImage = blogImage;
	}
	
	public String getBlogContent() {
		return blogContent;
	}
	@Column(name="content", length=500)
	public void setBlogContent(String blogContent) {
		this.blogContent = blogContent;
	}
	public int getBlogUser() {
		return blogUser;
	}
	@Column(name="user_id")
	public void setBlogUser(int blogUser) {
		this.blogUser = blogUser;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	@Column(name="publish_date")
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public Status getBlogStatus() {
		return blogStatus;
	}
	@Column(name="status")
	public void setBlogStatus(Status blogStatus) {
		this.blogStatus = blogStatus;
	}
	public Visibility getBlogVisibility() {
		return blogVisibility;
	}
	@Column(name="visibility")
	public void setBlogVisibility(Visibility blogVisibility) {
		this.blogVisibility = blogVisibility;
	}
	public ArrayList<Comment> getComments() {
		return comments;
	}
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="blog_id")
	public void setComments(ArrayList<Comment> comments) {
		this.comments = comments;
	}
	public ArrayList<Like> getLikes() {
		return likes;
	}
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="like_id")
	public void setLikes(ArrayList<Like> likes) {
		this.likes = likes;
	}
	
	public static void main(String a[]){
		System.out.println("hello world!!");
	}
	
	

}
