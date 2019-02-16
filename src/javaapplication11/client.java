/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.io.*;
import java.net.*;
public class client
{
public static void main(String[] args) throws IOException
{
    String s[]=new String[20];
    int i;
System.out.println("TCP CLIENT");
//System.out.println("Enter the host name to connect");
DataInputStream inp=new DataInputStream(System.in);
//String str=inp.readLine();
Socket clientsoc = new Socket("localhost", 9);
PrintWriter out = new PrintWriter(clientsoc.getOutputStream(), true);
BufferedReader in = new BufferedReader(new InputStreamReader(clientsoc.getInputStream()));
BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
String userinput;
try
{
while (true)
{
userinput = stdin.readLine();
System.out.println("Sever Says : " + in.readLine());
s=userinput.split(" ");
for(i=0;i<s.length;i++)
{
 out.println(s[i]);
}
System.out.println("ack");
}
}
catch(Exception e)
{
System.exit(0);
}
}
}
