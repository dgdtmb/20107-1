public abstract class BoardClass{
    protected String name;
    protected String day;
    protected String title;
    protected String contents;


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setDay(String day) {
        this.day = day;
    }
    public String getDay() {
        return day;
    };
    public void setTitle(String title) {
        this.title = title;
    };
    public String getTitle() { 
        return title;
    };
    public void setContents(String Contents) {
        this.contents = Contents;

    }
    public String getContents() { 
        return contents;
    };

    public abstract void printinfo();
}