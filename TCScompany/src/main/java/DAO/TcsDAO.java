package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import DB.TcsDB;
import DTO.TcsDTO;

public class TcsDAO {
	
	public boolean Tcs(TcsDTO dto) 
	{
		System.out.println("dto name="+dto.getName());
		
		System.out.println("dto age="+dto.getAge());
		
		System.out.println("dto dob="+dto.getDob());
		
		System.out.println("dto email="+dto.getEmail());
		
		System.out.println("dto mobile1="+dto.getMobile());
		
		System.out.println("dto Qualification="+dto.getQualification());
		
		System.out.println("dto gender="+dto.getGender());
		
		
		TcsDB db=new TcsDB();
		Connection conn= db.getConnection();
		boolean result1=false;
		
		String sql="INSERT INTO test1.tcsdata(Name,Age,Dob,Email,Mobile,Qualification,Gender)VALUES(?,?,?,?,?,?,?);";
		PreparedStatement ps=null;
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, dto.getName());
			ps.setString(2, dto.getAge());
			ps.setString(3, dto.getDob());
			ps.setString(4, dto.getEmail());
			ps.setString(5, dto.getMobile());
			ps.setString(6, dto.getQualification());
			ps.setString(7, dto.getGender());
			
			double result=0;
			result=ps.executeUpdate();//Important key for Updating values into Database
			System.out.println(result);
				if(result>0) 
				{
					result1=true;
					System.out.println("insert success!");
				}
		    } catch (Exception e) {
		    	System.out.println(e);
		    }
		
		
		System.out.println(conn);
		return result1;
	}
	
	//to Select all the itam in DB
   public ArrayList<TcsDTO> retrieveUser() {
		
	    TcsDB db=new TcsDB();
		Connection conn= db.getConnection();
		
		ArrayList<TcsDTO> list=new ArrayList<TcsDTO>();
		System.out.println(conn);
		ResultSet rs=null;
		PreparedStatement ps=null;
		
		String sql="select * from test1.tcsdata;";
		
		try {
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			System.out.println(rs);
			
			while(rs.next())
			{
			
				TcsDTO dto1=new TcsDTO();
				String name=rs.getString("Name");
				System.out.println("name---->"+name);
				dto1.setName(name);
				
				String Age=rs.getString("Age");
				System.out.println("Age---->"+Age);
				dto1.setAge(Age);
				
				String Dob=rs.getString("Dob");
				System.out.println("Dob---->"+Dob);
				dto1.setDob(Dob);
				
				String Email=rs.getString("Email");
				System.out.println("Email---->"+Email);
				dto1.setEmail(Email);
				
				String mobile=rs.getString("mobile");
				System.out.println("mobile---->"+mobile);
				dto1.setMobile(mobile);
				
				String Qualification=rs.getString("Qualification");
				System.out.println("Qualification---->"+Qualification);
				dto1.setQualification(Qualification);
				
				String Gender=rs.getString("Gender");
				System.out.println("Gender---->"+Gender);
				dto1.setGender(Gender);
				
				
				list.add(dto1);
			}
			
		} catch (Exception e) {
		System.out.println(e);
		}
		
		
		return list;		
  }


//Delete function
   
public boolean TcsDelete(String email) {

TcsDB db=new TcsDB();
Connection conn= db.getConnection();
boolean result1=false;

String sql="Delete From test1.tcsdata Where email=?";
PreparedStatement ps=null;
try {
	ps=conn.prepareStatement(sql);
	ps.setString(1, email);
	
	
	double result=0;
	result=ps.executeUpdate();
	System.out.println(result);
		if(result>0) 
		{
			result1=true;
			System.out.println("Delete success!");
		}
    } catch (Exception e) {
    	System.out.println(e);
    }

	System.out.println(conn);
	return result1;
  }
}