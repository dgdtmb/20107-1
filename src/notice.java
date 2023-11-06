public class notice extends BoardClass{
    private Integer importance;

    public void setImportance(Integer importance){
        this.importance = importance;
    }

    public Integer getImportance(){
        return importance;
    }

    @Override
    public void printinfo(){
        System.out.println("제목:" + this.title+ "내용:" + this.contents + "작성자:" + this.name + "작성일:"+ this.day + "조회수:" + this.importance);
    }
}