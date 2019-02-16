/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;


import java.io.*;
import java.net.*;
public class Server
{
public static void main(String a[]) throws Exception
{
    String s[]=new String[20];
    int i;
System.out.println("TCP SERVER");
System.out.println("Server is ready to connect…");
ServerSocket serversoc=new ServerSocket(9);
Socket clientsoc = serversoc.accept();
PrintWriter out = new PrintWriter(clientsoc.getOutputStream(), true);
BufferedReader in = new BufferedReader(new
       InputStreamReader(clientsoc.getInputStream()));
String inputline;
BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
try
{
while (true)
{
inputline = stdin.readLine();
out.println(inputline);
System.out.println("Client Says : "+in.readLine());
s=inputline.split(" ");
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
