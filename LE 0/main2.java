class GetterSetter{
     private String name;
     public void setname(String N){
         this.name=N;
     }
    public String getname(){
       return name;
    }
 }
 
public class main2
{
	public static void main(String[] args) {
		GetterSetter obj= new GetterSetter();
		obj.setname("Prathamesh");	
		System.out.println(obj.getname());
}
}
