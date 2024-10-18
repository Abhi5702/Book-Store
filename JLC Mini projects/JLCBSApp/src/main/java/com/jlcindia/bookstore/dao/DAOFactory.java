package com.jlcindia.bookstore.dao; 
/* 
* @Author : Srinivas Dande 
* @company : Java Learning Center 
* */ 
public class DAOFactory { 
 
 static UserDAO userDAO; 
 static { 
  userDAO = new UserDAOImpl(); 
 } 
 public static UserDAO getUserDAO() { 
  return userDAO; 
 } 
} 