

import java.util.*;
import java.io.*;
class comparableexample
{
public static void main(String args[])
{
ArrayList<student> al=new ArrayList<student>();
al.add(new student(56,"nithin",21));
al.add(new student(58,"mathan",40));
al.add(new student(57,"kalai",19));

Collections.sort(al);
for(student sd:al)
{
System.out.println("ID="+sd.sid+",NAME="+sd.sname+",AGE="+sd.sage);
}
}
}

class student implements Comparable<student>
{
int sid;
String sname;
int sage;

student(int sid,String sname,int sage)
{
this.sid=sid;
this.sname=sname;
this.sage=sage;
}

public int compareTo(student sd)
{
if(sage==sd.sage)
return 0;
else if(sage>sd.sage)
return 1;
else
return -1;
}
}



