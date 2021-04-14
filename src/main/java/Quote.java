import java.io.Serializable;

public class Quote implements Serializable {

    public Quote(short id, String content, short authorID, String author) {
        this.id = id;
        this.content = content;
        this.authorID = authorID;
        this.author = author;
    }

    private short id;
    private String content;
    private short authorID;
    private String author;

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public short getAuthorID() {
        return authorID;
    }

    public void setAuthorID(short authorID) {
        this.authorID = authorID;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
