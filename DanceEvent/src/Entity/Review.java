package Entity;

public class Review extends BaseEntity implements java.io.Serializable {
    private long id;
    private long setId;
    private long rating;
    private long comment;

    public Review() {

    }

    public long getSetId() {
        return setId;
    }
    public void setSetId(long setId) {
        this.setId = setId;
    }

    public long getRating() {
        return rating;
    }
    public void setRating(long rating) {
        this.rating = rating;
    }

    public long getComment() {
        return comment;
    }
    public void setComment(long comment) {
        this.comment = comment;
    }
}
