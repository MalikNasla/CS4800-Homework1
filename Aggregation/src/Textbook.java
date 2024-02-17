public class Textbook {
    public String textbookTitle;
    public String textbookAuthor;
    public String textbookPublisher;

    public Textbook(String textbookName, String textbookAuthor, String textbookPublisher){
        this.textbookTitle = textbookName;
        this.textbookAuthor = textbookAuthor;
        this.textbookPublisher = textbookPublisher;
    }

    public void setTextbookTitle(String textbookTitle) {
        this.textbookTitle = textbookTitle;
    }

    public void setTextbookAuthor(String textbookAuthor) {
        this.textbookAuthor = textbookAuthor;
    }

    public void setTextbookPublisher(String textbookPublisher) {
        this.textbookPublisher = textbookPublisher;
    }

    public String getTextbookTitle() {
        return textbookTitle;
    }

    public String getTextbookAuthor() {
        return textbookAuthor;
    }

    public String getTextbookPublisher() {
        return textbookPublisher;
    }
}
