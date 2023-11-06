public class free extends BoardClass {
    private Integer viewCount;

    public void setviewCount(Integer viewCount){
        this.viewCount = viewCount;
    }

    public Integer getviewCount(){
        return viewCount;
    }

    @Override
    public void printinfo(){
        System.out.println("제목:" + this.title+ "내용:" + this.contents + "작성자:" + this.name + "작성일:"+ this.day + "조회수:" + this.viewCount);
    }
}
