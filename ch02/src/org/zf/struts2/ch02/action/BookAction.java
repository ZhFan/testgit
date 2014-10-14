package org.zf.struts2.ch02.action;
import java.util.Vector;
import javax.servlet.http.HttpServletRequest;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
public class BookAction extends ActionSupport{
	private static final long serialVersionUID=3413439754153934751L;
	public String Name;
	public String Title;
	private String AuName;
	private Vector<String> vList=new Vector<String>();
	private Vector<String> vdetail=new Vector<String>();
	private Vector<String> vnew=new Vector<String>();
	private Vector<String> vListnew=new Vector<String>();
	public String getName() {
		return Name;
	}
	public void setName(String name){
		this.Name = name;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title){
		this.Title = title;
	}
	/*public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		this.doGet(request, response);
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		DBConnection bd=new DBConnection();
	    Vector vList=bd.ZfBook(Name);
	    request.setAttribute("booklist",vList);
	    request.getRequestDispatcher("/BookList.jsp").forward(request, response);
	}*/
	public String Search(){
		DBConnection bd=new DBConnection();
	    vList=bd.ZfBook(Name);
	    HttpServletRequest request=ServletActionContext.getRequest();
	    request.setAttribute("booklist",vList);
	    return SUCCESS;
	}
	public String Detail(){
		DBConnection bd=new DBConnection();
	    vdetail=bd.ZfBookdetail(Title);
	    HttpServletRequest request=ServletActionContext.getRequest();
	    request.setAttribute("bookdetail",vdetail);
	    return SUCCESS;
	}
	public String Delete(){
		DBConnection bd=new DBConnection();
		vnew=bd.ZfBookdetail(Title);
		bd.ZfBookdelete1(Title);
	    AuName=vnew.elementAt(6);
		vListnew=bd.ZfBook(AuName);
		for(int i=0;i<vListnew.size();i++){
		System.out.println(vListnew.elementAt(i));
	    }
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("booklist",vListnew);

	    return SUCCESS;
	}
}	
