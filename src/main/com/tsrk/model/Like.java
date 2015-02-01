package tsrk.model;

import tsrk.model.enums.LikeCategory;

public class Like {
	
	private long likeId;
	private LikeCategory likeCategory;
	private long blogId;
	private long commentId;
	private long userId;
	
	public long getLikeId() {
		return likeId;
	}
	public void setLikeId(long likeId) {
		this.likeId = likeId;
	}
	
	public LikeCategory getLikeCategory() {
		return likeCategory;
	}
	public void setLikeCategory(LikeCategory likeCategory) {
		this.likeCategory = likeCategory;
	}
	public long getBlogId() {
		return blogId;
	}
	public void setBlogId(long blogId) {
		this.blogId = blogId;
	}
	public long getCommentId() {
		return commentId;
	}
	public void setCommentId(long commentId) {
		this.commentId = commentId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	

}
