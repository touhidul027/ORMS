package company;

public class Review {
	 private int reviewId ; 
	 private String review_title ; 
	 private int recommend ; 
	 private String outlook ; 
	 private String pros ; 
	 private String cons ; 
	 private String advice ; 
	 private float rating ;
	 
	public int getReviewId() {
		return reviewId;
	}
	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}
	public String getReview_title() {
		return review_title;
	}
	public void setReview_title(String review_title) {
		this.review_title = review_title;
	}
	public int getRecommend() {
		return recommend;
	}
	public void setRecommend(int recommend) {
		this.recommend = recommend;
	}
	public String getOutlook() {
		return outlook;
	}
	public void setOutlook(String outlook) {
		this.outlook = outlook;
	}
	public String getPros() {
		return pros;
	}
	public void setPros(String pros) {
		this.pros = pros;
	}
	public String getCons() {
		return cons;
	}
	public void setCons(String cons) {
		this.cons = cons;
	}
	public String getAdvice() {
		return advice;
	}
	public void setAdvice(String advice) {
		this.advice = advice;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	} 	 
}
