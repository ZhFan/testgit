package org.zf.struts2.ch02.action;
import com.opensymphony.xwork2.Action;
public class Book implements Action {
	String ISBN; // ����׼ͼ���� 
    String Title; // ����
    String AuthorID;//����id
    String Publisher; // ������  
    String PublishDate; // ��������  
    String Price;// �۸� 
    String Name;//����
    String Age;//
    String Country;//
    public String getISBN(){
    	return ISBN;
    }
    public void setISBN(String isbn){
    	ISBN=isbn;
    }
    public String getTitle() {
    	return Title;
    }   
    public void setTitle(String title) {
    	Title = title;  
    }
    public String getAuthorID(){
    	return AuthorID;
    }
    public void setAuthorID(String authorID){
    	AuthorID=authorID;
    }
    public String getPublisher(){
    	return Publisher;
    }
    public void setPublisher(String publisher){
    	Publisher=publisher;
    }
    public String getPublishDate(){
    	return PublishDate;
    }
    public void setPublishDate(String publishDate){
    	PublishDate=publishDate;
    }
    public String getPrice(){
    	return Price;
    }
    public void setPrice(String price){
    	Price=price;
    }
    public String getName(){
    	return Name;
    }
    public void setName(String name){
    	Name=name;
    }
    public String getAge(){
    	return Age;
    }
    public void setAge(String age){
    	Age=age;
    }
    public String getCountry(){
    	return Country;
    }
    public void setCountry(String country){
    	Country=country;
    }
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}