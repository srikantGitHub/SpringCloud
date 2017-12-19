package com.srikant.ratingservice;

public class Rating {
    private Long id;
    private Long bookId;
    private int stars;
    
	public Rating(long l, long m, int i) {
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
 
    //standard getters and setters
}