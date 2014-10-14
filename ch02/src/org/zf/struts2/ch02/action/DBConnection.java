package org.zf.struts2.ch02.action;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.util.Vector;
public class DBConnection{
	String bb;
	public Vector<String> ZfBookdelete(String Title){
		Vector<String> v=new Vector<String>();
		String drv="com.mysql.jdbc.Driver";
		Connection con=null;
		String url="jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_zfselab2";
		String username="wjmwlyy003";
		String password="izkkj0y4j1hjzj201k10mk00jljh5xk24lk3j3hx";
		/*String url="jdbc:mysql://localhost:3306/new_schema";
		String username="root";
		String password="1234";*/
		String id=null;
		Statement stmt=null;
		Statement stmtb=null;
		ResultSet rs=null;
		String sql="select * from Book";
		try{
			Class.forName(drv);
			con=DriverManager.getConnection(url,username,password);
			stmtb=con.createStatement();
			rs=stmtb.executeQuery(sql);
			while(rs.next()){
				if(rs.getString("Title").equals(Title)){
					/*bb = new Book();// 每循环一次得到一个bb对象
					System.out.println(rsb.getString("Title"));
					bb.setTitle(rsb.getString("Title"));
					System.out.println(bb.Title);*/	
					id=rs.getString("AuthorID");
					
				}
			}
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			System.out.println("空指针异常!数据库驱动类没找到!");
			}catch (SQLException se){
				se.printStackTrace();
				System.out.println("数据库连接失败!a");
				}finally{
					try{
						rs.close();
						stmtb.close();
						con.close();
						}catch(SQLException e){
							e.printStackTrace();
							System.out.println("SQL关闭出现错误!");
							}
					}
		sql ="delete from Book where Title=\'"+Title+"\'";
		try{
			Class.forName(drv);
			con=DriverManager.getConnection(url,username,password);
			stmt=con.createStatement();
			stmt.execute(sql);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			System.out.println("空指针异常!数据库驱动类没找到!");
			}catch (SQLException se){
				se.printStackTrace();
				System.out.println("数据库连接失败!");
				}finally{
					try{
						stmt.close();
						con.close();
						}catch(SQLException e){
							e.printStackTrace();
							System.out.println("SQL关闭出现错误!");
							}
					}
		sql="select * from Book";
		try{
			Class.forName(drv);
			con=DriverManager.getConnection(url,username,password);
			stmtb=con.createStatement();
			rs=stmtb.executeQuery(sql);
			while(rs.next()){
				if(rs.getString("AuthorID").equals(id)){
					/*bb = new Book();// 每循环一次得到一个bb对象
					System.out.println(rsb.getString("Title"));
					bb.setTitle(rsb.getString("Title"));
					System.out.println(bb.Title);*/	
					bb=rs.getString("Title");
					v.addElement(bb);//把Book类型实例化的bb里面存放的每一条记录给v
					
				}
			}
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			System.out.println("空指针异常!数据库驱动类没找到!");
			}catch (SQLException se){
				se.printStackTrace();
				System.out.println("数据库连接失败!c");
				}finally{
					try{
						rs.close();
						stmtb.close();
						con.close();
						}catch(SQLException e){
							e.printStackTrace();
							System.out.println("SQL关闭出现错误!");
							}
					}
	    return v;
	}
	public void ZfBookdelete1(String Title){
		String drv="com.mysql.jdbc.Driver";
		Connection con=null;
		String url="jdbc:mysql://w.rdc.sae.sina.com.cn:3307//app_zfselab2";
		String username="wjmwlyy003";
		String password="izkkj0y4j1hjzj201k10mk00jljh5xk24lk3j3hx";
		/*String url="jdbc:mysql://localhost:3306/new_schema";
		String username="root";
		String password="1234";*/
		Statement stmt=null;
		String sql ="delete from Book where Title=\'"+Title+"\'";
		try{
			Class.forName(drv);
			con=DriverManager.getConnection(url,username,password);
			stmt=con.createStatement();
			stmt.execute(sql);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			System.out.println("空指针异常!数据库驱动类没找到!");
			}catch (SQLException se){
				se.printStackTrace();
				System.out.println("数据库连接失败!");
				}finally{
					try{
						stmt.close();
						con.close();
						}catch(SQLException e){
							e.printStackTrace();
							System.out.println("SQL关闭出现错误!");
							}
					}
		return;
	}
	public Vector<String> ZfBookdetail(String Title){
		Vector<String> v=new Vector<String>();
		String drv="com.mysql.jdbc.Driver";
		Connection con=null;
		String url="jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_zfselab2";
		String username="wjmwlyy003";
		String password="izkkj0y4j1hjzj201k10mk00jljh5xk24lk3j3hx";
		/*String url="jdbc:mysql://localhost:3306/new_schema";
		String username="root";
		String password="1234";*/
		String id=null;
		Statement stmta=null;
		Statement stmtb=null;
		ResultSet rsa=null;
		ResultSet rsb=null;
		String sqlb="select * from Book";
		try{
			Class.forName(drv);
			con=DriverManager.getConnection(url,username,password);
			stmtb=con.createStatement();
			rsb=stmtb.executeQuery(sqlb);
			while(rsb.next()){
				if(rsb.getString("Title").equals(Title)){
					/*bb = new Book();// 每循环一次得到一个bb对象
					System.out.println(rsb.getString("Title"));
					bb.setTitle(rsb.getString("Title"));
					System.out.println(bb.Title);*/	
					bb=rsb.getString("Title");
					v.addElement(bb);//把Book类型实例化的bb里面存放的每一条记录给v
					bb=rsb.getString("ISBN");
					v.addElement(bb);
					bb=rsb.getString("AuthorID");
					v.addElement(bb);
					bb=rsb.getString("Publisher");
					v.addElement(bb);
					bb=rsb.getString("PublishDate");
					v.addElement(bb);
					bb=rsb.getString("Price");
					v.addElement(bb);
					id=rsb.getString("AuthorID");
					
				}
			}
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			System.out.println("空指针异常!数据库驱动类没找到!");
			}catch (SQLException se){
				se.printStackTrace();
				System.out.println("数据库连接失败!");
				}finally{
					try{
						rsb.close();
						stmtb.close();
						con.close();
						}catch(SQLException e){
							e.printStackTrace();
							System.out.println("SQL关闭出现错误!");
							}
					}
		String sqla="select * from Author";
		try{
			Class.forName(drv);
			con=DriverManager.getConnection(url,username,password);
			stmta=con.createStatement();
			rsa=stmta.executeQuery(sqla);
			while(rsa.next()){
				if(rsa.getString("AuthorID").equals(id)){
					v.addElement(rsa.getString("Name"));
					v.addElement(rsa.getString("Age"));
					v.addElement(rsa.getString("Country"));
				}
			}
			}catch(ClassNotFoundException e){
				e.printStackTrace();
				System.out.println("空指针异常!数据库驱动类没找到!");
				}catch (SQLException se){
					se.printStackTrace();
					System.out.println("数据库连接失败!!!!!");
					}finally{
						try{
							rsa.close();
							stmta.close();
							con.close();
							}catch(SQLException e){
								e.printStackTrace();
								System.out.println("SQL关闭出现错误!");
								}
						}
	return v;
	}
	public Vector<String> ZfBook(String Name){
		Vector<String> v=new Vector<String>();
		String drv="com.mysql.jdbc.Driver";
		Connection con=null;
		String url="jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_zfselab2";
		String username="wjmwlyy003";
		String password="izkkj0y4j1hjzj201k10mk00jljh5xk24lk3j3hx";
		/*String url="jdbc:mysql://localhost:3306/new_schema";
		String username="root";
		String password="1234";*/
		String id=null;
		Statement stmta=null;
		Statement stmtb=null;
		ResultSet rsa=null;
		ResultSet rsb=null;
		String sqla="select * from Author";
		try{
			Class.forName(drv);
			con=DriverManager.getConnection(url,username,password);
			stmta=con.createStatement();
			rsa=stmta.executeQuery(sqla);
			while(rsa.next()){
				if(rsa.getString("Name").equals(Name)){
					id=rsa.getString("AuthorID");
				}
			}
			}catch(ClassNotFoundException e){
				e.printStackTrace();
				System.out.println("空指针异常!数据库驱动类没找到!");
				}catch (SQLException se){
					se.printStackTrace();
					System.out.println("数据库连接失败!!!!!");
					}finally{
						try{
							rsa.close();
							stmta.close();
							con.close();
							}catch(SQLException e){
								e.printStackTrace();
								System.out.println("SQL关闭出现错误!");
								}
						}
		String sqlb="select * from Book";
		try{
			Class.forName(drv);
			con=DriverManager.getConnection(url,username,password);
			stmtb=con.createStatement();
			rsb=stmtb.executeQuery(sqlb);
			while(rsb.next()){
				if(rsb.getString("AuthorID").equals(id)){
					/*bb = new Book();// 每循环一次得到一个bb对象
					System.out.println(rsb.getString("Title"));
					bb.setTitle(rsb.getString("Title"));
					System.out.println(bb.Title);*/
					bb=rsb.getString("Title");
					v.addElement(bb);//把Book类型实例化的bb里面存放的每一条记录给v
				}
			}
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			System.out.println("空指针异常!数据库驱动类没找到!");
			}catch (SQLException se){
				se.printStackTrace();
				System.out.println("数据库连接失败!");
				}finally{
					try{
						rsb.close();
						stmtb.close();
						con.close();
						}catch(SQLException e){
							e.printStackTrace();
							System.out.println("SQL关闭出现错误!");
							}
					}
	return v;
	}
	}