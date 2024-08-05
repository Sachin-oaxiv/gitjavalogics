import java.io.*;
public class parameterrizedconstructor {
        String name;
        int age;
               // creating constructor..
              parameterrizedconstructor(String name,int age){
 /* this name is my String name*/this.name= name;/*this name is my constructor argument passing name */
                this.age = age;
    
    
              }
    
        public static void main(String args[]) {
            parameterrizedconstructor obj=new parameterrizedconstructor("sachin",19);
            System.out.println(obj.name+":"+obj.age);
        }
    }


    

