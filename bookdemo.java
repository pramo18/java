import java.util.*;

class book
{  String name;
   String author;
   int price;
   int num_pages;
 
      book()
      {
      }
   void set_details(String x,String y,int z,int w)
   {
 
     name=x;
     author=y;
     price=z;
     num_pages=w;
     
   }
       void get_details()
        { 
           System.out.println("name="+name+"\n"+"author="+author+"\n"+" price="+price+"\n"+" num_pages="+num_pages);
        }
}   
     class bookdemo
     { 
     public static void main(String args[])
        {  
        book b1=new book();
        b1.set_details("maths","RD Sharma",300,1000);
        b1.get_details();
        }
     }
