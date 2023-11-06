public class b implements post {
    private String name;
    private String day;
    private String title;
    private String contents;
    private String Views;

    public void setName(String name) {
        System.out.println(name);
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setDay(String day) {
        System.out.println(name);
        this.day = day;
    }
    public String getDay() {
        return day;
    }
    public void setTitle(String title) {
        System.out.println(name);
        this.title = title;
    }
    public String getTitle() { 
        return title;
    }
    public void setContents(String Contents) {
        System.out.println(name);
        this.contents = Contents;

    }
    public String getContents() { 
        return contents;
 
    }
    public void setViews(String Views) {
        System.out.println(name);
        this.Views = Views;

    }
    public String Views() { 
        return Views;
    }        
}